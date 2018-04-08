package com.devesh.skunkworks.pokerworld

import com.devesh.skunkworks.pokerworld.Cards.Card

/**
  * Created by devesh on 4/7/18.
  */
object PokerRank {
 private val order = List( RoyalFlush, StraightFlush, FourOfAKind, FullHouse, Flush, Straight, ThreeOfAKind, TwoPair, OnePair, HighCard )

 val isSameInRank: (Hand) => (Hand) => Boolean =
   (first:Hand)=>(second:Hand) => order.indexOf(first) == order.indexOf(second)

 val isGreaterInRank: Hand => Hand => Boolean =
   (first:Hand)=>(second:Hand) => order.indexOf(first) < order.indexOf(second)


 val handFromCards: List[Card] => Hand = ???
}
