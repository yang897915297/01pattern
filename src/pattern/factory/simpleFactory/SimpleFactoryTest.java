package pattern.factory.simpleFactory;
/**
 * 
 * 简单工厂模式
 *
 */
public class SimpleFactoryTest {

//	//1、普通创建方式
//	public static void main(String[] args) {
//		SimpleFatory facFatory = new SimpleFatory();
//		ICourse course = facFatory.create("Java");
//		course.recore();
//	}
	
	//2、反射
	public static void main(String[] args) {
		SimpleFatory facFatory = new SimpleFatory();
		ICourse course = facFatory.create("pattern.fatory.simpleFactory.JavaCourse");
		course.recore();
		
		ICourse course1 = facFatory.create1(JavaCourse.class);
		course1.recore();
	}
}
