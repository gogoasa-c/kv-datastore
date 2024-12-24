package com.gogoasa
package common.query

case class WriteQuery(tableName: String) extends Query(QueryType.Write, tableName)