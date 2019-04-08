package pattern.adapter;

import pattern.adapter.poweradapter.ACC220;
import pattern.adapter.poweradapter.DC5;
import pattern.adapter.poweradapter.PowerAdapter;

/**
 * 
 * 适配器模式---转接头--登陆---引用适配的对象，has-a关系   注重兼容-转换
 * XXX instanceof  
 *
 */
public class AdapterTest {
	public static void main(String[] args) {
		DC5 dc5 = new PowerAdapter(new ACC220());
		dc5.outputACC5V();
	}

}
