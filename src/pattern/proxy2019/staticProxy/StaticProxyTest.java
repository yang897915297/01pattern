package pattern.proxy2019.staticProxy;

public class StaticProxyTest {

	public static void main(String[] args) {

		Father father = new Father(new Son());
		father.findLove();
	}
}
