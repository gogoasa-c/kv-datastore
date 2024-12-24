package com.gogoasa
package common.query

case class DeleteQuery(tableName: String) extends Query(QueryType.Delete, tableName)