<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@ include file="include/head-admin.jsp"%>

       <div id="page-wrapper">

            <div class="container-fluid">

                <!-- Page Heading -->
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">
                            个人 <small>信息</small>
                        </h1>
                        <ol class="breadcrumb">
                            <li class="active">
                                <i class="fa fa-edit"></i> 资料管理
                            </li>
                        </ol>
                    </div>
                </div>
                <!-- /.row -->

                <div class="row">
                    <div class="col-lg-12">
                        <div class="alert alert-warning alert-dismissable">
                            <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                            <i class="fa fa-info-circle"></i>  谨慎修改！
                        </div>
                    </div>
                </div>
                <!-- /.row -->

                <div class="row">
                    <div class="col-lg-12">
                        <form action="UserInfo" method="POST">
                        <div class="col-lg-4">
                            <label>姓名：</label>
                            <input class="form-control" name="user.username" value="<s:property value='user.name'/>">
                            <label>性别：</label>
                            <input class="form-control" name="user.sex"  value="<s:property value='user.sex'/>">
                            
                        </div>
                        <div class="col-lg-4">
                            <label>电话：</label>
                            <input class="form-control" name="user.tel"  value="<s:property value='user.tel'/>">
                            <label>E-Mail：</label>
                            <input class="form-control" name="user.email"  value="<s:property value='user.email'/>">
                        </div>
                        <div class="col-lg-4">
                            <label>个人介绍：</label>
                            <input class="form-control" name="user.other"  value="<s:property value='user.other'/>">
                            <label>密码修改：</label>
                            <input type="password" class="form-control" name="user.password"  value="<s:property value='user.password'/>">
                        </div>
                        <div class="col-lg-12">
                            <hr/>
                            <button class="btn btn-success col-lg-offset-6">修改</button>
                        </div>
                            
                        </form>
                    </div>
                </div>

            </div>
            <!-- /.container-fluid -->

        </div>
        <!-- /#page-wrapper -->

<%@ include file="include/footer-admin.jsp"%>