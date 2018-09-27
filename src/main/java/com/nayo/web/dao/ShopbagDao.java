package com.nayo.web.dao;

import java.util.List;

import com.nayo.web.entity.Shopbag;
import com.nayo.web.entity.id.ShopbagId;

public interface ShopbagDao {

	int insert(Shopbag shopbag);
	int update(Shopbag shopbag);
	int delete(String regId, String name);
		
	List<Shopbag> getList();
	List<Shopbag> getList(String regId);
}
