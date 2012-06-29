package spring.toppage;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 * コンストラクタでJNDIルックアップを行いデータソースを取得する
 *
 * @author sk
 *
 */
public class ToppageDaoJndiImpl extends ToppageDaoImpl {
	private String strDSName = "java:jboss/datasources/MysqlDS";

	public ToppageDaoJndiImpl() {
	}

	public ToppageDaoJndiImpl(String jndiName) throws Exception {
		Context ctx = new InitialContext();
		DataSource dataSource = (DataSource) ctx.lookup(jndiName);
		System.out.println("★★★:" + dataSource);
		this.setDataSource(dataSource);
	}

}
