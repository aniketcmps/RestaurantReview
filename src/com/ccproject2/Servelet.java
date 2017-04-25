package com.ccproject2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.google.appengine.repackaged.com.google.gson.Gson;

@SuppressWarnings("serial")
public class Servelet extends HttpServlet {
	public void doGet(final HttpServletRequest req, final HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/plain");
		String action = req.getParameter("hotel");
		// System.out.println(action);
		String hotel = "north-india-restaurant-san-francisco";
		YelpApis yelp = new YelpApis();

		// Print result of yelp API
		com.google.appengine.repackaged.com.google.gson.Gson gson = new com.google.appengine.repackaged.com.google.gson.Gson();
		System.out.print(gson.toJson(yelp.searchRestaurant(hotel)));
		System.out.print(gson.toJson(yelp.getReviews(hotel)));

	}
}
