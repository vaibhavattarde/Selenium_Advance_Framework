package com.sel.constants;

public final class FrameworkConstants {

    private FrameworkConstants() {

    }

    private static final String CHROMEDRIVERPATH = System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/srctest/Executables/chromedriver_win32 (1)/chromedriver.exe");



    public static String getChromedriverpath() {
        return CHROMEDRIVERPATH;
    }

}
