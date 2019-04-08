package pattern.factory.abstractFactory;

/**
 * 
 * 抽象工厂模式----生产不同产品族和产品等级的产品
 *
 */
public class AbstractFactoryTest {

	public static void main(String[] args) {
		ICourseFactory factory = new JavaCourseFactory();
		factory.create().recore();
		factory.save().write();
	}
}
