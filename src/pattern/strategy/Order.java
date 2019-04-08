package pattern.strategy;

import pattern.strategy.payport.PayStrategy;
import pattern.strategy.payport.Payment;

public class Order {
	private String uid;
	private String orderId;
	private double amount;
	
	public Order(String uid, String orderId, double amount) {
		this.uid = uid;
		this.orderId = orderId;
		this.amount = amount;
	}
	
	public MsgResult pay(String payKey){
		Payment payment = PayStrategy.get(payKey); 
		System.out.println("欢迎使用"+payment.getName());
		System.out.println("本地交易金额为："+ amount +",开始扣款....");
		return payment.pay(payKey, amount);
	}

}
