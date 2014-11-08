spring_spray_integration
========================

A restful server run on spray, which use spring data to fetch data from mongodb.


prerequires:

  1.mongo
  2.spring-data
  3.akka
  4.spray
  
  spray route:
  
      get {
          complete {
            val repo=Bean[UserRepository]
            repo.findAll().asScala.map{
              u =>
                User(u.getUsername,u.getPassword)
            }.toJson.prettyPrint
          }

      }
      
  lookup bean from spring with akka:
  
  
  class BeanLookupActor(applicationContext: ApplicationContext)
    extends Actor {
  
    def receive = {
      case LookupBean(beanType) =>
        sender ! applicationContext.getBean(beanType)
    }
  }
  
  
