package com.gogoasa
package common.di

import adapter.in.cli.QueryParser
import application.domain.service.ExecuteQueryService

object DIContainer {
  val queryParser: QueryParser = QueryParser(ExecuteQueryService())

}
