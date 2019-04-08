package pattern.protoType;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 
 * ԭ��ģʽ----����һ��ԭ���࣬��¡N��ʵ��
 *
 */
public class Client {
	public static void main(String[] args) throws CloneNotSupportedException, Exception {
		//ԭ��a����
		Resume a = new Resume("����", "��");
		
		//��¡b����
		Resume b = (Resume) a.clone();
		
		//ǳ��¡��ָ��ͬһ����ַ
		//�����Ƿ�ʽͬһ������   
		System.out.println(a.getName());
		System.out.println(b.getName());
		System.out.println(a.getName()==b.getName());
		System.out.println(a.getClass()==b.getClass());
		
//		BeanUtils.copy();  
		
		
		//-------------------------------------------------
		//ʹ�����л��ͷ����л�ʵ�����¡
		Resume s1 = new Resume("С��", "Ů");
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(s1);
		byte[] bytes = bos.toByteArray();
		
		ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
		ObjectInputStream ois = new ObjectInputStream(bis);
		//��¡�õĶ���
		Resume s2 = (Resume) ois.readObject();
		
		//����
		System.out.println(s1.getName());
		System.out.println(s2.getName());
		System.out.println(s1.getName()==s2.getName());
		System.out.println(s1.getClass()==s2.getClass());
	}

}
