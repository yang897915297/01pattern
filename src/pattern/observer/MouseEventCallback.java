package pattern.observer;

/**
 * 回调响应的逻辑，由自己实现
 * @author lenovo
 *
 */
public class MouseEventCallback {
	
	public void click(Event e){
		System.out.println("这是鼠标单击之后的逻辑");
		System.out.println("=========触发鼠标单击事件==========\n" + e);
	}
	
	public void doubleClick(Event e){
		System.out.println("=========触发鼠标双击事件==========\n" + e);
	}
	
	public void move(Event e){
		System.out.println("=========触发鼠标移动事件==========\n" + e);
	}
	
	public void down(Event e){
		System.out.println("=========触发鼠标按下事件==========\n" + e);
	}
	

	public void advice(Event e){
		System.out.println("=========触发事件，打印日志==========\n" + e);
	}
}
