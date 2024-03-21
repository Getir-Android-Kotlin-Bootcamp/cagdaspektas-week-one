
package com.example.getir_week_one_homework
//TODO sayfa 66= Patika ekibi tarafından bakılacak ana kısım burası
fun main() {
    //sayfa 9
    println("Sayfa9= 9 nolu sayfanın örneğiyim.")
    //sayfa 10
    isUnit("unit","fonksiyonum")
    //sayfa 11
    valOrVar()
    //sayfa 12
    classDeclaration()
    //sayfa 14
    stringDeclaration()
//sayfa 15
    ifDeclaration(14)
    //sayfa 16
    forDeclaration()
    //sayfa 17
    whileDeclaration()
    //sayfa 18
    whenDeclaration(10)
    //sayfa 19
    rangeDeclaration(2)
    //sayfa 20
    listDeclaration()
    //sayfa 21
    nullDeclaration("Kotlin")
    //sayfa 22
    typeCastTypeChecks(10.3)
    //Sayfa 23
    println("paket isimleri arada . ile tanımlanır {com.example.getir_week_one_homework} gibi method ve değişken tanımlamaları camelCase nerdeyse tüm örneklerde böyle kullandım")
    //Sayfa 38 ve 39
    dataClassExample()
    //Sayfa 41
    isDataClass(Student(10,"a","a"))
    //Sayfa 43
    isDataClass(mapOf("ben" to 5 ))
    //Sayfa 44
    mapDeclaration()
    //Sayfa 44
    lazyInit()
    //sayfa 46
    val result=10.basicSquare()
    println("sayfa 46= $result")
    //sayfa 47
    println("sayfa 47=maxval= ${SingletonDeclaration.maxValue} ")
    SingletonDeclaration.compareInts(3,2)
    //sayfa 48
    val eng = Engineer("çağdaş",3)
    eng.employeeDetails()
    eng.dateOfBirth("10 feb 1998")
    //sayfa50
    isNullOrNot(10)
    //sayfa 52
    getNullVariable(null)
    //sayfa 55
    returnWhen(0)
    //sayfa 56
    tryCatch("0")
    //sayfa 61
    val withData=WithOperator()
    with(withData){
        withOperatorFun()
        withOperatorFun2()
    }
    //sayfa 62
    val immutableData=ImmutableClass().apply {
        number=10
        age=20
        println("sayfa 62= sayı:$number yas:$age ")

    }
    //sayfa 64
    class Box<T>(t: T) {
        var value = t

    }
    val box: Box<Int> = Box<Int>(1)
    println("sayfa 64 = ${box.value}")
//sayfa 65
    alsoFun()
    //sayfa 67
    prefixDeclaration(3,"cagdas")
    //sayfa 68
    println("sayfa 68 =  ${10.cikar(3)}")
    //sayfa 69
    println("sayfa 69 =  ${    Vector(1, 2).plus(Vector(3, 4))}")
    //sayfa 70
    printNumbers(10, 20, 30, 40, 50)
    //sayfa 71 72 73 74
    println("sayfa 71,72,73, 74 = kullanılan tüm örneklerde benzerleri bulunmaktadır")
    //sayfa 75
    ParameterizedClass<String>("string-value").getValue()
    //sayfa 76

    println("sayfa 76 =ben generic functionım t typeda ne verirsen ona dönüşürüm ${singletonList(" Hello ")} ve ${singletonList(10)}")
//sayfa 77
    MyChildClass(null).myFunction(true)
//sayfa 78
    MyChildClass(10).myFunction(false)

    //sayfa 82
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    for (x in cars) {
        println("sayfa 82 = $x ")
    }
    //sayfa 83
    var number = 1
    while(number <= 3) {
        println("sayfa 83 = $number")
        number++;
    }
    //sayfa 84
    val num = 2
    var i = 1
    do {
        println("sayfa 84 = $num")

        i++
    }while(i <= 2)

    //sayfa 86 87
    for (i in 1..4) println("sayfa 86 ve 87 = $i")
    //sayfa 88 89
    checkIfEqual(10,20)
//sayfa 91 92
    val homeWork= HomeWork( "do data class", 91)
println("sayfa ${homeWork.page}= ${homeWork.description}")
    val copyHomeWork=homeWork.copy(page = 92, description = "copied data class")
    println("sayfa ${copyHomeWork.page}= ${copyHomeWork.description}")


}

data class HomeWork(

    var description: String,
    var page: Int
)

fun checkIfEqual( a:Int,
                  b:Int){

    return if (a==b)
     println("sayfa 88 89= it is equal")
    else println( "sayfa 88 89= it is not equal")
}
open class MyParentClass(val number: Int?) {
    val x = 5
}

// Subclass
class MyChildClass(number: Int?): MyParentClass(number) {
    fun myFunction(isX:Boolean) {
        when(isX){
        true->   println("sayfa 77 = $x ")
        false->  println("sayfa 78 ve 79 = $number ")
        }


    }
}
//generic fun
fun <T> singletonList(item: T): List<T> {
    return listOf(item)
}
//generic class
class ParameterizedClass<A>(private val value: A) {

    fun getValue() {
        println("sayfa 75 =  $value")

    }
}

fun isUnit(a: String,b:String):Unit{
    println("Sayfa10= ben $a tipli bir $b yani ne döneceğim dynamictir :D,istersem :unit yazabilirim faka yazmasamda unit olduğum anlaşılır.Çünkü generic tipim boşsa unitimdir.")
}

fun valOrVar(){
    val degismem :Int=1
    var degisirim :Int=2

    degisirim=5
    println("Sayfa11= $degisirim var olduğu için tanımlandıktan sonra değer atanır fakat $degismem atılamaz çünkü valdır.")
}

class MinusClass(a: Double,b:Double){
    val minus = a-b
}
fun classDeclaration(){
    val minus = MinusClass(10.3,3.1)
    println("Sayfa12= sonuc : ${minus.minus}")
}
fun stringDeclaration(){
    val defautlString="abc"
    val s="$defautlString 'in 2. kelimesi ${defautlString.get(2)} "
    println("Sayfa14= $s")
}

fun ifDeclaration(age:Int){
    val ageGroup = if (age < 18) "Kid" else "Adult"
    println("Sayfa15= tek satırda if else $ageGroup")
}

fun forDeclaration(){
    for (i in 10 downTo 0 step 3) {
        println("Sayfa16=  $i")
    }
}
fun whileDeclaration(){
    var i = 0
    while (i < 2) {
        println("Sayfa17 = ${i*(i-1)}")
        i++
    }
}
fun whenDeclaration(x:Int){
    when (x) {
        in 1..10 -> println("Sayfa18 =x is in the range")
        !in 1..10 -> println("Sayfa18 =x is outside the range")
        else -> println("Sayfa18 =none of the above")
    }
}
fun rangeDeclaration(x:Int){
    for (x in 1..4)if (x==2) println("Sayfa19 = x 2dir") else println("Sayfa19 = x 2 değildir. $x dir")
}
fun listDeclaration(){
    val stringList = listOf("one", "two", "one")
    println("Sayfa20 =liste elemanları: $stringList" )
}

fun nullDeclaration( b: String?){

    if (!b.isNullOrEmpty()) {
        println("Sayfa21 =String uzunluğu ${b.length}")
    } else {
        println("Sayfa21 =boş yani null string")
    }
}
fun typeCastTypeChecks( x: Any?){

    when (x) {
        is Int -> println("Sayfa22= x  intir=$x ")
        is String -> println("Sayfa22= x Stringtir=$x ")
        is Double -> println("Sayfa22= x  doubledır=$x ")
    }
}

data class Student(
    val studentId:Int,
    val name:String,
    val subject:String,
)
fun dataClassExample( ){
val student=Student(34,"çağdaş","bilgisayar")
    println("Sayfa37 ve 38 = id${student.studentId} name${student.name}, subject${student.subject}")
}

fun isDataClass(x:Any?){
    when(x){
        is Student->    println("Sayfa 41= student is student")
        is Map<*, *>->println("Sayfa 43= student is not student,it's map")
        else ->println("Sayfa 41= student is not student")

    }
}
fun mapDeclaration(){
    val numbersMap = mapOf("one" to 1, "two" to 2, "three" to 3)

    println("Sayfa 44= ${numbersMap["one"]} and key values is ${numbersMap.keys} , ${numbersMap.values}")

}
fun lazyInit(){
    val myLazyString: String by lazy { "I am a value with Lazy Initialization" }
    println("Sayfa 45= $myLazyString")
}

//extension
fun Int.basicSquare():Int{
    return  this*this
}

//infix fun
infix fun Int.cikar(no:Int):Int{
    return this-no


}

//singleton

object SingletonDeclaration {


    val maxValue: Int = 100

    fun compareInts(a: Int, b: Int) = if (a>b) println("Sayfa 47=$a $b den büyüktür") else println("Sayfa 47=$a $b den küçüktür")
}

//abstract class
abstract class Employee(val name: String,val experience: Int) {   // Non-Abstract
    // Abstract Property (Must be overridden by Subclasses)
    abstract var salary: Double

    // Abstract Methods (Must be implemented by Subclasses)
    abstract fun dateOfBirth(date:String)

    // Non-Abstract Method
    fun employeeDetails() {
        println("Sayfa 48=Name of the employee: $name")
        println("Sayfa 48=Experience in years: $experience")
        println("Sayfa 48=Annual Salary: $salary")
    }
}
// derived class
class Engineer(name: String,experience: Int) : Employee(name,experience) {
    override var salary = 50.000


    override fun dateOfBirth(date:String){
        println("Sayfa 48=Date of Birth is: $date")
    }
}

fun isNullOrNot(age: Int?){

    age?.let {
        println("sayfa 50 ve sayfa 53 =not null")
        println("sayfa 50 ve sayfa 53= null değilim yey!")
    } ?: run {
        println("sayfa 50 ve sayfa 53= null")
        println("sayfa 50 ve sayfa 53= null geldim seni bitirdim")
    }
}
fun getNullVariable(data:String?){


    val dataInit= data ?:"null geldim"
    val orDataInit= data?.let {
        data.get(1)
    } ?: "a"
    println("sayfa 52= $dataInit ve  sayfa 54=$orDataInit")
}

fun returnWhen(number: Int) {
    return when (number) {
        0 -> println("sayfa 55=sıfır")
        1 -> println("sayfa 55=bir")
        2 -> println("sayfa 55=iki")
        else -> println("sayfa 55=hiç biri değilim")
    }
}

fun tryCatch(age: String?){
    val a = try {println("sayfa 56 ve sayfa 59= ${ age?.toInt()}") } catch (e: NumberFormatException) { println("sayfa 56 ve ve sayfa 59= null") }
return a
}

class WithOperator{
    fun withOperatorFun(){
        println("sayfa 61=with operatörüyle kullanılıyorum böylelikle tek nesneyi sürekli . demiyorsun curly bracets içinde beni çağırabilirsin")
    }
    fun withOperatorFun2(){
        println("sayfa 61=with operatörüyle kullanılıyorum 2. fonksiyonum  böylelikle tek nesneyi sürekli . demiyorsun curly bracets içinde beni çağırabilirsin ")
    }
}

class ImmutableClass{
    var number=0
    var age=0


}

fun alsoFun(){
    data class Person(var name: String, var age: Int)

    fun updatePerson(person: Person) {
        person.also {
            it.name = "John Doe"
            it.age = 30
        }
    }

    val person = Person("Alice", 25)
    updatePerson(person)
    println("sayfa 65 = ${person.name}")
}
data class Vector(val x: Int, val y: Int) {

    operator fun plus(other: Vector): Vector {
        return Vector(x + other.x, y + other.y)
    }
}
fun prefixDeclaration(exampleNo:Int,name: String){
    println("sayfa 67 = $exampleNo, $name ")
}

fun printNumbers(vararg numbers: Int) {
    for (number in numbers) {
        println("sayfa 70 = $number ")
    }
}