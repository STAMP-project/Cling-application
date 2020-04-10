/*

 * Tue Mar 03 16:13:27 GMT 2020
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.StringUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class StringUtils_ESTest extends StringUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = StringUtils.repeat("qy;hL#!gP]Dw1w3nEe5", 1);
      assertNotNull(string0);
      assertEquals("qy;hL#!gP]Dw1w3nEe5", string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase((String) null, "qy;hL#!gP]Dw1w3nEe5");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = StringUtils.repeat("x", 106);
      assertEquals("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", string0);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = StringUtils.repeat("fjlxBy|?S;", 4);
      assertEquals("fjlxBy|?S;fjlxBy|?S;fjlxBy|?S;fjlxBy|?S;", string0);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[1];
      stringArray0[0] = "fjlxBy|?S;";
      boolean boolean0 = StringUtils.endsWithAny("fjlxBy|?S;fjlxBy|?S;fjlxBy|?S;fjlxBy|?S;", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = StringUtils.repeat("", 2665);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase((String) null, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringUtils.endsWithIgnoreCase((String) null, (String) null);
      String string0 = StringUtils.repeat("8c9%b@", 74);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = StringUtils.repeat("qy;hL#!gP]Dw1w3nEe5", 3);
      assertEquals("qy;hL#!gP]Dw1w3nEe5qy;hL#!gP]Dw1w3nEe5qy;hL#!gP]Dw1w3nEe5", string0);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase((String) null, "qy;hL#!gP]Dw1w3nEe5qy;hL#!gP]Dw1w3nEe5qy;hL#!gP]Dw1w3nEe5");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringUtils.repeat("A-<l2a", 1);
      String string0 = StringUtils.normalizeSpace((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = StringUtils.repeat("qy;hL#!gP]Dw1w3nEe5", 1);
      assertNotNull(string0);
      
      String string1 = StringUtils.normalizeSpace("qy;hL#!gP]Dw1w3nEe5");
      assertTrue(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = StringUtils.substring("kcIA'JwX!TOS", 7, 7);
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = StringUtils.repeat("A-<l2a", 1);
      assertNotNull(string0);
      assertEquals("A-<l2a", string0);
      
      String[] stringArray0 = new String[1];
      stringArray0[0] = "A-<l2a";
      boolean boolean0 = StringUtils.endsWithAny("A-<l2a", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = StringUtils.repeat("qy;hL#!gP]D-w1w3nEe5", 1);
      assertNotNull(string0);
      assertEquals("qy;hL#!gP]D-w1w3nEe5", string0);
      
      String[] stringArray0 = new String[7];
      stringArray0[0] = "qy;hL#!gP]D-w1w3nEe5";
      boolean boolean0 = StringUtils.endsWithAny("TimeToLive of ", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = "\\u";
      String string1 = StringUtils.repeat(string0, 1);
      assertNotNull(string1);
      assertEquals("\\u", string1);
      
      boolean boolean0 = StringUtils.endsWithAny("", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringUtils.repeat("", 1110);
      String string0 = StringUtils.normalizeSpace((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = StringUtils.repeat("", 4);
      String string1 = StringUtils.normalizeSpace("");
      assertTrue(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringUtils.normalizeSpace((String) null);
      String string0 = StringUtils.repeat("Index: ", 64);
      assertNotNull(string0);
      assertEquals("Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: Index: ", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = StringUtils.normalizeSpace("WcdW;X .!jLhrfE");
      assertEquals("WcdW;X .!jLhrfE", string0);
      assertNotNull(string0);
      
      String string1 = StringUtils.repeat("WcdW;X .!jLhrfE", 64);
      assertNotNull(string1);
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = StringUtils.repeat("", 2666);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase((String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = StringUtils.repeat("A-<l2a", 1);
      assertEquals("A-<l2a", string0);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase((String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = StringUtils.repeat("", 1950);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[1];
      stringArray0[0] = "org.apache.commons.lang3.CharUtils";
      boolean boolean0 = StringUtils.endsWithAny("q", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = StringUtils.repeat("", 2686);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[8];
      stringArray0[1] = "sun.text.Normalizer is not available";
      boolean boolean0 = StringUtils.endsWithAny("sun.text.Normalizer is not available", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = StringUtils.repeat("A-<l2a", 97);
      assertEquals("A-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2a", string0);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase("A-<l2a", "A-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2a");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = StringUtils.repeat("", 10);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny("org.apache.commons.lang3.StringUtils", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = StringUtils.repeat("qy;hL#!gP]Dw1w3nEe5", 1);
      assertNotNull(string0);
      assertEquals("qy;hL#!gP]Dw1w3nEe5", string0);
      
      boolean boolean0 = StringUtils.endsWithAny("qy;hL#!gP]Dw1w3nEe5", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = StringUtils.repeat("", 101);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny("", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = StringUtils.repeat("s less than ", 65);
      assertNotNull(string0);
      assertEquals("s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than s less than ", string0);
      
      String[] stringArray0 = new String[1];
      boolean boolean0 = StringUtils.endsWithAny("T+dg'&\"x1fS+eNN", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = StringUtils.repeat("A-<l2a", 11);
      assertEquals("A-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2aA-<l2a", string0);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny((String) null, (String[]) null);
      assertFalse(boolean0);
  }
}
