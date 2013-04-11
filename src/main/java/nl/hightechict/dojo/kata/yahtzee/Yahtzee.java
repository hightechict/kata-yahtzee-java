package nl.hightechict.dojo.kata.yahtzee;

import java.util.Hashtable;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

public class Yahtzee {

	public enum Category {
		ONES, TWOS, THREES
	}

	private final Hashtable<Category, Integer> CategoryToIntegerLookup = new Hashtable<Category, Integer>();

	public Yahtzee() {
		CategoryToIntegerLookup.put(Category.ONES, 1);
		CategoryToIntegerLookup.put(Category.TWOS, 2);
		CategoryToIntegerLookup.put(Category.THREES, 3);

	}

	public int score(Iterable<Integer> dice, Category category) {
		Multiset<Integer> diceThrow = HashMultiset.create(dice);
		Integer value = CategoryToIntegerLookup.get(category);
		return value * diceThrow.count(value);
	}
}
