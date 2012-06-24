package spring;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.mvc.AbstractController;

public class ViewController extends AbstractController {

	public ViewController() {
	}

	@Override
	protected ModelAndView handleRenderRequestInternal(RenderRequest request,
			RenderResponse response) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		return super.handleRenderRequestInternal(request, response);
	}

	@Override
	protected void handleActionRequestInternal(ActionRequest request,
			ActionResponse response) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		super.handleActionRequestInternal(request, response);
	}

}
