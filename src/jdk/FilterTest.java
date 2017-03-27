package jdk;

import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class FilterTest implements Filter{

	@Override
	public boolean isLoggable(LogRecord record) {
		String s = record.getMessage();
		if(s.endsWith("aaa")){
		return false;
		}
		return true;
	}

}
