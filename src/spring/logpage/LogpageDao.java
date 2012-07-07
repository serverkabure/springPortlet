package spring.logpage;

import java.util.List;

/**
 * HTML���̎��e����|�[�g���b�g�v���t�@�����X�֕ύX
 *
 * @author sk
 */
public interface LogpageDao {
	/**
	 * server.log���烍�O�����[�h����
	 *
	 * @param filePath
	 *
	 * @return ���[�h�������O�f�[�^
	 * @throws Exception
	 */
	public abstract List<LogMessageObj> readLogmessages(String filePath)
			throws Exception;

	/**
	 * MySQL�Ƀ��O���C���T�[�g����
	 *
	 * @param logMessage
	 */
	public abstract void writeLogmessage(LogMessageObj logMessage);

}