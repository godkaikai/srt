function PostAjax(url,data) {
    $.ajax({
        type: 'POST',
        url: url,
        async: false,
        data: data,
        contentType : 'application/json;charset=utf-8',
        success: function (response) {
            alert(response);
        },
        error: function () {
            alert("操作失败，请重试");
        }
    })
}