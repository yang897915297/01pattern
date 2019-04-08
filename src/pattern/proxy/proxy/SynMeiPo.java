package pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SynMeiPo implements InvocationHandler {
	private Man man;
	
	public SynMeiPo(final Man man){
		this.man = man;
	}
	

	@Override
	public Object invoke(Object obj, Method menthod, Object[] arg2)
			throws Throwable {
		Object result = menthod.invoke(man, arg2);
		return result;
	}

}
