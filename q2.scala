@main def main():Unit = {
    print("Enter a number: ")
    var userInput = scala.io.StdIn.readInt()

    

    val isMultipleofFive = (userInput:Int) => userInput % 5 == 0
    val isMultipleofThree = (userInput:Int) => userInput % 3 == 0

    userInput match {
        case n if isMultipleofFive(n) && isMultipleofThree(n) => println("Multiple of Both Three and Five")
        case n if isMultipleofFive(n) => println("Multiple of Five")
        case n if isMultipleofThree(n) => println("Multiple of Three")
        case _ => println("Not a multiple of Three or Five")
    }
}

