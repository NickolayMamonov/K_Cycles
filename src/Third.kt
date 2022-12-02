fun Third(){
    val a = readln().toInt()
    for(i in 1..a){
        if(a % i == 0 && i != a){
            print("${i}, ")
        }
        else if(i == a){
            print(i)
        }
    }
}