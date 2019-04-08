package pattern.singleton.threadLocalSingleton;

/**
 * α����---��һ���߳����̰߳�ȫ�����̼߳䲻��ȫ
 * 
 *
 */
public class ThreadLocalSingleton {
	
	private ThreadLocalSingleton(){}

	private static final ThreadLocal<ThreadLocalSingleton> threadLocalIntance= 
			new ThreadLocal<ThreadLocalSingleton>(){

				@Override
				protected ThreadLocalSingleton initialValue() {
					return new ThreadLocalSingleton();
				}
		
	};
	
	public static ThreadLocalSingleton getInstance(){
		return threadLocalIntance.get();
	}
}
