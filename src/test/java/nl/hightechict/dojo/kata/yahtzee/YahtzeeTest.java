package nl.hightechict.dojo.kata.yahtzee;

import nl.hightechict.dojo.kata.yahtzee.Yahtzee.Category;

import org.junit.Assert;
import org.junit.Test;

public class YahtzeeTest {

	@Test
	public void shouldReturnZeroForIncompatibelThrow() {
		int result = new Yahtzee().score(new int[] { 2, 2, 2, 2, 2 },
				Category.ONES);
		Assert.assertEquals(0, result);
	}
}
