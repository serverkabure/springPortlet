package spring.toppage;
/**
 * HTML文の収容先をポートレットプリファレンスへ変更
 *
 * @author sk
 * @deprecated
 */
public interface ToppageDao {

	public abstract String selectHtml();

	public abstract void updateHtml(String html);

}