package pattern.decorator;

public class BattercakeDecorater extends Battercake{
	
	private Battercake battercake;
	

	public BattercakeDecorater(Battercake battercake) {
		this.battercake = battercake;
	}

	@Override
	public String getMsg() {
		return this.battercake.getMsg();
	}

	@Override
	public int getPrice() {
		return this.battercake.getPrice();
	}

}
