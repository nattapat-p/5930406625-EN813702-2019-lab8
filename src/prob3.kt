fun main(){
    print("The result of canAddFish(10.0, listOf(3,3,3)) is " + canAddFish(10.0, listOf(3,3,3)))
    print("\nThe result of canAddFish(8.0, listOf(2,2,2),hasDecoration = false) is " + canAddFish(8.0, listOf(2,2,2),hasDecoration = false))
    print("\nThe result of canAddFish(9.0, listOf(1,1,3),3) is " + canAddFish(9.0, listOf(1,1,3),3))
    print("\nThe result of canAddFish(9.0, listOf(),7,true) is " + canAddFish(9.0, listOf(),7,true))
}

fun canAddFish(tankSize : Double, currentFish: List<Int>,
               fishSize:Int = 2,hasDecoration:Boolean = true): Boolean {
    return if (!hasDecoration){
        tankSize / currentFish.sum() + fishSize >= 1.0
    } else (tankSize*80/100) / (currentFish.sum() + fishSize) >= 1.0

}

