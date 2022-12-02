fun Fifth(){
    var a = 0
    for(i in 1..100){
        if(i % 4 == 0) {
            a = a.plus(i)
        }
    }
    println(a)
}