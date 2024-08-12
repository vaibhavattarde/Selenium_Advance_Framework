package com.sel.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public final class ReadPropertyFile {
    private ReadPropertyFile() {

    }

    public static String getValue(String key) throws Exception {
        String value = "";
        Properties property = new Properties();
        FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/src/test/Config/Config.properties");
        property.load(file);
        value = property.getProperty(key);
        if (Objects.isNull(value )) {
            throw new Exception("property name " + key + "Is not found please check config.properties");
        }
        return value;

    }


}
