package com.pss.page;

/**
 * 
 * 查询对象:封装公共当前页码,一页条数,封装2条hql以及参数值
 * 
 */
public abstract class BaseQuery {
	private StringBuilder hql;
	// hql:select o from Employee o where o.name like ? and o.email like ? and
	// o.department.id=?
	private StringBuilder countHql;

	// countHql:select count(o) from Employee o where o.name like ? and o.email
	// like ? and o.department.id=?

	public BaseQuery(String className) {
		hql = new StringBuilder("select o from " + className + " o");
		countHql = new StringBuilder("select count(o) from " + className + " o");
	}

}
