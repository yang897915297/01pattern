package pattern.adapter;

import pattern.adapter.poweradapter.ACC220;
import pattern.adapter.poweradapter.DC5;
import pattern.adapter.poweradapter.PowerAdapter;

/**
 * 
 * ������ģʽ---ת��ͷ--��½---��������Ķ���has-a��ϵ   ע�ؼ���-ת��
 * XXX instanceof  
 *
 */
public class AdapterTest {
	public static void main(String[] args) {
		DC5 dc5 = new PowerAdapter(new ACC220());
		dc5.outputACC5V();
	}

}
