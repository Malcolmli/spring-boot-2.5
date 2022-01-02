package smoketest.tomcat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.net.URL;
import java.net.URLClassLoader;

public class UtilMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext();

	}

	private static void URLClassLoader() {
		URL[] urls = null;
		URLClassLoader loader = new URLClassLoader(urls);
		//loader.loadClass()
	}
}
