package spring.toppage;

import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class ToppageDao {
	// private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		// create a JdbcTemplate and set data source
		this.jdbcTemplate = new JdbcTemplate();
		this.jdbcTemplate.setDataSource(dataSource);
	}

	public String selectHtml() {
		final String sql = "select distinct html from toppage";
		return (String) this.jdbcTemplate.queryForObject(sql, String.class);
	}

	public void updateHtml(String html) {
		final String sql = "update toppage set html = ?";
		this.jdbcTemplate.update(sql, new Object[] { html },
				new int[] { Types.VARCHAR });
	}
}
