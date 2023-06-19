fun main() {
    val banker=Banker("Samuel",43)
    banker.eat()
    banker.sleep()
    println(banker.countmoney(arrayOf(6,10,20,19)))

    val doctor=Doctor("Bridget",37)
//    doctor.eat()
    doctor.introduction("Nelson")
    doctor.talk("hello there")
    doctor.countmoney(arrayOf(6,10,20,19))
    doctor.treatpatient("Rebecca","Malaria")

    val Farmer=farmer("Grace",34)
    Farmer.eat()
    Farmer.talk("I am digging")
    Farmer.caltivateland()
}
open class Person(name:String, age:Int){
    fun talk(words:String){
        println(words)
    }

  open fun eat(){
        println("yum")
    }

  open  fun sleep(){
        println("zzzz")
    }

   open fun introduction(name: String){
        println("Hi my name is doctor $name")
    }
}

 open class Banker( name:String,  age:Int):Person(name,age){


    fun countmoney(notes:Array<Int>):Int{
        return notes.sum()
    }
}

class Doctor( name:String, age:Int) :Banker(name,age){
    fun treatpatient(patient: String, disease: String) {
        println("treating $patient for $disease")

    }

    override fun introduction(name: String) {
//        super.introduction(name)
        println("Hi my name is Doctor $name")
    }
}
class farmer(name:String,age:Int):Person(name,age){
    fun caltivateland(){
        println("dig dig dig dig")
    }

    override fun eat() {
//        super.eat()
        println("farmer eating")
    }


    }