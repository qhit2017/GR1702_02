function checkFrom() {
	if (document.login.user.value=="") {
		alert("用户名不能为空，请输入！！！")
		return false;
	}
	if (document.login.password.value=="") {
		alert("密码不能为空，请输入！！！")
		return false;
	}
}