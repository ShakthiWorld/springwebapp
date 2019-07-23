package com.visa.training.web;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShoppingCartImpl {

	@RequestMapping("/bookcart")
	public ModelAndView addBooks(@RequestParam("books") String[] books,HttpSession session)
	{
		session.setAttribute("books", books);
		String viewName="bikes";
		
		
		return new ModelAndView(viewName);
	}
	
	@RequestMapping("/bikecart")
	public ModelAndView addBikes(@RequestParam("bikes") String[] bikes,HttpSession session)
	{
		session.setAttribute("bikes", bikes);
		String viewName="cars";
		
		return new ModelAndView(viewName);
	}
	
	@RequestMapping("/carcart")
	public ModelAndView addCars(@RequestParam("cars") String[] cars,HttpSession session)
	{
		session.setAttribute("cars", cars);
		String viewName="output";
		
		return new ModelAndView(viewName);
	}
}
