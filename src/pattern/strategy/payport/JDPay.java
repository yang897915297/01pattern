package pattern.strategy.payport;

public class JDPay extends Payment{

	@Override
	public String getName() {
		return "¾©¶«°×Ìõ";
	}

	@Override
	public double queryBalance(String uid) {
		return 500;
	}

}
