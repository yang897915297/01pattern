package pattern.singleton.hungry;

/**
 * 
 * ����ʽ����
 *
 */
public class HungrySingleton {

	private static final HungrySingleton hungrySingleton = new HungrySingleton();
	
	private HungrySingleton(){}
	
	public static HungrySingleton getInstance(){
		return hungrySingleton;
	}
}
