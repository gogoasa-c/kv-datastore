package com.gogoasa
package application.port.out

import application.domain.model.Table

trait Repository {
  def writeToFile(table: Table): Boolean
  def readFromFile(tableName: String): Table
}
