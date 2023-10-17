package com.teamp.spring.tp.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.teamp.spring.tp.dto.CartItem;
import com.teamp.spring.tp.dto.ProductInfo;
import com.teamp.spring.tp.mapper.ShopMapper;

@Service
public class ShopServiceImpl implements ShopService{
	 private final ShopMapper shopMapper;

	    public ShopServiceImpl(ShopMapper shopMapper) {
	        this.shopMapper = shopMapper;
	    }

	    @Override
	    public List<ProductInfo> getAllProducts() {
	        return shopMapper.getAllProducts();
	    }
	    @Override
	    public ProductInfo getProductById(int productId) {
	        return shopMapper.getProductById(productId);
	    }
	    @Override
	    public List<ProductInfo> searchProducts(String keyword) {
	        return shopMapper.searchProducts("%" + keyword + "%");
	    }
	    @Override
	    public List<ProductInfo> selectProductsByCategory(String category) {
	        return shopMapper.selectProductsByCategory(category);
	    }
	    @Override
	    public List<ProductInfo> searchProductsByCategoryAndKeyword(Map<String, Object> params) {
	        return shopMapper.searchProductsByCategoryAndKeyword(params);
	    }
	    @Override
	    public void saveCartToDatabase(String userId, Map<Integer, Integer> cart) {
	        shopMapper.saveCart(userId, cart);
	    }

	    @Override
	    public Map<Integer, CartItem> getCartFromDatabase(String userId) {
	        return shopMapper.getCart(userId);
	    }

}
