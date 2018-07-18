package repositories.places

import com.outworkers.phantom.dsl._
import conf.connections.DataConnection
import repositories.places.tables.VenueTableImpl

class VenueDatabase(override val connector: KeySpaceDef) extends Database[VenueDatabase](connector)
{
  object VenueDatabase extends VenueDatabase(DataConnection.connector)
  
  trait VenueRepository
  {
    def database = VenueDatabase
  }
