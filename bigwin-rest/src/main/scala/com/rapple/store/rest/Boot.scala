package com.rapple.store.rest

import akka.actor.{Props, ActorSystem}
import akka.io.IO
import akka.util.Timeout
import com.rapple.store.spring.{Start,Stop, SpringActor}
import scala.concurrent.duration._
import spray.can.Http
import akka.pattern.ask
import spray.http.MediaTypes._

/**
 * Created by libin on 14-11-7.
 */
object Boot extends App{
  // we need an ActorSystem to host our application in
  implicit val system = ActorSystem("store-rest")

  // create and start our service actor
  val service = system.actorOf(Props[RestServiceActor], "rest-service")

  val springActor = system.actorOf(
    props = Props[SpringActor],
    name = "spring"
  )

  println(springActor)

  springActor ! Start()

  implicit val timeout = Timeout(5.seconds)
  // start a new HTTP server on port 8080 with our service actor as the handler
  IO(Http) ? Http.Bind(service, interface = "localhost", port = 8080)


}
