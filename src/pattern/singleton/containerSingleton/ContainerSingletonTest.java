package pattern.singleton.containerSingleton;

public class ContainerSingletonTest {
	public static void main(String[] args) {
		Object obj = ContainerSingleton.getBean("pattern.factory.simpleFactory.JavaCourse");
		System.out.println(System.currentTimeMillis()+"£º"+obj);
	}

}
