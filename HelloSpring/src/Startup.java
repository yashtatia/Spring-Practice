import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
public class Startup {
	static void fx() {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		//Beans.xml can have any name
		Namaskara obj = (Namaskara) context.getBean("Namaskara");
		obj.setMessage("yeye");
		System.out.println(obj.getMessage());
		
		Message obj2 = (Message) context.getBean("Message");
		obj2.setMessage("Virappan");
		System.out.println(obj.getMessage());
		
		Message obj3 = (Message) context.getBean("Message1");
		obj3.setMessage("Virappan");
		System.out.println(obj.getMessage());
		System.out.println("Is Singleton " + context.isSingleton("Namaskara"));
		context.registerShutdownHook(); //disables finalize
	}
	public static void main(String[] args) {
		fx();
		System.gc();
	}
}