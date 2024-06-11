package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;
import org.testing.testSteps.HttpMethods;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.PropertiesHandle;

public class TC4_PutRequest {
	
	public static String returnIDValue;

	public void testcase4() throws IOException
	{
		Properties p = PropertiesHandle.LoadProperties("../APIFWk/URI.properties");
		String requestBody = JsonHandle.readJsonData("../APIFWk/src/test/java/org/testing/resources/updateRequestBody.json");
				
		requestBody = JsonReplacement.assignJsonValue(requestBody, "id", TC1_PostRequest.returnIDValue);
		HttpMethods http = new HttpMethods(p);
		http.putMethod(requestBody, "QA_URI", TC1_PostRequest.returnIDValue);
		//returnIDValue = JsonParsing.doParsing(resobj, "id");
	}
}