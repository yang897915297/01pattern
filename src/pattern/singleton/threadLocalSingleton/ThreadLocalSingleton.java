package pattern.singleton.threadLocalSingleton;

/**
 * 伪单例---在一个线程内线程安全，在线程间不安全
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
