
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

	$('#log-username-check-result').text("");
	$('#log-password-check-result').text("");
	
	$.ajax({
		url: 'login',
		type: 'POST',
		data: $('#login-form').serialize(),
		success:function(result){

            if (result.extend.resinfo == "nouser") {
            	$('#log-username-check-result').text("用户名不存在");
            }else if (result.extend.resinfo == "errorpwd") {
            	$('#log-password-check-result').text("密码错误");
            }else{
            	window.location.href="home";
            }
    
		}
	});

});