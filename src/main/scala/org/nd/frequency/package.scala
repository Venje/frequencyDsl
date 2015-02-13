package org.nd

/**
 * Package-object с неявными классами.
 *
 * @author AlexeyVorobyev
 */
package object frequency {

  implicit final class FrequencyInt(private val n: Int) extends FrequencyConversions {

    override protected def frequencyIn(unit: FrequencyUnitScala): Frequency = Frequency(n, unit)
  }
}
