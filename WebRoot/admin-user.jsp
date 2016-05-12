<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ include file="include/head-admin.jsp"%>

        <div id="page-wrapper">

            <div class="container-fluid">

                <!-- Page Heading -->
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">
                            用户 <small>列表</small>
                        </h1>
                        <ol class="breadcrumb">
                            <li class="active">
                                <i class="fa fa-edit"></i> 用户管理
                            </li>
                        </ol>
                    </div>
                </div>
                <!-- /.row -->


                <div class="row">
                    <div class="col-lg-12">
                        <div class="table-responsive">
                            <table class="table table-bordered table-hover table-striped">
                                <thead>
                                    <tr>
                                    	<th>序号</th>
                                        <th>姓名</th>
                                        <th>性别</th>
                                        <th>电话号码</th>
                                        <th>E-Mail</th>
                                        <th>权限</th>
                                        <th>密码</th>
                                        <th>其他</th>
                                        <th>操作</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <s:iterator value="users" status="st">
                                    	<tr>
                                    		<td><s:property value="#st.index+1"/></td>
                                    		<td><s:property value="username"/></td>
                                    		<td><s:property value="sex"/></td>
                                    		<td><s:property value="tel"/></td>
                                    		<td><s:property value="email"/></td>
                                    		<td><s:property value="power"/></td>
                                    		<td><s:property value="password"/></td>
                                    		<td><s:property value="other"/></td>
                                    		<td><a href="User?userid=<s:property value='id'/>" role="button">删除</a>
                                            <a href="User?userid=<s:property value='id'/>&isadd=9" role="button">权限提升</a>
                                            </td>
                                    	</tr>
                                    </s:iterator>
                                    </tbody>
                                    </table>
                                    <hr/>
                        </form>
                        </div>
                    </div>
                </div>

            </div>
            <!-- /.container-fluid -->

        </div>
        <!-- /#page-wrapper -->
<%@ include file="include/footer-admin.jsp"%>