package com.ccproject2;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Servelet extends HttpServlet {
	public void doGet(final HttpServletRequest req, final HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/plain");
		String action = req.getParameter("hotel");
//		System.out.println(action);
		String hotel="north-india-restaurant-san-francisco";
		YelpApis yelp=new YelpApis();
		yelp.searchRestaurant(hotel);
		yelp.getReviews(hotel);

	}
}
