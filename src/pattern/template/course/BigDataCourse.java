package pattern.template.course;

public class BigDataCourse extends NetWorkCourse{
	
	private boolean needHomeWork = false;
	
	

	public BigDataCourse(boolean needHomeWork) {
		this.needHomeWork = needHomeWork;
	}



	@Override
	void checkHomeWork() {
		System.out.println("检查大数据课程作业");
		
	}



	@Override
	public boolean needHomeWork() {
		// TODO Auto-generated method stub
		return this.needHomeWork;
	}

}
