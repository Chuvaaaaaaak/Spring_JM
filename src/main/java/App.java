import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(helloWorld.getMessage());
        System.out.println(bean == helloWorld);

        Cat cat = (Cat) applicationContext.getBean("Cat");
        System.out.println(cat.getMessage());
        Cat cat2 = (Cat) applicationContext.getBean("Cat");
        System.out.println(cat2.getMessage());
        System.out.println(cat == cat2);
    }
}