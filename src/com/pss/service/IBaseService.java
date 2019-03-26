package com.pss.service;

import java.io.Serializable;
import java.util.List;

import com.pss.page.BaseQuery;
import com.pss.page.PageResult;

public interface IBaseService<T> {
	void save(T t);

	void update(T t);

	void delete(Serializable id);

	T get(Serializable id);

	List<T> getAll();

	PageResult<T> findPageResult(BaseQuery baseQuery);
}
