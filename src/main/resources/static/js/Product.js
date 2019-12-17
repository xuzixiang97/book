

//尺码选择和颜色选择功能
(function(){
    var $li1 = $('#choice1 li');
    choice($li1);
    function choice(obj){
        obj.click(function(){
            index=obj.index($(this));
            //alert(index)
            obj.eq(index).addClass('checked').siblings().removeClass('checked');
        });
    }
})();







