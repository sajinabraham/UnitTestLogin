package `in`.sajin.unittestlogin

import com.google.common.truth.Truth.assertThat
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.junit.Test

@RunWith(JUnit4::class)


class ValidatorTest{

    @Test
    fun whenInputIsValid() {
        val s1 = "Sajin"
        val result = Validator.main(s1)
        assertThat(result).isEqualTo(true)
    }
}