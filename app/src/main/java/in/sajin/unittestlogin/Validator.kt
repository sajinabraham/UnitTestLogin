package `in`.sajin.unittestlogin

import java.util.regex.Pattern

object Validator {
    @JvmStatic
    fun main(string: String):Boolean {
        val p = Pattern.compile("[A-Z]")
        val m1 = p.matcher(string)
        println("First letter of each word from string \"$string\" : ")
        while (m1.find()) print(m1.group())
        //println()
        return string.isNotEmpty()
    }
}