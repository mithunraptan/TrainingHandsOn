package com.training.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AccountSecurityInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Security check before action");
		String username = invocation.getInvocationContext()
							.getParameters().get("username") != null ?
									invocation.getInvocationContext().getParameters().get("username").getValue() : null;
		System.out.println("username is : "+username);
		if("blockedUser".equals(username)) {
			System.out.println("Account is locked!");
			return "locked";
		}
		
		String result = invocation.invoke();
		System.out.println("result is : "+ result);
		return result;
	}

}
