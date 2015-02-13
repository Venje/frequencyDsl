package org.nd.frequency

/**
 * Пример работы DSL
 *
 * @author AlexeyVorobyev
 */
object MainApp {

  def main(args: Array[String]): Unit = {
    println(1 Hz)
    println(1 kHz)
    println(1 MHz)
    println(1 GHz)

    // Скобки необходимы
    val sum = (3000 kHz) + (2 MHz)

    println("3000 kHz + 2 MHz equals " + sum.toKHz)
  }
}
