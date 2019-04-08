package pattern.strategy.payport;

public class AliPay extends Payment{

	@Override
	public String getName() {
		return "Ö§¸¶±¦Ö§¸¶";
	}

	@Override
	public double queryBalance(String uid) {
		return 800;
	}

}
