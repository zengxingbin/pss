package com.pss.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.pss.page.BaseQuery;
import com.pss.page.PageResult;


/**
 * 
 * 公共dao,直接操作数据库
 * 
 */
public class BaseDao<T> extends HibernateDaoSupport {

	public void save(T t) {
		getHibernateTemplate().save(t);
	}

	public void update(T t) {
		getHibernateTemplate().update(t);
	}

	/**
	 * 
	 * @param Serializable
	 *            id:通用的好处
	 */

	public void delete(Class<T> entityClass, Serializable id) {
		// getHibernateTemplate().delete(id);//报错
		T t = get(entityClass, id);
		if (t != null) {
			getHibernateTemplate().delete(t);
		}
	}

	public T get(Class<T> entityClass, Serializable id) {
		return getHibernateTemplate().get(entityClass, id);
	}

	public List<T> getAll(Class<T> entityClass) {
		return getHibernateTemplate().find("from " + entityClass.getName());
	}

	public PageResult<T> findPageResult(BaseQuery baseQuery) {
		return null;
	}

}
