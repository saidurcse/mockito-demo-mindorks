package demo.mockito.myapplication

import demo.mockito.calculator.Utility
import junit.framework.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock

class UtilityTest {
    @Test
    fun providedNumber_isSum_true(){
        val mockUtil = mock(Utility::class.java)
        `when`(mockUtil.getSum(1,2)).thenReturn(3)
        val actualResult = mockUtil.getSum(1,2)
        assertEquals(3, actualResult)
    }
}