package example.myapp

class Aquarium (var length: Int = 100, var width: Int = 20, var height: Int = 40) {
//mendefinisikan properti secara langsung dengan konstruktor

    init {
        println("aquarium initializing")
    }
    init {
        println("Volume: ${width * length * height / 1000} liters")
    }
    //constructor sekunder
    constructor(numberOfFish: Int) : this() {
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }
    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
    }
}
