package pattern.proxy2019.staticProxy;

public class Father implements Person {
	private Person person;

	public Father(Person person){
		this.person = person;
	}
	
	public void findLove(){
		System.out.println("父亲帮儿子物色对象了");
		this.person.findLove();
		System.out.println("等父母双方都同意，就可以领证了");
	}
}
