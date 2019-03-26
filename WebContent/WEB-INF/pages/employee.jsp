<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<link href="css/index.css" rel="stylesheet" type="text/css" />
<title>成都蓝源进销存系统(教学版)-产品列表页</title>
</head>
<body>
<div class="content-right">
<div class="content-r-pic"><div style="margin:8px auto auto 12px;"><img src="images/ping.gif" width="138" height="17" /></div></div>
<div class="content-text">
<div class="square-o-top">
<table width="100%"  border="0" cellpadding="0" cellspacing="0" style="font-size:14px; font-weight:bold; font-family:"黑体";">
   <tr><td height="24">&nbsp;</td></tr>
  <tr>
    <td width="60" height="30">名称:</td>
    <td width="133"><input name="" type="text" size="18" /></td>
    <td width="49">email:</td>
    <td width="142"><input name="" type="text" size="18" /></td>
    <td width="52">部门名称:</td>
    <td width="149"><select name="" size="1" class="kuan">&nbsp;</select></td>
	<td width="85"><a href="#"><img src="images/can_b_01.gif" border="0"/></a></td>
	<td width="136"><a href="employee_input.action"><img src="images/can_b_02.gif" border="0"/></a></td>
  </tr>
</table>
</div><!--"square-o-top"end-->
<div class="square-order">
  <table width="100%"  border="1" cellpadding="0" cellspacing="0">
    <tr align="center" style="background:url(images/table_bg.gif) repeat-x;">
      <td width="13%" height="30">编号</td>
      <td width="16%">名称</td>
      <td width="15%">密码</td>
      <td width="14%">email</td>
      <td width="14%">年龄</td>
      <td width="12%">部门名称</td>
      <td width="16%">操作</td>
    </tr>
    <s:iterator value="employees">
    <tr align="center" bgcolor="#FFFFFF">
      <td height="28">${id}</td>
      <td>${name}</td>
      <td>${password}</td>
      <td></td>
      <td></td>
      <td></td>
      <td><img src="images/icon_3.gif" /> <span style="line-height:12px; text-align:center;">
        <a class="xiu" href="employee_input.action?employee.id=${id}">修改</a></span> <img src="images/icon_04.gif" /> 
        <span style="line-height:12px; text-align:center;">
        <a class="xiu" href="employee_delete.action?employee.id=${id}">删除</a></span></td>
    </tr>
    </s:iterator>
  </table>
</div><!--"square-order"end-->
</div><!--"content-text"end-->
<div class="content-bbg">
<table width="100%"  border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td width="3%">&nbsp;</td>
    <td width="10%">共120条记录</td>
    <td width="9%">当前第<span style="color:red;">1</span>/10</td>
    <td width="11%">每页13条记录</td>
    <td width="13%">分页：<a class="num" href="#">1</a>,<a class="num" href="#">2</a>,<a class="num" href="#">3</a>,<a class="num" href="#">4</a>,</td>
    <td width="4%">首页</td>
    <td width="6%"><a class="sye" href="#">上一页</a></td>
    <td width="6%"><a class="sye" href="#">下一页</a></td>
    <td width="38%">末页</td>
  </tr>
</table>
</div>
</div><!--"content-right"end-->
</body>
</html>

