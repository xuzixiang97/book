

//点击书籍时跳转到书籍详情页
function bookclick(bcid,aid){
    console.log("bcid:",bcid);
    console.log("aid:",aid);
    window.localStorage.setItem('bookcatid',bcid);
    window.localStorage.setItem('bookid',aid);
    window.location.href= "single";
}

//点击书籍类别跳转到某类别的书籍展示页
function catclick(pid,cid){
    console.log("cid:",cid);
    window.localStorage.setItem('parentid',pid);
    window.localStorage.setItem('categoryid',cid);
    window.location.href= "CategoryList";
}

//图书加入购物车
function addcart(nnum,bid,uid){
    $.ajax({
        url: "/laofuzi/cart/findByUserId",
        type: "POST",
        dataType:"json",
        contentType : 'application/json',
        data: JSON.stringify({"userId":uid}),
        async: false,
        success: function(result){
            console.log(result);
            var count = 0;
            for(var i =0; i < result.length; i++){
                console.log(bid,result[i].bookId);
                if(bid == result[i].id){
                    count ++;
                    var num = result[i].number + parseInt(nnum);
                    var cartid = result[i].id
                }
            }
            console.log(count,num);
            if(count > 0){
                $.ajax({
                    url: "/laofuzi/cart/update",
                    type: "POST",
                    dataType:"json",
                    contentType : 'application/json',
                    data: JSON.stringify({"userId":uid,"bookId":bid,"number":num,"id":cartid}),
                    async: false,
                    success: function(data){
                        console.log("updatecart:",data);
                        window.location.href = "checkout";
                    }
                });
            }else{
                $.ajax({
                    url: "/laofuzi/cart/add",
                    type: "POST",
                    dataType:"json",
                    contentType : 'application/json',
                    data: JSON.stringify({"userId":uid,"bookId":bid,"number":parseInt(nnum)}),
                    async: false,
                    success: function(result){
                        console.log("addcart:",result);
                        window.location.href = "checkout";
                    }
                });
            }

        }
    });
}

//结算
function payclick(bid,uid){
    // window.localStorage.setItem('bookid',bid);
    window.location.href = "pay";
}

function account(number,unitprice){
    console.log(number,unitprice);
    number = parseInt(number)+ 1;
    amount = parseInt(number)*parseFloat(unitprice);
    console.log(number,amount);
}

//格式化long类型时间
function formatDate(longDate) {
    var date = new Date(longDate);
    var yyyy = date.getFullYear();
    var mm = date.getMonth() + 1;
    if (mm < 10) {
        mm = "0" + mm;
    }
    var dd = date.getDate();
    if (dd < 10) {
        dd = "0" + dd;
    }
    return yyyy + "-" + mm + "-" + dd;
}

function exit(){
    window.localStorage.clear();
    window.location.href = "login"
}

var userid = window.localStorage.getItem('userid');// 用户id
var user = window.localStorage.getItem('user');//登录成功的用户名
var user1 = window.localStorage.getItem('user1');//注册成功的用户名
var parentid = window.localStorage.getItem('parentid');//一级类别的id
var categoryid = window.localStorage.getItem('categoryid');//二级类别的id
var bookcatid = window.localStorage.getItem('bookcatid');//书籍的类别id
var bookid = window.localStorage.getItem('bookid');//书籍的id
var ids = window.localStorage.getItem('ids');//书籍的id列表