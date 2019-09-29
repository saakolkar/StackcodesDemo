package com.qa.utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	public Properties loadproperties() throws IOException {
		FileReader reader = new FileReader("AppConfig.properties");
		Properties p = new Properties();
		p.load(reader);
		return p;
	}

	public String geturl() throws IOException {

		return loadproperties().getProperty("AppURL");

	}

}
