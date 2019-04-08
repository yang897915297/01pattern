package pattern.singleton.lazy;

/**
 * 
 * ����ʽ����   Ҫ��synchronization�ؼ���
 * synchronized���ڷ����ϻ�Ӱ�����ܣ����Լӵ���ֵ�ĵط�
 *
 */
public class LazySingleton {

	private volatile static LazySingleton lazySingleton ;
	
	private LazySingleton(){}
	
	public synchronized static LazySingleton getInstance(){
		if(lazySingleton == null){
			lazySingleton = new LazySingleton();
		}
		return lazySingleton;
	}
	
	//synchronized���ڷ����ϻ�Ӱ�����ܣ����Լӵ���ֵ�ĵط�
	//˫�ؼ����
	public  static LazySingleton getInstance1(){
		if(lazySingleton == null){
			synchronized(LazySingleton.class){
				if(lazySingleton == null){
					lazySingleton = new LazySingleton();
				}
			}	
		}
		return lazySingleton;
	}
}
