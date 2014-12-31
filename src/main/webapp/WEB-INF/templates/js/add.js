var ue = UE.getEditor('editor');

function save(){
	var flag = true;
	
	$("#content").val(ue.getContent());
	//判断新闻内容是否填写
	if($.trim($("#content").val()) == ""){
		$("#contentError").show();
		flag = false;
	}
	//判断标题是否填写
	if($.trim($("#title").val()) == ""){
		$("#titleError").show();
		flag = false;
	}
	//判断标题长度
	if($.trim($("#title").val()).length > 20){
		$("#titleError").html("标题长度过长。限制输入20个字符");
		$("#titleError").show();
		flag = false;
	}
	//判断新闻摘要是否填写
	if($.trim($("#summary").val()) == ""){
		$("#summaryError").show();
		flag = false;
	}
	//判断新闻摘要长度
	if($.trim($("#summary").val()).length > 50){
		$("#summaryError").html("消息摘要长度过长。限制输入50个字符");
		$("#summaryError").show();
		flag = false;
	}
	return flag;
}