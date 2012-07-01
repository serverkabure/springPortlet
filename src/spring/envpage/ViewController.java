package spring.envpage;

import java.util.Map;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.mvc.ParameterizableViewController;

/**
 * 環境変数を表示するポートレット
 *
 * @author sk
 */
public class ViewController extends ParameterizableViewController {

	public ViewController() {
	}

	@Override
	protected ModelAndView handleRenderRequestInternal(RenderRequest request,
			RenderResponse response) throws Exception {
		Map<String, String> model = System.getenv();

		return new ModelAndView(this.getViewName(), "model", model);
	}

}
