package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HttpMethods;
import org.testing.utilities.PropertiesHandle;

public class TC5_deleteRequest {

	public void testcase5() throws IOException
	{
		Properties p = PropertiesHandle.LoadProperties("../Dummy_API_Automation/URI.properties");
		HttpMethods http = new HttpMethods(p);
		http.deleteMethod("QA3_URI",TC1_PostRequest.returnIDValue);
	}
}
