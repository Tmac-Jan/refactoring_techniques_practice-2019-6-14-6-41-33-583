package com.tws.refactoring.extract_variable;

public class BannerRender {
    String renderBanner(String platform, String browser) {
        final boolean doesPlatFormContainsMAC
            = platform.toUpperCase().contains("MAC");
        final  boolean doesBrowserContainIE =
            browser.toUpperCase().contains("IE");
        return doesBrowserContainIE&&doesPlatFormContainsMAC?"IE on Mac?":"banner";
    }
}
