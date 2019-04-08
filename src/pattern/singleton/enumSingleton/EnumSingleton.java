package pattern.singleton.enumSingleton;
/**
 * 属于注册式单例
 * 枚举类型
 * 建议使用的单例模式
 * 从JDK层面就为枚举不被反序列化和反射破坏保驾护航
 *
 */
public enum EnumSingleton {

	INSTANCE;
	
	private Object data;

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	public static EnumSingleton getInstance(){return INSTANCE;}
}
