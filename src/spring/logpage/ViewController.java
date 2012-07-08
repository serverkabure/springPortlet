package spring.logpage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.PortletPreferences;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.mvc.ParameterizableViewController;

/**
 * ���O�\���|�[�g���b�g
 *
 * @author sk
 */
public class ViewController extends ParameterizableViewController {
	private LogpageDao logpageDao;

	public ViewController() {
	}

	@Override
	protected ModelAndView handleRenderRequestInternal(RenderRequest request,
			RenderResponse response) throws Exception {
		Map<String, Object> model = new HashMap<String, Object>();

		PortletPreferences pref = request.getPreferences();
		String filePath = pref.getValue("filePath", "x");// filePath
		String log4jPattern = pref.getValue("log4jPattern", "x");// log4jPattern
		//
		model.put("filePath", filePath);
		// ���O���b�Z�[�W�̃��X�g���擾����
		List<LogMessageObj> list = this.logpageDao.readLogmessages(filePath,
				log4jPattern);
		// displaytag�Ń\�[�g�A�y�[�W���O���郊�X�g�֕ϊ�
		PaginatedListImpl list2 = new PaginatedListImpl(request);
		list2.setList(list);
		model.put("list", list);

		// return new ModelAndView(this.getViewName(), "model", model);
		return new ModelAndView(this.getViewName(), model);
	}

	public LogpageDao getLogpageDao() {
		return logpageDao;
	}

	public void setLogpageDao(LogpageDao logpageDao) {
		this.logpageDao = logpageDao;
	}

}
