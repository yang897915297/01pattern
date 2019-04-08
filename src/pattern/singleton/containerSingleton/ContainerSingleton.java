package pattern.singleton.containerSingleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册式单例---容器式
 * spring使用方式
 *
 */
public class ContainerSingleton {

	private ContainerSingleton(){}
	
	private static Map<String,Object> ioc = new ConcurrentHashMap<String,Object>();
	
	public static Object getBean(String className){
		synchronized(ioc){
			if(!ioc.containsKey(className)){
				Object obj =null; 
				try{
					obj = Class.forName(className).newInstance();
					ioc.put(className, obj);
				}catch(Exception e){
					e.printStackTrace();
				} 
				return obj;
			}
			return ioc.get(className);
		}	
	}
}
