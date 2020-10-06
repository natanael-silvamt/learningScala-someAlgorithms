package Sort

object InsertionSort {

  def insertionSort(array: Array[Int]): Array[Int] = {
    for(i <- 0 until array.length){
      val position: Int = array(i)
      var j = i - 1

      while(j >= 0 && position < array(j)){
        array(j + 1) = array(j)
        j -= 1
      }
      array(j + 1) = position
    }
    array
  }
}
