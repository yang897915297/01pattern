package pattern.strategy.payport;

public class WeChatPay extends Payment{

	@Override
	public String getName() {
		return "΢��֧��";
	}

	@Override
	public double queryBalance(String uid) {
		return 120;
	}

}
