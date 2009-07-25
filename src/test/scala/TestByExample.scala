import org.junit._

import Assert._

/**
 * TestByExample
 */
class TestByExample {
	@Test def square_roots_by_newtons_method {
		def sqrt(x: Double) = {
			def square(x: Double) = x*x
			def improve(guess: Double) = (guess + x/guess) /2
			def isGoodEnough(guess: Double) = Math.abs(square(guess) - x) < 0.001
			def sqrtIter(guess: Double): Double = 
				if (isGoodEnough(guess)) guess
				else sqrtIter(improve(guess))
			sqrtIter(1.0)
		}
		
		def ret = sqrt(1024)
		println("sqrt(1024) is " + ret)
		assertEquals(32, Math.round(ret).toInt)
	}
}
