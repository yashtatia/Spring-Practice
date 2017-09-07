import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Entry {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

	  System.out.println("\n ********** Dependency Injection - Setter*******");
      TextEditor te = (TextEditor) context.getBean("textEditor");
      te.spellCheck();
   }
}