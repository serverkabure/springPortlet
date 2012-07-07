package spring.logpage;

import java.util.List;

/**
 * HTML文の収容先をポートレットプリファレンスへ変更
 *
 * @author sk
 */
public interface LogpageDao {
	/**
	 * server.logからログをロードする
	 *
	 * @param filePath
	 *
	 * @return ロードしたログデータ
	 * @throws Exception
	 */
	public abstract List<LogMessageObj> readLogmessages(String filePath)
			throws Exception;

	/**
	 * MySQLにログをインサートする
	 *
	 * @param logMessage
	 */
	public abstract void writeLogmessage(LogMessageObj logMessage);

}