package spring.toppage;

import java.util.HashMap;
import java.util.Map;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.mvc.ParameterizableViewController;

public class ViewController extends ParameterizableViewController {
	private ToppageDao toppageDao;

	public ViewController() {
	}

	@Override
	protected ModelAndView handleRenderRequestInternal(RenderRequest request,
			RenderResponse response) throws Exception {
		String html = this.toppageDao.selectHtml();

		Map<String, String> model = new HashMap<String, String>();
		model.put("html", html);

		return new ModelAndView(this.getViewName(), model);
	}

	public ToppageDao getToppageDao() {
		return toppageDao;
	}

	public void setToppageDao(ToppageDao toppageDao) {
		this.toppageDao = toppageDao;
	}

}
