package org.eclilipse.ocean;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class RestClient {
	public RestClient(String requestUrl) {
		super();
		this.requestUrl = requestUrl;
	}

	public RestClient(){
		
	}

	private String requestUrl;

	
	public String get() throws ClientProtocolException, IOException{
		String responseStr="";
		String line;
		HttpClient httpClient = HttpClientBuilder.create().build();
		HttpGet getRequest=new HttpGet(requestUrl);
		HttpResponse response;
		response=httpClient.execute(getRequest);
		BufferedReader br = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
		while ((line = br.readLine()) != null) {
			responseStr=responseStr+line+"¥n";
		}

		return responseStr;
	}
	

}
