package at.hoeselm.exercises8.exercise1

import java.util.Date

class Console(
    val make: String,
    val model: String,
    val debutDate: Date,
    val wifiType: Option[String],
    val physicalMediaTypes: List[String],
    val maxVideoResolution: (Int, Int)) {

  override def toString = s"$model created by $make with debutDate at $debutDate has max resolution $maxVideoResolution"

}