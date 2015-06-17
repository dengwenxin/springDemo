$(function() {
    $('#createBinaryCode').on("click", function(){
        console.log("xx");
        var xx = $("#codeInput").val();
        $('#outCode').text(xx);
        console.log("xx",xx);
    });
});