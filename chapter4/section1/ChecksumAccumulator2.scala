package chapter4.section1

class ChecksumAccumulator2 {
  private var sum = 0
  def add(b: Byte): Unit = sum += b
  def checksum(): Int = ~(sum & 0xFF) + 1
}