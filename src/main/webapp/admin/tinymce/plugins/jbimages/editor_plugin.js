(function(){tinymce.PluginManager.requireLangPack('jbimages');tinymce.create('tinymce.plugins.jbImagesPlugin',{init:function(ed,url){ed.addCommand('jbImages',function(){var unixtime_ms=new Date().getTime();ed.windowManager.open({file:url+'/dialog.htm?z'+unixtime_ms,width:330+parseInt(ed.getLang('jbimages.delta_width',0)),height:155+parseInt(ed.getLang('jbimages.delta_height',0)),inline:1},{plugin_url:url})});ed.addButton('jbimages',{title:'jbimages.desc',cmd:'jbImages',image:url+'/img/jbimages-bw.gif'});ed.onNodeChange.add(function(ed,cm,n){cm.setActive('jbimages',n.nodeName=='IMG')})},createControl:function(n,cm){return null},getInfo:function(){return{longname:'JustBoil.me Images Plugin',author:'Viktor Kuzhelnyi',authorurl:'http://justboil.me/',infourl:'http://justboil.me/',version:"2.3"}}});tinymce.PluginManager.add('jbimages',tinymce.plugins.jbImagesPlugin)})();