import kotlin.math.sqrt
import kotlin.math.pow
class Quadratic{
    var a: Double = 0.0
    var b: Double = 0.0
    var c: Double = 0.0
    var rS1: Double = 0.0
        private set
    var iS1: String = ""
        private set
    var rS2: Double = 0.0
        private set
    var iS2: String = ""
        private set


    fun setCoefficients(_a:Double, _b:Double, _c:Double):Unit{
        //Set the values of a, b, and c
        a = _a
        b = _b
        c = _c
    }

    fun hasImagSolu(under_root:Double):Boolean{
        //return if the solution will be imaginary
        if(under_root < 0){
            return true
        }
        return false
    }
    fun printSolutions():Unit{
        var under_root: Double = (b.pow(2) - (4*a*c))
        if(hasImagSolu(under_root)){
            under_root = under_root*-1
            var ans1: Double = -(b)/(2*a)
            var ans2: Double = (sqrt(under_root))/(2*a)

            iS1 = "$ans1 + $ans2"+"i"
            iS2 = "$ans1 - $ans2"+"i"
            println("x1: $iS1 x2: $iS2")
        }
        else{
            rS1= (-(b) + sqrt(b.pow(2) - (4*a*c)))/2
            rS2 = (-(b) - (sqrt(b.pow(2) - (4*a*c))))/2
            println("x1: $rS1 x2: $rS2")
        }
    }
}
fun main(){
    val quad = Quadratic()
    var response: String = ""
    while (response != "q") { //Run once then continue until they quit
        println("Please enter a, b, and c. Press enter after each value")
        var a: Double = readLine()!!.toDouble()
        var b: Double = readLine()!!.toDouble()
        var c: Double = readLine()!!.toDouble()
        
        quad.setCoefficients(a,b,c)
        quad.printSolutions()

        println("\nEnter q to quit and s to solve another problem.")
        response = readLine().toString()
    }
}
