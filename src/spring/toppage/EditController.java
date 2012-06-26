package spring.toppage;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

public class EditController extends ViewController {

	public EditController() {
	}

	@Override
	protected void handleActionRequestInternal(ActionRequest request,
			ActionResponse response) throws Exception {
		String htmlEdit = request.getParameter("html");
		if (htmlEdit != null)
			this.getToppageDao().updateHtml(htmlEdit);
	}

}
