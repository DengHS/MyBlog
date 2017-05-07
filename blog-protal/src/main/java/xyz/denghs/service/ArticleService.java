package xyz.denghs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xyz.denghs.common.pojo.ArticleDetailHtml;
import xyz.denghs.common.pojo.ArticlePreviewHtml;
import xyz.denghs.mapper.ArticleMapper;
import xyz.denghs.pojo.Article;
import xyz.denghs.pojo.ArticleExample;
import xyz.denghs.pojo.ArticleExample.Criteria;

@Service
public class ArticleService {

	@Autowired
	private ArticleMapper articleMapper;
	
	public String getAllArticleHtml() {
		StringBuffer sb = new StringBuffer();
		ArticleExample example = new ArticleExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdIsNotNull();
		List<Article> list = articleMapper.selectByExample(example);
		ArticlePreviewHtml articleHtml = null;
		for (int i=0; i < list.size(); i++) {
			if (i%2 == 0) {
				sb.append("<div class=\"row\">");
			}
			articleHtml = new ArticlePreviewHtml(list.get(i));
			sb.append(articleHtml.toString());
			if (i%2 != 0 || i == list.size() - 1) {
				sb.append("</div>");
			}

		}
		return sb.toString();
	}
	
	public String getArticleDetailHtml(int id) {
		Article article = articleMapper.selectByPrimaryKey(id);
		ArticleDetailHtml articleHtml = new ArticleDetailHtml(article);
		return articleHtml.toString();
	}
}
