fun main(args: Array<String>){


    var x=0
    var birthday =0
    print("Enter your birthday: ")
    while (x != 1 ){


        val stringInput = readLine()!!
        val str = stringInput.toIntOrNull()
        if(str != null){
            x=1
            val mess = getFortuneCookie(str)
            print("Your fortune is "+ mess)
        }
        else {
            print("Please enter your birthday")
        }
    }
}

fun getFortuneCookie(birth : Int): String {
    val fortunes = listOf("You will have a great day!",
            "Things will go well for you today",
            "Enjoy a wonderful day of success",
            "Be humble and all will turn out well",
            "Today is a good day for exercising restraint",
            "Take it easy and enjoy life!",
            "Treasure your friends because they are your greatest fortune")

    return fortunes[birth%7]
}