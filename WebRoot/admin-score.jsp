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
                            成绩 <small>列表</small>
                        </h1>
                        <ol class="breadcrumb">
                            <li class="active">
                                <i class="fa fa-edit"></i> 成绩查看
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
                                        <th>考生</th>
                                        <th>考试名</th>
                                        <th>分数</th>
                                        <th>结束时间</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <s:iterator value="score" status="st">
                                    	<tr>
                                    		<td><s:property value="#st.index+1"/></td>
                                    		<td><s:property value="username"/></td>
                                    		<td><s:property value="exname"/></td>
                                    		<td><s:property value="sco"/></td>
                                    		<td><s:property value="emddate"/></td>
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