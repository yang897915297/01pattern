package pattern.factory.abstractFactory;

public class JavaCourseFactory implements ICourseFactory{

	@Override
	public ICourse create() {
		return new JavaCourse();
	}

	@Override
	public INote save() {
		return new JavaNote();
	}

}
