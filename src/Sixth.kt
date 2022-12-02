fun Sixth(){
    var a = 5
    var b = a
    while (a != 57){
        a += 1
        if(a == 34 || a == 46 || a == 52){ continue }
        else{ b += a }
    }
    println(b)
}