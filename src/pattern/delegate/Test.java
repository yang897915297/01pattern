package pattern.delegate;
/**
 * ί��ģʽ---�Լ����ɻ���������˸ɣ���Ŀ�����
 * @author lenovo
 *
 */
public class Test {
	public static void main(String[] args) {
		Boss boss =new Boss();
		boss.doing("ǰ��", new Leader());
	}

}
