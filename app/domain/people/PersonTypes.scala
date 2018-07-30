
package domain.people
import play.api.libs.json.Json
/**
  *@created Natasha
  */


case class PersonTypes(personId: String, deptId: String, firstName:String, lastName: String, initial: String, email: String) 
{
  object PersonTypes
  {
    implicit val PersonTypesJson = Json.format[PersonTypes]
}
