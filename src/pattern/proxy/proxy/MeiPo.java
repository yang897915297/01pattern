package pattern.proxy;

public class MeiPo implements Man {
	
	private Man man;
	
	public MeiPo(final Man man){
		this.man = man;
	}

	@Override
	public void findGirlFriend() {
		System.out.println("我时媒婆，我会帮你的，请说出你的要求");
		man.findGirlFriend();
		System.out.println("我的任务完成了！");
	}

}
