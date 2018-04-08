import com.devesh.skunkworks.pokerworld._
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by devesh on 9/10/17.
  */
@RunWith(classOf[JUnitRunner])
class TestCards  extends FlatSpec with Matchers{
  "set intersection" should "be commutative" in{
    1 should be (1)
  }

  "comparing two cards of diff rank" should "result" in {
    val c1 = (Heart, Six)
    val c2 = (Clubs, Seven)
    Cards.isGreaterInRank(c1, c2) should be (false)
  }

}
