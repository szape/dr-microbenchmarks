package utils

/**
  * Capability of a partitioner to estimate its migration cost
  */
trait MigrationCostEstimator {

  def getMigrationCostEstimation: Option[Double]

}