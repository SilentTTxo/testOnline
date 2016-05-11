<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>在线考试系统</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/sb-admin.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="css/plugins/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>
	<s:if test="null==#session.username">
	<script type="text/javascript">
		location.href = 'login.html';
		</script>
	</s:if>

    <div id="wrapper">

        <!-- Navigation -->
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="admin.jsp">在线考试后台管理系统</a>
            </div>
           
            <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav side-nav">
                    <li class="active">
                        <a href="#"><i class="fa fa-fw fa-edit"></i> 题库管理</a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-fw fa-desktop"></i> 考试管理</a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-fw fa-bar-chart-o"></i> 用户管理</a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-fw fa-dashboard"></i> 成绩查看</a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-fw fa-wrench"></i> 管理员设置</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </nav>

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
                        </div>
                    </div>
                </div>

            </div>
            <!-- /.container-fluid -->

        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Morris Charts JavaScript -->
    <script src="js/plugins/morris/raphael.min.js"></script>
    <script src="js/plugins/morris/morris.min.js"></script>
    <script src="js/plugins/morris/morris-data.js"></script>

</body>

</html>
