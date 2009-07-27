import org.junit._
import Assert._

/**
 * TestNinetyNineProblems
 */
class TestNinetyNineProblems {
	@Test def x_1_find_the_last_element_of_a_list {
		def last[T](list:List[T]):T = list match {
			case head::Nil => head
			case _::tail => last(tail)
			case Nil => error("0 NOES")
		}
		val myList = List(1,2,3,4)
		assertEquals(myList.last, last(myList))
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
	
	@Test def x_3_nth {
		def nth[A](list: List[A], n:Int):A = list match {
			case head::_ if(n==1) => head
			case head::tail => nth(tail, n-1)
			case _ => error("0 NOES")
		} 
		val myList = List(1,2,3,4,5)
		assertEquals(3,nth(myList, 3))
	}
	
	@Test def x_4_length {
		def length[A](list:List[A]):Int = list.foldLeft(0) {(count, ignore) => count + 1}
		
		val myList = List(1,2,3,4,5)
		assertEquals(5, length(myList))
	}
}
