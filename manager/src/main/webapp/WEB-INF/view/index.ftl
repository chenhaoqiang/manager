<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>主页</title>
<link rel="stylesheet" href="${rc.contextPath}/static/lib/bootstrap-3.3.0/css/bootstrap.min.css" media="screen" type="text/css" />
<link rel="stylesheet" href="${rc.contextPath}/static/css/index.css" media="screen" type="text/css" />
<script type="text/javascript" src="${rc.contextPath}/static/lib/jquery/jquery-1.10.2.min.js"></script>
<script type="text/javascript" src="${rc.contextPath}/static/lib/bootstrap-3.3.0/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${rc.contextPath}/static/js/Chq.js"></script>
<script type="text/javascript" src="${rc.contextPath}/static/js/util/Html.js"></script>
<script type="text/javascript" src="${rc.contextPath}/static/js/index.js"></script>
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
	<div class="header">
		<div class="header-left col-md-2">
			<h2>我的管理系统</h2>
		</div>
		<div class="header-center col-md-7">
		<p>早上好，${account.accname}！ 上次登录时间：2016-11-11 11:11:11</p>
		</div>
		<div class="header-right col-md-3">
			<div class="btn-group">
				<a type="button" class="btn btn-lg dropdown-toggle" data-toggle="dropdown">
					<i class="glyphicon glyphicon-envelope"></i>消息<span class="badge">5</span><span class="caret"></span>
				</a>
				<ul class="dropdown-menu dropdown-menu-right msg-menu" role="menu">
					<li><div>
							<strong>张三</strong> <span class="pull-right text-muted"> <em>今天</em>
							</span>
						</div>
						<div>很高兴认识你！很高兴认识你！很高兴认识你！很高兴认识你！</div></li>
					<li class="divider"></li>
					<li><div>
							<strong>李四</strong> <span class="pull-right text-muted"> <em>今天</em>
							</span>
						</div>
						<div>我是李四！我是李四！我是李四！</div></li>
					<li class="divider"></li>
					<li><a href="#" style="text-align: center;">查看全部消息&gt;</a></li>
				</ul>
			</div>
			<div class="btn-group">
				<a type="button" class="btn btn-lg dropdown-toggle" data-toggle="dropdown">
					<i class="glyphicon glyphicon-bell"></i>提醒<span class="badge">10</span><span class="caret"></span>
				</a>
				<ul class="dropdown-menu dropdown-menu-right" role="menu">
					<li><a href="#"><i class="glyphicon glyphicon-user"></i>新的评论</a></li>
					<li><a href="#"><i class="glyphicon glyphicon-cog"></i>新的任务</a></li>
					<li class="divider"></li>
					<li><a href="#" style="text-align: center;">查看全部提醒&gt;</a></li>
				</ul>
			</div>
			<div class="btn-group">
				<a type="button" class="btn btn-lg dropdown-toggle" data-toggle="dropdown">
					<i class="glyphicon glyphicon-user"></i>账户<span class="badge">2</span><span class="caret"></span>
				</a>
				<ul class="dropdown-menu dropdown-menu-right" role="menu">
					<li><a href="#"><i class="glyphicon glyphicon-user"></i>信息</a></li>
					<li><a href="#"><i class="glyphicon glyphicon-cog"></i>设置</a></li>
					<li class="divider"></li>
					<li><a href="#"><i class="glyphicon glyphicon-log-out"></i>退出</a></li>
				</ul>
			</div>
		</div>
	</div>
	<div class="nav col-md-2">
		<ul id="accordion" class="accordion">
			<li class="open">
				<div class="link">
					<i class="fa fa-paint-brush"></i>我的待办<i class="fa fa-chevron-down"></i>
				</div>
				<ul class="submenu" style="display: block;">
					<li><a href="#">工作任务</a></li>
					<li><a href="#">会议行程</a></li>
				</ul>
			</li>
			<li>
				<div class="link">
					<i class="fa fa-code"></i>我的生活<i class="fa fa-chevron-down"></i>
				</div>
				<ul class="submenu">
					<li><a href="#">Javascript</a></li>
					<li><a href="#">jQuery</a></li>
					<li><a href="#">Frameworks javascript</a></li>
				</ul>
			</li>
			<li>
				<div class="link">
					<i class="fa fa-mobile"></i>我的工具<i class="fa fa-chevron-down"></i>
				</div>
				<ul class="submenu">
					<li><a href="#">Tablets</a></li>
					<li><a href="#">Dispositivos mobiles</a></li>
					<li><a href="#">Medios de escritorio</a></li>
					<li><a href="#">Otros dispositivos</a></li>
				</ul>
			</li>
			<li><div class="link">
					<i class="fa fa-globe"></i>我的示例<i class="fa fa-chevron-down"></i>
				</div>
				<ul class="submenu">
					<li><a href="#">Google</a></li>
					<li><a href="#">Bing</a></li>
					<li><a href="#">Yahoo</a></li>
					<li><a href="#">Otros buscadores</a></li>
				</ul></li>
		</ul>
	</div>
	<div class="content">
		<div class="col-md-9 toolbar">
			<a class="btn btn-primary"><i class="glyphicon glyphicon-plus"></i>每日任务</a>
			<a class="btn btn-primary"><i class="glyphicon glyphicon-plus"></i>每周任务</a>
			<a class="btn btn-primary"><i class="glyphicon glyphicon-plus"></i>每月任务</a>
		</div>
		<div class="col-md-3 tasklist">
			<div class="tasklist-title">2016-12-19 日任务列表<i class="glyphicon glyphicon-remove"></i></div>
			<div class="tasklist-content">
				<div class="tasklist-uncomplete">
					<ul>
						<li>
							<i class="glyphicon glyphicon-unchecked"></i>
							<input class="task" type="text" value="任务1" readonly/>
						</li>
						<li>
							<i class="glyphicon glyphicon-unchecked"></i>
							<input class="task" type="text" value="任务2" readonly/>
						</li>
						<li>
							<i class="glyphicon glyphicon-unchecked"></i>
							<input class="task newtask" type="text" value="&lt;新建任务&gt;" readonly/>
						</li>
					</ul>
				</div>
				<div class="divider"></div>
				<div class="tasklist-complete">
					<ul>
						<li>
							<i class="glyphicon glyphicon-check"></i>
							<input class="task" type="text" value="已完成任务1" readonly/>
							<span class="time">2016-12-19 11:16:00</span>
						</li>
						<li>
							<i class="glyphicon glyphicon-check"></i>
							<input class="task" type="text" value="已完成任务2" readonly/>
							<span class="time">2016-12-19 11:18:00</span>
						</li>
					</ul>
				</div>
			</div>
		</div>
		<div class="col-md-3 tasklist">
			<div class="tasklist-title">2016-12-19至2016-12-25 周任务列表<i class="glyphicon glyphicon-remove"></i></div>
			<div class="tasklist-content">
				<div class="tasklist-uncomplete">
					<ul>
						<li><input type="checkbox"/>任务1</li>
						<li><input type="checkbox"/><span>&lt;新建任务&gt;</span></li>
					</ul>
				</div>
				<div class="divider"></div>
				<div class="tasklist-complete">
					<ul>
						<li><input type="checkbox"/>已完成任务1</li>
						<li><input type="checkbox"/>已完成任务2</li>
					</ul>
				</div>
			</div>
		</div>
		<div class="col-md-3 tasklist">
			<div class="tasklist-title">2016-12 月任务列表<i class="glyphicon glyphicon-remove"></i></div>
			<div class="tasklist-content">
				<div class="tasklist-uncomplete">
					<ul>
						<li><input type="checkbox"/>任务1</li>
						<li><input type="checkbox"/><span>&lt;新建任务&gt;</span></li>
					</ul>
				</div>
				<div class="divider"></div>
				<div class="tasklist-complete">
					<ul>
						<li><input type="checkbox"/>已完成任务1</li>
						<li><input type="checkbox"/>已完成任务2</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
</body>
</html>