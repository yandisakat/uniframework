
package domain.people
import play.api.libs.json.Json
/**
  *@created Natasha
  *@personId
  *@departmentId
  *@firstName
  *@lastName
  *@initials 
  *@email
*/


case class PersonTypes(personId: String, deptId: String, firstName:String, lastName: String, initials: String, email: String) 
{
  object PersonTypes
  {
    implicit val PersonTypesJson = Json.format[PersonTypes]
  }
}
