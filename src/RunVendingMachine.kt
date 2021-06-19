import java.util.Scanner
fun main(){
    val reader = Scanner(System.`in`)
    var vendingMachine = VendingMachine()

//    while(true) {
//
//        print("Please enter item ID you would like to buy - ")
//        print("")
//        var itemID = readLine()
//        if(itemID == ""){
//            continue
//        }
//        print("Please enter how many you would like to buy - ")
//        print("")
//        var itemCount: Int = reader.nextInt()
//        print("Please enter money to buy - ")
//        print("")
//        var money: Int = reader.nextInt()
//
//        vendingMachine.takeOrder(itemID!!, itemCount, money.toDouble())
//
//        println("Buy Again? Press Y or N")
//        var input = readLine()
//        if(input == "Y" || input == "y"){
//            continue
//        }
//        else{
//            break
//        }
//    }
    snapCrackle()
}

fun snapCrackle(){
    var checkIfNumberExist = ""

    for(i in 1..100){
        checkIfNumberExist = i.toString()
        if((i % 3 == 0 || checkIfNumberExist.contains("3")) && i % 7 != 0){
            println("$i snap")
        }
        else if((i % 7 == 0 || checkIfNumberExist.contains("7")) && i % 3 != 0){
            println("$i crackle")
        }
        else if((i % 3 == 0 || checkIfNumberExist.contains("3")) && (i % 7 == 0 || checkIfNumberExist.contains("7"))){
            println("$i snap crackle")
        }
        else{
            println(i)
        }
    }
}