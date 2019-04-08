package pattern.adapter.poweradapter;

public class PowerAdapter implements DC5{
	private ACC220 acc220 ;
	
	public PowerAdapter(ACC220 acc220){
		this.acc220 = acc220;
	}
	
	@Override
	public int outputACC5V() {
		int adapterInput = acc220.outputACC220V();
		int adapterOutput = adapterInput/44;
		System.out.println("ʹ��Adapter����AC��" + adapterInput + "V�����AC��" + adapterOutput +"V");
		return adapterOutput;
	}

}
