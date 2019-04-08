package pattern.singleton.lazy;

/**
 * 
 * 懒汉式单例   要加synchronization关键字
 * synchronized加在方法上会影响性能，可以加到赋值的地方
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
	
	//synchronized加在方法上会影响性能，可以加到赋值的地方
	//双重检查锁
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
