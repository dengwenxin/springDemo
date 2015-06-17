$(function() {
    console.log("init");
    init();
});

function init() {
    console.log("s");
    var currentDate = new Date();

    var selectDate = setTimeZero(currentDate);
    console.log(selectDate);
    var table =
            "<table> \
        <thead class='tablehead'> \
            <tr> \
                <td class='thead' style='color:#bc5016;'>日</td> \
                <td class='thead'>一</td> \
                <td class='thead'>二</td> \
                <td class='thead'>三</td> \
                <td class='thead'>四</td> \
                <td class='thead'>五</td> \
                <td class='thead' style='color:#bc5016;'>六</td> \
            </tr> \
        </thead> \
    </table> \
    <table id='cont' style='height:100%;'> \
    <tbody>";
   
    var rows = 5;
    var aWeek = "<tr style='height:" + (1 / rows).toPercent() + ";'>";
    
    var aDay = "";
    
    table += "</tbody></table>";

    $('#mainCal').empty();
    $('#mainCal').append(table);

    console.log("mainCal");

}

function setTimeZero(date) {
    ndate = new Date(date);
    ndate.setHours(0);
    ndate.setMinutes(0);
    ndate.setSeconds(0);
    ndate.setMilliseconds(0);
    return ndate;
}
