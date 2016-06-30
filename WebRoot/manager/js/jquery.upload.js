/*
 * ! jQuery v1.10.2 | (c) 2005, 2013 jQuery Foundation, Inc. |
 * jquery.org/license //@ sourceMappingURL=jquery-1.10.2.min.map
 */
// $(function() {
// initTypeInfo(1);
//
function uploadFile(obj) {
	if (obj.value != "未选择任何文件") {
		document.getElementById("logo").value = obj.value;
		$("#logo").value = obj.value;
	}
}

function uploadPic(obj) {
	$.ajax({
				url : "uploadPic",
				type : "post",
				data : obj,
				dataType : "json",
				success : function(message) {
					alert(message.other);
					location.reload();
				}
			});
}