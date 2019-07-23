package com.visa.training.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.visa.training.domain.Product;
import com.visa.training.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductValidator validator;
	
	public ProductService service;
	
	@Autowired
	public void setService(ProductService service) {
		this.service = service;
	}


	@RequestMapping(value="/product",method=RequestMethod.POST)
	public ModelAndView addNewProduct(@ModelAttribute("product")Product p,Errors validationErrors)
	//here the modelattribute name should be the same as in commandname in the 
	//form
	{
		Product pro=new Product();
		
		validator.validate(p, validationErrors);
		service.addNewProduct(p);
		
		List<Product> products=service.findAll();
		Map<String, Object>attr=new HashMap<String, Object>();
		attr.put("products", products);
		attr.put("product",pro);
		
		return new ModelAndView("newProduct",attr);
	}
	
	
	@RequestMapping("/removeProduct")
	public ModelAndView removeProduct(@RequestParam("id")int id1)
	{
//		int id1=Integer.parseInt(id);
		Product pro=new Product();
		service.deleteProduct(id1);		
		List<Product> products=service.findAll();
		Map<String, Object>attr=new HashMap<>();
		attr.put("products", products);
		attr.put("product",pro);
		return new ModelAndView("newProduct",attr);	
		
		
//		return "newProduct";
		
	}
	
	@RequestMapping(value="/product",method=RequestMethod.GET)
	public ModelAndView listProducts()
	{
		Product product=new Product();
		List<Product> products=service.findAll();
		Map<String, Object>attr=new HashMap<>();
		attr.put("products", products);
		attr.put("product",product);
		return new ModelAndView("newProduct",attr);
		
	}
	
//	@ModelAttribute("products")
	//it mentions that any method that the controller handles, before handing it
	//over to the jsp file execute this method and return a model attribute of 
	//name mentioned in modelattribute.
	
	//but this is called before the invokacation of the addnewproduct or 
	//removeproduct. so the previous method of using list and storing in map
	//can be used.
	/*
	 * public List<Product> getProductList() { return service.findAll(); }
	 */
}
