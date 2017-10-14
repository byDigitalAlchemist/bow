package com.dc.bow.annotations;

public interface CsvStringTextParser<E> {
	public E parseStringText(String... csvText);
}
