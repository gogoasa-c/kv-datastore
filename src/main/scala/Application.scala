package com.gogoasa

import common.di.DIContainer

object Application extends App {
  println(DIContainer.queryParser.parse())

}
