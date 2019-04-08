package pattern.singleton.lazy;

/**
 * 
 * 静态内部类
 *
 */
//性能最优
public class LazyInnerClassSingleton {

	private LazyInnerClassSingleton(){
		//防止用反射创建,只能通过getInstance()去创建对象
		if(LazyHandle.LAZY != null){
			throw new RuntimeException("不允许创建多个实例");
		}
	}
	
	public LazyInnerClassSingleton getInstance(){
		return LazyHandle.LAZY;
	}
	
	//懒汉式
	//初始化外部类的时候会初始化内部类
	private static class LazyHandle{
		private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
	}
}
