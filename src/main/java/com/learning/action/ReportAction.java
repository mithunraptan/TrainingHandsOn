package com.learning.action;

import com.opensymphony.xwork2.ActionSupport;
import com.learning.util.BirtReportUtil;

import java.util.HashMap;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;

public class ReportAction extends ActionSupport {

    private int courseId;

    public String execute() {

        try {
            ServletContext context = ServletActionContext.getServletContext();

            // 🔥 Pass parameter to BIRT
            HashMap<String, Object> params = new HashMap<>();
            params.put("courseId", courseId);

            String outputPath = context.getRealPath("/reports/output.pdf");

            BirtReportUtil.generateReport(
                    context,
                    "new_report.rptdesign",
                    params,
                    outputPath
            );

        } catch (Exception e) {
            e.printStackTrace();
        }

        return SUCCESS;
    }

    // Getter & Setter
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
}