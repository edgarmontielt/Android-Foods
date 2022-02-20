package com.ap.andoridfoods

class Food (var name: String, var numberLikes: Int) {

}


/* fun main() {

    val food = Food("Edgar", 30)

    println(food.numberLikes)

    val foodsLikes = arrayOf(food.numberLikes)

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
}




/* @JvmName("getName1")
fun getName(): String{
    return name;
}

@JvmName("setName1")
fun setName(name: String){
    this.name = name
}

@JvmName("getName")
fun getName(numberLikes: Int){
    this.numberLikes = numberLikes
}

@JvmName("setNumberOfLikes")
fun setNumberOfLikes(numberLikes: Int) {
    this.numberLikes = numberLikes
} */