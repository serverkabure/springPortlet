package spring.toppage;

import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * �g�b�v�y�[�W�ɕ\������HTML��DB��R/W����DAO�B<br />
 * JBoss��JNDI�f�[�^�\�[�X��Spring���擾�ł��Ȃ��̂ŁA�g�p���Ȃ��B<br />
 * spring��JndiObjectFactoryBean�ŁAJBoss��java:jboss/datasources/
 * MysqlDS�����b�N�A�b�v���ăG���[�ɂȂ�B
 *
 * HTML���̎��e����|�[�g���b�g�v���t�@�����X�֕ύX
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
	 * (�� Javadoc)
	 *
	 * @see spring.toppage.ToppageDao#selectHtml()
	 */
	@Override
	public String selectHtml() {
		final String sql = "select distinct value0 from toppage where key0 = 'html'";
		return (String) this.jdbcTemplate.queryForObject(sql, String.class);
	}

	/*
	 * (�� Javadoc)
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
