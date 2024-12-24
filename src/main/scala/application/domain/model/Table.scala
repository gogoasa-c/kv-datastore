package com.gogoasa
package application.domain.model

case class Table(tableName: String, rowList: List[Row] = List()) {

  def add(row: Row): Table = {
    copy(rowList = rowList :+ row)
  }

  def print(): Unit = rowList.foreach(row => println(s"${row.key}: ${row.value}"))

  

}
