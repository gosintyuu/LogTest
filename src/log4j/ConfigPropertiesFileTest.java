package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class ConfigPropertiesFileTest {

	static {
		String filePath = "config\\log4j.properties";
		System.out.println("日志的配置文件路径为：" + filePath);
		if (filePath != null) {
			PropertyConfigurator.configure(filePath); // 载入配置文件
			System.out.println("日志的配置文件读取成功");
		}
	}

	public static Logger getLogger(Class cls) {
		return Logger.getLogger(cls.getName());
	}
    てからというもの    そばから    なり    おいかける    が早いか    にあって　在。。。    において　における    門出    というところだ　＝　せいぜいだ    今年度を限りに　最後の。。    //皮切りにして    //んがため　積極的に行動    　仲立ち
	public static void main(String[] args) {
		Logger logger = getLogger(ConfigPropertiesFileTest.class);
		logger.info("this is my info msgmsgaaamsgaaamsgaaamsgaaamsgaaamsgaaamsgaaaaaa");
		logger.debug("this is my debug msgmsgmsgaaamsgaaamsgaaamsgaaamsgaaamsgaaamsgaaaaaaaaaab");
		logger.error("this is my error msgmsgmsgaaamsgaaamsgaaamsgaaamsgaaamsgaaamsgaaaaaaaaaa");
		logger.warn("this is myx warning mmsgmsgaaamsgaaamsgaaamsgaaamsgaaamsgaaamsgaaaaaasga");
	}
}
