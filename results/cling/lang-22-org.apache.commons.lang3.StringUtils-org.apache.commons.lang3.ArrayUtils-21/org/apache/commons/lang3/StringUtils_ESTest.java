/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 19:54:33 GMT 2019
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
      String string0 = StringUtils.substring("9.BJ-l*4x^h*LQevo", 0, 0);
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringUtils.normalizeSpace((String) null);
      String string0 = StringUtils.repeat("org.apache.commons.lang3.exception.CloneFailedException", "^_K^O[jh", 1);
      assertEquals("org.apache.commons.lang3.exception.CloneFailedException", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = StringUtils.repeat("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", 1);
      assertEquals("org.apache.commons.lang3.ArrayUtils", string0);
      assertNotNull(string0);
      
      String string1 = StringUtils.normalizeSpace("lyup{_v)`3zE");
      assertEquals("lyup{_v)`3zE", string1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringUtils.repeat("e6/F", "e6/F", 1);
      boolean boolean0 = StringUtils.endsWithIgnoreCase("e6/F", "java.text.Normalizer is not available");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = StringUtils.repeat("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", 1);
      assertEquals("org.apache.commons.lang3.ArrayUtils", string0);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny("org.apache.commons.lang3.ArrayUtils", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = "\\u=00";
      String string1 = StringUtils.repeat(string0, "hara", 1);
      assertEquals("\\u=00", string1);
      assertNotNull(string1);
      
      boolean boolean0 = StringUtils.endsWithAny((String) null, (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = "\\u=00";
      String string1 = StringUtils.repeat(string0, "hara", 1);
      assertEquals("\\u=00", string1);
      assertNotNull(string1);
      
      boolean boolean0 = StringUtils.endsWith((String) null, "hara");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[4];
      String string0 = "\\u00";
      boolean boolean0 = StringUtils.endsWithAny(string0, stringArray0);
      assertFalse(boolean0);
      
      String string1 = StringUtils.repeat(string0, "hara", 1);
      assertEquals("\\u00", string1);
      assertNotNull(string1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = StringUtils.repeat("", "", 32);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[1];
      boolean boolean0 = StringUtils.endsWithAny(" n", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringUtils.normalizeSpace((String) null);
      String string0 = StringUtils.repeat("", 16);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = StringUtils.repeat("", "", 62);
      assertNotNull(string0);
      
      String string1 = StringUtils.normalizeSpace("7W(I5zN\"?-/~4RF@");
      assertEquals("7W(I5zN\"?-/~4RF@", string1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringUtils.normalizeSpace((String) null);
      String string0 = StringUtils.repeat("e^*4ywpqurH?rFYT*>|mR2", "", 2757);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = StringUtils.normalizeSpace("Search and Replace array lengths don't mat#Kz!");
      assertEquals("Search and Replace array lengths don't mat#Kz!", string0);
      assertNotNull(string0);
      
      String string1 = StringUtils.repeat("Search and Replace array lengths don't mat#Kz!", "", 1453);
      assertNotNull(string1);
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = StringUtils.repeat("", (String) null, 308);
      assertNotNull(string0);
      
      String string1 = StringUtils.removeEndIgnoreCase(" #u -", "_rY8ie");
      assertEquals(" #u -", string1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = "\\u00";
      String string1 = StringUtils.repeat(string0, "hara", 10);
      assertEquals("\\u00hara\\u00hara\\u00hara\\u00hara\\u00hara\\u00hara\\u00hara\\u00hara\\u00hara\\u00", string1);
      assertNotNull(string1);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase(string0, string1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = StringUtils.repeat("", "", 32);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny("g}zg", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = StringUtils.repeat("b|]U)_Q~gm6GD", "b|]U)_Q~gm6GD", 32);
      assertEquals("b|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GDb|]U)_Q~gm6GD", string0);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny("b|]U)_Q~gm6GD", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringUtils.endsWith((String) null, (String) null);
      String string0 = StringUtils.repeat("", "", 153);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = StringUtils.repeat("\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000B)\r\u000E\u000F\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001A\u001B\u001C\u001D\u001E\u001F !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMOPQRSTUVWXYZ[]^_`abcdefghijklmnopqrstuvwxyz{|}~", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000B)\r\u000E\u000F\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001A\u001B\u001C\u001D\u001E\u001F !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMOPQRSTUVWXYZ[]^_`abcdefghijklmnopqrstuvwxyz{|}~", 36);
      boolean boolean0 = StringUtils.endsWith((String) null, string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = StringUtils.repeat("", "", 62);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny("", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[2];
      boolean boolean0 = StringUtils.endsWithAny(stringArray0[0], stringArray0);
      assertFalse(boolean0);
      
      String string0 = StringUtils.repeat("'O)UAa+B", "'O)UAa+B", 48);
      assertNotNull(string0);
      assertEquals("'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B'O)UAa+B", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = StringUtils.repeat("", "", 1471);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase((String) null, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      boolean boolean0 = StringUtils.endsWith((String) null, (String) null);
      assertTrue(boolean0);
      
      String string0 = StringUtils.repeat("...", "mnopqrstuvwxyz{|}~", 26);
      assertNotNull(string0);
      assertEquals("...mnopqrstuvwxyz{|}~...mnopqrstuvwxyz{|}~...mnopqrstuvwxyz{|}~...mnopqrstuvwxyz{|}~...mnopqrstuvwxyz{|}~...mnopqrstuvwxyz{|}~...mnopqrstuvwxyz{|}~...mnopqrstuvwxyz{|}~...mnopqrstuvwxyz{|}~...mnopqrstuvwxyz{|}~...mnopqrstuvwxyz{|}~...mnopqrstuvwxyz{|}~...mnopqrstuvwxyz{|}~...mnopqrstuvwxyz{|}~...mnopqrstuvwxyz{|}~...mnopqrstuvwxyz{|}~...mnopqrstuvwxyz{|}~...mnopqrstuvwxyz{|}~...mnopqrstuvwxyz{|}~...mnopqrstuvwxyz{|}~...mnopqrstuvwxyz{|}~...mnopqrstuvwxyz{|}~...mnopqrstuvwxyz{|}~...mnopqrstuvwxyz{|}~...mnopqrstuvwxyz{|}~...", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = StringUtils.repeat("Minimum abbreiationwidth wthoffset is 7", "Minimum abbreiationwidth wthoffset is 7", 32);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[1];
      boolean boolean0 = StringUtils.endsWithAny(" n", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = StringUtils.repeat("org.apache.commons.lang3.ArrayUtils", "org.apache.commons.lang3.ArrayUtils", 1);
      assertEquals("org.apache.commons.lang3.ArrayUtils", string0);
      
      String[] stringArray0 = new String[3];
      stringArray0[0] = "org.apache.commons.lang3.ArrayUtils";
      boolean boolean0 = StringUtils.endsWithAny("org.apache.commons.lang3.ArrayUtils", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[1] = "4y4";
      StringUtils.endsWithAny("4y4", stringArray0);
      String string0 = StringUtils.repeat("", 16);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringUtils.repeat("Minimum abbreviation width with offset is 7", "Minimum abbreviation width with offset is 7", 32);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Minimum abbreviation width with offset is 7";
      boolean boolean0 = StringUtils.endsWithAny("Minimum abbreviation width with offset is 7", stringArray0);
      assertTrue(boolean0);
  }
}
