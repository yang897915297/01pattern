package pattern.factory.factoryMethod;

/**
 * 
 * ��������ģʽ---������Ĵ����Ƶ����๤���У�ÿ�����๤��ֻ����һ�ֲ�Ʒ
 *
 */
public class FactoryMethodTest {

	public static void main(String[] args) {
		JavaCourseFactory javaFactory = new JavaCourseFactory();
		ICourse course = javaFactory.create();
		course.recore();
	}
}
