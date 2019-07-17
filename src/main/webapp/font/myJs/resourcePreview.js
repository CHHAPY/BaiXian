$(function(){
//	alert(sessionStorage.id);
	//查询资源单详情
	showDetail();
	aa();
	$("#selPart").on("click",aa);	//查询满足条件的产品
	$("#next").on("click",next);//下一页
	$("#prev").on("click",prev);//上一页
	$("#first").on("click",first);//首页
	$("#last").on("click",last);//末页
	$("#skipPage").on("click",skipPage);//跳转
})
var id = sessionStorage.sourceId;
var total=1;
var curPage=1;
var pageSize=1;

function aa(){
	selPart();
	selPartTotal();
	show();
}

function showDetail(){
	$.ajax({
		url:"/BaiXian/source/showDetail",
		type:"get",
		dataType:"json",
		data:{
			id:id,
			curPage:curPage,
			pageSize:pageSize
		},
		success:function(data){
			var com = data.company;
			$("#cname").html(com.name);
			$("#adress").html(com.adress);
			$("#tel").html(com.makertel);
			$("#explains").html(data.explains);
			var proList = data.productList
			$("#showData").empty();
			for(var i=0;i<proList.length;i++){
				var str = "<tr><td>" + proList[i].name;
				str += "</td><td>" + proList[i].area;
				str += "</td><td>" + proList[i].type;
				str += "</td><td>" + proList[i].rank;
				str += "</td><td>" + proList[i].count;
				str += "</td><td>" + proList[i].price;
				str += "</td><td>" + proList[i].currency;
				str += "</td><td>" + proList[i].warehouse;
				str += "</td><td>" + proList[i].prostatus;
				str += "</td><td>" + proList[i].remark;
				str += "</td><td>无</td></tr>";
				$("#showData").append(str);
			}
		},
		error:function(data){
			
		}
	})
}

function selPart(){
	$.ajax({
		url:"/BaiXian/source/selPart",
		type:"get",
		dataType:"json",
		data:{
			id:id,
			pname:$("#pname").val(),
			area:$("#area").val(),
			curPage:curPage,
			pageSize:pageSize
		},
		success:function(data){
			$("#showData").empty();
			for(var i=0;i<data.length;i++){
				var str = "<tr><td>" + data[i].name;
				str += "</td><td>" + data[i].area;
				str += "</td><td>" + data[i].type;
				str += "</td><td>" + data[i].rank;
				str += "</td><td>" + data[i].count;
				str += "</td><td>" + data[i].price;
				str += "</td><td>" + data[i].currency;
				str += "</td><td>" + data[i].warehouse;
				str += "</td><td>" + data[i].prostatus;
				str += "</td><td>" + data[i].remark;
				str += "</td><td>无</td></tr>";
				$("#showData").append(str);
			}
		},
		error:function(data){
			
		}
	})
}

function selPartTotal(){
	$.ajax({
		url:"/BaiXian/source/selPartTotal",
		type:"get",
		dataType:"json",
		async:false,
		data:{
			id:id,
			pname:$("#pname").val(),
			area:$("#area").val()
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


