/**
* Created by 216074630 on 7/30/2018.
**/

package repositories.staff

import com.outworkers.phantom.dsl._
import conf.connections.DataConnection
import repositories.places.tables.StaffTableImpl

class staffDatabase(override val connector: KeySpaceDef) extends Database[staffDatabase](connector)
{
  object staffDatabase extends staffDatabase(DataConnection.connector)
  
  trait StaffRepository
  {
    def database = staffDatabase
  }
