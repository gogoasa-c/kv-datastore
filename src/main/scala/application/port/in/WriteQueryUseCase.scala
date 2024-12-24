package com.gogoasa
package application.port.in

import common.query.WriteQuery

trait WriteQueryUseCase {
  def write(query: WriteQuery): Boolean
}
