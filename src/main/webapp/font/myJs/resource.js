$(function(){
	loadMClass();	//加载所有的主类
//	loadSources();	//查询所有资源单
	aa();
	$("#selBut").on("click",aa);//查询所有
	$("#next").on("click",next);//下一页
	$("#prev").on("click",prev);//上一页
	$("#first").on("click",first);//首页
	$("#last").on("click",last);//末页
	$("#skipPage").on("click",skipPage);//跳转
	
})

var total=1;
var curPage=1;
var pageSize=1;

function aa(){
	loadSources();
	selTotal();
	show();
}

//加载所有的主类
function loadMClass(){
//	alert("-----")
	$.ajax({
		url:"/BaiXian/source/selMClass",
		type:"post",
		dataType:"json",
		success:function(data){
			for(var i=0;i<data.length;i++){
				var str = "<input type='checkbox' name=mclass value="+data[i].id+">";
				str += data[i].name +"&nbsp;&nbsp;&nbsp;";
				$("#mainClass").append(str);
			}
		},
		error:function(data){
			
		}
	})
}

//查询所有资源单
function loadSources(){
	var mainclass = $("#mainClass input[type='checkbox']:checked");
	var mc = new Array();
	for(var i=0;i<mainclass.length;i++){
		mc.push($.trim($(mainclass[i]).val()));
	}
//	alert(mc)
//	alert($("#mainClass input[name='mclass']:checked").length);
	$.ajax({
		url:"/BaiXian/source/selSources",
		type:"get",
		dataType:"json",
		traditional:true,
		data:{
			comName:$("#comName").val(),
			productName:$("#productName").val(),
			area:$("#area").val(),
			mainClass:mc,
			curPage:curPage,
			pageSize:pageSize
		},
		success:function(data){
			$("#showDataDiv").empty();
			for(var i=0;i<data.length;i++){
				var row = "<tr><td>";
				row += data[i].comName+"</td><td>"
				for(var j=0;j<data[i].bcName.length;j++){
					row += "<p>"+data[i].bcName[j]+"</p>";
				}
				row += "</td><td>";
				for(var j=0;j<data[i].proName.length;j++){
					row += data[i].proName[j]+"&nbsp;&nbsp;";
				}
				row += "</td><td>"+data[i].explains;
				row += "</td><td>"+data[i].createDate;
				row += "</td><td>1";
				row += "</td><td><button class=btn04 onclick=showDetail("+data[i].id+")>快速预览</button>";
				row += "</td></tr>";
				$("#showDataDiv").append(row);
			}
		}
	})
}
//查询总条数
function selTotal(){
	var mainclass = $("#mainClass input[type='checkbox']:checked");
	var mc = new Array();
	for(var i=0;i<mainclass.length;i++){
		mc.push($.trim($(mainclass[i]).val()));
	}
	$.ajax({
		url:"/BaiXian/source/selTotal",
		type:"get",
		dataType:"json",
		async:false,
		traditional:true,
		data:{
			comName:$("#comName").val(),
			productName:$("#productName").val(),
			area:$("#area").val(),
			mainClass:mc,
		},
		success:function(data){
			total=Math.ceil(parseInt(data)/pageSize);
		}
	})
}

function show(){
//	alert(Math.ceil(parseInt(6)/pageSize));
	$("#totalPage").html(total);
	$(".curPage").text(curPage);
	$("#prev").attr("class","prev-listPage");
	$("#next").attr("class","next-listPage");
	if(curPage == 1){
		$("#prev").attr("class","prev-listPage prev-disable");
	}
	if(curPage == total){
		$("#next").attr("class","next-listPage next-disable");
	}
}

//上一页，下一页
function next(){
	if(curPage == total){
		return;
	}
	curPage++;
	aa();
}
function prev(){
	if(curPage == 1){
		return;
	}
	curPage--;
	aa();
}
//首页，末页
function first(){
	curPage=1;
	aa();
}
function last(){
	curPage=total;
	aa();
}
//跳转
function skipPage(){
	var page = $("#skipPageNum").val();
	if(isNaN(page)){
		alert("请输入合法的数字...");
		return;
	}
	if(parseInt(page)<1 || parseInt(page)>total){
		alert("输入的页号不在范围内，请重新输入");
		return;
	}
	curPage = parseInt(page);
	aa();
}






function showDetail(id){
	sessionStorage.sourceId=id;
	window.location.href="resourcePreview.html";
}


