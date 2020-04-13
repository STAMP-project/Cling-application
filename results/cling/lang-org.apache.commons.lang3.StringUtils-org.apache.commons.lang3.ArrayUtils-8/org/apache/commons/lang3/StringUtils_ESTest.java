/*

 * Tue Mar 03 16:13:31 GMT 2020
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
      String string0 = StringUtils.repeat("", (int) '~');
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny("C", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = StringUtils.endsWith((String) null, "P\"1b6LA*(s?");
      assertFalse(boolean0);
      
      String string0 = StringUtils.repeat("P\"1b6LA*(s?", "P\"1b6LA*(s?", 10);
      assertEquals("P\"1b6LA*(s?P\"1b6LA*(s?P\"1b6LA*(s?P\"1b6LA*(s?P\"1b6LA*(s?P\"1b6LA*(s?P\"1b6LA*(s?P\"1b6LA*(s?P\"1b6LA*(s?P\"1b6LA*(s?P\"1b6LA*(s?P\"1b6LA*(s?P\"1b6LA*(s?P\"1b6LA*(s?P\"1b6LA*(s?P\"1b6LA*(s?P\"1b6LA*(s?P\"1b6LA*(s?P\"1b6LA*(s?", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = StringUtils.normalizeSpace("P\"1b6LA*(s?");
      String string1 = StringUtils.repeat("P\"1b6LA*(s?", 1);
      assertNotNull(string1);
      assertTrue(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = StringUtils.substring("^ck'~/KBz#B!d(?uT}B", 16, 16);
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = StringUtils.repeat("9!", 1);
      assertNotNull(string0);
      assertEquals("9!", string0);
      
      boolean boolean0 = StringUtils.endsWith("kusU20n/z&wFm([p}", "org.apache.commons.lang3.ObjectUtils$Null");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = StringUtils.repeat("P\"1b6LA*(s?", 1);
      assertEquals("P\"1b6LA*(s?", string0);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[8];
      stringArray0[2] = "";
      boolean boolean0 = StringUtils.endsWithAny("P\"1b6LA*(s?", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = "\\u";
      String string1 = StringUtils.repeat(string0, 1);
      assertNotNull(string1);
      assertEquals("\\u", string1);
      
      String[] stringArray0 = new String[6];
      boolean boolean0 = StringUtils.endsWithAny("", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringUtils.repeat("", (int) '~');
      String string0 = StringUtils.normalizeSpace((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringUtils.repeat("", 32);
      String string0 = StringUtils.normalizeSpace("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringUtils.normalizeSpace((String) null);
      String string0 = StringUtils.repeat("JB'", 13);
      assertNotNull(string0);
      assertEquals("JB'JB'JB'JB'JB'JB'JB'JB'JB'JB'JB'JB'JB'", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = StringUtils.repeat("d(?uT}B", 32);
      assertNotNull(string0);
      
      String string1 = StringUtils.normalizeSpace("d(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}B");
      assertTrue(string1.equals((Object)string0));
      assertNotNull(string1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = StringUtils.endsWith((String) null, (String) null);
      assertTrue(boolean0);
      
      String string0 = StringUtils.repeat("P\"1b6LA*(?", (String) null, 5);
      assertEquals("P\"1b6LA*(?P\"1b6LA*(?P\"1b6LA*(?P\"1b6LA*(?P\"1b6LA*(?", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = StringUtils.repeat("", (int) '~');
      assertNotNull(string0);
      
      String[] stringArray0 = new String[9];
      stringArray0[0] = "rcjx#giuidn";
      boolean boolean0 = StringUtils.endsWithAny("zu", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = StringUtils.repeat("", (int) '~');
      assertNotNull(string0);
      
      String[] stringArray0 = new String[9];
      stringArray0[3] = "";
      boolean boolean0 = StringUtils.endsWithAny("zu", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = StringUtils.repeat("d(?uT}B", 32);
      assertEquals("d(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}B", string0);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[2];
      stringArray0[1] = "d(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}Bd(?uT}B";
      boolean boolean0 = StringUtils.endsWithAny("d(?uT}B", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = StringUtils.repeat("j0#t9", 1436);
      String[] stringArray0 = new String[2];
      stringArray0[0] = string0;
      boolean boolean0 = StringUtils.endsWithAny(string0, stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringUtils.endsWithAny("P\"1b6LA*(s?", (String[]) null);
      String string0 = StringUtils.repeat("P\"1b6LA*(s?", 1792);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = StringUtils.repeat("9!", 1);
      assertNotNull(string0);
      assertEquals("9!", string0);
      
      boolean boolean0 = StringUtils.endsWithAny("X`,R=[o!eJD_-dj7,X`,R=[o!eJD_-dj7,", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = StringUtils.repeat("P\"1b6LA*(s?", 1);
      assertNotNull(string0);
      assertEquals("P\"1b6LA*(s?", string0);
      
      String[] stringArray0 = new String[8];
      boolean boolean0 = StringUtils.endsWithAny("P\"1b6LA*(s?", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = StringUtils.repeat("", (int) '~');
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny("", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = StringUtils.repeat("X`,GRf[oG!eJD_-dj7,", 1436);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny("", (String[]) null);
      assertFalse(boolean0);
  }
}
