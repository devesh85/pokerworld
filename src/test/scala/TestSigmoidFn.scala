import org.junit.runner.RunWith
import org.scalatest.{FlatSpec, Matchers}
import org.scalatest.junit.JUnitRunner

/**
  * Created by devesh on 11/3/17.
  */
@RunWith(classOf[JUnitRunner])
class TestSigmoidFn   extends FlatSpec with Matchers{
  "set intersection" should "be commutative" in{
    sigmoid(-1000)  should be (0)
    sigmoid(1000)  should be (1)

  }


  private def sigmoid(weight:Double):Int = {
    val res = 1/(1+Math.exp(-weight))
    if(res > 0.5) 1
    else 0
  }
}
