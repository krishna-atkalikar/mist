

/*
import akka.pattern.{ask, AskTimeoutException}
import scala.concurrent.ExecutionContext.Implicits.global

@Ignore class workerManagerTest(_system: ActorSystem) extends TestKit(_system) with ImplicitSender with WordSpecLike with Matchers
  with BeforeAndAfterAll with ScalaFutures with JsonFormatSupport with DefaultJsonProtocol with Eventually{

  def this() = this(ActorSystem("mist", MistConfig.Akka.Main.settings))

  val workerManager = system.actorOf(Props[WorkerManager], name = "TestWorkerManager")

  override def afterAll() = {
    TestKit.shutdownActorSystem(system)
  }
  "WorkerManager Tests" must {
    "Worker must started" in {

        //workerManager ! CreateContext("test context")

        //val json = TestConfig.request_jar.parseJson
        //val jobConfiguration = json.convertTo[JobConfiguration]

        //val future = workerManager.ask(jobConfiguration)(timeout = 10.minutes)
        /*var result_state = false
        future
          .onSuccess {
            case result: Either[Map[String, Any], String] =>
              val jobResult: JobResult = result match {
                case Left(jobResult: Map[String, Any]) =>
                  result_state = true
                  JobResult(success = true, payload = jobResult, request = jobConfiguration, errors = List.empty)
                case Right(error: String) =>
                  JobResult(success = false, payload = Map.empty[String, Any], request = jobConfiguration, errors = List(error))
              }

              val jsonString = Json(DefaultFormats).write(jobResult)
          }
        Await.result(future, 10.seconds)
        eventually(timeout(10 seconds), interval(1 second)) {
          assert(result_state)
        }*/
      Thread.sleep(5000)
      }

    "Worker must removed" in {
      workerManager ! RemoveContext("test context")
      Thread.sleep(5000)
    }
  }
  override implicit def patienceConfig: PatienceConfig = PatienceConfig(Span(60, Seconds), Span(1, Second))
}
*/