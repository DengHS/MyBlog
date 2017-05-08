package xyz.denghs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import xyz.denghs.service.ArticleService;

@Controller
public class ArticleController {

	@Autowired
	private ArticleService articleService;
	
	@RequestMapping("/allarticle")
	@ResponseBody
	public String getAllArticle() {
		return articleService.getAllArticleHtml();
	}
	
	@RequestMapping("/articledetail")
	@ResponseBody
	public String getArticleDetail(@RequestParam("id")int id) {
		return articleService.getArticleDetailHtml(id);
	}
}
