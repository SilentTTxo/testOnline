<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ include file="include/head.jsp"%>

<div id="page-wrapper">

            <div class="container-fluid">

                <!-- Page Heading -->
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">
                            考试 <small>列表</small>
                        </h1>
                        <ol class="breadcrumb">
                            <li class="active">
                                <i class="fa fa-edit"></i> 在线考试
                            </li>
                        </ol>
                    </div>
                </div>
                <!-- /.row -->

                <div class="row">
                    <div class="col-lg-12">
                        <div class="alert alert-info alert-dismissable">
                            <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                            <i class="fa fa-info-circle"></i>  请注意考试开始时间
                        </div>
                    </div>
                </div>
                <!-- /.row -->

                <div class="row">
                    <div class="col-lg-12">
                        <div class="table-responsive">
                            <table class="table table-bordered table-hover table-striped">
                                <thead>
                                    <tr>
                                        <th>考试名</th>
                                        <th>开始时间</th>
                                        <th>结束时间</th>
                                        <th>开始考试！</th>
                                    </tr>
                                </thead>
                                <tbody>
                                <s:set name="nowTime" value="new java.util.Date()"></s:set>
                                    <s:iterator value="examidList" id="list">
                                    <s:set name="lessTime" value="emddate"></s:set>
                                    <s:set name="startTime" value="startdate"></s:set>
                                    	<tr>
                                    		<td><s:property value="name"/></td>
                                    		<td><s:date name="startdate" format="yyyy-MM-dd HH:mm:ss"/></td>
                                    		<td><s:date name="emddate" format="yyyy-MM-dd HH:mm:ss" /></td>
                                    		<td><a class="btn col-lg-4 col-lg-offset-4 <s:if test='#nowTime.getTime() < #startTime.getTime()'>btn-danger disabled</s:if><s:else>btn-primary</s:else>" href="test?examId=<s:property value='id'/>" role="button">考试</a></td>
                                    	</tr>
                                    </s:iterator>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>

            </div>
            <!-- /.container-fluid -->

        </div>
        <!-- /#page-wrapper -->

<%@ include file="include/footer.jsp"%>