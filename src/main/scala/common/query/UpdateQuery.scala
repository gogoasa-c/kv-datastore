package com.gogoasa
package common.query

import application.domain.model.Row

case class UpdateQuery(tableName: String, row: Row) extends Query(QueryType.Update, tableName)
