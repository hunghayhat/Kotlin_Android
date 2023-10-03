fun swim (speed: String = "fast"){
    println("swimming $speed")
}
fun main() {
    swim()
    swim("slow")
    swim(speed = "turtle-like")
}