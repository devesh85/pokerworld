package com.devesh.skunkworks.pokerworld

/**
  * Created by devesh on 4/7/18.
  */

object Cards {
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
