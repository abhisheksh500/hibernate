package bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class emp {
	public static void main(String arg[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("empl.xml");
		pojo e1 = (pojo) context.getBean("emp1");
		System.out.println(e1);
	}
}
