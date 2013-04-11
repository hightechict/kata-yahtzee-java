package nl.hightechict.dojo.kata.yahtzee;

import java.util.Hashtable;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

public class Yahtzee {

	public enum Category {
		ONES, TWOS, THREES, FOURS, FIVES, SIXES, CHANCE
	}

	private final Hashtable<Category, Integer> CategoryToIntegerLookup = new Hashtable<Category, Integer>();

	public Yahtzee() {
		CategoryToIntegerLookup.put(Category.ONES, 1);
		CategoryToIntegerLookup.put(Category.TWOS, 2);
		CategoryToIntegerLookup.put(Category.THREES, 3);
		CategoryToIntegerLookup.put(Category.FOURS, 4);
		CategoryToIntegerLookup.put(Category.FIVES, 5);
		CategoryToIntegerLookup.put(Category.SIXES, 6);
	}

	public int score(Iterable<Integer> dice, Category category) {
		Multiset<Integer> diceThrow = HashMultiset.create(dice);
		if (category == Category.CHANCE) {
			return diceSum(diceThrow);
		} else {
			return singlesScore(category, diceThrow);
		}
	}

	private int singlesScore(Category category, Multiset<Integer> diceThrow) {
		Integer value = CategoryToIntegerLookup.get(category);
		return value * diceThrow.count(value);
	}

	private int diceSum(Multiset<Integer> diceThrow) {
		int value = 0;
		for (Integer i : diceThrow) {
			value += i;
		}
		return value;
	}
}
