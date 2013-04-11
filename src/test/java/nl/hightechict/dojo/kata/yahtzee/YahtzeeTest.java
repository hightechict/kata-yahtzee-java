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

	@Test
	public void onesShouldReturnFiveForFiveOneDice() {
		assertScore(Lists.newArrayList(1, 1, 1, 1, 1), Category.ONES, 5);
	}

	@Test
	public void twosShouldReturnZeroForIncompatibleThrow() {
		assertScore(Lists.newArrayList(1, 1, 1, 1, 1), Category.TWOS, 0);
	}

	@Test
	public void twosShouldReturn8() {
		assertScore(Lists.newArrayList(1, 2, 2, 2, 2), Category.TWOS, 8);
	}

	@Test
	public void threesShouldReturn6() {
		assertScore(Lists.newArrayList(1, 3, 3, 2, 2), Category.THREES, 6);
	}

	@Test
	public void foursShouldReturn12() {
		assertScore(Lists.newArrayList(4, 3, 4, 2, 4), Category.FOURS, 12);
	}

	@Test
	public void fivesShouldReturn15() {
		assertScore(Lists.newArrayList(5, 5, 3, 5, 2), Category.FIVES, 15);
	}

	@Test
	public void sixesShouldReturn6() {
		assertScore(Lists.newArrayList(1, 3, 6, 2, 2), Category.SIXES, 6);
	}

	@Test
	public void chanceShouldReturn() {
		assertScore(Lists.newArrayList(1, 2, 3, 4, 5), Category.CHANCE, 15);
	}

	public void assertScore(Iterable<Integer> dice, Category category,
			int expected) {
		int result = yahtzee.score(dice, category);
		Assert.assertEquals(expected, result);
	}
}
