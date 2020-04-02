/**
 * <p>请求提交Object对象
 * @author hutao
 * var data = {
 * 			"userName":$("#userName").val(),
			"passWord":$("#passWord").val(),
			"token":""
 * }
 * httpRequestForObjetc(url,data)
 * 
 */
function httpRequestForObjetc(url,objectData,type){
	layer.open({ title: '提示', content: type });
	var resultData;
	$.ajax({
		type:type,
		url: url,
		data:objectData,
		async: false,
		dataType: "json",
		success: function(rdata){
			resultData = rdata;
		}
	
	});
	return resultData;
}
/**
 * <p>请求提交Json字符串
 * var data = {
 * 			"userName":$("#userName").val(),
			"passWord":$("#passWord").val(),
			"token":""
 * }
 * httpRequestForJson(url,JSON.stringify(data))
 */
function httpRequestForJson(url,jsonStrData,type){
	var resultData;
	$.ajax({
		type: type,
		contentType: "application/json;charset=UTF-8",//Spring MVC @RequestBody注解做提交json字符串自动绑定到pojo入参
		url: url,
		data:jsonStrData,
		async: false,
		dataType: "json",
		success: function(rdata){
			resultData = rdata;
		}
	
	});
	return resultData;
}
/**
 * <p>请求提交form表单文件
 * @author hutaoa
 */
function httpRequestForFile(url,formData,type){
	var resultData;
	$.ajax({
		url:url, 
		type: type,
		data: formData,
		async: false,
		cache: false,
		contentType: false,
		processData: false,
		success: function (data) {
			resultData = data;
		},
		error: function (data) {
			layer.open({ title: '提示', content: "文件提交失败，请联系管理员" });
		}
	});
}