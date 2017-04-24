package com.ccproject2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class YelpApis {
	private static final String BASE_URL="https://api.yelp.com/v3/";
	private static final String SEARCH_URL="businesses/search";
	private static final String SEARCH_BUSINESS="businesses/";
	private static final String REVIEWS_URL="/reviews";
	private HttpURLConnection conn;
	
	public void searchRestaurant(String name) {
		try {
			URL url = new URL(BASE_URL+SEARCH_BUSINESS+name);
			System.out.println(url);
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-Type", "application/json");
			conn.setRequestProperty("Authorization", "Bearer Qq4n0uf_IeDA6eSCuDg0JQawSMoFkCZDDM4LfTIq_pIomQl9mOayqypTYkxjvBP2gUCUjQ8VY_MWmUBY5fQK2DtUL5E6KE6FECrrt0h_sLncArZNhJv6Y3Y2E3_1WHYx");
			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
			String output;
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			conn.disconnect();
		}
	}
	
	public void getReviews(String name) {
		try {
			URL url = new URL(BASE_URL+SEARCH_BUSINESS+name+REVIEWS_URL);
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-Type", "application/json");
			conn.setRequestProperty("Authorization", "Bearer Qq4n0uf_IeDA6eSCuDg0JQawSMoFkCZDDM4LfTIq_pIomQl9mOayqypTYkxjvBP2gUCUjQ8VY_MWmUBY5fQK2DtUL5E6KE6FECrrt0h_sLncArZNhJv6Y3Y2E3_1WHYx");
			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
			String output;
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			conn.disconnect();
		}
	}

}
