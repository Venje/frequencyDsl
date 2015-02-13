package org.nd.frequency

import org.nd.frequency

/**
 * Содержит те самые методы, которые пишутся после цифр.
 *
 * @author AlexeyVorobyev
 */
trait FrequencyConversions {

  protected def frequencyIn(unit: FrequencyUnitScala): Frequency

  def Hz = frequencyIn(frequency.Hz)

  def kHz = frequencyIn(frequency.kHz)

  def MHz = frequencyIn(frequency.MHz)

  def GHz = frequencyIn(frequency.GHz)
}
