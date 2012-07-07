package spring.toppage;

import java.util.HashMap;
import java.util.Map;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.mvc.ParameterizableViewController;

import spring.logpage.LogpageDao;

/**
 * HTML文の収容先をポートレットプリファレンスへ変更
 *
 * @author sk
 * @deprecated
 */
public class ViewController extends ParameterizableViewController {
	private LogpageDao toppageDao;

	public ViewController() {
	}

	// protected ModelAndView handleRenderRequestInternal(RenderRequest request,
	// RenderResponse response) throws Exception {
	// String html = this.toppageDao.selectHtml();
	//
	// Map<String, String> model = new HashMap<String, String>();
	// model.put("html", html);
	//
	// return new ModelAndView(this.getViewName(), model);
	// }
	// public LogpageDao getToppageDao() {
	// return toppageDao;
	// }
	// public void setToppageDao(LogpageDao toppageDao) {
	// this.toppageDao = toppageDao;
	// }

}
