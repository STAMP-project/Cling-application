/*

 * Tue Mar 03 16:13:55 GMT 2020
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
      boolean boolean0 = StringUtils.endsWith((String) null, (String) null);
      assertTrue(boolean0);
      
      String string0 = StringUtils.repeat("F", "", 1);
      assertEquals("F", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = StringUtils.endsWithAny("C!;%6{!>2A*cPS}$u?4u", (String[]) null);
      assertFalse(boolean0);
      
      String string0 = StringUtils.repeat("clone", "clone", 5);
      assertEquals("clonecloneclonecloneclonecloneclonecloneclone", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = StringUtils.repeat("", 4);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      boolean boolean0 = StringUtils.endsWithAny("\"Zn2O6}`4se;Q<i:S7", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringUtils.endsWith((String) null, (String) null);
      String string0 = StringUtils.repeat("", 5);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = StringUtils.repeat("", 6);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWith((String) null, "8xEw#f;");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringUtils.endsWith((String) null, (String) null);
      String string0 = StringUtils.repeat("u7X+q+eUsbTiK1q", "8N@A_5)jIv\"PW", 256);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringUtils.repeat("dd28bc$UZ", 1);
      String string0 = StringUtils.normalizeSpace((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringUtils.normalizeSpace("");
      String string0 = StringUtils.repeat("{NbMuV!7WkPqGWnAH", 1);
      assertNotNull(string0);
      assertEquals("{NbMuV!7WkPqGWnAH", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = StringUtils.substring("dd28bc$U", 1, 1);
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = StringUtils.repeat("R]TAh$bXt7sh+I\"", 1);
      assertEquals("R]TAh$bXt7sh+I\"", string0);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[2];
      stringArray0[0] = "R]TAh$bXt7sh+I\"";
      boolean boolean0 = StringUtils.endsWithAny("R]TAh$bXt7sh+I\"", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = StringUtils.repeat("dd28bc$UZ", 1);
      assertEquals("dd28bc$UZ", string0);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[8];
      stringArray0[0] = "iJ is less than 0: iJ is less than 0: ";
      boolean boolean0 = StringUtils.endsWithAny("dd28bc$UZ", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = StringUtils.repeat("R]TAh$bXt7sh+I\"", 1);
      assertEquals("R]TAh$bXt7sh+I\"", string0);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny((String) null, (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringUtils.repeat("", 1818);
      String string0 = StringUtils.normalizeSpace((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringUtils.normalizeSpace("");
      String string0 = StringUtils.repeat("", 6);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringUtils.normalizeSpace((String) null);
      String string0 = StringUtils.repeat("(t`oTFnMvA0FJu6.m", 42);
      assertNotNull(string0);
      assertEquals("(t`oTFnMvA0FJu6.m(t`oTFnMvA0FJu6.m(t`oTFnMvA0FJu6.m(t`oTFnMvA0FJu6.m(t`oTFnMvA0FJu6.m(t`oTFnMvA0FJu6.m(t`oTFnMvA0FJu6.m(t`oTFnMvA0FJu6.m(t`oTFnMvA0FJu6.m(t`oTFnMvA0FJu6.m(t`oTFnMvA0FJu6.m(t`oTFnMvA0FJu6.m(t`oTFnMvA0FJu6.m(t`oTFnMvA0FJu6.m(t`oTFnMvA0FJu6.m(t`oTFnMvA0FJu6.m(t`oTFnMvA0FJu6.m(t`oTFnMvA0FJu6.m(t`oTFnMvA0FJu6.m(t`oTFnMvA0FJu6.m(t`oTFnMvA0FJu6.m(t`oTFnMvA0FJu6.m(t`oTFnMvA0FJu6.m(t`oTFnMvA0FJu6.m(t`oTFnMvA0FJu6.m(t`oTFnMvA0FJu6.m(t`oTFnMvA0FJu6.m(t`oTFnMvA0FJu6.m(t`oTFnMvA0FJu6.m(t`oTFnMvA0FJu6.m(t`oTFnMvA0FJu6.m(t`oTFnMvA0FJu6.m(t`oTFnMvA0FJu6.m(t`oTFnMvA0FJu6.m(t`oTFnMvA0FJu6.m(t`oTFnMvA0FJu6.m(t`oTFnMvA0FJu6.m(t`oTFnMvA0FJu6.m(t`oTFnMvA0FJu6.m(t`oTFnMvA0FJu6.m(t`oTFnMvA0FJu6.m(t`oTFnMvA0FJu6.m", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = StringUtils.normalizeSpace("Arguments cannot both be null");
      assertNotNull(string0);
      assertEquals("Arguments cannot both be null", string0);
      
      String string1 = StringUtils.repeat("Arguments cannot both be null", "Arguments cannot both be null", 315);
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = StringUtils.repeat("C!;%6{!>2A*cPS}$u?4uorg.apache.commons+lanV3.ArrayUtils", 10);
      assertEquals("C!;%6{!>2A*cPS}$u?4uorg.apache.commons+lanV3.ArrayUtilsC!;%6{!>2A*cPS}$u?4uorg.apache.commons+lanV3.ArrayUtilsC!;%6{!>2A*cPS}$u?4uorg.apache.commons+lanV3.ArrayUtilsC!;%6{!>2A*cPS}$u?4uorg.apache.commons+lanV3.ArrayUtilsC!;%6{!>2A*cPS}$u?4uorg.apache.commons+lanV3.ArrayUtilsC!;%6{!>2A*cPS}$u?4uorg.apache.commons+lanV3.ArrayUtilsC!;%6{!>2A*cPS}$u?4uorg.apache.commons+lanV3.ArrayUtilsC!;%6{!>2A*cPS}$u?4uorg.apache.commons+lanV3.ArrayUtilsC!;%6{!>2A*cPS}$u?4uorg.apache.commons+lanV3.ArrayUtilsC!;%6{!>2A*cPS}$u?4uorg.apache.commons+lanV3.ArrayUtils", string0);
      
      boolean boolean0 = StringUtils.endsWith((String) null, string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = StringUtils.repeat("{NbMuV!7WkPqGWnAH", 1);
      assertEquals("{NbMuV!7WkPqGWnAH", string0);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase((String) null, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = StringUtils.repeat("", 590);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase("", "N64\">");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = StringUtils.repeat(" character ", 1435);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWith(" character ", string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[1] = "ryEa*~n";
      StringUtils.endsWithAny("ryEa*~n", stringArray0);
      String string0 = StringUtils.repeat("ryEa*~n", 526);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringUtils.endsWithAny("org.apache.commons.lang3.CharUtils", (String[]) null);
      String string0 = StringUtils.repeat("", 155);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = StringUtils.repeat("R]TAh$bXt7sh+I\"", 1);
      assertEquals("R]TAh$bXt7sh+I\"", string0);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[0];
      boolean boolean0 = StringUtils.endsWithAny("R]TAh$bXt7sh+I\"", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String[] stringArray0 = new String[1];
      StringUtils.endsWithAny("C!;%6{!>2A*cPS}$u?4u", stringArray0);
      String string0 = StringUtils.repeat("", 256);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = StringUtils.repeat("", 195);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny("", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String[] stringArray0 = new String[2];
      StringUtils.endsWithAny("ryEa*~n", stringArray0);
      String string0 = StringUtils.repeat("ryEa*~n", 526);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String[] stringArray0 = new String[10];
      StringUtils.endsWithAny((String) null, stringArray0);
      String string0 = StringUtils.repeat("gB$F]e2c`Y|~s;p4", 590);
      assertNotNull(string0);
  }
}
