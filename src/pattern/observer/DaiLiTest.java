package pattern.observer;

/**
 * ʹ�ö�̬����Ĳ�����
 * @author lenovo
 *
 */
public class DaiLiTest {

	public static void main(String[] args) {
		DongZuo dongzuo = (DongZuo) new DaiLiClass().getInstince(new Mouse());
		dongzuo.click();
	}
}
