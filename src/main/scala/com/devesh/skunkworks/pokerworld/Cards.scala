object Cards {

  trait Suit

  object Heart extends Suit

  object Diamond extends Suit

  object Spades extends Suit

  object Clubs extends Suit


  trait Rank

  object Ace extends Rank

  object King extends Rank

  object Queen extends Rank

  object Jack extends Rank

  object Ten extends Rank

  object Nine extends Rank

  object Eight extends Rank

  object Seven extends Rank

  object Six extends Rank

  object Five extends Rank

  object Four extends Rank

  object Three extends Rank

  object Two extends Rank

  type Card = (Suit, Rank)

  private val order = List(Ace, King, Queen, Jack, Ten, Nine, Eight, Seven, Six, Five, Four, Three, Two)

  def isGreaterInRank(firstCard: Card, secondCard:Card):Boolean = {
    val (rankFirst, _ ) = firstCard
    val (rankSecond, _ ) = secondCard
    order.indexOf(rankFirst) < order.indexOf(rankSecond)
  }
  def isSameInRank(firstCard: Card, secondCard:Card):Boolean = {
    val (rankFirst, _ ) = firstCard
    val (rankSecond, _ ) = secondCard
    order.indexOf(rankFirst) == order.indexOf(rankSecond)
  }


}
