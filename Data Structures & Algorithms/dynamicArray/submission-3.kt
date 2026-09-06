class DynamicArray(capacity: Int) {

    private val fullcapacity = capacity
    private var array =     IntArray(fullcapacity)
    private var size = 0
    
    fun get(i: Int): Int {
        return array[i]
    }


    fun set(i: Int, n: Int) {
        array[i] = n
    }

    fun pushback(n: Int) {
        if(array.size == size){
            resize()
        }
        array[size] = n
        size++
    }

    fun popback(): Int {
        size--
        return array[size]
    }

    private fun resize() {
        array = array.copyOf(array.size * 2)
    }

    fun getSize(): Int {
        return size
    }

    fun getCapacity(): Int {
        return array.size
    }
}