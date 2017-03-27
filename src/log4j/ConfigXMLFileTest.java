package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

public class ConfigXMLFileTest {

	static {
		String filePath = "config\\log4j.xml";
		System.out.println("日志的配置文件路径为：" + filePath);
		if (filePath != null) {
			DOMConfigurator.configure(filePath);//
			System.out.println("日志的配置文件读取成功");
		}
	}

	public static Logger getLogger(Class cls) {
		return Logger.getLogger(cls.getName());
	}

	public static void main(String[] args) {
		//Logger logger = getLogger(ConfigXMLFileTest.class);
		Logger logger = getLogger(ConfigXMLFileTest.class);
		logger.info("this is my info msgmsgaaamsgaaamsgaaamsgaaamsgaaamsgaaamsgaaaaaa");
		logger.debug("this is my debug msgmsgmsgaaamsgaaamsgaaamsgaaamsgaaamsgaaamsgaaaaaaaaaab");
		logger.error("this is my error msgmsgmsgaaamsgaaamsgaaamsgaaamsgaaamsgaaamsgaaaaaaaaaa");
		logger.warn("this is myx warning mmsgmsgaaamsgaaamsgaaamsgaaamsgaaamsgaaamsgaaaaaasga");
	}
}
