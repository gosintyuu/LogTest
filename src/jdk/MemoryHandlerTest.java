package jdk;

import java.io.UnsupportedEncodingException;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.MemoryHandler;

public class MemoryHandlerTest {
	static Logger log = Logger.getLogger(MemoryHandlerTest.class.getName());
	public static void main(String[] args) throws SecurityException, UnsupportedEncodingException {
		
		log.setLevel(Level.INFO);
		
		//formatter
		FormatterTest formatter = new FormatterTest();
		
		//Filter
		FilterTest filter = new FilterTest();
		
		// Handler
		ConsoleHandler consoleHandler = new ConsoleHandler();
		MemoryHandler memoryHandler = new MemoryHandler(consoleHandler, 10,
				Level.ALL);
		memoryHandler.setEncoding("UTF-8");
		memoryHandler.setPushLevel(Level.INFO);
		consoleHandler.setFormatter(formatter);
		consoleHandler.setFilter(filter);
		
		log.addHandler(memoryHandler);
		
		log.info("this is my info msgaaa");
		log.fine("this is my fine msgaaaab");
		log.finest("this is my finest msgaaaa");
		log.warning("this is myx warning msga1");
		log.warning("this is myx warning msga2");
		log.warning("this is myx warning msga3");
		log.warning("this is myx warning msga4");
		log.warning("this is myx warning msga5");
		log.warning("this is myx warning msga6");
		log.warning("this is myx warning msga7");
		log.warning("this is myx warning msga8");
		log.warning("this is myx warning msga9");
		log.warning("this is myx warning msga10");
		log.warning("this is myx warning msga11");
		log.warning("this is myx warning msga12");
		log.warning("this is myx warning msga13");
		
	}
}


