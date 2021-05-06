class VendingMachine(){
    var change: Number = 0
    var items = mutableListOf<VendingMachineItem>(
        VendingMachineItem("apple",1.0, "A2",10),
        VendingMachineItem("cookie",4.0, "D4",20),
        VendingMachineItem("banana",0.5, "F1",15),
        VendingMachineItem("lays",2.0, "G3",25),
        VendingMachineItem("gatorade",1.0, "A5",5),
        VendingMachineItem("chocolate milk",2.0, "A6",2),
        VendingMachineItem("diet coke",2.75,"B8", 30),
        VendingMachineItem("pepsi",2.75, "J9",20),
        VendingMachineItem("5 gum",3.0,"F9", 15),
        VendingMachineItem("jerky",4.0, "A10",21))
    init{
        println("Vending Machine Items")
        println("----------------------")
        for(i in items){
            println(i.name+ " - "+i.itemLocation+" - $"+i.price)
        }
        println("----------------------")
    }

    fun takeOrder(itemLocation: String, amountRequested: Int, amountInserted: Double){
        var found = items.filter{
            it.itemLocation == itemLocation
        }
        if(!checkIfItemExist(itemLocation)){
            println("Sorry item not available")
        }
        else{
            if(found.get(0).itemCount >= amountRequested) {
                if(amountInserted >= found.get(0).price) {
                    change = (amountInserted.toDouble() - (found.get(0).price.toDouble())*amountRequested)
                    println("Your Change is $change")
                    found.get(0).itemCount--
                }
                else{
                    println("Sorry, you did not deposited enough $$")
                }
            }
            else{
                println("Sorry, we don't have $amountRequested of them")
            }
        }
    }

    fun checkIfItemExist(itemLocation: String): Boolean{
        var found = items.filter{
            it.itemLocation == itemLocation
        }
        return found.get(0).itemCount != 0
    }

}

fun main(){

}