package jdk;

import java.util.logging.ConsoleHandler;
import java.util.logging.ErrorManager;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConsoleHandlerTest {
	static Logger log = Logger.getLogger(ConsoleHandlerTest.class.getName());
	
	public static void main(String[] args) throws Exception{
		
		//format
		FormatterTest formatter = new FormatterTest();
		
		//filter
		FilterTest filter = new FilterTest();
		
		//ErrorMessage
		ErrorManager e =new ErrorManager();

		//handler
		ConsoleHandler consoleHandler= new ConsoleHandler();
		consoleHandler.setEncoding("UTF-8");
		//consoleHandler.setErrorManager(e);
		consoleHandler.setFilter(filter);
		consoleHandler.setFormatter(formatter);
		consoleHandler.setLevel(Level.ALL);
		
		//log
		log.setLevel(Level.ALL);
		log.addHandler(consoleHandler);
		
		log.info("this is my info msgaaaa");
		log.fine("this is my fine msgaaaa");
		log.finest("this is my finest msgaaaac");
		log.warning("this is myx warning msga");
		
	}
}
