package jdk;

import java.util.logging.ErrorManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SocketHandler;

public class SocketHandlerTest {
	static Logger log = Logger.getLogger(SocketHandlerTest.class.getName());
	public static void main(String[] args) throws SecurityException, Exception {
		// format
		FormatterTest formatter = new FormatterTest();

		// filter
		FilterTest filter = new FilterTest();

		// ErrorMessage
		ErrorManager e = new ErrorManager();

		// handler
		SocketHandler socketHandler = new SocketHandler("localhost",1222);
		socketHandler.setEncoding("UTF-8");
		socketHandler.setErrorManager(e);
		socketHandler.setFilter(filter);
		socketHandler.setFormatter(formatter);
		socketHandler.setLevel(Level.ALL);

		// log
		log.setLevel(Level.ALL);
		log.addHandler(socketHandler);

		log.info("this is my info msgaaa");
		log.fine("this is my fine msgaaaab");
		log.finest("this is my finest msgaaaa");
		log.warning("this is myx warning msga");
	}
}
