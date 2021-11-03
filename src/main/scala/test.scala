import org.apache.spark.{SparkContext, SparkConf}

object test {

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("Ex1_SimpleRDD").setMaster("local[4]")
    val sc = new SparkContext(conf)
    println("3")
  }

}
