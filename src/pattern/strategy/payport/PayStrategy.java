package pattern.strategy.payport;

import java.util.HashMap;
import java.util.Map;

public class PayStrategy {

	public static final String ALI_PAY = "AliPay";
	public static final String JD_PAY = "JDPay";
	public static final String WECHAT_PAY = "wechatPay";
	public static final String DEFAULT_PAY = "AliPay";
	
	public static Map<String,Payment> payStrategy = new HashMap<String,Payment>();
	
	static{
		payStrategy.put(ALI_PAY, new AliPay());
		payStrategy.put(JD_PAY, new JDPay());
		payStrategy.put(WECHAT_PAY, new WeChatPay());
	}
	
	public static Payment get(String payKey){
		if(!payStrategy.containsKey(payKey)){
			return payStrategy.get(DEFAULT_PAY);
		}
		return payStrategy.get(payKey);
	}
}
