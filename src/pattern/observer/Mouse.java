package pattern.observer;


public class Mouse extends MouseLisenter implements DongZuo{
	
	//通常采用动态代理来实现监控，防止代码侵入 
	public void click(){
		System.out.println("鼠标单击事件");
		
		//这一句代码事件上是侵入式的代码
		//invoker()
		//proxy 类，method 参数值
		//根据所调用的方法去动态的判断触发哪个事件
		//也可以用策略模式
		//事先配置好方法和触发事件的关系
		//Map<String,MouseEventType> map;
		//map.put("click",ON_CLICK);
		//MAP.PUT("",xxx);
		
		this.trigger(MouseEventType.ON_CLICK);
	}
	public void doubleClick(){
		System.out.println("鼠标双击事件");
		trigger(MouseEventType.ON_DOUBLE_CLICK);
	}
	public void move(){
		System.out.println("鼠标移动事件");
		trigger(MouseEventType.ON_MOVE);
	}
	public void down(){
		System.out.println("鼠标按下事件");
		trigger(MouseEventType.ON_DOWN);
	}

}
