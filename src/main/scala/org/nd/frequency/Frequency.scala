package org.nd.frequency

import org.nd.frequency

/**
 * Класс для представления частоты.
 *
 * @author AlexeyVorobyev
 */
final class Frequency(val hz: BigInt) {

  require(hz >= 0, "Frequency must be greater or equal to zero!")

  def toKHz = frequency.Hz.toKHz(hz) + " kHz"

  def toMHz = frequency.Hz.toMHz(hz) + " MHz"

  def toGHz = frequency.Hz.toGHz(hz) + " GHz"

  def +(other: Frequency) = new Frequency(hz + other.hz)

  override def toString: String = hz.toString + " Hz"
}

object Frequency {

  def apply(value: BigInt, unit: FrequencyUnitScala): Frequency = unit match {
    case frequency.Hz => new Frequency(value)
    case u => new Frequency(u.toHz(value))
  }
}
