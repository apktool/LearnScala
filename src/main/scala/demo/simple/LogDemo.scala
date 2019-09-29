package demo.simple

import org.apache.logging.log4j.Level
import org.apache.logging.log4j.scala.Logging
import org.slf4j.{Logger, LoggerFactory}

object LogDemo {
  val Log: Logger = LoggerFactory.getLogger(LogDemo.getClass)

  def main(args: Array[String]): Unit = {
    Log.info("break1")

    Log.info("break2")
    new MyClass().doStuff()

    Log.info("break3")
    new MyClass().doStuffWithLevel(Level.DEBUG)
  }
}

class MyClass extends Logging {
  def doStuff(): Unit = {
    logger.info("Doing stuff")
  }

  def doStuffWithLevel(level: Level): Unit = {
    logger(level, "Doing stuff with arbitrary level")
  }
}
