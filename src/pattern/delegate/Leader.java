package pattern.delegate;

import java.util.concurrent.ConcurrentHashMap;

public class Leader {
	
	ConcurrentHashMap<String, IEmployee> target = new ConcurrentHashMap<String, IEmployee>();
	
	public Leader(){
		target.put("ǰ��", new EmployeeA());
		target.put("��̨", new EmployeeA());
	}

	public void doing(String commod){
		target.get(commod).doing(commod);;
	}
}
