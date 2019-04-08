package pattern.decorator;

/**
 * 
 * װ����ģʽ --��ʵ��ͬһ���ӿڣ�is-a��ϵ��ע����ǿ����չ
 *
 */
public class DecoratorTest {
	
	public static void main(String[] args) {
		Battercake battercake;
		//·����һ�������һ����������
		battercake = new BaseBattercake();
		//����е�С����һ������
		battercake = new EggDecorator(battercake);
		//����̫���ˣ��ټ�һ���㳦
		battercake = new XiangChangDecorator(battercake);
		//����̫�����ټ�һ���㳦��
		battercake = new XiangChangDecorator(battercake);
		System.out.println(battercake.getMsg()+"���ܼۣ�"+battercake.getPrice());
	}

}
