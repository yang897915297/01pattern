package pattern.proxy;

public class MeiPo implements Man {
	
	private Man man;
	
	public MeiPo(final Man man){
		this.man = man;
	}

	@Override
	public void findGirlFriend() {
		System.out.println("��ʱý�ţ��һ����ģ���˵�����Ҫ��");
		man.findGirlFriend();
		System.out.println("�ҵ���������ˣ�");
	}

}
