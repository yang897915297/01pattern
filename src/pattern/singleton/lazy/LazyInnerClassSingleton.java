package pattern.singleton.lazy;

/**
 * 
 * ��̬�ڲ���
 *
 */
//��������
public class LazyInnerClassSingleton {

	private LazyInnerClassSingleton(){
		//��ֹ�÷��䴴��,ֻ��ͨ��getInstance()ȥ��������
		if(LazyHandle.LAZY != null){
			throw new RuntimeException("�����������ʵ��");
		}
	}
	
	public LazyInnerClassSingleton getInstance(){
		return LazyHandle.LAZY;
	}
	
	//����ʽ
	//��ʼ���ⲿ���ʱ����ʼ���ڲ���
	private static class LazyHandle{
		private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
	}
}
