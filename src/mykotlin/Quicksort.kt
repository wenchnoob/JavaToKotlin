package mykotlin


fun main() {
    val arr = mutableListOf(12, 17, 34, 53, 56, 32, 12, 32, 43, 23)
    quicksort(arr, 0, arr.size)
    System.out.println(arr)
}

fun quicksort(arr: MutableList<Int>, start: Int, end: Int) {
    if (end - start > 1) {
        val mid = partition(arr, start, end)
        quicksort(arr, start, mid)
        quicksort(arr, mid+1, end)
    }
}

fun partition(arr: MutableList<Int>, start: Int, end: Int): Int {
    var beforePivot = start - 1
    val pivot = arr[end-1]

    for(i in start until end) {
        if(arr[i] < pivot) swap(arr, i, ++beforePivot)
    }
    swap(arr, end-1, ++beforePivot)
    return beforePivot
}

private fun swap(arr: MutableList<Int>, i: Int, j: Int) {
    val temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp
}
