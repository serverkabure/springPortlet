package spring.toppage;

import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * トップページに表示するHTMLをDBにR/WするDAO。<br />
 * JBossのJNDIデータソースをSpringが取得できないので、使用しない。<br />
 * springのJndiObjectFactoryBeanで、JBossのjava:jboss/datasources/
 * MysqlDSをルックアップしてエラーになる。
 *
 * HTML文の収容先をポートレットプリファレンスへ変更
 *
 * @author sk
 * @deprecated
 */
public class ToppageDaoImpl implements ToppageDao {
	// private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		// create a JdbcTemplate and set data source
		this.jdbcTemplate = new JdbcTemplate();
		this.jdbcTemplate.setDataSource(dataSource);
	}

	/*
	 * (非 Javadoc)
	 *
	 * @see spring.toppage.ToppageDao#selectHtml()
	 */
	@Override
	public String selectHtml() {
		final String sql = "select distinct value0 from toppage where key0 = 'html'";
		return (String) this.jdbcTemplate.queryForObject(sql, String.class);
	}

	/*
	 * (非 Javadoc)
	 *
	 * @see spring.toppage.ToppageDao#updateHtml(java.lang.String)
	 */
	@Override
	public void updateHtml(String html) {
		final String sql = "update toppage set value0 = ? where key0 = 'html'";
		this.jdbcTemplate.update(sql, new Object[] { html },
				new int[] { Types.VARCHAR });
	}
}
