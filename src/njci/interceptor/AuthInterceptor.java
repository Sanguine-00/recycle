package njci.interceptor;

import java.util.Map;

import njci.bean.UserInfo;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthInterceptor extends AbstractInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4478067580944210635L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		Map<String, Object> session = ActionContext.getContext().getSession();
		UserInfo user = (UserInfo) session.get("login");
		if (user == null) {
			return Action.LOGIN;
		} else {
			return invocation.invoke();
		}
	}

}
