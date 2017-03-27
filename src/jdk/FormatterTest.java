package jdk;

import java.text.MessageFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class FormatterTest extends Formatter {

	Date dat = new Date();
	Date[] args = new Date[1];
	MessageFormat formatter = null;
	private final static String format = "start {0,date} {0,time}";

	@Override
	public String format(LogRecord record) {
		StringBuffer sb = new StringBuffer();
		// Minimize memory allocations here.
		dat.setTime(record.getMillis());
		args[0] = dat;
		StringBuffer text = new StringBuffer();
		if (formatter == null) {
			formatter = new MessageFormat(format);
		}
		formatter.format(args, text, null);
		sb.append(text);
		sb.append(" ");
		sb.append(record.getLoggerName());
		sb.append("\r\n");
		sb.append(record.getMessage());
		sb.append("\r\n");
		sb.append("\r\n");
		return sb.toString();
	}

}
