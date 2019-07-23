package com.visa.training.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

//just for understanding how different we can use the session
@Controller
@SessionAttributes({"selectedBooks","selectedCars","selectedBikes"})
//these are the session attributes. although these are in the map we can specify
//that these are not just request scope obj but are treated as session scope 
//obj.
public class ShoppingCartImpl_Session {
    
    @RequestMapping("/addbooks")
    //view is only returned instead of modelandview. model is accepted as param
    //into the method.
    public String handleAddBooks(@RequestParam("books")String[] books,Map model) {
        model.put("selectedBooks", books);
        return "cars";
    }

    @RequestMapping("/addcars")
    public String handleAddCars(@RequestParam("cars")String[] cars,Map model) {
        model.put("selectedCars", cars);
        return "bikes";
    }
    
    @RequestMapping("/addbikes")
    public String handleAddBikes(@RequestParam("bikes")String[] bikes,Map model) {
        model.put("selectedBikes", bikes);
        return "cart_el";
    }
}