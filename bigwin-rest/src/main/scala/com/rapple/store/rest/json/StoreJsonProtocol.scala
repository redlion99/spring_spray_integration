package com.rapple.store.rest.json

import spray.json._
import DefaultJsonProtocol._
/**
 * Created by libin on 14-11-8.
 */
object StoreJsonProtocol {
  implicit val userFormat = jsonFormat2(User)
}
