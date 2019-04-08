package pattern.observer;

/**
 * 使用动态代理的测试类
 * @author lenovo
 *
 */
public class DaiLiTest {

	public static void main(String[] args) {
		DongZuo dongzuo = (DongZuo) new DaiLiClass().getInstince(new Mouse());
		dongzuo.click();
	}
}
