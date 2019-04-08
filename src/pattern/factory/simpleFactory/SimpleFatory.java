package pattern.factory.simpleFactory;

public class SimpleFatory {

//	//1����ͨ������ʽ
//	public ICourse create(String name){
//		if("Java".equals(name)){
//			return new JavaCourse();
//		}else{
//			System.out.println("δ�ҵ���ؿγ�");
//		}
//		return null;
//	}
	
	//2������
	public ICourse create(String className){
		if(null !=className || !"".equals(className)){
			try {
				return (ICourse) Class.forName(className).newInstance();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	//3������
	public ICourse create1(Class clazz){
		if(clazz != null){
			try {
				return (ICourse) clazz.newInstance();
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
		return null;
	}
}
