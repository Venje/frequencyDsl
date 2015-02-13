package org.nd.frequency

/**
 * Единицы измерения и правила их конвертации.
 * Для частоты выглядит как всё просто, но бывает и сложенее.
 * @see java.util.concurrent.TimeUnit
 *
 * @author AlexeyVorobyev
 */
sealed trait FrequencyUnitScala {

  def toHz(n: BigInt): BigInt

  def toKHz(n: BigInt): BigInt

  def toMHz(n: BigInt): BigInt

  def toGHz(n: BigInt): BigInt

  def convert(n: BigInt, unit: FrequencyUnitScala): BigInt
}

object Hz extends FrequencyUnitScala {

  override def toHz(n: BigInt): BigInt = n

  override def toGHz(n: BigInt): BigInt = toMHz(n) / 1000

  override def toKHz(n: BigInt): BigInt = n / 1000

  override def toMHz(n: BigInt): BigInt = toKHz(n) / 1000

  override def convert(n: BigInt, unit: FrequencyUnitScala): BigInt = unit.toHz(n)
}

object kHz extends FrequencyUnitScala {

  override def toHz(n: BigInt): BigInt = n * 1000

  override def toGHz(n: BigInt): BigInt = toMHz(n) / 1000

  override def toKHz(n: BigInt): BigInt = n

  override def toMHz(n: BigInt): BigInt = n / 1000

  override def convert(n: BigInt, unit: FrequencyUnitScala): BigInt = unit.toKHz(n)
}

object MHz extends FrequencyUnitScala {

  override def toHz(n: BigInt): BigInt = toKHz(n) * 1000

  override def toGHz(n: BigInt): BigInt = n / 1000

  override def toKHz(n: BigInt): BigInt = n * 1000

  override def toMHz(n: BigInt): BigInt = n

  override def convert(n: BigInt, unit: FrequencyUnitScala): BigInt = unit.toMHz(n)
}

object GHz extends FrequencyUnitScala {

  override def toHz(n: BigInt): BigInt = toKHz(n) * 1000

  override def toGHz(n: BigInt): BigInt = n

  override def toKHz(n: BigInt): BigInt = toMHz(n) * 1000

  override def toMHz(n: BigInt): BigInt = n * 1000

  override def convert(n: BigInt, unit: FrequencyUnitScala): BigInt = unit.toGHz(n)
}