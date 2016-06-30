/*! jQuery v1.10.2 | (c) 2005, 2013 jQuery Foundation, Inc. | jquery.org/license
//@ sourceMappingURL=jquery-1.10.2.min.map
*/
//$(function() {
//	initTypeInfo(1);
//})

function initTypeInfo(currentTypeInfoId){
	var select = "<select id='typeInfoId' name='typeInfoId'>";
	var option;
	var end = "</select>";
	$.ajax({
		url:"findAllTypeInfoInBrandInfo",
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
								+rows[index].type+"</option>";
							}else{
								option += "<option value='"+ rows[index].id+ "'> "
								+rows[index].type+"</option>";
							}
						}
						select = select + option +end;
						$("#divTypeInfo").html(select);
					}
				}else{
					alert("请配置type数据")
				}
				
			}
					
	}
		
	});
}