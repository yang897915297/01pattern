package pattern.template;

import pattern.template.course.BigDataCourse;
import pattern.template.course.JavaCourse;
import pattern.template.course.NetWorkCourse;

/**
 * 
 * ���̲��䣬���ƻ����Ե�ʵ��
 * һ����ʵ��һ���㷨����Ĳ��֣������ɱ�Ĳ��ֽ�������ʵ��
 * �磺��-�ϰ�-���緹-���극-�°�    ÿ������̲��䣬�����ϰ��ҿ���������ȥ��Ҳ����������ȥ
 *
 */
public class Test {
	public static void main(String[] args) {
		System.out.println("----Java�ܹ�ʦ�γ�----");
		NetWorkCourse work = new JavaCourse();
		work.createCourse();
		
		System.out.println("----�����ݿγ�----");
		NetWorkCourse work1 = new BigDataCourse(true);
		work1.createCourse();
	}

}
