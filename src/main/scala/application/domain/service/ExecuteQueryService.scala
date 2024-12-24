package com.gogoasa
package application.domain.service

import application.domain.model.Table
import application.port.in.ReadQueryUseCase
import common.query.ReadQuery

case class ExecuteQueryService() extends ReadQueryUseCase {
  override def read(query: ReadQuery): Table = {
    println(query)
    Table(query.tableName)
  }

}
