/*

 * Tue Mar 03 16:15:02 GMT 2020
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
      String string0 = StringUtils.repeat("", "", 124);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny("N~", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = StringUtils.repeat(" is not in the range '0' - '9'", " is not in the range '0' - '9'", 32);
      String[] stringArray0 = new String[1];
      stringArray0[0] = string0;
      boolean boolean0 = StringUtils.endsWithAny(string0, stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = StringUtils.repeat("", "", 124);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWith((String) null, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringUtils.endsWith((String) null, (String) null);
      String string0 = StringUtils.repeat("U.Y!^fZ>|", 128);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = StringUtils.repeat("Dj]j?L3TTfDj]j?L3TTfDj]j?L3TTfDj]j?L3TTfDj]j?L3TTfDj]j?L3TTfDj]j?L3TTf?L3TTf", "Dj]j?L3TTfDj]j?L3TTfDj]j?L3TTfDj]j?L3TTfDj]j?L3TTfDj]j?L3TTfDj]j?L3TTf?L3TTf", 256);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWith((String) null, "Dj]j?L3TTfDj]j?L3TTfDj]j?L3TTfDj]j?L3TTfDj]j?L3TTfDj]j?L3TTfDj]j?L3TTf?L3TTf");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = StringUtils.repeat("", "", 1);
      String string1 = StringUtils.normalizeSpace("");
      assertTrue(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = StringUtils.substring(" is not in the range '0' - '9'", (-8), (-8));
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = StringUtils.repeat("Bzhm|#1xA&V5Y`Hf_K", "h?.", 1);
      assertEquals("Bzhm|#1xA&V5Y`Hf_K", string0);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[3];
      stringArray0[0] = "Bzhm|#1xA&V5Y`Hf_K";
      boolean boolean0 = StringUtils.endsWithAny("h?.", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = StringUtils.repeat("Bzhm|#1xA&V5Y`Hf_K", "...", 1);
      assertNotNull(string0);
      assertEquals("Bzhm|#1xA&V5Y`Hf_K", string0);
      
      String[] stringArray0 = new String[3];
      stringArray0[1] = "...";
      boolean boolean0 = StringUtils.endsWithAny("...", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = StringUtils.repeat("", "", 1);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny("", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringUtils.repeat("", (String) null, 124);
      String string0 = StringUtils.normalizeSpace((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = StringUtils.repeat("", (String) null, 124);
      assertEquals("", string0);
      assertNotNull(string0);
      
      String string1 = StringUtils.normalizeSpace("^nkd+?8c5|5");
      assertNotNull(string1);
      assertEquals("^nkd+?8c5|5", string1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringUtils.repeat("O", "O", 29);
      String string0 = StringUtils.normalizeSpace((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = StringUtils.repeat("The Character must not be nullq 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2qy#*m^uv%+cy@[vh 2q 2q 2q 2q 2q 2", "The Character must not be nullq 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2qy#*m^uv%+cy@[vh 2q 2q 2q 2q 2q 2", 62);
      String string1 = StringUtils.normalizeSpace(string0);
      assertTrue(string1.equals((Object)string0));
      assertNotNull(string1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = StringUtils.repeat("", (String) null, 129);
      assertNotNull(string0);
      assertEquals("", string0);
      
      boolean boolean0 = StringUtils.endsWith((String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = StringUtils.repeat("?", "?", 1);
      assertNotNull(string0);
      assertEquals("?", string0);
      
      boolean boolean0 = StringUtils.endsWith((String) null, " in a");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = StringUtils.repeat("", "", 101);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase("", "y4 n|s");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = StringUtils.repeat("", "", 124);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[2];
      stringArray0[0] = "l_E";
      boolean boolean0 = StringUtils.endsWithAny("l_E", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = StringUtils.repeat(" 2", " 2", 124);
      assertNotNull(string0);
      assertEquals(" 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2", string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase(" 2", " 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = StringUtils.repeat(" 2", " 2", 124);
      assertEquals(" 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2", string0);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny(" 2", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = StringUtils.repeat(" is not in the range '0' - '9'", " is not in the range '0' - '9'", 1);
      assertEquals(" is not in the range '0' - '9'", string0);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny(" is not in the range '0' - '9'", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = StringUtils.repeat("", "", 124);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[2];
      boolean boolean0 = StringUtils.endsWithAny("l_E", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = StringUtils.repeat("", "", 124);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny("", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = StringUtils.repeat("The Character must not be nullq 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2qy#*m^uv%+cy@[vh 2q 2q 2q 2q 2q 2", "The Character must not be nullq 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2q 2qy#*m^uv%+cy@[vh 2q 2q 2q 2q 2q 2", 62);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[1];
      boolean boolean0 = StringUtils.endsWithAny(string0, stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = StringUtils.repeat(" 2", " 2", 124);
      assertNotNull(string0);
      assertEquals(" 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2", string0);
      
      boolean boolean0 = StringUtils.endsWithAny((String) null, (String[]) null);
      assertFalse(boolean0);
  }
}
