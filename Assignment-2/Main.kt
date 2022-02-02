

import kotlin.text.toIntOrNull
import kotlin.text.toDouble
import kotlin.math.sqrt
import kotlin.math.pow

fun main() {
    var response: String = ""
    while (response != "q") { //Run once then continue until they quit
        println("Please enter a, b, and c. Press enter after each value")
        var a: Double = readLine()!!.toDouble()
        var b: Double = readLine()!!.toDouble()
        var c: Double = readLine()!!.toDouble()
        
        calculation(a, b, c)

        println("Enter q to quit and s to solve another problem.")
        response = readLine().toString()
    }
}

fun calculation(a: Double, b: Double, c: Double): Unit{
    //calculate/check num under sqrt
    var under_root: Double = (b.pow(2) - (4*a*c))
    var x1: String
    var x2: String
    if(is_imaginary(under_root)){
        //The number is imaginary so concat i
        under_root = under_root*-1
        var ans1: Double = -(b)/(2*a)
        var ans2: Double = (sqrt(under_root))/(2*a)

        x1 = "$ans1 + $ans2"+"i"
        x2 = "$ans1 - $ans2"+"i"
    }else {
        //No imaginary Numberrs
        x1= ""+ (-(b) + sqrt(b.pow(2) - (4*a*c)))/2
        x2 = ""+(-(b) - (sqrt(b.pow(2) - (4*a*c))))/2
    }
    println("x1: $x1, x2: $x2")

}
fun is_imaginary(num: Double): Boolean {
    //Takes in double, checks if it would make the number imaginary
    if(num < 0){
        return true
    }
    return false
}
