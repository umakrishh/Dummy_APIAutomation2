package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.testing.testSteps.HttpMethods;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.JsonParsing;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.PropertiesHandle;

import io.restassured.response.Response;

public class TC1_PostRequest {
	
	public static String returnIDValue;

	public void testcase1() throws IOException
	{
		Properties p = PropertiesHandle.LoadProperties("../Dummy_API_Automation/URI.properties");
		String requestBody = JsonHandle.readJsonData("../Dummy_API_Automation/src/test/java/org/testing/resources/requestBody.json");
	System.out.println("Please enter the id value");
	Scanner s = new Scanner(System.in);
		Integer idValue = s.nextInt();		
		requestBody = JsonReplacement.assignJsonValue(requestBody, "id", idValue.toString());
		HttpMethods http = new HttpMethods(p);
		Response resobj = http.postMethod(requestBody, "QA1_URI");
		returnIDValue = JsonParsing.doParsing(resobj, "id");
		s.close();
	}
}
