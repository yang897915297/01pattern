package pattern.factory.simpleFactory;
/**
 * 
 * �򵥹���ģʽ
 *
 */
public class SimpleFactoryTest {

//	//1����ͨ������ʽ
//	public static void main(String[] args) {
//		SimpleFatory facFatory = new SimpleFatory();
//		ICourse course = facFatory.create("Java");
//		course.recore();
//	}
	
	//2������
	public static void main(String[] args) {
		SimpleFatory facFatory = new SimpleFatory();
		ICourse course = facFatory.create("pattern.fatory.simpleFactory.JavaCourse");
		course.recore();
		
		ICourse course1 = facFatory.create1(JavaCourse.class);
		course1.recore();
	}
}
