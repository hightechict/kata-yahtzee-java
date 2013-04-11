package nl.hightechict.dojo.kata.yahtzee;

import nl.hightechict.dojo.kata.yahtzee.Yahtzee.Category;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Lists;

public class YahtzeeTest {

	Yahtzee yahtzee;

	@Before
	public void setUp() {
		yahtzee = new Yahtzee();
	}

	@Test
	public void onesShouldReturnZeroForIncompatibelThrow() {
		assertScore(Lists.newArrayList(2, 2, 2, 2, 2), Category.ONES, 0);
	}

	@Test
	public void onesShouldReturnOneForSingleOneDice() {
		assertScore(Lists.newArrayList(1, 2, 2, 2, 2), Category.ONES, 1);
	}

	public void assertScore(Iterable<Integer> dice, Category category,
			int expected) {
		int result = yahtzee.score(dice, category);
		Assert.assertEquals(expected, result);
	}
}
