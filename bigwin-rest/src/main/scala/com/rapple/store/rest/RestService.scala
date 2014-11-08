package com.rapple.store.rest

import com.rapple.store.mongodb.core.CustomerRepository
import com.rapple.store.mongodb.core.user.UserRepository
import com.rapple.store.mongodb.product.ProductRepository
import com.rapple.store.rest.json.User
import com.rapple.store.spring.Bean
import spray.routing.HttpService
import akka.actor.Actor
import spray.routing._
import spray.http._
import akka.actor.ActorContext
import spray.json._
import DefaultJsonProtocol._
import scala.collection.JavaConverters._
import com.rapple.store.rest.json.StoreJsonProtocol._

/**
 * Created by libin on 14-11-7.
 */
class RestServiceActor extends Actor with RestService{

  def actorRefFactory = context

  def receive = runRoute(myRoute)

}

trait RestService extends HttpService{


  def myRoute(implicit context: ActorContext) =
    path("") {
      get {
          complete {
            val repo=Bean[UserRepository]
            repo.findAll().asScala.map{
              u =>
                User(u.getUsername,u.getPassword)
            }.toJson.prettyPrint
          }

      }
    }
}