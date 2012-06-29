package spring.toppage;

import java.util.HashMap;
import java.util.Map;

import javax.portlet.PortletPreferences;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.mvc.ParameterizableViewController;

public class ViewController2 extends ParameterizableViewController {

	public ViewController2() {
	}

	@Override
	protected ModelAndView handleRenderRequestInternal(RenderRequest request,
			RenderResponse response) throws Exception {
		PortletPreferences pref = request.getPreferences();
		String html = pref.getValue("html", "<p>hello</p>");

		Map<String, String> model = new HashMap<String, String>();
		model.put("html", html);

		return new ModelAndView(this.getViewName(), model);
	}

}
