package domain.places
import play.api.libs.json.Json

/**
  * created by Natasha
  * @param entityId
  * @param entityName
  * @param uniId
  * @param facultyId
  * @param departmentId
  *
  * represents University, Faculty and Department
  */ 

case class Entity(entityId: String, entityName: String, uniId: String, facultyId: String, departmentId: String)

object Entity
{
  implicit val entityJson = Json.format[Entity]
  def definity: Entity = Entity ("","","","","")
}
