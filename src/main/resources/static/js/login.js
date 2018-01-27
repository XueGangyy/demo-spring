/**
 * Created by yuyue on 2017/12/4.
 */
var loginBaseUrl="http://127.0.0.1:8080/login";
function submit(){
   var loginJson={
       username:$("#username").val(),
       password:$("#password").val(),
   }
   $.ajax({
       type: "POST",
       url:loginBaseUrl+"/user",
       data:JSON.stringify(loginJson),
       xhrFields:{withCredentials:true},
       contentType:"application/json",
       success:function (msg) {
           alert(msg);
           if(msg==="success") {
               window.location.href = "/index";
           }else if(msg==="error"){
               window.location.href="/error";
           }
       },
       error:function (msg) {
           alert(msg);
           window.location.href="/error";
       }
   })
}