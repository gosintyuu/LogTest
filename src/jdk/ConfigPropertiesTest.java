package jdk;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

public class ConfigPropertiesTest {

	// 初始化LogManager
	static {
		// 读取配置文件
		//根目录读区
		ClassLoader cl = ConfigPropertiesTest.class.getClassLoader();
		InputStream inputStream = null;
		if (cl != null) {
			inputStream = cl.getResourceAsStream("jdk.properties");
		} else {
			inputStream = ClassLoader
					.getSystemResourceAsStream("jdk.properties");
		}
		java.util.logging.LogManager logManager = java.util.logging.LogManager
				.getLogManager();
		try {
			// 重新初始化日志属性并重新读取日志配置。
			logManager.readConfiguration(inputStream);
		} catch (SecurityException e) {
			System.err.println(e);
		} catch (IOException e) {
			System.err.println(e);
		}
	}

	/**
	 * 获取日志对象
	 * @param clazz
	 * @return
	 */
	public static Logger getLogger(Class clazz) {
		Logger logger = Logger
				.getLogger(clazz.getName());
		return logger;
	}
	
	public static void main(String[] args) {
		Logger log = getLogger(ConfigPropertiesTest.class);
		log.info("this is my info msgaaa");
		log.fine("this is my fine msgaaaab");
		log.finest("this is my finest msgaaaa");
		log.warning("this is myx warning msga");
	}

}