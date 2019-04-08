package pattern.singleton.enumSingleton;
/**
 * ����ע��ʽ����
 * ö������
 * ����ʹ�õĵ���ģʽ
 * ��JDK�����Ϊö�ٲ��������л��ͷ����ƻ����ݻ���
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
