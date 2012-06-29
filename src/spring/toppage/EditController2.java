package spring.toppage;

import javax.portlet.*;

public class EditController2 extends ViewController2 {

	public EditController2() {
	}

	@Override
	protected void handleActionRequestInternal(ActionRequest request,
			ActionResponse response) throws Exception {
		String html = request.getParameter("html");
		if (html != null) {
			PortletPreferences pref = request.getPreferences();
			pref.setValue("html", html);
			pref.store();
		}
	}
}
