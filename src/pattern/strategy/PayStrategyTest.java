package pattern.strategy;

import pattern.strategy.payport.PayStrategy;

/**
 * 
 * ����ģʽ---�ṩһЩ�㷨�����û�����ѡ��
 *
 */
public class PayStrategyTest {

	public static void main(String[] args) {
		Order order = new Order("1", "20190403000001", 342.54);
		MsgResult result = order.pay(PayStrategy.JD_PAY);
		System.out.println(result.toString());
	}
}
