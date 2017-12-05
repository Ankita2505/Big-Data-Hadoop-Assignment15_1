package assignment15_1

/*
 * Showing Simple inheritance in Scala
 */


//Employee Class (Parent Class)

class Employee(emp_id:Int) 
{
  val id :Int =emp_id
  def work() = println("Working")
}

//Part Time Employee Inheriting Employee Class (Child Class)

class Part_Time_Employee(emp_id:Int) extends Employee(emp_id)
{
  override val id :Int = emp_id
  override def work() = println("Working Part Time Only")
}

//Full Time Employee Inheriting Employee Class (Child Class)

class Full_Time_Employee(emp_id:Int) extends Employee(emp_id)
{
  override val id:Int =emp_id
  override def work() = println("Working Full Time")
}


object Simple_Inheritance
{
  def main(args: Array[String]): Unit = {

    
    val part__time_emp =  new Part_Time_Employee(10)
    val full__time_emp = new Full_Time_Employee(11)
    
    println("*****************************************\n")
    println("\nShowing Simple Inherritance in Scala \n")
    println("*****************************************\n")
    println()
    
    println("Employee Id of Part-time Employee is : " + part__time_emp.id)
    part__time_emp.work()
    
    println()
    println("---------------------------------------------------------------")
    println("Employee Id of Full-time Employee is is: " + full__time_emp.id)
    full__time_emp.work()
    
  }
}