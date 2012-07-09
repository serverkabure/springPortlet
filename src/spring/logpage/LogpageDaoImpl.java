package spring.logpage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.jalore.LogMessage;
import org.jalore.LogReader;
import org.jalore.log4j.Log4JFileReader;
import org.jalore.log4j.Log4JProperties;

/**
 * ログファイルからログメッセージをリードするDAO
 *
 * @author sk
 */
public class LogpageDaoImpl implements LogpageDao {
	public LogpageDaoImpl() {
	}

	// JBoss独自仕様部分をメッセージとして扱う"%d{HH:mm:ss,SSS} %-5p [%c] (%t) %m%n";
	@Override
	public List<LogMessageObj> readLogmessages(String filePath,String log4jPattern) throws Exception {
		List<LogMessageObj> logmessages = new ArrayList<LogMessageObj>();
		// nextMessage後に、自分でReaderをcloseするので、Log4JFileReaderを使用する
		LogReader logReader = new Log4JFileReader(new File(filePath),
				log4jPattern);
		for (int i = 1; logReader.hasMoreMessages(); i++) {
			LogMessage message = logReader.nextMessage();
			// %d property
			String timestamp = message.getProperty(Log4JProperties.TIMESTAMP);
			// MDC myMdc (%X{myMdc})
			String myMdc = message.getProperty(Log4JProperties.PREFIX_MDC
					+ "myMdc");
			// %p
			String level = message.getProperty(Log4JProperties.LEVEL);
			// %c
			String category = message.getProperty(Log4JProperties.CATEGORY);
			// %t
			String thread = message.getProperty(Log4JProperties.THREAD);
			// %m
			String rawMessage = message.getProperty(Log4JProperties.MESSAGE);
			//
			LogMessageObj lmo = new LogMessageObj(i, timestamp, myMdc, level,
					category, thread, rawMessage);
			logmessages.add(lmo);
		}

		return logmessages;
	}

	@Override
	public void writeLogmessage(LogMessageObj logMessage) {
		// TODO 自動生成されたメソッド・スタブ
	}


}
