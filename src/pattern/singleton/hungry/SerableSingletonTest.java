package pattern.singleton.hungry;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 
 * 单例模式----保证只有一个实例
 *
 */
public class SerableSingletonTest {

	public static void main(String[] args) {
		//反序列化创建对象
		SerableSingleton s1 = null;
		SerableSingleton s2 = SerableSingleton.getInstance();
		
		FileOutputStream fos = null;
		try{
			fos = new FileOutputStream("SerableSingleton.obj");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s2);
			oos.flush();
			oos.close();
			
			FileInputStream fis =new FileInputStream("SerableSingleton.obj");
			ObjectInputStream ois = new ObjectInputStream(fis);
			s1 = (SerableSingleton) ois.readObject();
			ois.close();
			
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s1==s2);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
