package pattern.delegate;

import java.util.concurrent.ConcurrentHashMap;

public class Leader {
	
	ConcurrentHashMap<String, IEmployee> target = new ConcurrentHashMap<String, IEmployee>();
	
	public Leader(){
		target.put("Ç°¶Ë", new EmployeeA());
		target.put("ºóÌ¨", new EmployeeA());
	}

	public void doing(String commod){
		target.get(commod).doing(commod);;
	}
}
