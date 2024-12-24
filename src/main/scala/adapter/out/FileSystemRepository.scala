package com.gogoasa
package adapter.out

import application.domain.model.{Row, Table}
import application.port.out.Repository

case class FileSystemRepository() extends Repository {
  private val users: Map[String, String] = Map("user" -> "password")

  override def write(table: Table): Boolean =
    true


  override def read(tableName: String): Table = Table("users", List(Row("user", users("user"))))
}
