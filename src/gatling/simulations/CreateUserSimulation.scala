import io.gatling.core.Predef._
import io.gatling.http.Predef._

class CreateUserSimulation extends Simulation {

  // 1 - Informações de acesso à Aplicação
  val httpConf = http
    .baseUrl("https://reqres.in")
    .header("Content-Type", "application/json")

  // 2 - Definição do cenário da chamada à aplicação
  val scn = scenario("Create Users")
    // Definição da requisição. Nome que será exibido no relatório html
    .exec(http("Create User")
      .post("/api/users")
      .body(StringBody(
        """{
           "name": "Rodrigo Magalhães",
           "job": "QA"
        }""")).asJson
      .check(status.is(201))
      .check(jsonPath("$.job").is("QA")))

  // 3 - Configuração do cenário
  setUp(
    scn.inject(rampUsers(10) during (10))
  ).protocols(httpConf)

}