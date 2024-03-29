package fr.jasmin.model.dao.interfaces;

import java.util.List;

import fr.jasmin.entity.Category;
import fr.jasmin.entity.Item;

public interface IItemDao {

	List<Item> getItemsByCategory(String categoryName) throws Exception;
	void updateArticle(Item article) throws Exception;
	void removeArticle(Integer id) throws Exception;
	void removeArticle(Item article) throws Exception;
	Item getArticle(Integer id) throws Exception;
	List<Item> getArticles() throws Exception;
	void updateArticleById(Integer id) throws Exception;
	Item addArticle(Item article) throws Exception;
}
