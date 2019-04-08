package pattern.observer;

/**
 * �ص���Ӧ���߼������Լ�ʵ��
 * @author lenovo
 *
 */
public class MouseEventCallback {
	
	public void click(Event e){
		System.out.println("������굥��֮����߼�");
		System.out.println("=========������굥���¼�==========\n" + e);
	}
	
	public void doubleClick(Event e){
		System.out.println("=========�������˫���¼�==========\n" + e);
	}
	
	public void move(Event e){
		System.out.println("=========��������ƶ��¼�==========\n" + e);
	}
	
	public void down(Event e){
		System.out.println("=========������갴���¼�==========\n" + e);
	}
	

	public void advice(Event e){
		System.out.println("=========�����¼�����ӡ��־==========\n" + e);
	}
}
