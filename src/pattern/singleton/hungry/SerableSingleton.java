package pattern.singleton.hungry;

import java.io.Serializable;

/**
 * 
 * 序列化
 *
 */

public class SerableSingleton implements Serializable{

private static final SerableSingleton serableSingleton = new SerableSingleton();
	
	private SerableSingleton(){}
	
	public static SerableSingleton getInstance(){
		return serableSingleton;
	}
	//防止序列化方式创建对象--单例
	//重写readResolve方法，只不过是覆盖了反序列化出来的对象
	//还是创建了两次，发生在JVM层，相当来说比较安全
	//之前反序列化创建的对象会被GC回收
	private Object readResolve(){
		return serableSingleton;
	}
}
