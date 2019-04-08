package pattern.singleton.hungry;

/**
 * 
 * ¶öººÊ½µ¥Àý
 *
 */
public class HungrySingleton {

	private static final HungrySingleton hungrySingleton = new HungrySingleton();
	
	private HungrySingleton(){}
	
	public static HungrySingleton getInstance(){
		return hungrySingleton;
	}
}
