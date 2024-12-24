package com.gogoasa

import common.di.DIContainer

object Application extends App {
  DIContainer.queryParser.parse()

}
