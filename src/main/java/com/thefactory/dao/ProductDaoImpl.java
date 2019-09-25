package com.thefactory.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.thefactory.domain.Product;


@Transactional
@Repository("PDao")
public class ProductDaoImpl implements ProductDAO
{
	
		@PersistenceContext
		EntityManager em;

		public List<Product> findAll() {
			List<Product> product= em.createQuery(
					 "Select a from Product a"
					 , Product.class).getResultList();
			return product;
		}

		public void create(Product obj) {
			em.persist(obj);
			
		}
		
	
}
