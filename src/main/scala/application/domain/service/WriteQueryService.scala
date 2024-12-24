package com.gogoasa
package application.domain.service

import application.port.in.WriteQueryUseCase

import com.gogoasa.common.query.WriteQuery

case class WriteQueryService() extends WriteQueryUseCase {

  override def write(query: WriteQuery): Boolean = ???
}
