/*

 * Tue Mar 03 16:12:44 GMT 2020
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
      boolean boolean0 = StringUtils.endsWithIgnoreCase((String) null, (String) null);
      assertTrue(boolean0);
      
      String string0 = StringUtils.repeat("i4zNjMA./ekYnK3", 1);
      assertEquals("i4zNjMA./ekYnK3", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = StringUtils.repeat("", "", 48);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[0];
      boolean boolean0 = StringUtils.endsWithAny("f#A3o(`\"&&c", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = StringUtils.repeat("", 48);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[2];
      stringArray0[1] = "";
      boolean boolean0 = StringUtils.endsWithAny("org.apache.commons.lang3.ArrayUtils", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringUtils.endsWithIgnoreCase((String) null, (String) null);
      String string0 = StringUtils.repeat("", 48);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringUtils.endsWithIgnoreCase((String) null, "");
      String string0 = StringUtils.repeat("", 48);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = StringUtils.repeat("oH_E.jQ!(k", 48);
      assertNotNull(string0);
      assertEquals("oH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(k", string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase((String) null, "oH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(k");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringUtils.repeat("strings must not", 1);
      String string0 = StringUtils.normalizeSpace((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = StringUtils.repeat("I]OHnN:1", 1);
      assertNotNull(string0);
      
      String string1 = StringUtils.normalizeSpace("I]OHnN:1");
      assertTrue(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = StringUtils.substring("Cannot get the toString of a null identity", 16, 16);
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = StringUtils.repeat("I]OHnN:1", 1);
      assertNotNull(string0);
      assertEquals("I]OHnN:1", string0);
      
      String[] stringArray0 = new String[3];
      stringArray0[0] = "strings must not";
      boolean boolean0 = StringUtils.endsWithAny(string0, stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[2] = "strings must not";
      String string0 = StringUtils.repeat("I]OHnN:1", 1);
      assertNotNull(string0);
      assertEquals("I]OHnN:1", string0);
      
      boolean boolean0 = StringUtils.endsWithAny("strings must not", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = StringUtils.repeat("strings must not", 1);
      assertEquals("strings must not", string0);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[0];
      boolean boolean0 = StringUtils.endsWithAny((String) null, stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringUtils.repeat("", 273);
      String[] stringArray0 = new String[2];
      String string0 = StringUtils.normalizeSpace(stringArray0[1]);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = StringUtils.repeat("", 45);
      String string1 = StringUtils.normalizeSpace("");
      assertTrue(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringUtils.repeat(" tha 2", 679);
      String string0 = StringUtils.normalizeSpace((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = StringUtils.repeat("srings must t", 3);
      assertNotNull(string0);
      assertEquals("srings must tsrings must tsrings must t", string0);
      
      String string1 = StringUtils.normalizeSpace("srings must t");
      assertEquals("srings must t", string1);
      assertNotNull(string1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = StringUtils.repeat("oH_E.jQ!(k", 48);
      assertNotNull(string0);
      assertEquals("oH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(koH_E.jQ!(k", string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase((String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = StringUtils.repeat("I]OHnN:1", 1);
      assertNotNull(string0);
      assertEquals("I]OHnN:1", string0);
      
      boolean boolean0 = StringUtils.endsWith((String) null, "strings must not");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = StringUtils.repeat("", 48);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase("L'08!OgPx'T%<!:r(+", "org.apache.commons.lang3.StringUtils");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = StringUtils.repeat("", 48);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[2];
      stringArray0[0] = "&z[A";
      boolean boolean0 = StringUtils.endsWithAny("org.apache.commons.lang3.ArrayUtils", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = StringUtils.repeat("da d_/cg", 898);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase("da d_/cg", "oH_E.jQ!(k");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "iK`eIle[^(Cym#mJ(*5";
      StringUtils.endsWithAny("iK`eIle[^(Cym#mJ(*5", stringArray0);
      String string0 = StringUtils.repeat("iK`eIle[^(Cym#mJ(*5", 256);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringUtils.endsWithAny("oH_E.jQ!(k", (String[]) null);
      String string0 = StringUtils.repeat("da d_/cg", 898);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = StringUtils.repeat("srings must t", 1);
      assertEquals("srings must t", string0);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny(",Y0KjT)G&f", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = StringUtils.repeat("", 273);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[2];
      boolean boolean0 = StringUtils.endsWithAny("", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String[] stringArray0 = new String[2];
      boolean boolean0 = StringUtils.endsWithAny("Cannot pad a negative amount: ", stringArray0);
      assertFalse(boolean0);
      
      String string0 = StringUtils.repeat("?%M", 35);
      assertNotNull(string0);
      assertEquals("?%M?%M?%M?%M?%M?%M?%M?%M?%M?%M?%M?%M?%M?%M?%M?%M?%M?%M?%M?%M?%M?%M?%M?%M?%M?%M?%M?%M?%M?%M?%M?%M?%M?%M?%M", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = StringUtils.repeat("Invocat%onTargetException occurred", 273);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny((String) null, (String[]) null);
      assertFalse(boolean0);
  }
}
