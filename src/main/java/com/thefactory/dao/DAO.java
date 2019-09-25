package com.thefactory.dao;

import java.util.List;

public interface DAO<T> 
{
	List<T> findAll();
	void create(T obj);
}
