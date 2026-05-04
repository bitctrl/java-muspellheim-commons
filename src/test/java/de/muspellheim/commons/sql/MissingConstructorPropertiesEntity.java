/*
 * Muspellheim Commons
 * Copyright (c) 2019 Falko Schumann
 */

package de.muspellheim.commons.sql;

import java.beans.ConstructorProperties;

import lombok.Getter;

public class MissingConstructorPropertiesEntity {

	@Getter
	private final String text;
	@Getter
	private final int number;

	@ConstructorProperties({ "text" })
	public MissingConstructorPropertiesEntity(String text, int number) {
		this.text = text;
		this.number = number;
	}
}
