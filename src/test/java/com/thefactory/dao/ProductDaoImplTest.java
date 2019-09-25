package com.thefactory.dao;

import static org.junit.Assert.*;

import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.thefactory.domain.Product;

@ContextConfiguration(locations="classpath*:META-INF/appContext.xml")
@RunWith(SpringRunner.class)
@Rollback(true)
@Transactional
public class ProductDaoImplTest {

	@Autowired
	ProductDAO pdi;
	
	
	@Test
	public void testFindAll() {
		Product p1 = new Product("Les lunettes présidentielles") ;
		int nb = pdi.findAll().size();
		pdi.create(p1);
		Assert.assertTrue(pdi.findAll().size()==nb+1);
	}

	
	@Test
	public void testCreate() {
		Product p1 = new Product("Les lunettes présidentielles") ;
		int nb = pdi.findAll().size();
		pdi.create(p1);
		Assert.assertTrue(pdi.findAll().size()==nb+1);
	}

	

}
