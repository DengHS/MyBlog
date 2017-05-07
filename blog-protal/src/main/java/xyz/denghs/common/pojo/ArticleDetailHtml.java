package xyz.denghs.common.pojo;

import org.joda.time.DateTime;
import xyz.denghs.pojo.Article;

public class ArticleDetailHtml {

	private Article article;

	public ArticleDetailHtml(Article article) {
		super();
		this.article = article;
	}

	@Override
	public String toString() {
		return "<article class=\"blog-post\">\n" +
				"	<header>\n" +
				"		<div class=\"lead-image\">\n" +
				"			<img src=\"" + article.getImage() + "\" alt=\"\" class=\"img-responsive\">\n" +
				"		</div>\n" +
				"	</header>\n" +
				"	<div class=\"body\">\n" +
				"		<h1>" + article.getTitle() + "</h1>\n" +
				"		<div class=\"meta\">\n" +
				"			<i class=\"fa fa-user\"></i>" + article.getEditer() +"<i class=\"fa fa-calendar\">\n" +
				"			</i>" + new DateTime(article.getTime()).toString("yyyy年MM月dd日") + "<i class=\"fa fa-comments\"></i><span class=\"data\"><a\n" +
				"				href=\"#comments\">3 Comments</a></span>\n" +
				"		</div>\n" +
				"		<p>" + article.getContent() + "</p>\n" +
				"	</div>\n" +
				"</article>\n";
	}
	
	
}
