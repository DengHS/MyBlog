package xyz.denghs.common.pojo;

import org.joda.time.DateTime;
import xyz.denghs.pojo.Article;

public class ArticlePreviewHtml {

	private Article article;

	public ArticlePreviewHtml(Article article) {
		super();
		this.article = article;
	}

	@Override
	public String toString() {
		return "<div class=\"col-md-6 col-sm-6\">\n" +
				"	<article class=\" blog-teaser\">\n" +
				"		<header>\n" +
				"			<img src=\"" + article.getImage() + "\" alt=\"\" height=\"200px\" width=\"326px\" >\n" +
				"			<h3>\n" +
				"				<a href=\"#\">" + article.getTitle() + "</a>\n" +
				"			</h3>\n" +
				"			<span class=\"meta\">" + new DateTime(article.getTime()).toString("yyyy年MM月dd日") + ", " + article.getEditer() + "</span>\n" +
				"			<hr>\n" +
				"		</header>\n" +
				"		<div class=\"body\">" + article.getSummary() + "</div>\n" +
				"		<div class=\"clearfix\">\n" +
				"			<a href=\"single.html?id=" + article.getId() + "\" class=\"btn btn-clean-one\">Read more</a>\n" +
				"		</div>\n" +
				"	</article>\n" +
				"</div>\n";
	}
	
	
}
