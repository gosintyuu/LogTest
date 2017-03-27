package log4j;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class ConsoleAppenderTest {

	static Logger logger = Logger.getLogger(ConsoleAppenderTest.class);
	public static void main(String[] args) throws Exception{
		
		
		//layout
		PatternLayout p = new PatternLayout("%-4r[%t]%-5p%c%x - %m%n"); 
		
		//appender
		ConsoleAppender consoleAppender = new ConsoleAppender(p,ConsoleAppender.SYSTEM_OUT);
		consoleAppender.setEncoding("UTF-8");
		
		logger.setLevel(Level.ALL);
		logger.addAppender(consoleAppender);
		
		logger.info("this is my info msgaaa");
		logger.debug("this is my debug msgaaaab");
		logger.error("this is my error msgaaaa");
		logger.warn("this is myx warning msga");
		
		
		
	}
}
