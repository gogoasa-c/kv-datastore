package com.gogoasa
package common.di

import adapter.in.cli.QueryParser
import adapter.out.FileSystemRepository
import application.domain.service.{ReadQueryService, WriteQueryService}
import application.port.in.{ReadQueryUseCase, WriteQueryUseCase}
import application.port.out.Repository

object DIContainer {
  private val repository: Repository = FileSystemRepository()

  private val readQuery: ReadQueryUseCase = ReadQueryService(repository)
  private val writeQuery: WriteQueryUseCase = WriteQueryService()

  val queryParser: QueryParser = QueryParser(readQuery, writeQuery)



}
