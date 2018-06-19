import java.io._

/* Reece Waldeck
 * 214218244
 */

object Demo 
{
    def main(args: Array[String])
    {
      val lect1 = new Lecturer("Reece","Waldeck","555-1234-567");
      
      println(lect1.getName());
      println(lect1.getSurname());
      println(lect1.getPhoneNo());
    }
  } 