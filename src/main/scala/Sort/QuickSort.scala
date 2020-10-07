package Sort

object QuickSort {

  def quickSort(array: Array[Int]): Array[Int] = {

    def quickSortImpl(array: Array[Int], first: Int, last: Int): Array[Int] = {
      var pivolt: Int = 0
      var i: Int = 0
      var j: Int = 0
      var temp: Int = 0

      if(first < last){
        pivolt = first
        i = first
        j = last

        while(i < j){
          while(array(i) <= array(pivolt) && i < last){
            i += 1
          }

          while(array(j) > array(pivolt)){
            j -= 1
          }

          if(i < j){
            temp = array(i)
            array(i) = array(j)
            array(j) = temp
          }
        }
        temp = array(pivolt)
        array(pivolt) = array(j)
        array(j) = temp

        quickSortImpl(array, first, j - 1)
        quickSortImpl(array, j + 1, last)
      }
      array
    }
    quickSortImpl(array, 0, array.length - 1)
  }
}
