package pattern.delegate;
/**
 * 委派模式---自己不干活，交给其他人干（项目外包）
 * @author lenovo
 *
 */
public class Test {
	public static void main(String[] args) {
		Boss boss =new Boss();
		boss.doing("前端", new Leader());
	}

}
