package com.tws.refactoring.extract_variable;

import static org.junit.Assert.*;

import org.junit.Test;

public class BannerRenderTest {
  @Test
    public void should_get_IE_MAC_when_give_platform_contanis_MAC_AND_browser_contains_IE(){
      String expectedResult = new BannerRender().renderBanner("MACCC","IEEE");

      assertEquals("IE on Mac?",expectedResult);
    }
  @Test
  public void should_get_IE_MAC_when_give_platform_contanis_MAC_AND_browser_not_contains_IE(){
    String expectedResult = new BannerRender().renderBanner("MACCC","FIRFOX");

    assertEquals("banner",expectedResult);
  }
  @Test
  public void should_get_IE_MAC_when_give_platform_not_contanis_MAC_AND_browser_contains_IE(){
    String expectedResult = new BannerRender().renderBanner("WINDOWS","FIRFOX");

    assertEquals("banner",expectedResult);
  }
  @Test
  public void should_get_IE_MAC_when_give_platform_not_contanis_MAC_AND_browser_not_contains_IE(){
    String expectedResult = new BannerRender().renderBanner("WINDOWS","FIRFOX");

    assertEquals("banner",expectedResult);
  }
}