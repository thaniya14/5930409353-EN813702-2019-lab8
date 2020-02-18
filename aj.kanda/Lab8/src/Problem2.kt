fun main(args: Array<String>){

    for( i in 1..10){
        val fortune : getFortune(getBirthday())
        println("\nYour fortune is $fortune")
        if (fortune.contains("Take is easy")) break ;
    }
}



fun getBirthday() : String {

    var stringInput = readLine()!!

    return stringInput
}

fun getFortune(str : String):String{


    val fortunes = listOf("You will have a great day!",
            "Things will go well for you today",
            "Enjoy a wonderful day of success",
            "Be humble and all will turn out well",
            "Today is a good day for exercising restraint",
            "Take it easy and enjoy life!",
            "Treasure your friends because they are your greatest fortune")
    var str1 = ""
    val num = str.toInt()


    when (num){

        in 1..7 -> str1= "Have a good start the first week of the month"
         28 -> str1 = "Enjoy that last days of month"
         31 -> str1 = "Enjoy that last days of month"
         else -> {
             str1 = fortunes[num%7]
         }
    }

    return str1

}

