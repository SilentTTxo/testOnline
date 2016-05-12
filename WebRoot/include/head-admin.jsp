<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
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
    <s:if test="null==#session.username||#session.power == 1">
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
                    <li>
                        <a href="Question"><i class="fa fa-fw fa-edit"></i> 题库管理</a>
                    </li>
                    <li>
                        <a href="Exam?admin=1"><i class="fa fa-fw fa-desktop"></i> 考试管理</a>
                    </li>
                    <li>
                        <a href="User"><i class="fa fa-fw fa-bar-chart-o"></i> 用户管理</a>
                    </li>
                    <li>
                        <a href="Score"><i class="fa fa-fw fa-dashboard"></i> 成绩查看</a>
                    </li>
                    <li>
                        <a href="UserInfo"><i class="fa fa-fw fa-wrench"></i> 管理员设置</a>
                    </li>
                    <li>
                        <a href="Exam"><i class="fa fa-fw fa-wrench"></i> 在线考试页面</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </nav>