package com.visa.training.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorImpl {

	@RequestMapping("/calculator")
	//has the mapping which is called by the calci.html 
	
	//after computation the modelview is sent to the dispatcher servlet along
	//with the viewname as calcview (which is then modified as calcview.jsp by
	//the view resolver )and the map which contains the result in it.
	public ModelAndView calculateResult(@RequestParam("n1") String n1, @RequestParam("n2") String n2,
			@RequestParam("op") String op) {

		int no1 = Integer.parseInt(n1);
		int no2 = Integer.parseInt(n2);
		float result = 0;
		switch (op) {
		case "+":
			result = no1 + no2;
			break;
		case "-":
			result = no1 - no2;
			break;
		case "*":
			result = no1 * no2;
			break;
		case "/":
			result = no1 / no2;
			break;

		}
		String viewName = "calcview";

		Map<String, Float> mp = new HashMap<String, Float>();
		mp.put("result", result);

		return new ModelAndView(viewName, mp);
	}

	@RequestMapping("/calculator_total_impl")
	//has the mapping which is called by the calci_total_file.jsp 
	
	//after computation the modelview is sent to the dispatcher servlet along
	//with the viewname as calci_total_file (which is then modified as calci_total_file.jsp by
	//the view resolver) and the map which contains the result in it.
	
	//note that the file which called it and the jsp to which the control goes
	//again are the same.
	public ModelAndView calculateResultTotalImpl(@RequestParam("n1") String n1, @RequestParam("n2") String n2,
			@RequestParam("op") String op) {

		int no1 = Integer.parseInt(n1);
		int no2 = Integer.parseInt(n2);
		float result = 0;
		switch (op) {
		case "+":
			result = no1 + no2;
			break;
		case "-":
			result = no1 - no2;
			break;
		case "*":
			result = no1 * no2;
			break;
		case "/":
			result = no1 / no2;
			break;

		}
		String viewName = "calci_total_file";

		Map<String, Float> mp = new HashMap<String, Float>();
		mp.put("result", result);

		return new ModelAndView(viewName, mp);
	}
}