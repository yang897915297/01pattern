package pattern.factory.factoryMethod;

/**
 * 
 * 工厂方法模式---将对象的创建移到子类工厂中，每个子类工厂只创建一种产品
 *
 */
public class FactoryMethodTest {

	public static void main(String[] args) {
		JavaCourseFactory javaFactory = new JavaCourseFactory();
		ICourse course = javaFactory.create();
		course.recore();
	}
}
