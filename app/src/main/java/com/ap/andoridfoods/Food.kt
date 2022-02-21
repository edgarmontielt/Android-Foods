package com.ap.andoridfoods

class Food (var name: String, var numberLikes: Int) {

}

fun bubbleSort(list:ArrayList<Food>){

    for (i in 0 until (list.size - 1 )) {
        for (j in 0 until (list.size - i - 1)) {
            if (list[j].numberLikes < list[j + 1].numberLikes) {
                val tmp = list[j+1]
                list[j+1] = list[j]
                list[j] = tmp
            }
        }
    }
}


 /* fun main() {

    val food = Food("Edgar", 1)
    val food1 = Food("Juan", 30)
    val food2 = Food("Marco", 24)

    println(food.numberLikes)

    val foodsLikes = arrayOf(food, food1, food2)

    foodsLikes.forEach { print("$it ") }

     for (item in 0 until (foodsLikes.size - 1 )) {
         for (j in 0 until (foodsLikes.size - item - 1)) {
             if (foodsLikes[j].numberLikes < foodsLikes[j + 1].numberLikes) {

                 val tmp = foodsLikes[j+1]
                 foodsLikes[j+1] = foodsLikes[j]
                 foodsLikes[j] = tmp

                 /*val tmp = foodsLikes[j + 1].numberLikes
                 foodsLikes[j + 1].numberLikes = foodsLikes[j].numberLikes
                 foodsLikes[j].numberLikes = tmp*/
             }
         }
     }

     println()

     foodsLikes.forEach { print("$it ") }

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