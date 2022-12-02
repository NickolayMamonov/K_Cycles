import kotlin.random.Random

fun Second(){
    val a = Random.nextInt(1,9)
    var b = readln().toInt()
    while(a != b){
        println("Неверно")
        b = readln().toInt()

    }
    if(a.equals(b)){
        println("Числа совпали!")
    }
}