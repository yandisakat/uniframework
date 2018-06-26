
import java.io._
import scala.collection
object test  {

    def main(args: Array[String])
    {
      
      val campus1=new Campus("Cape Town campus","dgjdhfdhfjk")
      val campus2=new Campus("Bellvile campus","jhsjfsjfhs")
      val campus3=new Campus("Granger Bay","fhshfsgfs")
      var campuses:List[Campus]=List(campus1,campus2,campus3)
        val university = new University("CPUT",campuses,1974)
      
      println(university.name)
      println(university.campuses)
      println(university.year_founded)
    }
  
}
