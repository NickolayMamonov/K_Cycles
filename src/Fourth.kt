fun Fourth(){
    var a = readln().toInt()
    var even = 0
    var odd = 0
    while(a > 0){
        if(a % 2 == 0) { even += 1 }
        else{ odd += 1 }
        a /= 10
    }
    println("Четные: ${even} \nНечетные: ${odd}")
}