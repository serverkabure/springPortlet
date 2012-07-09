package spring.logpage;

import java.util.List;

/**
 * ログメッセージのリード/ライト用DAO
 *
 * @author sk
 */
public interface LogpageDao {
	/**
	 * ログメッセージをリードする
	 *
	 * @param filePath
	 *
	 * @return ロードしたログデータ
	 * @throws Exception
	 */
	public abstract List<LogMessageObj> readLogmessages(String filePath,String log4jPattern) throws Exception;

	/**
	 * ログメッセージをライトする
	 *
	 * @param logMessage
	 */
	public abstract void writeLogmessage(LogMessageObj logMessage);

}