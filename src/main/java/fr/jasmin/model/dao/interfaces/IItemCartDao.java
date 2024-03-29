package fr.jasmin.model.dao.interfaces;

import java.util.List;

import fr.jasmin.entity.ItemCart;


public interface IItemCartDao {
	
	ItemCart addItemCart(ItemCart itemCart) throws Exception ;
	ItemCart getItemCart(Integer id) throws Exception;
	void updateItemCart(ItemCart itemCart) throws Exception;
	List<ItemCart> getItemCartList() throws Exception;
	void removeItemCart(ItemCart itemCart) throws Exception;
	List<ItemCart> getPanierByUserId(Integer userId) throws Exception;
	void removeItemCartById(Integer id) throws Exception;	


}
