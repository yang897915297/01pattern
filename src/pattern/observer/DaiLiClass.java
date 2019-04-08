
package pattern.observer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//代理类
public class DaiLiClass implements InvocationHandler{
	private DongZuo dongzuo;
	
	public Object getInstince(DongZuo dongzuo){
		this.dongzuo = dongzuo;
		Class<?> clazz = dongzuo.getClass();
		//用来生成一个新的对象，利用字节码重组来实现
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getClasses(), this);
	}

	@Override
	public Object invoke(Object paramObject, Method paramMethod,
			Object[] args) throws Throwable {
		
		System.out.println("我时动态代理的方法");
		System.out.println("我现在已经拿到你要调用的方法了");
		
		paramMethod.invoke(this.dongzuo, args);
		
		return null;
	}

}
