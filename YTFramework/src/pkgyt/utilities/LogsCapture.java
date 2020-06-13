package pkgyt.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogsCapture {

public static void takelogs(String classname, String message)

{

DOMConfigurator.configure("../YTFramework/LogsLayout.xml");
Logger l = Logger.getLogger(classname);
l.info(message);
	
}
	
	
}
