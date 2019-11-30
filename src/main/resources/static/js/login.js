
// $.ajax({
//     url: url,
//     type: "POST",
//     data: parameters,
//     dataType:"json",
//     async: false,
//     success: function(result){
//         var userinfo = JSON.stringify(result);
//         userinfo = eval("("+userinfo+")");
//         let name = userinfo.username;
//         let pass = userinfo.password;
//         let utype = userinfo.type;
//
//         // $("input[name='extendDataFormInfo.value(fd_shengyu_nianjia)']").val(annualDays);
//         // $("input[name='extendDataFormInfo.value(fd_ruzhi_date)']").val(entryDate);
//
//     }
// });


let btn = document.getElementById("login");
let usertype = document.getElementsByName("usertype");

let name = "ys";
let pass = "123456";
let utype = "1";
let ctype = null;

btn.addEventListener("click",function(){
    let username = document.getElementById("user").value;
    let password = document.getElementById("password").value;
    for(let i =0; i < usertype.length; i++){
        if(usertype[i].checked){
           ctype = usertype[i].value;
           // console.log(ctype);
        }
    }
    if(username != '' && username === name){
        if(password != ''){
            if(password === pass){
                if(utype === ctype){
                    window.location.href("index.html");
                }else{
                    alert("用户类型选择错误");
                }
            }else{
                alert("密码错误");
            }
        }else{
            alert("请填写密码");
        }
    }else {
        alert("用户不存在！");
    }
})