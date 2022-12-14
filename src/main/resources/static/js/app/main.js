var main = {
    init : function () {
        var _this = this;
        $('#btn-save').on('click', function () {
            _this.save();
        });
    },
    save : function () {
        var data = {
            title: $('#title').val(),
            author: $('#author').val(),
            content: $('#content').val()
        };

        console.log(data);

        $.ajax({
            type: 'POST',
            url: '/posts',
            dataType: 'json',
            contentType: 'application/json; charset=utf-8',
            data: JSON.stringify(data),
            success: function () {
                alert('글이 등록되었습니다.');
                location.reload();
            },
            error: function (error) {
                console.log("error", error);
                alert(error);
            }
        });
    }

};

main.init();