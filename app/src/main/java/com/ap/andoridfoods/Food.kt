package com.ap.andoridfoods

class Food constructor(name: String, numberLikes: Int)  {
    var name: String = name
    var numberLikes: Int = numberLikes

    fun contador(): Int {
        var number = this.numberLikes + 1
        return number
    }
}

fun main() {
    val food = Food("Pollo", 10)
    val food1 = Food("Pollo", 30)
    val food2 = Food("Pollo", 25)
    val food3 = Food("Pollo", 25)

    val foodsLikes = arrayOf(food.numberLikes, food1.numberLikes, food2.numberLikes, food3.numberLikes)

    foodsLikes.forEach { print("$it ") }

    for (item in 0 until (foodsLikes.size - 1 )) {
        for (j in 0 until (foodsLikes.size - item - 1)) {
            if (foodsLikes[j] < foodsLikes[j + 1]) {
                val tmp = foodsLikes[j+1]
                foodsLikes[j+1] = foodsLikes[j]
                foodsLikes[j] = tmp
            }
        }
    }

    println()
    foodsLikes.forEach { print("$it ") }

    println()
    print(food1.contador())
    println()

    foodsLikes.forEach { print("$it ") }
}