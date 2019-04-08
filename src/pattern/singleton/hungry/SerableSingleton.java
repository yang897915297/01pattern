package pattern.singleton.hungry;

import java.io.Serializable;

/**
 * 
 * ���л�
 *
 */

public class SerableSingleton implements Serializable{

private static final SerableSingleton serableSingleton = new SerableSingleton();
	
	private SerableSingleton(){}
	
	public static SerableSingleton getInstance(){
		return serableSingleton;
	}
	//��ֹ���л���ʽ��������--����
	//��дreadResolve������ֻ�����Ǹ����˷����л������Ķ���
	//���Ǵ��������Σ�������JVM�㣬�൱��˵�Ƚϰ�ȫ
	//֮ǰ�����л������Ķ���ᱻGC����
	private Object readResolve(){
		return serableSingleton;
	}
}
