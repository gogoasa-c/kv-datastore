package com.gogoasa
package application.domain.service

import application.domain.model.Table
import application.port.in.ReadQueryUseCase
import application.port.out.Repository
import common.query.ReadQuery

case class ReadQueryService(repository: Repository) extends ReadQueryUseCase {
  override def read(query: ReadQuery): Table = {
    repository.read(query.tableName)
  }

}
