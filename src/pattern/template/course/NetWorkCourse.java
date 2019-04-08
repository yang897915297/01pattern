package pattern.template.course;

public abstract class NetWorkCourse {

	public final void createCourse(){
		
		//1、发布预习资料
		this.postPreResource();
		
		
		//2、制作PPT课件
		this.createPPT();
		
		//.......
		//6、布置作业，有些课有作业，有些课没有作业
		//如果有作业，需要检查作业，如果没有作业，流程结束
		if(needHomeWork()){
			checkHomeWork();
		}
		
	}

	abstract void checkHomeWork();

	//钩子方法,供使用者微调  -----子类重写此方法
	public boolean needHomeWork() {
		return false;
	}

	final void createPPT() {
		System.out.println("制作PPT课件");
		
	}

	final void postPreResource() {
		System.out.println("分发预习资料");
		
	}
}
