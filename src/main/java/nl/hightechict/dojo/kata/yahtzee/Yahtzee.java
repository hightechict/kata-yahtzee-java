package nl.hightechict.dojo.kata.yahtzee;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

public class Yahtzee {

	public enum Category {
		ONES
	}

	public int score(Iterable<Integer> dice, Category ones) {
		Multiset<Integer> diceThrow = HashMultiset.create(dice);
		return diceThrow.count(1);
	}
}
