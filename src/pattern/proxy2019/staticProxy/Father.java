package pattern.proxy2019.staticProxy;

public class Father implements Person {
	private Person person;

	public Father(Person person){
		this.person = person;
	}
	
	public void findLove(){
		System.out.println("���װ������ɫ������");
		this.person.findLove();
		System.out.println("�ȸ�ĸ˫����ͬ�⣬�Ϳ�����֤��");
	}
}
