package conf.connections

import java.net.InetAddress

import com.datastax.driver.core.SocketOptions
import com.outworkers.phantom.dsl._
import com.typesafe.config.ConfigFactory

import scala.collection.JavaConverters._


object Config {
  val config = ConfigFactory.load()

  def PORT = 9042

  def connectionTimeoutMillis = 700000

  // Default is 5000
  def readTimeoutMillis = 1500000

  // Default is 12000
  val hosts: Seq[String] = config.getStringList("cassandra.host").asScala.toList
  val dataCenter = config.getString("cassandra.dataCenter")
  val inets = hosts.map(InetAddress.getByName)
  val keySpace: String = config.getString("cassandra.keySpace")
  val clusterName: String = config.getString("cassandra.clusterName")
}

//object DefaultsConnector {
//  val connector = ContactPoint.local.noHeartbeat().keySpace(Config.keySpace)
//}

object DataConnection {

  lazy val connector: CassandraConnection = ContactPoints(Config.hosts, Config.PORT)
    .withClusterBuilder(
      _.withCredentials(
        Config.config.getString("cassandra.username"),
        Config.config.getString("cassandra.password"))
        .withClusterName(Config.clusterName)
        .withSocketOptions(new SocketOptions()
          .setReadTimeoutMillis(Config.readTimeoutMillis)
          .setConnectTimeoutMillis(Config.connectionTimeoutMillis))
      //              .withLoadBalancingPolicy(new TokenAwarePolicy(
      //                new DCAwareRoundRobinPolicy.Builder()
      //                  .withUsedHostsPerRemoteDc(2)
      //                  .withLocalDc(Config.dataCenter).build()
      //              ))
    ).noHeartbeat().keySpace(Config.keySpace)

  val local: CassandraConnection = ContactPoint.local
    .withClusterBuilder(_.withSocketOptions(
      new SocketOptions()
        .setConnectTimeoutMillis(20000)
        .setReadTimeoutMillis(20000)
    )
    ).noHeartbeat().keySpace(
    KeySpace(Config.keySpace).ifNotExists().`with`(
      replication eqs SimpleStrategy.replication_factor(1)
    )
  )
}

