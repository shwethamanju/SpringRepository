package controller;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
//	@GetMapping("/hello")
//	public String getHello(Model model) {
//		model.addAttribute("Person","john");
//		return "hello.jsp";
	
//	@GetMapping("/map")
//	public String showMessage(ModelMap modelMap) {
//		
//		modelMap.put("appVersion", "snapshot");
//		modelMap.put("name", "dimple");
//		Map<String,Double> map = new LinkedHashMap<String, Double>();
//	    map.put("memory",1.2);
//	    map.put("RAM", 0.6);
//	    modelMap.addAllAttributes(map);
//	    return "hello.jsp";
//	
//	}
//	@GetMapping("/view")
//	public ModelAndView sendMessage() {
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.addObject("QueenName", "dimple");
//		modelAndView.setViewName("hello.jsp");
//		return modelAndView;
	
	@GetMapping("/view")
	public ModelAndView sendMessage(HttpServletRequest req) {
		String name = req.getParameter("name");
		int age =Integer.parseInt(req.getParameter("age"));
		String email = req.getParameter("email");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("personName",name);
		modelAndView.addObject("personAge",age);
		modelAndView.addObject("personEmail",email);
		modelAndView.setViewName("hello.jsp");
	    return modelAndView;
	}

}
