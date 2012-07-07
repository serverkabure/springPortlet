package spring.logpage;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * コンストラクタでJNDIルックアップを行いデータソースを取得する
 *
 * @author sk
 *
 */
public class LogpageDaoJndiImpl extends LogpageDaoImpl {
	// private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public LogpageDaoJndiImpl() {
	}

	public void setDataSource(DataSource dataSource) {
		// create a JdbcTemplate and set data source
		this.jdbcTemplate = new JdbcTemplate();
		this.jdbcTemplate.setDataSource(dataSource);
	}

	public List<LogMessageObj> readLogmessages() {
		// "SELECT Log4J_TIMESTAMP, Log4J_PREFIX_MDC, Log4J_LEVEL, Log4J_CATEGORY, Log4J_THREAD, Log4J_MESSAGE, Line_Number FROM LogMessage WHERE 1"
		String sql = "SELECT * FROM LogMessage WHERE 1";
		return this.jdbcTemplate.queryForList(sql, LogMessageObj.class);
	}

	@Override
	public void writeLogmessage(LogMessageObj logMessage) {
		String sql = "INSERT INTO LogMessage(Log4J_TIMESTAMP, Log4J_PREFIX_MDC, Log4J_LEVEL, Log4J_CATEGORY, Log4J_THREAD, Log4J_MESSAGE, Line_Number) VALUES (?,?,?,?,?,?,?)";

	}
}
