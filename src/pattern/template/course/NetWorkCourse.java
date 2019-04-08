package pattern.template.course;

public abstract class NetWorkCourse {

	public final void createCourse(){
		
		//1������Ԥϰ����
		this.postPreResource();
		
		
		//2������PPT�μ�
		this.createPPT();
		
		//.......
		//6��������ҵ����Щ������ҵ����Щ��û����ҵ
		//�������ҵ����Ҫ�����ҵ�����û����ҵ�����̽���
		if(needHomeWork()){
			checkHomeWork();
		}
		
	}

	abstract void checkHomeWork();

	//���ӷ���,��ʹ����΢��  -----������д�˷���
	public boolean needHomeWork() {
		return false;
	}

	final void createPPT() {
		System.out.println("����PPT�μ�");
		
	}

	final void postPreResource() {
		System.out.println("�ַ�Ԥϰ����");
		
	}
}
