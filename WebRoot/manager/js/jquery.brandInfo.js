$(function() {
			initBrandInfo(1);
		})
		
function initBrandInfo(currentTypeInfoId) {
	var select = "<select id='brandInfoId' name='brandInfoId'>";
	var option;
	var end = "</select>";
	$.ajax({
				url : "findAllBrandInfoInProductInfo",
				type : "post",
				dataType : "json",
				success : function(list) {
					if (list != null) {
						var array = eval(list);
						if (array != null) {
							var rows = array.rows;
							if (rows.length > 0) {
								for (var index = 0; index < rows.length; index++) {
									if (currentTypeInfoId == rows[index].id) {
										option += "<option value='"
												+ rows[index].id
												+ "' selected='selected'> "
												+ rows[index].name+"--"+rows[index].typeInfo.type
												+ "</option>";
									} else {
										option += "<option value='"
												+ rows[index].id + "'> "
												+ rows[index].name+"--"+rows[index].typeInfo.type
												+ "</option>";
									}
								}
								select = select + option + end;
								$("#divBrandInfo").html(select);
							}
						} else {
							alert("请配置type数据")
						}

					}

				}

			});
}