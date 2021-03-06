/**
 * 添加自定义配置文件
 */
//自定义工具栏
FCKConfig.ToolbarSets["myToolbar"] = [
	['Source','-','Preview','-','Templates'],
	['Cut','Copy','Paste','PasteText','PasteWord'],
	['Undo','Redo','-','Find','Replace','-','SelectAll','RemoveFormat'],
	'/',
	['Bold','Italic','Underline','StrikeThrough','-','Subscript','Superscript'],
	['OrderedList','UnorderedList','-','Outdent','Indent','Blockquote','CreateDiv'],
	['JustifyLeft','JustifyCenter','JustifyRight','JustifyFull'],
	['Link','Unlink','Anchor'],
	['Image','Flash','Table','Rule','Smiley','SpecialChar','PageBreak'],
	'/',
	['Style','FontFormat','FontName','FontSize'],
	['TextColor','BGColor'],
	['FitWindow','ShowBlocks']		// No comma for the last row.
] ;
//自定义字体
FCKConfig.FontNames		= '宋体;仿宋;黑体;楷体';

//自定义字体大小
FCKConfig.FontSizes  = '10px;15px;20px;25px;30px;35px;40px;45px';

//自定义表情图片

//表情图片存放地址
FCKConfig.SmileyPath	= FCKConfig.BasePath + 'images/smiley/qq/' ;

//修改表情图片名字
FCKConfig.SmileyImages	= ['001.gif','002.gif','004.gif','005.gif',
                      	   '006.gif','007.gif','008.gif','009.jpg',
                      	   '010.jpg','011.gif','012.gif','013.gif',
                      	   '014.gif','015.gif','016.gif','017.jpg'] ;

//自定义表情图片列数
FCKConfig.SmileyColumns = 5 ;

//自定义图片宽和高
FCKConfig.SmileyWindowWidth		= 320 ;
FCKConfig.SmileyWindowHeight	= 210 ;