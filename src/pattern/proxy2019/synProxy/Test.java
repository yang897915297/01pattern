package pattern.proxy2019.synProxy;

/**
 * 
 * ����ģʽ---��̬����----������Ĳ����£��ɴ���������
 *
 */
public class Test {

	public static void main(String[] args) {
		SynMeipo meipo = new SynMeipo();
		Person obj = (Person) meipo.getInstance(new Girl());
		obj.findLove();
	}
}
