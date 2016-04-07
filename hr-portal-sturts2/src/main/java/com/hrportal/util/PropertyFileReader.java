package com.hrportal.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

public final class PropertyFileReader {

    private PropertyFileReader() {
    }

    public static Map<String, String> map = new HashMap<>();

    public static final String DB_NAME = "db.name";
    public static final String DB_USERNAME = "db.user";
    public static final String DB_PASSWORD = "db.password";
    public static final String DB_HOST = "db.host";
    public static final String DB_PORT = "db.port";

    static {
	InputStream stream = PropertyFileReader.class.getClassLoader().getResourceAsStream("db.properties");
	Properties props = new Properties();
	try {
	    props.load(stream);
	    for (Entry<Object, Object> prop : props.entrySet()) {
		String key = (String) prop.getKey();
		map.put(key, props.getProperty(key));
	    }
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    public static String getProperty(String key) {
	return map.get(key);
    }

}
