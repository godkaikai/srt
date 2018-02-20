<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<body>
<h2>Hello World!</h2>
<input type="button" class="s">
<div id="add"></div>
</body>
</html>
<script src="static/js/jquery.js"></script>
<script src="static/js/jquery.min.js"></script>
<script src="static/js/ajaxUtils.js"></script>
<script>
    $('.s').click(function () {
        var url = 'room/getRoomList.do';
        var data = '';
        $.ajax({
            type: 'POST',
            url: url,
            async: false,
            data: data,
            contentType : 'application/json;charset=utf-8',
            success: function (response) {
                document.getElementById("add").innerHTML = response;
            },
            error: function () {
                alert("操作失败，请重试");
            }
        })
    })


    //以删除教室为例
    function deleteRoom() {
        var url = "room/deleteRoom.do";
        var data = {
            roomid : 1
        };
        PostAjax(url,data);
    }
</script>
