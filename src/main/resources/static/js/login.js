


var btn = document.getElementById("login");
var usertype = document.getElementsByName("usertype");


btn.addEventListener("click",function(){
    var username = document.getElementById("user").value;
    var password = document.getElementById("password").value;
    $.ajax({
        url: "/laofuzi/user/login",
        type: "POST",
        data: {"username":username,
            "password":password},
        dataType:"json",
        async: false,
        success: function(result){
            var userinfo = JSON.stringify(result);


            // $("input[name='extendDataFormInfo.value(fd_shengyu_nianjia)']").val(annualDays);
            // $("input[name='extendDataFormInfo.value(fd_ruzhi_date)']").val(entryDate);

        }
    });
})