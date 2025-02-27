package scala.cli.commands.pgp

import scala.cli.commands.ScalaCommand

class PgpCommands {
  def allScalaCommands: Array[ScalaCommand[_]] =
    Array(PgpCreate, PgpSign, PgpVerify)
  def allExternalCommands: Array[ExternalCommand] =
    Array.empty
}
