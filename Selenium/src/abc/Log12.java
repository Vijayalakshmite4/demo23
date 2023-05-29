package abc;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Log12 {
@Test
public void test1()
{
	//step1
	BasicConfigurator.configure();
	//step2
	Logger log=Logger.getLogger(this.getClass().getName());
	//step3
	log.warn("Warn");
	log.info("info");
	log.error("Error");
}
}
