package com.pss.service.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import com.pss.dao.BaseDao;
import com.pss.page.BaseQuery;
import com.pss.page.PageResult;
import com.pss.service.IBaseService;

public  abstract class BaseServiceImpl<T> implements IBaseService<T> {
	private BaseDao<T> baseDao;
	private Class<T> entityClass;

	public BaseServiceImpl() {
		Class clazz = getClass();
		// System.out.println("getClass():" + clazz);// EmployeeServiceImpl
		Type type = clazz.getGenericSuperclass();
		// System.out.println("getGenericSuperclass():" + type);//
		// BaseServiceImpl<Employee>
		if (type instanceof ParameterizedType) {
			ParameterizedType parameterizedType = (ParameterizedType) type;
			entityClass = (Class<T>) parameterizedType.getActualTypeArguments()[0];
		}
		System.out.println("entityClass:" + entityClass);// Employee.class
	}

	public void setBaseDao(BaseDao<T> baseDao) {
		this.baseDao = baseDao;
	}

	public void save(T t) {
		baseDao.save(t);
	}

	public void update(T t) {
		baseDao.update(t);
	}

	public void delete(Serializable id) {
		baseDao.delete(entityClass, id);
	}

	public T get(Serializable id) {
		return baseDao.get(entityClass, id);
	}

	public List<T> getAll() {
		return baseDao.getAll(entityClass);
	}

	public PageResult<T> findPageResult(BaseQuery baseQuery) {
		return baseDao.findPageResult(baseQuery);
	}

}
