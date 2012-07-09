package spring.logpage;

import java.util.List;

/**
 * ���O���b�Z�[�W�̃��[�h/���C�g�pDAO
 *
 * @author sk
 */
public interface LogpageDao {
	/**
	 * ���O���b�Z�[�W�����[�h����
	 *
	 * @param filePath
	 *
	 * @return ���[�h�������O�f�[�^
	 * @throws Exception
	 */
	public abstract List<LogMessageObj> readLogmessages(String filePath,String log4jPattern) throws Exception;

	/**
	 * ���O���b�Z�[�W�����C�g����
	 *
	 * @param logMessage
	 */
	public abstract void writeLogmessage(LogMessageObj logMessage);

}