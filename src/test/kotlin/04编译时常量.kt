

const val PI =45  // 定义编译时常量
// 编译时常量只能是常用的基本数据类型: (String, Double, Int, Float, Long，Short, Byte，Char, Boolean)
//编泽时常量只能在函数之外定义，为什么?
//答: 如果在函数之内定义，就必须是在运行时才能调运赋值，何来编泽时常量一说
// 结论:编译时常量只能在函数之外定义，就可以在编译期间赋值初始了

fun main(){
    val a = "这个是只读类型的变量"  //这就相当于 局部常量

    // 提示：修饰符 const 不适用于 局部变量
//    const val PI =45
}