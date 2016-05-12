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
                            题库 <small>列表</small>
                        </h1>
                        <ol class="breadcrumb">
                            <li class="active">
                                <i class="fa fa-edit"></i> 题库管理
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
                                        <th>题目</th>
                                        <th>答案数</th>
                                        <th>选项A</th>
                                        <th>选项B</th>
                                        <th>选项C</th>
                                        <th>选项D</th>
                                        <th>选项E</th>
                                        <th>正确答案</th>
                                        <th>操作</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <s:iterator value="questions" status="st">
                                    	<tr>
                                    		<td><s:property value="#st.index+1"/></td>
                                    		<td><s:property value="dis"/></td>
                                    		<td><s:property value="ansnum"/></td>
                                    		<td><s:property value="ansa"/></td>
                                    		<td><s:property value="ansb"/></td>
                                    		<td><s:property value="ansc"/></td>
                                    		<td><s:property value="ansd"/></td>
                                    		<td><s:property value="anse"/></td>
                                    		<td><s:property value="ans"/></td>
                                    		<td><a class="btn col-lg-4 col-lg-offset-4 " href="Question?delid=<s:property value='id'/>&cmd=2" role="button">删除</a></td>
                                    	</tr>
                                    </s:iterator>
                                    </tbody>
                                    </table>
                                    <hr/>
                                    	<form class="col-lg-12" action="Question" method="POST">
                                    		<input hidden="true" value="3" name="cmd"></input>
                                    		<div class="col-lg-12">
                                    			<div class="col-lg-10">
                                    				<div class="form-group input-group">
                                					<span class="input-group-addon">题目</span>
                                					<input type="text" class="form-control" name="question.dis">
                            						</div>
                                    			</div>
                                    			<div class="col-lg-2">
                            						<div class="form-group input-group">
                                					<span class="input-group-addon">答案数</span>
                                					<select class="form-control" name="question.ansnum">
                                						<option value="2">2</option>
                                   						<option value="3">3</option>
                                    					<option value="4">4</option>
                                    					<option value="5">5</option>
                                					</select>
                            						</div>
                            					</div>
                            					<div class="col-lg-2">
                            						<div class="form-group input-group">
                                					<span class="input-group-addon">A</span>
                                					<input type="text" class="form-control"  name="question.ansa">
                            						</div>
                            					</div>
                            					<div class="col-lg-2">
                            						<div class="form-group input-group">
                                					<span class="input-group-addon">B</span>
                                					<input type="text" class="form-control"  name="question.ansb">
                            						</div>
                            					</div>
                            					<div class="col-lg-2">
                            						<div class="form-group input-group">
                                					<span class="input-group-addon">C</span>
                                					<input type="text" class="form-control"  name="question.ansc">
                            						</div>
                            					</div>
                            					<div class="col-lg-2">
                            						<div class="form-group input-group">
                                					<span class="input-group-addon">D</span>
                                					<input type="text" class="form-control"  name="question.ansd">
                            						</div>
                            					</div>
                            					<div class="col-lg-2">
                            						<div class="form-group input-group">
                                					<span class="input-group-addon">E</span>
                                					<input type="text" class="form-control"  name="question.anse">
                            						</div>
                            					</div>
                            					<div class="col-lg-2">
                            						<div class="form-group input-group">
                                					<span class="input-group-addon" >正确答案</span>
                                					<select class="form-control" name="question.ans">
                                    					<option value="1">A</option>
                                    					<option value="2">B</option>
                                   						<option value="3">C</option>
                                    					<option value="4">D</option>
                                    					<option value="5">E</option>
                                					</select>
                            						</div>
                            					</div>
                            					</div>                                 			
                                    		</div> 
                                    		<div class="col-lg-12">
                            					<hr/>
                           						 <button class="btn btn-success col-lg-offset-6">增加</button>
                        					</div>
                                    	</form>
                        </div>
                    </div>
                </div>

            </div>
            <!-- /.container-fluid -->

        </div>
        <!-- /#page-wrapper -->
<%@ include file="include/footer-admin.jsp"%>