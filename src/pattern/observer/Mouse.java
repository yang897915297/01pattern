package pattern.observer;


public class Mouse extends MouseLisenter implements DongZuo{
	
	//ͨ�����ö�̬������ʵ�ּ�أ���ֹ�������� 
	public void click(){
		System.out.println("��굥���¼�");
		
		//��һ������¼���������ʽ�Ĵ���
		//invoker()
		//proxy �࣬method ����ֵ
		//���������õķ���ȥ��̬���жϴ����ĸ��¼�
		//Ҳ�����ò���ģʽ
		//�������ú÷����ʹ����¼��Ĺ�ϵ
		//Map<String,MouseEventType> map;
		//map.put("click",ON_CLICK);
		//MAP.PUT("",xxx);
		
		this.trigger(MouseEventType.ON_CLICK);
	}
	public void doubleClick(){
		System.out.println("���˫���¼�");
		trigger(MouseEventType.ON_DOUBLE_CLICK);
	}
	public void move(){
		System.out.println("����ƶ��¼�");
		trigger(MouseEventType.ON_MOVE);
	}
	public void down(){
		System.out.println("��갴���¼�");
		trigger(MouseEventType.ON_DOWN);
	}

}
