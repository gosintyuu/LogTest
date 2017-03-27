package log4j;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.DailyRollingFileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.RollingFileAppender;

public class RollingFileAppenderTest {

	static Logger logger = Logger.getLogger(RollingFileAppenderTest.class);
	public static void main(String[] args)throws Exception {
		
		//layout
		PatternLayout p = new PatternLayout("%-4r[%t]%-5p%c%x - %m%n"); 
		
		//appender
		RollingFileAppender rollingFileAppender = new RollingFileAppender(p,"D:\\Temp\\log4j.log");
		rollingFileAppender.setEncoding("UTF-8");
		rollingFileAppender.setMaxFileSize("5");
		rollingFileAppender.setMaxBackupIndex(3);
		
		logger.setLevel(Level.ALL);
		logger.addAppender(rollingFileAppender);
		
		logger.info("this is my info msgaaamsgaaamsgaaamsgaaamsgaaamsgaaamsgaaamsgaaamsgaaamsgaaamsgaaa");
		logger.debug("this is my debug msgaaamsgaaamsgaaamsgaaamsgaaamsgaaamsgaaamsgaaamsgaaamsgaaamsgaaa");
		logger.error("this is my error msgaaamsgaaamsgaaamsgaaamsgaaamsgaaamsgaaamsgaaamsgaaamsgaaamsgaaa");
		logger.warn("this is myx warning msgaaamsgaaamsgaaamsgaaamsgaaamsgaaamsgaaamsgaaamsgaaamsgaaamsgaaa");
		
	}
}
