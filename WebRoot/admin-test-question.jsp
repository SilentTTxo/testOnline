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
                            <s:property value="#st.index+1"/>
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
                                    	<th class="col-lg-1">序号</th>
                                        <th>题目</th>
                                        <th class="col-lg-1">操作</th>
                                    </tr>
                                </thead>
                                <tbody>
                                <s:iterator value="list" status='st'>
                                <tr>
                                    <td><s:property value="#st.index+1"/></td>
                                    <td><s:property value="dis"/></td>
                                    <td><a class="btn col-lg-4 col-lg-offset-4" href="test?delqueId=<s:property value='id'/>&examId=<s:property value='examId'/>" role="button">删除</a></td>
                                </tr>
                                </s:iterator>
                                    </tbody>
                                </table>
                                <hr/>
                                <form class="col-lg-12" action="test" method="POST">
                                <input hidden="true" value="<s:property value='examId'/>" name="examId"></input>
                                            <div class="col-lg-12">
                                                <div class="col-lg-10">
                                                    <div class="form-group input-group">
                                                    <span class="input-group-addon">试题</span>
                                                    <select class="form-control" name="queId">
                                                    <s:iterator value="qlist" status='st'>
                                                        <option value="<s:property value='id'/>"><s:property value="dis"/></option>
                                                    </s:iterator>
                                                    </select>
                                                    </div>
                                                </div>
                                                <div class="col-lg-2">           
                                                    <button class="btn btn-success">增加</button>
                                                </div>
                                                </div>                                          
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