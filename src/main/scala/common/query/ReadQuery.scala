package com.gogoasa
package common.query

case class ReadQuery(tableName: String) extends Query(QueryType.Read, tableName)
