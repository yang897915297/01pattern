package pattern.observer;

import java.lang.reflect.Method;

public class Event {
	
	//�¼�Դ
	private Object source;
	
	//֪ͨĿ��
	private Object target;
	
	//�ص�
	private Method callBack;
	
	//����
	private String trigger;
	
	private Long time;

	public Event(Object target, Method callBack) {
		super();
		this.target = target;
		this.callBack = callBack;
	}

	public Object getSource() {
		return source;
	}

	public Event setSource(Object source) {
		this.source = source;
		return this;
	}

	public Object getTarget() {
		return target;
	}

	public Event setTarget(Object target) {
		this.target = target;
		return this;
	}

	public Method getCallBack() {
		return callBack;
	}

	public Event setCallBack(Method callBack) {
		this.callBack = callBack;
		return this;
	}

	public String getTrigger() {
		return trigger;
	}

	Event setTrigger(String trigger) {
		this.trigger = trigger;
		return this;
	}

	public Long getTime() {
		return time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Event ["
				+ "\tsource=" + source + ",\n"
				+ "\ttarget=" + target + ",\n"
				+ "\tcallBack="+ callBack + ",\n"
				+ "\ttrigger=" + trigger + "]\n";
	}

	
	
}
