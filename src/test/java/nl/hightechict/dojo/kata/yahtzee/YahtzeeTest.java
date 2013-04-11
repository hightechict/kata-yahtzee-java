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
		int result = yahtzee.score(Lists.newArrayList(2, 2, 2, 2, 2),
				Category.ONES);
		Assert.assertEquals(0, result);
	}

	@Test
	public void onesShouldReturnOneForSingleOneDice() {
		int result = yahtzee.score(Lists.newArrayList(1, 2, 2, 2, 2),
				Category.ONES);

		Assert.assertEquals(1, result);
	}
}
