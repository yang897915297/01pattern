package pattern.singleton.enumSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EnumSingletonTest {

	public static void main(String[] args) {
		//反序列化创建对象
		EnumSingleton s1 = null;
		EnumSingleton s2 = EnumSingleton.getInstance();
		s2.setData(new Object());
		
		FileOutputStream fos = null;
		try{
			fos = new FileOutputStream("EnumSingleton.obj");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s2);
			oos.flush();
			oos.close();
			
			FileInputStream fis =new FileInputStream("EnumSingleton.obj");
			ObjectInputStream ois = new ObjectInputStream(fis);
			s1 = (EnumSingleton) ois.readObject();
			ois.close();
			
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s1==s2);
			
			System.out.println(s1.getData());
			System.out.println(s2.getData());
			System.out.println(s1.getData()==s2.getData());
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
