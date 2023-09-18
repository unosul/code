function btn(){
    const time = new Date().getHours();
    let img = '';
    let x;
    if (time > 19) {
        x = "晚安"
        img = './img/evening.jpg'
    } else {
        x = "你好"
        img = './img/monring.jpg'
    }
    document.getElementById("ex").innerHTML= x
    var obj = document.getElementById("ex1")
    obj.innerHTML = '<img src="'+img+'" />'
}