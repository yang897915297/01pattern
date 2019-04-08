package pattern.strategy;

import pattern.strategy.payport.PayStrategy;

/**
 * 
 * 策略模式---提供一些算法，供用户自由选择
 *
 */
public class PayStrategyTest {

	public static void main(String[] args) {
		Order order = new Order("1", "20190403000001", 342.54);
		MsgResult result = order.pay(PayStrategy.JD_PAY);
		System.out.println(result.toString());
	}
}
