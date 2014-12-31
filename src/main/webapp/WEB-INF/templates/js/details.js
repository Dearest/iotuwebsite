
//评论
function comment(){
	var contentId = $("#contentId").val();
	var toUser = $("#toUser").val();
	var fromUser = $("#fromUser").val();
	var commentary =$("#commentary").val();
	var isRecomment = 0; 
	$.post("comment",{
		contentId:contentId,
		toUser:toUser,
		fromUser:fromUser,
		commentary:commentary,
		isRecomment:isRecomment
		},
		function (){
			location.href="details?contentId="+contentId;
		}
	); 
}

//回复评论
function recomment(commentId){
	var contentId = $("#contentId").val();
	var toUser = $("#commentauthor"+commentId).html();
	var fromUser = $("#toUser").val();
	var commentary = $("#recommentInput"+commentId).val();
	var isRecomment = 1; 
	var recommentId = commentId;
	$.post("comment",{
		contentId:contentId,
		toUser:toUser,
		fromUser:fromUser,
		commentary:commentary,
		isRecomment:isRecomment,
		recommentId:recommentId
		},
		function (){
			location.href="details?contentId="+contentId;
		}
	); 
}