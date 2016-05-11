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
                <a class="navbar-brand" href="index.html">在线考试系统</a>
            </div>
            <!-- Top Menu Items -->
            <ul class="nav navbar-right top-nav">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> <s:property value="#session.username" /> <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li>
                            <a href="UserInfo"><i class="fa fa-fw fa-user"></i> 个人资料</a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="Login?isUnLogin=1"><i class="fa fa-fw fa-power-off"></i> Log Out</a>
                        </li>
                    </ul>
                </li>
            </ul>
            <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav side-nav">
                    <li class="active">
                        <a href="Exam"><i class="fa fa-fw fa-edit"></i> 在线考试</a>
                    </li>
                    <li>
                        <a href="Score"><i class="fa fa-fw fa-bar-chart-o"></i> 历史成绩</a>
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
                            <s:property value="exam.name"/>
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
                        <div class="table-responsive">
                            <form role="form" action="Judge" method="POST">
                            <input type="radio " hidden="true" name="examId" id="optionsRadiosInline5" value='<s:property value="examId" />'>
                                <s:iterator value="list" status='st'>
                                    <h4><s:property value="#st.index+1"/>.<s:property value="dis"/></h4>
                                    <div class="form-group col-lg-12">
                                    <input type="radio " hidden="true" name="rs.id" id="optionsRadiosInline5" value='<s:property value="queid" />'>
                                    <label class="radio-inline col-lg-2" >
                                        <input type="radio" name="rs[<s:property value='#st.index'/>].ans" id="optionsRadiosInline1" value="1">A.<s:property value="ansa" />
                                    </label>
                                    <s:if test="ansnum>=2">
                                    <label class="radio-inline col-lg-2">
                                        <input type="radio" name="rs[<s:property value='#st.index'/>].ans" id="optionsRadiosInline2" value="2">B.<s:property value="ansb" />
                                    </label>
                                    </s:if>
                                    <s:if test="ansnum>=3">
                                    <label class="radio-inline col-lg-2">
                                        <input type="radio" name="rs[<s:property value='#st.index'/>].ans" id="optionsRadiosInline3" value="3">C.<s:property value="ansc" />
                                    </label>
                                    </s:if>
                                    <s:if test="ansnum>=4">
                                    <label class="radio-inline col-lg-2">
                                        <input type="radio" name="rs[<s:property value='#st.index'/>].ans" id="optionsRadiosInline4" value="4">D.<s:property value="ansd" />
                                    </label>
                                    </s:if>
                                    <s:if test="ansnum>=5">
                                    <label class="radio-inline col-lg-2">
                                        <input type="radio" name="rs[<s:property value='#st.index'/>].ans" id="optionsRadiosInline5" value="5">E.<s:property value="anse" />
                                    </label>
                                    </s:if>
                                    </div>
                                </s:iterator>
                                <div class="col-lg-12">
                                    <button type="submit" class="btn btn-lg btn-primary col-lg-offset-6 col-lg-2">交卷</button>
                                </div>
                            </form>
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