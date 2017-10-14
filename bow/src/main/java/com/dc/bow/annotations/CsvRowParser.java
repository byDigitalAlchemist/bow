package com.dc.bow.annotations;

public interface CsvRowParser<E> {
	public E parseRowText(String... csvText);
}
