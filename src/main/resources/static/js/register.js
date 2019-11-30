
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

let name = "ys";
let reg = document.getElementById("register");

reg.addEventListener("click",function(){
    let username = document.getElementById("user").value;
    let password = document.getElementById("password").value;
    let password1 = document.getElementById("password1").value;
    if(username != '') {
        if(username === name) {
            alert("用户已存在！");
        }else {
            if(password != ''){
                if(password1 != ''){
                    if(password === password1) {
                        alert("注册成功，请登录");
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