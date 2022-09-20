fun main(args: Array<String>) {
    println("Hello World!")

    println("Введи данные")
    var a :Float = readLine()!!.toFloat()
    var b :Float = readLine()!!.toFloat()
    println("Результат сложения:")
    println(a+b)
    println("Результат вычитания:")
    println(a-b)
    println("Результат умножения:")
    println(a*b)
    println("Результат деления:")
    println(a/b)
}