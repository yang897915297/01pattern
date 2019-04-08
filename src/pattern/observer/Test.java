package pattern.observer;
import java.lang.reflect.Method;

public class Test {
	public static void main(String[] args) {
		
		try{

			//�۲���
			MouseEventCallback obServer = new MouseEventCallback();
			Method callback = MouseEventCallback.class.getMethod("click", new Class<?>[]{Event.class});
			
			//���۲���
			Mouse mouse = new Mouse();
			mouse.addListenter(MouseEventType.ON_CLICK, obServer, callback);
			
			
			mouse.click();
			mouse.move();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
