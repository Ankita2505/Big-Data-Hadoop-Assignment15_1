package assignment15_1
/*
 * Showing Multiple Inhertiance in Scala using Trait keyword
 */

trait Printable{  
    def print()  
}  
  
trait Showable{  
   def show()  
}  
  
class A6 extends Printable with Showable{  
    def print(){  
        println("This is printable")  
    }  
    def show(){  
        println("This is showable");  
    }  
}  
object Multiple_Inheritance 
{
  def main(args:Array[String])
  {  
        var a = new A6()  
        println("----------------Showing Multiple Inheritance-------------------")
        println()
        println("--------------------------------------------------------------")
        println()
        a.print()  
        a.show()  
    }  
}