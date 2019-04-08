package pattern.proxy;

import java.lang.reflect.Proxy;

public class ProxyTest {

	public static void main(String[] args) {
		//静态代理
		System.out.println("--------静态代理---------");
		Man zhangsan = new ZhangSan();
		MeiPo meipo = new MeiPo(zhangsan);
		meipo.findGirlFriend();
		
		
		System.out.println("--------动态代理---------");
		Man zhangsan1 = new ZhangSan();
		SynMeiPo meipo1 = new SynMeiPo(zhangsan1);
		Man manproxy = (Man) Proxy.newProxyInstance(SynMeiPo.class.getClassLoader(), new Class[]{Man.class}, meipo1);
		manproxy.findGirlFriend();
	}
}
