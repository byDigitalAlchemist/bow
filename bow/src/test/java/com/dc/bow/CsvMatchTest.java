package com.dc.bow;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.linesOf;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class CsvMatchTest {

	@Test
	public void test1() throws IOException {
		final File actual = new File("src/main/resources/actual/trades.csv");
		final File output = new File("src/main/resources/output/trades.csv");
		
		
		//Assert.assertEquals(FileUtils.readLines(actual), FileUtils.readLines(output));
	
		//assertTrue("The files differ!", FileUtils.contentEquals(actual, output));
		
		
	    //assertThat(actual).hasSameContentAs(output);
	    assertThat(linesOf(actual)).isSameAs(linesOf(actual));
	}
}
