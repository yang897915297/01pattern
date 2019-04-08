package pattern.proxy2019.synProxy;

/**
 * 
 * 代理模式---动态代理----被代理的不做事，由代理类来做
 *
 */
public class Test {

	public static void main(String[] args) {
		SynMeipo meipo = new SynMeipo();
		Person obj = (Person) meipo.getInstance(new Girl());
		obj.findLove();
	}
}
