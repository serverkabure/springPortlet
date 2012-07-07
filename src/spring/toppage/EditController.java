package spring.toppage;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

/**
 * HTML文の収容先をポートレットプリファレンスへ変更
 *
 * @author sk
 * @deprecated
 */
public class EditController extends ViewController {

	public EditController() {
	}

	// protected void handleActionRequestInternal(ActionRequest request,
	// ActionResponse response) throws Exception {
	// String htmlEdit = request.getParameter("html");
	// if (htmlEdit != null)
	// this.getToppageDao().updateHtml(htmlEdit);
	// }

}
