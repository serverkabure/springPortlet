package spring.logpage;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * DBにログメッセージをリード/ライトするDAO<br />
 * 現在未使用
 *
 * @author sk
 *
 */
public class LogpageDaoDbImpl implements LogpageDao {
	// private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public LogpageDaoDbImpl() {
	}

	public void setDataSource(DataSource dataSource) {
		// create a JdbcTemplate and set data source
		this.jdbcTemplate = new JdbcTemplate();
		this.jdbcTemplate.setDataSource(dataSource);
	}

	@Override
	public List<LogMessageObj> readLogmessages(String filePath,String log4jPattern) throws Exception {
		// "SELECT Log4J_TIMESTAMP, Log4J_PREFIX_MDC, Log4J_LEVEL, Log4J_CATEGORY, Log4J_THREAD, Log4J_MESSAGE, Line_Number FROM LogMessage WHERE 1"
		String sql = "SELECT * FROM LogMessage WHERE 1";
		return this.jdbcTemplate.queryForList(sql, LogMessageObj.class);
	}

	@Override
	public void writeLogmessage(LogMessageObj logMessage) {
		String sql = "INSERT INTO LogMessage(Log4J_TIMESTAMP, Log4J_PREFIX_MDC, Log4J_LEVEL, Log4J_CATEGORY, Log4J_THREAD, Log4J_MESSAGE, Line_Number) VALUES (?,?,?,?,?,?,?)";

	}

}
