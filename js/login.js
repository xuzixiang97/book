
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
let reg = document.getElementById("register");
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
           console.log(ctype);
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
reg.addEventListener("click",function(){
    document.getElementById("pass1").style.display = "block";
    document.getElementById("password").placeholder = "请设置密码";
    reg.style.backgroundColor = "blue";
    btn.style.backgroundColor = "#ececec";
    btn.disabled = true;
    let username = document.getElementById("user").value;
    let password = document.getElementById("password").value;
    let password1 = document.getElementById("password1").value;
    for(let i =0; i < usertype.length; i++){
        if(usertype[i].checked){
            ctype = usertype[i].value;
            console.log(ctype);
        }
    }
    if(username != '') {
        if(username === name) {
            alert("用户已存在！");
        }else {
            if(password != ''){
                if(password1 != ''){
                    if(password === password1) {
                        alert("注册成功，请登录");
                        document.getElementById("pass1").style.display = "none";
                        document.getElementById("password").placeholder = "请填写密码";
                        btn.style.backgroundColor = "blue";
                        reg.style.backgroundColor = "#ececec";
                        btn.disabled = false;
                    }else{
                        alert("确认密码填写错误");
                    }
                }else{
                    alert("请再次填写密码以进行确认");
                }
            }else{
                alert("请设置密码");
            }
        }
    }
})