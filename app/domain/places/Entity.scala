package domain.places

//represents University, Faculty and Department
import play.api.libs.json.Json

case class Entity(entityId:String, entityName: String, universiId:String, facultyId:String, departmentId:String)

object Entity{
  implicit val entityJson = Json.format[Entity]
}
