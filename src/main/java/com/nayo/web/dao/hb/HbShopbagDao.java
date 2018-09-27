package com.nayo.web.dao.hb;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nayo.web.dao.ShopbagDao;
import com.nayo.web.entity.Shopbag;

@Repository
public class HbShopbagDao implements ShopbagDao{

	@Autowired
	private SessionFactory sessionFactory; 
	
	@Override
	@Transactional
	public int insert(Shopbag shopbag) {
		Session session = sessionFactory.getCurrentSession();
		Object id = session.save(shopbag);
			if(id != null)
				return 1;
		return 0;
	}

	@Override
	@Transactional
	public int update(Shopbag shopbag) {
		Session session = sessionFactory.getCurrentSession();
		session.update(shopbag);
		
		return 1;
	}

	@Override
	@Transactional
	public int delete(String regId, String name) {
		Session session = sessionFactory.getCurrentSession();
		
		Shopbag shopbag = new Shopbag();
		shopbag.setRegId(regId);
		shopbag.setName(name);
		
		session.remove(shopbag);
		
		return 1;
	}

	@Override
	@Transactional
	public List<Shopbag> getList() {
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Shopbag";
		List<Shopbag> list = session.createQuery(hql, Shopbag.class)
				.getResultList();
	
		return list;
	}

	@Override
	@Transactional
	public List<Shopbag> getList(String regId) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Shopbag where regId = ':regId'";

		List<Shopbag> list = session.createQuery(hql, Shopbag.class)
				.setParameter("regId", regId)
				.getResultList();
		
		return list;
	}

}
