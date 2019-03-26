package com.pss.web;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.pss.domain.Employee;
import com.pss.service.IEmployeeService;

public class EmployeeAction extends ActionSupport {
	public static final String RELOAD = "reload";

	private IEmployeeService employeeService;
	private List<Employee> employees;
	private Employee employee = new Employee();

	public void setEmployeeService(IEmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	// 列表
	@Override
	public String execute() throws Exception {
		this.employees = employeeService.getAll();
		return SUCCESS;
	}

	// 添加页面和修改页面
	@Override
	public String input() throws Exception {
		if (employee.getId() != null) {
			employee = employeeService.get(employee.getId());
		}
		return INPUT;
	}

	// 处理新增保存和修改后保存
	public String save() throws Exception {
		if (employee.getId() == null) {
			employeeService.save(employee);
		} else {
			employeeService.update(employee);
		}
		return RELOAD;
	}

	// 删除
	public String delete() throws Exception {
		if (employee.getId() != null) {
			employeeService.delete(employee.getId());
		}
		return RELOAD;
	}
}
