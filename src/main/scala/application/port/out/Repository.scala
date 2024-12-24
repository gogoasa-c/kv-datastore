package com.gogoasa
package application.port.out

import application.domain.model.Table

trait Repository {
  def write(table: Table): Boolean
  def read(tableName: String): Table
}
