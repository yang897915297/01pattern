package pattern.protoType;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 
 * 原型模式----根据一个原型类，克隆N个实例
 *
 */
public class Client {
	public static void main(String[] args) throws CloneNotSupportedException, Exception {
		//原型a对象
		Resume a = new Resume("张三", "男");
		
		//克隆b对象
		Resume b = (Resume) a.clone();
		
		//浅克隆，指向同一个地址
		//测试是否式同一个对象   
		System.out.println(a.getName());
		System.out.println(b.getName());
		System.out.println(a.getName()==b.getName());
		System.out.println(a.getClass()==b.getClass());
		
//		BeanUtils.copy();  
		
		
		//-------------------------------------------------
		//使用序列化和反序列化实现深克隆
		Resume s1 = new Resume("小芳", "女");
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(s1);
		byte[] bytes = bos.toByteArray();
		
		ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
		ObjectInputStream ois = new ObjectInputStream(bis);
		//克隆好的对象
		Resume s2 = (Resume) ois.readObject();
		
		//测试
		System.out.println(s1.getName());
		System.out.println(s2.getName());
		System.out.println(s1.getName()==s2.getName());
		System.out.println(s1.getClass()==s2.getClass());
	}

}
