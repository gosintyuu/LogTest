package jdk;

import java.io.UnsupportedEncodingException;
import java.util.logging.ConsoleHandler;
import java.util.logging.ErrorManager;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileHandlerTest {
	static Logger log = Logger.getLogger(FileHandlerTest.class.getName());
	public static void main(String[] args) throws SecurityException, Exception {
		// format
		FormatterTest formatter = new FormatterTest();

		// filter
		FilterTest filter = new FilterTest();

		// ErrorMessage
		ErrorManager e = new ErrorManager();

		// handler
		FileHandler fileHandler = new FileHandler("D:\\Temp\\jdkLog.log");
		fileHandler.setEncoding("UTF-8");
		fileHandler.setErrorManager(e);
		fileHandler.setFilter(filter);
		fileHandler.setFormatter(formatter);
		fileHandler.setLevel(Level.ALL);

		// log
		log.setLevel(Level.ALL);
		log.addHandler(fileHandler);

		log.info("this is my info msgaaa");
		log.fine("this is my fine msgaaaab");
		log.finest("this is my finest msgaaaa");
		log.warning("this is myx warning msga");
	}
}
