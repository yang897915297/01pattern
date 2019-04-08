package pattern.decorator;

/**
 * 
 * 装饰者模式 --都实现同一个接口，is-a关系，注重增强、扩展
 *
 */
public class DecoratorTest {
	
	public static void main(String[] args) {
		Battercake battercake;
		//路边买一个煎饼，一个基本的类
		battercake = new BaseBattercake();
		//煎饼有点小，加一个鸡蛋
		battercake = new EggDecorator(battercake);
		//今天太饿了，再加一个香肠
		battercake = new XiangChangDecorator(battercake);
		//好像不太够，再加一个香肠吧
		battercake = new XiangChangDecorator(battercake);
		System.out.println(battercake.getMsg()+"，总价："+battercake.getPrice());
	}

}
