package spring.logpage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.jalore.LogMessage;
import org.jalore.LogReader;
import org.jalore.log4j.Log4JFileReader;
import org.jalore.log4j.Log4JProperties;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * HTML文の収容先をポートレットプリファレンスへ変更
 *
 * @author sk
 */
public class LogpageDaoImpl implements LogpageDao {

	@Override
	public List<LogMessageObj> readLogmessages(String filePath)
			throws Exception {
		List<LogMessageObj> logmessages = new ArrayList<LogMessageObj>();
		//
		String log4jPattern = "%d{HH:mm:ss,SSS} %-5p [%c] (%t) %m%n";// JBoss独自仕様部分をメッセージとして扱う
		LogReader logReader = new Log4JFileReader(new File(filePath),
				log4jPattern);// nextMessage後に、自分でReaderをcloseするので、Log4JFileReaderを使用する
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
