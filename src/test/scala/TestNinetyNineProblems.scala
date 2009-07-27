import org.junit._
import Assert._

/**
 * TestNinetyNineProblems
 * @see http://www.haskell.org/haskellwiki/99_Haskell_exercises
 */
class TestNinetyNineProblems {
	@Test def x_8_compress {
		def compress[A](list:List[A]):List[A] = {
			list
		}
		val myList = List(1,1,2,2,3,3,4,4)
		assertEquals(List(1,2,3,4),compress(myList))
	}
	
	@Test def x_7_flatten_a_list {
		//todo: finish it
		assertEquals(1,2)
	}
	@Test def x_6_is_palindrome {
		def isPalindrome[A](list:List[A]):Boolean = {
			list == list.reverse
		}
		val myList = List(1,2,3,2,1)
		
		assertTrue(isPalindrome(myList))
	}
	
	@Test def x_5_reserve {
		def reverse[A](list:List[A]):List[A] = {
			list.foldLeft(List[A]()) {(newList, value) => value::newList}
		}
		val myList = List(1,2,3,4)
		
		assertEquals(List(4,3,2,1),reverse(myList))
	}
	
	@Test def x_4_length {
		def length[A](list:List[A]):Int = list.foldLeft(0) {(count, ignore) => count + 1}
		
		val myList = List(1,2,3,4,5)
		assertEquals(5, length(myList))
	}
	
	@Test def x_3_nth {
		def nth[A](list: List[A], n:Int):A = list match {
			case head::_ if(n==1) => head
			case head::tail => nth(tail, n-1)
			case _ => error("0 NOES")
		} 
		val myList = List(1,2,3,4,5)
		assertEquals(3,nth(myList, 3))
	}
	
	@Test def x_2_pnenultimate {
		def pnenultimate[A](list:List[A]):A = list match {
			case head::_::Nil => head
			case _::Nil => error("only one element")
			case _::tail => pnenultimate(tail)
			case Nil => error("0 NOES")
		}
		val myList = List(1,2,3,4,5)
		assertEquals(4, pnenultimate(myList))
	}
	
	@Test def x_1_find_the_last_element_of_a_list {
		def last[T](list:List[T]):T = list match {
			case head::Nil => head
			case _::tail => last(tail)
			case Nil => error("0 NOES")
		}
		val myList = List(1,2,3,4)
		assertEquals(myList.last, last(myList))
	}
}
