package pattern.decorator;

public class XiangChangDecorator extends BattercakeDecorater{

	public XiangChangDecorator(Battercake battercake) {
		super(battercake);
	}

	@Override
	public String getMsg() {
		// TODO Auto-generated method stub
		return super.getMsg()+"+1¸öÏã³¦";
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice()+2;
	}
}
