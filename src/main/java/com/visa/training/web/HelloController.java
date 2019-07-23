package com.visa.training.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	//this mentions the url the same name hello is given at the place
	//from where it is called refer hello.html
	
	public ModelAndView helloWorld(@RequestParam("name")String name) {
	//requestParam gets the parameter with the same name mentioned from
		//where it was called from and stores it in the string called name.
		
		String result="hello"+name;
		String viewName="helloview";
		
		Map<String, Object>attributes=new HashMap<String, Object>();
		attributes.put("result", result);
		
		
		return new ModelAndView(viewName,attributes);
		//the map attributes when it is sent to the dispatcher servlet, it sets
		//the key and value pairs for each pair into the request object.
		
		//then it consults the viewresolver method which takes the name given in 
		//viewname here converts it into an appropriate name and then gives control
		//to that required jsp file.
		
	}
	
}
