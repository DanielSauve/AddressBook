import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringLauncher {
    public static void main(String[] args) {
        String[] contextPaths = new String[]{"META-INF/spring-config.xml"};
        new ClassPathXmlApplicationContext(contextPaths);
    }
}
