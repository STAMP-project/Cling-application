/*

 * Tue Mar 03 16:14:38 GMT 2020
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
      String string0 = StringUtils.repeat(";i.y&", 686);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny(string0, (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = StringUtils.repeat("{`P!U", 3813);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[1];
      stringArray0[0] = "0S?axtSdLF:#`2oam";
      boolean boolean0 = StringUtils.endsWithAny("0S?axtSdLF:#`2oam", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringUtils.endsWithIgnoreCase((String) null, "The character ");
      String string0 = StringUtils.repeat("", 111);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = StringUtils.repeat("i!cC&i!c&", "i!cC&i!c&", 2881);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase((String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      boolean boolean0 = StringUtils.endsWithIgnoreCase((String) null, "The character ");
      assertFalse(boolean0);
      
      String string0 = StringUtils.repeat("\u0006#EvvLw:/X:=g{N", 8);
      assertEquals("\u0006#EvvLw:/X:=g{N\u0006#EvvLw:/X:=g{N\u0006#EvvLw:/X:=g{N\u0006#EvvLw:/X:=g{N\u0006#EvvLw:/X:=g{N\u0006#EvvLw:/X:=g{N\u0006#EvvLw:/X:=g{N\u0006#EvvLw:/X:=g{N", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringUtils.repeat("Minimum abbreviation width with offset is 7", 1);
      String string0 = StringUtils.normalizeSpace((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = StringUtils.repeat("annotclone Cloneable type ", 1);
      assertNotNull(string0);
      assertEquals("annotclone Cloneable type ", string0);
      
      String string1 = StringUtils.normalizeSpace("Cannot get the toString of a null identity");
      assertEquals("Cannot get the toString of a null identity", string1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = StringUtils.substring(" is less than 0: ", 1, 1);
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringUtils.repeat("", "", 1693);
      String[] stringArray0 = new String[6];
      stringArray0[3] = "";
      boolean boolean0 = StringUtils.endsWithAny("java.text.Normalizer is not available", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = StringUtils.repeat(" is less than 0: ", 1);
      assertNotNull(string0);
      assertEquals(" is less than 0: ", string0);
      
      String[] stringArray0 = new String[1];
      stringArray0[0] = " is less than 0: ";
      boolean boolean0 = StringUtils.endsWithAny(" is less than 0: ", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = StringUtils.repeat(" is less than 0: ", 1);
      assertNotNull(string0);
      
      String string1 = StringUtils.removeEndIgnoreCase(" is less than 0: ", "Arguments cannot both be null");
      assertTrue(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = StringUtils.repeat("z],%79ODd^_$^k", 1);
      assertNotNull(string0);
      assertEquals("z],%79ODd^_$^k", string0);
      
      boolean boolean0 = StringUtils.endsWithAny("", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringUtils.normalizeSpace((String) null);
      String string0 = StringUtils.repeat("", 2);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringUtils.repeat("", 1452);
      String string0 = StringUtils.normalizeSpace("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringUtils.normalizeSpace((String) null);
      String string0 = StringUtils.repeat("z]X%79ODd^ms^k", 2);
      assertNotNull(string0);
      assertEquals("z]X%79ODd^ms^kz]X%79ODd^ms^k", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = StringUtils.repeat(" is less than 0: ", 973);
      String string1 = StringUtils.normalizeSpace(string0);
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringUtils.endsWithIgnoreCase((String) null, (String) null);
      String string0 = StringUtils.repeat("", 8192);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = StringUtils.repeat("Cannot clone Cloneable type ", 1);
      assertEquals("Cannot clone Cloneable type ", string0);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase((String) null, "kbNV# r3UnVUC|");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = StringUtils.repeat("", 90);
      assertNotNull(string0);
      
      String string1 = "\\u0";
      String[] stringArray0 = new String[1];
      stringArray0[0] = ")/wl";
      boolean boolean0 = StringUtils.endsWithAny(string1, stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = StringUtils.repeat(" is less than 0: ", " is less than 0: ", 128);
      String string1 = StringUtils.removeEndIgnoreCase(" is less than 0: ", string0);
      assertEquals(" is less than 0: ", string1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = StringUtils.repeat("", 8192);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny("Y;~ =]eha7v'n\"9G", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = StringUtils.repeat(" is less than 0: ", 1);
      assertEquals(" is less than 0: ", string0);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny("Arguments cannot both be null", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = StringUtils.repeat(" is less than 0: ", 1);
      assertEquals(" is less than 0: ", string0);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[1];
      boolean boolean0 = StringUtils.endsWithAny(" is less than 0: ", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = StringUtils.repeat("", 1452);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny("", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringUtils.repeat(" is less than 0: ", " is less than 0: ", 128);
      String[] stringArray0 = new String[12];
      boolean boolean0 = StringUtils.endsWithAny(" is less than 0: ", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = StringUtils.repeat(" is less than 0: ", 8);
      assertEquals(" is less than 0:  is less than 0:  is less than 0:  is less than 0:  is less than 0:  is less than 0:  is less than 0:  is less than 0: ", string0);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny("", (String[]) null);
      assertFalse(boolean0);
  }
}
