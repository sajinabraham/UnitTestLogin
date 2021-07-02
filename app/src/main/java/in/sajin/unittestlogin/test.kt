package `in`.sajin.unittestlogin

import java.util.regex.Pattern

 object Test {
    @JvmStatic
    fun main(string: String):String {
        val p = Pattern.compile("\\b[a-zA-Z]")
        val m1 = p.matcher(string)
        println("First letter of each word from string \"$string\" : ")
        while (m1.find()) print(m1.group())
        println()
        return (m1.group())
    }
}