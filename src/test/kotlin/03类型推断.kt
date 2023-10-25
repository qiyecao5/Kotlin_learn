
// 类型推断
fun main(){
    // 提示Explicity given type is redundant here
    //      给定类型的显式在这里是多余的
    val info : String = "看到=号左边的String是灰色的，它想告诉你它可以省略"
    println(info)

    val age = 98
    println(age)
    val info2 = "直接写，不用写类型，自动识别你输入的类型"
    println(info2)
}