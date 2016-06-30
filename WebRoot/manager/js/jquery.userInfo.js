/*! jQuery v1.10.2 | (c) 2005, 2013 jQuery Foundation, Inc. | jquery.org/license
//@ sourceMappingURL=jquery-1.10.2.min.map
*/
$(function() {
	initUserInfo(1);
})

function initUserInfo(currentTypeInfoId){
	var select = "<select id='userInfoId' name='userInfoId'>";
	var option;
	var end = "</select>";
	$.ajax({
		url:"findAllUserInfoInProductInfo",
		type:"post",
		dataType:"json",
		success:function(list){
			if(list!=null){
				var array = eval(list);
				if(array!=null){
					var rows = array.rows;
					if(rows.length>0){
						for(var index = 0; index < rows.length; index++){
							if(currentTypeInfoId == rows[index].id){
								option += "<option value='"+ rows[index].id+ "' selected='selected'> "
								+rows[index].name+"</option>";
							}else{
								option += "<option value='"+ rows[index].id+ "'> "
								+rows[index].name+"</option>";
							}
						}
						select = select + option +end;
						$("#divUserInfo").html(select);
					}
				}else{
					alert("请配置type数据")
				}
				
			}
					
	}
		
	});
}