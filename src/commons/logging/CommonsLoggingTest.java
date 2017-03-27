package commons.logging;

import org.apache.commons.logging.Log;
import  org.apache.commons.logging.LogFactory;

public class CommonsLoggingTest {
	  private static Log log = LogFactory.getLog(CommonsLoggingTest.class);
	public static void main(String[] args) {
		log.info("this is my info msgaaa");
		log.debug("this is my debug msgaaaab");
		log.error("this is my error msgaaaa");
		log.warn("this is myx warning msga");
	}
}
