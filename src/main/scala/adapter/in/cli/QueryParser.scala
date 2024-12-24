package com.gogoasa
package adapter.in.cli

import application.port.in.{ReadQueryUseCase, WriteQueryUseCase}
import common.query.ReadQuery

case class QueryParser(readQueryUseCase: ReadQueryUseCase, writeQueryUseCase: WriteQueryUseCase) {
  def parse() =
    readQueryUseCase.read(ReadQuery("users"))

}
