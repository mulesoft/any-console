package com.anyconsole.plugin;

import com.anyconsole.core.parser.Parser;

public interface Plugin {
	Parser parse(String statement);
	String execute(Parser parser);
}