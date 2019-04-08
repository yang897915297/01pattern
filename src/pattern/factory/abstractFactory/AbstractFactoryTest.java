package pattern.factory.abstractFactory;

/**
 * 
 * ���󹤳�ģʽ----������ͬ��Ʒ��Ͳ�Ʒ�ȼ��Ĳ�Ʒ
 *
 */
public class AbstractFactoryTest {

	public static void main(String[] args) {
		ICourseFactory factory = new JavaCourseFactory();
		factory.create().recore();
		factory.save().write();
	}
}
