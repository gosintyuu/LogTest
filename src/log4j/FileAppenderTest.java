package log4j;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class FileAppenderTest {

	static Logger logger = Logger.getLogger(FileAppenderTest.class);
	public static void main(String[] args) throws Exception{
		
		//layout
		PatternLayout p = new PatternLayout("%-4r[%t]%-5p%c%x - %m%n"); 
		
		//appender
		FileAppender consoleAppender = new FileAppender(p,"D:\\Temp\\log4j.log");
		consoleAppender.setEncoding("UTF-8");
		
		logger.setLevel(Level.ALL);
		logger.addAppender(consoleAppender);
		
		logger.info("this is my info msgaaa");
		logger.debug("this is my debug msgaaaab");
		logger.error("this is my error msgaaaa");
		logger.warn("this is myx warning msga");
	}
}
