KindEditor.ready(function(K) {
	var options = {
		cssPath : 'js/kindeditor/plugins/code/prettify.css',
		uploadJson : 'js/kindeditor/jsp/upload_json.jsp',
		fileManagerJson : 'js/kindeditor/jsp/file_manager_json.jsp',
		allowFileManager : true,
		allowImageUpload : true,
		resizeType : 0,
		
		afterCreate : function() {
			var self = this;
			K.ctrl(document, 13, function() {
				self.sync();
				K('form[name=myform]')[0].submit();
			});
			K.ctrl(self.edit.doc, 13, function() {
				self.sync();
				K('form[name=myform]')[0].submit();
			});
		},		
		afterBlur : function() {
			this.sync();
		}
	};
	var editor = K.create('textarea', options);
	editor.sync();
	prettyPrint();
	});