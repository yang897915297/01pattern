
package pattern.observer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//������
public class DaiLiClass implements InvocationHandler{
	private DongZuo dongzuo;
	
	public Object getInstince(DongZuo dongzuo){
		this.dongzuo = dongzuo;
		Class<?> clazz = dongzuo.getClass();
		//��������һ���µĶ��������ֽ���������ʵ��
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getClasses(), this);
	}

	@Override
	public Object invoke(Object paramObject, Method paramMethod,
			Object[] args) throws Throwable {
		
		System.out.println("��ʱ��̬����ķ���");
		System.out.println("�������Ѿ��õ���Ҫ���õķ�����");
		
		paramMethod.invoke(this.dongzuo, args);
		
		return null;
	}

}
