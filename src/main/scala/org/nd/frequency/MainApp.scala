package org.nd.frequency

/**
 * Пример работы DSL
 *
 * @author AlexeyVorobyev
 */
object MainApp {

  def main(args: Array[String]): Unit = {

    // Постфиксная нотация. Не рекомендуется.
    println(1 Hz)
    println(1 kHz)
    println(1 MHz)
    println(1 GHz)

    val sum = (3000 kHz) + (2 MHz)

    // Безопасная нотация.
    val sum2 = 2000.kHz + 200.kHz

    println("3000 kHz + 2 MHz equals " + sum.toKHz)
    println("2000 kHz + 200 kHz equals " + sum2.toKHz)
  }
}
