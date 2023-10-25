import com.sun.org.apache.xpath.internal.operations.Bool

//引用类型学习
//Java语言有两种数据类型：
//      第一种：基本类型 ： int double 等
//      第二种：引用类型 String 等

// kotlin语言只有一种数据类型：
//      看起来都是引用类型，实际上 编译器会在Java字节码中，修改成“基本类型”
fun main(){
    val age: Int = 99
    val pi: Float = 3.1415f
    val pi2: Double = 3.1415
    val isok: Boolean = true
}