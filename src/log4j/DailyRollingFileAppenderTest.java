package log4j;

import org.apache.log4j.DailyRollingFileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class DailyRollingFileAppenderTest {

	static Logger logger = Logger.getLogger(DailyRollingFileAppenderTest.class);
	public static void main(String[] args)throws Exception {
		
		//layout
		PatternLayout p = new PatternLayout("%-4r[%t]%-5p%c%x - %m%n"); 
		
		//appender
		DailyRollingFileAppender dalyRollingFileAppender = new DailyRollingFileAppender(p,"D:\\Temp\\log4j.log","yyyy-MM-dd'.log'");
		dalyRollingFileAppender.setEncoding("UTF-8");
		
		
		logger.setLevel(Level.ALL);
		logger.addAppender(dalyRollingFileAppender);
		
		logger.info("this is my info msgaaa");
		logger.debug("this is my debug msgaaaab");
		logger.error("this is my error msgaaaa");
		logger.warn("this is myx warning msga");
		
	}
}
