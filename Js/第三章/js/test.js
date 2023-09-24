
function display() {
    var x  = document.getElementById("week").selectedIndex
    var s = ""

    switch (x)
    {
        case 0:
            s = "周一"
            break
        case 1:
            s = "周二"
            break
        case 2:
            s = "周三"
            break
        case 3:
            s = "周四"
            break
        case 4:
            s = "周五"
            break
        case 5:
            s = "周六"
            break
        case 6:
            s = "周天"
            break
    }
    document.getElementById("input").innerHTML=s
}

