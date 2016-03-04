package org.eclilipse.ocean;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.client.ClientProtocolException;

public class Runner {
	private static String baseUrl = "http://localhost:8080/rest/";
	private static String mediaType = "xml";

	public static void main(String[] args) {

		// prepare
		List<Integer> list = new ArrayList();
		list.add(1);
		list.add(2);

		// http call
		
		try {
			for (Integer item : list) {
				
				System.out.println("--------------------------------------");
				System.out.println(new RestClient(baseUrl+"/"+mediaType+"/"+item).get());

				System.out.println("--------------------------------------");
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
