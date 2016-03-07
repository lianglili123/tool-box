package org.eclilipse.ocean.node;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.client.ClientProtocolException;
import org.eclilipse.ocean.nodes.RestNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader=AnnotationConfigContextLoader.class)
public class RestNodeTest {
	private static String baseUrl = "http://localhost:8080/sample/";
	private static String mediaType = "xml";
	@Test
	public void testXml(){
		// prepare
		List<Integer> list = new ArrayList();
		list.add(1);
		list.add(2);

		// http call
		
		try {
			for (Integer item : list) {
				
				System.out.println("--------------------------------------");
				System.out.println(new RestNode(baseUrl+"/xml/"+item).get());

				System.out.println("--------------------------------------");
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void testJson(){
		// prepare
		List<Integer> list = new ArrayList();
		list.add(1);
		list.add(2);

		// http call
		
		try {
			for (Integer item : list) {
				
				System.out.println("--------------------------------------");
				System.out.println(new RestNode(baseUrl+"/json/"+item).get());

				System.out.println("--------------------------------------");
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
