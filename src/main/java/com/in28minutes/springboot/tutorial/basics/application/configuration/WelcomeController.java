package com.in28minutes.springboot.tutorial.basics.application.configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String getIndex(Model model)
	{
		return "index";
	}

	@RequestMapping(value = "/tables",method = RequestMethod.GET)
	public String getTable(Model model){
		return "tables";
	}

	@RequestMapping(value = "/blank",method = RequestMethod.GET)
	public String test(Model model){
		return "blank";
	}

	@RequestMapping(value = "/tables", method = RequestMethod.POST)
	public String search(@RequestParam (value = "searchstr") String searchStr,
							 Model model) {
		QueryGenerator gueryGen = new QueryGenerator();
		SearchPlanner planner = new SearchPlanner(searchStr);
		planner.startSearch();
		model.addAttribute("tableheader",gueryGen.getHeader());
		model.addAttribute("resultwrapper",planner.getResultWrapper());
		return "tables";
	}
}