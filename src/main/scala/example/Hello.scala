package example

import cats.Eval
import github4s.Github
import github4s.jvm.Implicits._
import cats.Eval
import github4s.Github._
import github4s.GithubResponses.GHResult

import scalaj.http.HttpResponse
import scalaj.http.HttpResponse

object Hello extends App {

  val user1 = Github().users.get("freewind")
  user1.exec[Eval, HttpResponse[String]]().value match {
    case Right(GHResult(result, status, headers)) =>
      println(result)
    case Left(e) => e.getMessage
  }

  val getRepo = Github().repos.listOrgRepos("scala-demos")

  getRepo.exec[cats.Id, HttpResponse[String]]() match {
    case Left(e) => println(s"Something went wrong: ${e.getMessage}")
    case Right(r) => println(r.result)
  }

}
