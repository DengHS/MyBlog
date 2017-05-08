package xyz.denghs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ManageController {
	
	@RequestMapping("manage/{page}")
	public String getPortal(@PathVariable("page")String page) {
		return "manage/" + page;
	}

}
