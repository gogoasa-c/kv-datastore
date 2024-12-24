package com.gogoasa
package application.port.in

import application.domain.model.Table
import common.query.ReadQuery

trait ReadQueryUseCase {
  def read(query: ReadQuery): Table
}
