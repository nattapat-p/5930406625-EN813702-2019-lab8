fun main(){
    print(getFortuneCookie())
}

fun getFortuneCookie(): String {
    var list = listOf<String>("You will have a great day!.","Things will go well for you today.","Enjoy a wonderful day of success.","Be humble and all will turn out well.","Today is a good day for exercising restraint.","Take it easy and enjoy life!.","Treasure your friends because they are greatest fortune.")
    print("Enter your birthday: ")
    val birthday = readLine()?.toIntOrNull()?:return "Please enter your birthday"
    if (birthday >31 || birthday <1){
        return "Please enter your birthday"
    }
    return "You fortune is: "+ list[birthday % list.size]
}