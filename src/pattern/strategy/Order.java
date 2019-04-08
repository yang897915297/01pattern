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
		System.out.println("��ӭʹ��"+payment.getName());
		System.out.println("���ؽ��׽��Ϊ��"+ amount +",��ʼ�ۿ�....");
		return payment.pay(payKey, amount);
	}

}
