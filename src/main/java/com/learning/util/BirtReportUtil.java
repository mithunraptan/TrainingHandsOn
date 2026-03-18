package com.learning.util;

import java.util.HashMap;
import javax.servlet.ServletContext;

import org.eclipse.birt.core.framework.Platform;
import org.eclipse.birt.report.engine.api.EngineConfig;
import org.eclipse.birt.report.engine.api.IReportEngine;
import org.eclipse.birt.report.engine.api.IReportEngineFactory;
import org.eclipse.birt.report.engine.api.IReportRunnable;
import org.eclipse.birt.report.engine.api.IRunAndRenderTask;
import org.eclipse.birt.report.engine.api.PDFRenderOption;

public class BirtReportUtil {

    public static void generateReport(ServletContext context, String reportName,
                                      HashMap<String, Object> params,
                                      String outputPath) {

        IReportEngine engine = null;

        try {
            // ✅ Step 1: Create EngineConfig
            EngineConfig config = new EngineConfig();

            // 🔥🔥🔥 MOST IMPORTANT FIX (Driver Injection)
            String driverPath = context.getRealPath("/WEB-INF/lib/postgresql-42.7.9.jar");

            config.getAppContext().put("OdaJDBCDriverClassPath", driverPath);
            config.getAppContext().put("OdaJDBCDriverClassName", "org.postgresql.Driver");

            // ✅ Step 2: Start BIRT Platform
            Platform.startup(config);

            // ✅ Step 3: Create Engine
            IReportEngineFactory factory = (IReportEngineFactory) Platform
                    .createFactoryObject(IReportEngineFactory.EXTENSION_REPORT_ENGINE_FACTORY);

            engine = factory.createReportEngine(config);

            // ✅ Step 4: Load Report
            String reportPath = context.getRealPath("/reports/" + reportName);
            IReportRunnable design = engine.openReportDesign(reportPath);

            // ✅ Step 5: Create Task
            IRunAndRenderTask task = engine.createRunAndRenderTask(design);

            // ✅ Step 6: Set Parameters
            if (params != null) {
                task.setParameterValues(params);
            }

            // ✅ Step 7: Render as PDF
            PDFRenderOption options = new PDFRenderOption();
            options.setOutputFileName(outputPath);
            options.setOutputFormat("pdf");

            task.setRenderOption(options);

            // 🔥 Run report
            task.run();
            task.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (engine != null) {
                engine.destroy();
            }

            Platform.shutdown();
        }
    }
}