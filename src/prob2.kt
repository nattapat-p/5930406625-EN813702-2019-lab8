fun main(){
    var fortune:String
    for (i in 1..10){
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
        if(fortune.contains("Take it easy")) break;
    }
}
fun getBirthday(): Int? {
    print("Enter your birthday: ")
    return readLine()?.toIntOrNull()?:return null
}
fun getFortune(birthday : Int?): String {
    var list = listOf<String>("You will have a great day!.","Things will go well for you today.","Enjoy a wonderful day of success.","Be humble and all will turn out well.","Today is a good day for exercising restraint.","Take it easy and enjoy life!.","Treasure your friends because they are greatest fortune.")
    return when (birthday){
        in 28..31-> "Enjoy that last days of month"
        in 1..7->"Have a good start the first week of month"
        !in 1..31 ->"Please enter a valid birthday (1-31)"
        !is Int ->"Please enter a valid birthday (1-31)"
       else -> list[birthday % list.size]
    }
}