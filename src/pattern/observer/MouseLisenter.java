package pattern.observer;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class MouseLisenter {
	
	protected Map<Enum,Event> events = new HashMap<Enum,Event>();
	
	public void addListenter(Enum eventType , Object target ,Method callback){
		//ע���¼�
		//�÷�������������
		events.put(eventType, new Event(target,callback));
	}
	
	private void  trigger(Event e){
		e.setSource(this);
		e.setTime(System.currentTimeMillis());
		
		try{
			
			e.getCallBack().invoke(e.getTarget(), e);
			
		}catch(Exception e1){
			e1.printStackTrace();
		}
	}
	
	protected void trigger(Enum call){
		if(!this.events.containsKey(call)){
			return;
		}
		trigger(this.events.get(call).setTrigger(call.toString()));
	}

}
