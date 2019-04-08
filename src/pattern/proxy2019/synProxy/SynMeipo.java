package pattern.proxy2019.synProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SynMeipo implements InvocationHandler{
	
	private Person target;
	
	public Object getInstance(Person person){
		this.target = person;
		Class<?> clazz = target.getClass();
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		before();
		Object obj = method.invoke(target, args);
		after();
		return obj;
	}
	private void before(){
		System.out.println("����ý�ţ��һ�����Ҷ�������Ҫȷ�����Ҫ��");
	}
	private void after(){
		System.out.println("��֪���ˣ��ҵ����ʵĻ�֪ͨ���");
	}

}
