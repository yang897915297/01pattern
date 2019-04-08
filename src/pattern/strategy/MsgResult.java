package pattern.strategy;

public class MsgResult {

	private int code;
	private String msg;
	private Object data;
	
	public MsgResult(int code, String msg, Object data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	@Override
	public String toString() {
		return "֧��״̬��["+code+"],"+ msg+",�������飺"+ data;
	}
	
	
	
}
