import Cards.{Ace, Card, Clubs}
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


}
