package com.gogoasa
package adapter.in.cli

import application.domain.model.Table
import application.port.in.ReadQueryUseCase
import common.query.ReadQuery

case class QueryParser(readQuery: ReadQueryUseCase) {

  def parse(): Table = {
    val query = ReadQuery("name")
    readQuery.read(query)
  }

}
