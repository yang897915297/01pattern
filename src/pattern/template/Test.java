package pattern.template;

import pattern.template.course.BigDataCourse;
import pattern.template.course.JavaCourse;
import pattern.template.course.NetWorkCourse;

/**
 * 
 * 流程不变，定制化个性的实现
 * 一次性实现一个算法不变的部分，并将可变的部分交给子类实现
 * 如：起床-上班-吃午饭-吃完饭-下班    每天的流程不变，但是上班我可以坐地铁去，也可以坐公交去
 *
 */
public class Test {
	public static void main(String[] args) {
		System.out.println("----Java架构师课程----");
		NetWorkCourse work = new JavaCourse();
		work.createCourse();
		
		System.out.println("----大数据课程----");
		NetWorkCourse work1 = new BigDataCourse(true);
		work1.createCourse();
	}

}
