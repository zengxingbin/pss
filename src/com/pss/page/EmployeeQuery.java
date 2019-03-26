package com.pss.page;

/**
 * 
 * 查询对象:封装employee的查询条件(名称,email模糊查询,部门名称查询),还必须有当前页码,一页条数(由父类处理)
 * 
 */
public class EmployeeQuery extends BaseQuery {

	public EmployeeQuery() {
		super("Employee");
	}

	private String name;
	private String email;
	private Long deptId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

}
