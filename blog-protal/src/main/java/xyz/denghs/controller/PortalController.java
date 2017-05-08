package xyz.denghs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PortalController {
	
	@RequestMapping("index")
	public String getIndex() {
		return "portal/index";
	}
	
	@RequestMapping("portal/{page}")
	public String getPortal(@PathVariable("page")String page) {
		return "portal/" + page;
	}

}
