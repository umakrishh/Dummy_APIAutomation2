package org.testing.trigger;

import java.io.IOException;

import org.testing.testScripts.TC1_PostRequest;
import org.testing.testScripts.TC2_GetAllRequest;
import org.testing.testScripts.TC3_GetParticularRequest;
import org.testing.testScripts.TC4_PutRequest;
import org.testing.testScripts.TC5_deleteRequest;
import org.testing.testScripts.TC6_GetRequest;

public class trigger {

	public static void main(String[] args) throws IOException {
		
	
		System.out.println("*********TC1_PostRequest is executing************");
		TC1_PostRequest tc1 = new TC1_PostRequest();
		tc1.testcase1();
		
		System.out.println("*********TC2_GetAllRequest is executing*********");
		TC2_GetAllRequest tc2 = new TC2_GetAllRequest();
		tc2.testcase2();
		
		System.out.println("*********TC3_GetParticularRequest is executing*********");
		TC3_GetParticularRequest tc3 = new TC3_GetParticularRequest();
		tc3.testcase3();
		
	//	System.out.println("*********TC4_PutRequest is executing*********");
	//	TC4_PutRequest tc4 = new TC4_PutRequest();
	//	tc4.testcase4();
		
		System.out.println("*********TC5_deleteRequest is executing*********");
		TC5_deleteRequest tc5 = new TC5_deleteRequest();
		tc5.testcase5();
		
		System.out.println("*********TC6_GetRequest is executing*********");
		TC6_GetRequest tc6 = new TC6_GetRequest();
		tc6.testcase6();
	}
}
