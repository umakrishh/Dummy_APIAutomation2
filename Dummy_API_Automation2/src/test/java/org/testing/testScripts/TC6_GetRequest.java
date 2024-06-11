package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HttpMethods;
import org.testing.utilities.PropertiesHandle;

public class TC6_GetRequest {
	
	public void testcase6() throws IOException
	{
		Properties p = PropertiesHandle.LoadProperties("../Dummy_API_Automation/URI.properties");
		HttpMethods http = new HttpMethods(p);
		//http.getAllMethod("QA_URI");
		//TC6_GetRequesthttp.getMethod("QA1_URI");
		http.getMethod("QA2_URI");
	}
}
