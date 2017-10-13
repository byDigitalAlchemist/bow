package com.dc.bow;

import java.io.File;

import org.junit.Assert;
import org.junit.Test;

public class CsvMatchTest {

	@Test
	public void test1() {
		 final File actual = new File("xyz.txt");
		 final File expected = new File("xyz.txt");
		 Assert.assertEquals(FileUtils.readLines(expected), FileUtils.readLines(output));
		}
	}
}
