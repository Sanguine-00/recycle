package njci.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(format.format(new Date()));
	}

}
