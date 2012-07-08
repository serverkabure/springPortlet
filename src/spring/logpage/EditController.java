package spring.logpage;

import java.util.HashMap;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletPreferences;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.mvc.ParameterizableViewController;

/**
 * ログ表示ポートレット
 *
 * @author sk
 */
public class EditController extends ParameterizableViewController {

	public EditController() {
	}

	@Override
	protected ModelAndView handleRenderRequestInternal(RenderRequest request,
			RenderResponse response) throws Exception {
		Map<String, String> model = new HashMap<String, String>();
		//
		PortletPreferences pref = request.getPreferences();
		String filePath = pref.getValue("filePath", "/");
		model.put("filePath", filePath);
		// log4jPattern
		String log4jPattern = pref.getValue("log4jPattern", "/");
		model.put("log4jPattern", log4jPattern);
		// return new ModelAndView(this.getViewName(), "model", model);
		return new ModelAndView(this.getViewName(), model);
	}

	@Override
	protected void handleActionRequestInternal(ActionRequest request,
			ActionResponse response) throws Exception {
		PortletPreferences pref = request.getPreferences();
		// filePath
		String filePath = request.getParameter("filePath");
		if (filePath != null)
			pref.setValue("filePath", filePath);
		// log4jPattern
		String log4jPattern = request.getParameter("log4jPattern");
		if (log4jPattern != null)
			pref.setValue("log4jPattern", log4jPattern);
		pref.store();
	}

}
