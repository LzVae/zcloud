
// 登录按钮绑定弹出事件
$('#login-btn').click(function(event) {
	
	layui.use(["form","layer"], function(){
	  var layer = layui.layer;
	  var form=layui.form;
	  layer.open({
		  type: 1, 
		  area: '500px',
		  content: $('#login-form')
		});
	  form.render();

	});    
});


// 用户登录
$('#try-login').click(function(event) {

	$.ajax({
		url: 'login',
		type: 'POST',
		data: $('#login-form').serialize(),
	});
	
	
});