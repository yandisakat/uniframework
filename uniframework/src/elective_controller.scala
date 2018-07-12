

class elective_controller {
  //this class contains functions to control an elective
  
  import scala.collection.mutable.ListBuffer

  def elective_name(subject:Elective):String= subject.name
    
  
  def electiveChoice(student:Student):String=student.electiveChoice
    
  //create list based on elective choices
 
  //Functional Programming
  def FPclassList(classList:List[Student]):List[Student]={
   
    var list=new ListBuffer[Student]()
    for (student <-classList if student.electiveChoice.contains("Functional programming")
       list+=student 
    )
 val finalList:List[Student]=list.toList
 finalList
  }
  
  //Cyber Security
  def CSclassList(classList:List[Student]):List[Student]={
   
    var list=new ListBuffer[Student]()
    for (student <-classList if student.electiveChoice.contains("Cyber Security")
       list+=student 
    )
 val finalList :List[Student]=list.toList
 finalList
  } 
  
  //Big data analytics
  def BDAclassList(classList:List[Student]):List[Student]={
   
    var list=new ListBuffer[Student]()
    for (student <-classList if student.electiveChoice.contains("Big Data Anaytics")
       list+=student 
    )
 val finalList:List[Student]=list.toList
 finalList
  } 
 
  //get number of student doing an elective using a classList
  def numOfStdsInFP(students:List[Student]):Int={
    var total=0
    for (student <- students   if student.electiveChoice.contains("Functional programming")
     count++ 
   )   
      count
     
  }
  
  def numOfStdsInCS(students:List[Student]):Int={
    var count=0
    for (student <- students   if student.electiveChoice.contains("Cyber Security")
     count++    
    ) 
     count
  }
  
  def numOfStdsInElectiveBDA(students:List[Student]):Int={
    var count=0
    for (student <- students   if student.electiveChoice.contains("Big Data Anaytics")
     count++   
    ) 
     count
  }
  
  
}//end class