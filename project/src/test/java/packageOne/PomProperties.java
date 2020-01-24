package packageOne;
import java.io.IOException;
import java.util.Properties;

public class PomProperties {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		Class cls = Class.forName("PomProperties");
		ClassLoader cLoader = cls.getClassLoader();
		java.io.InputStream is = cls.getResourceAsStream("my.properties");
		java.util.Properties p = new Properties();
		p.load(is);
		String name = p.getProperty("name");
		String version = p.getProperty("version");
		String foo = p.getProperty("foo");

		System.out.println(name + version + foo);
	}

}
