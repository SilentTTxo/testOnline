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
                            考试 <small>列表</small>
                        </h1>
                        <ol class="breadcrumb">
                            <li class="active">
                                <i class="fa fa-edit"></i> 考试管理
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
                                        <th>考试名</th>
                                        <th>开始时间</th>
                                        <th>结束时间</th>
                                        <th>操作</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <s:set name="nowTime" value="new java.util.Date()"></s:set>
                                    <s:iterator value="examidList" id="list" status="st">
                                    <s:set name="lessTime" value="emddate"></s:set>
                                    <s:set name="startTime" value="startdate"></s:set>
                                        <tr>
                                            <td><s:property value="#st.index+1"/></td>
                                            <td><s:property value="name"/></td>
                                            <td><s:date name="startdate" format="yyyy-MM-dd HH:mm:ss"/></td>
                                            <td><s:date name="emddate" format="yyyy-MM-dd HH:mm:ss" /></td>
                                            <td><div class="btn-group col-lg-offset-4">
                                                <a class="btn <s:if test='#nowTime.getTime() < #startTime.getTime()'>btn-primary</s:if><s:else>btn-danger disabled</s:else>" href="test?examId=<s:property value='id'/>" role="button">修改</a><a class="btn <s:if test='#nowTime.getTime() < #startTime.getTime()'>btn-primary</s:if><s:else>btn-danger disabled</s:else>" href="Exam?delexamid=<s:property value='id'/>&admin=1" role="button">删除</a>
                                            </div></td>
                                        </tr>
                                    </s:iterator>
                                    </tbody>
                                </table>
                                <hr/>
                                <form class="col-lg-12" action="Exam" method="POST">
                                            <input hidden="true" value="1" name="admin"></input>
                                            <div class="col-lg-12">
                                                <div class="col-lg-4">
                                                    <div class="form-group input-group">
                                                    <span class="input-group-addon">考试名</span>
                                                    <input type="text" class="form-control" name="exam.name">
                                                    </div>
                                                </div>
                                                <div class="col-lg-4">
                                                    <div class="form-group input-group">
                                                    <span class="input-group-addon">考试开始时间</span>
                                                    <input type="text" class="form-control" name="exam.startdate">
                                                    </div>
                                                </div>
                                                <div class="col-lg-4">
                                                    <div class="form-group input-group">
                                                    <span class="input-group-addon">考试结束时间</span>
                                                    <input type="text" class="form-control" name="exam.emddate">
                                                    </div>
                                                </div>
                                                </div>                                          
                                            </div> 
                                            <div class="col-lg-12">
                                                <hr/>
                                                 <button class="btn btn-success col-lg-offset-6">增加</button>
                                            </div>
                                        </form>
                        </form>
                        </div>
                    </div>
                </div>

            </div>
            <!-- /.container-fluid -->

        </div>
        <!-- /#page-wrapper -->
<%@ include file="include/footer-admin.jsp"%>