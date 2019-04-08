package pattern.decorator;

public class EggDecorator extends BattercakeDecorater{

	public EggDecorator(Battercake battercake) {
		super(battercake);
	}

	@Override
	public String getMsg() {
		// TODO Auto-generated method stub
		return super.getMsg()+"+1¸ö¼¦µ°";
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice()+1;
	}

	
	

}
