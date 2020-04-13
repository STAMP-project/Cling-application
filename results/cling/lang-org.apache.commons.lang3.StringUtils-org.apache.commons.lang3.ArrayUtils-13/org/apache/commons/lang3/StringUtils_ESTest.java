/*

 * Tue Mar 03 16:16:47 GMT 2020
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
      String string0 = StringUtils.repeat("*", "*", 256);
      assertEquals("*******************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************", string0);
      
      boolean boolean0 = StringUtils.endsWithAny("*", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringUtils.repeat("(H1|h ;", "(H1|h ;", 255);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "(H1|h ;";
      boolean boolean0 = StringUtils.endsWithAny("(H1|h ;", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = StringUtils.substring("', is neither of type Map.Entry nor an Array", 7, 7);
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = StringUtils.repeat("", "", 256);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase((String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = StringUtils.repeat("5_O7", "5_O7", 240);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase((String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      boolean boolean0 = StringUtils.endsWithIgnoreCase((String) null, " k'.pgjj2]|:ZA>;");
      assertFalse(boolean0);
      
      String string0 = StringUtils.repeat("pfhT>B/", 14);
      assertEquals("pfhT>B/pfhT>B/pfhT>B/pfhT>B/pfhT>B/pfhT>B/pfhT>B/pfhT>B/pfhT>B/pfhT>B/pfhT>B/pfhT>B/pfhT>B/pfhT>B/", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = StringUtils.repeat("largumeu\"2lq#ptio", "largumeu\"2lq#ptio", 1);
      assertNotNull(string0);
      assertEquals("largumeu\"2lq#ptio", string0);
      
      String string1 = StringUtils.normalizeSpace("``aFg1<");
      assertEquals("``aFg1<", string1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringUtils.repeat("", "", 236);
      String[] stringArray0 = new String[2];
      stringArray0[1] = "";
      boolean boolean0 = StringUtils.endsWithAny(".RAXvyg{+_O`", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = StringUtils.repeat("-'OI1t<RT[", "1Zs6~&2E`:zEJBQTv$", 1);
      assertNotNull(string0);
      assertEquals("-'OI1t<RT[", string0);
      
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-'OI1t<RT[";
      boolean boolean0 = StringUtils.endsWithAny("-'OI1t<RT[", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = StringUtils.repeat("", "index:bindex:bindex:bindex:bzz:vcme8i*ndex:bindex:bindex:bindex:b", 1);
      assertEquals("", string0);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWith("QPBm#", "spUd2P}%W32V_6};&7U");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = StringUtils.repeat("s$%I;A2t\"4", "s$%I;A2t\"4", 1);
      assertNotNull(string0);
      assertEquals("s$%I;A2t\"4", string0);
      
      String[] stringArray0 = new String[1];
      boolean boolean0 = StringUtils.endsWithAny((String) null, stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringUtils.repeat("", "", 256);
      String string0 = StringUtils.normalizeSpace((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = StringUtils.repeat("", "", 236);
      String string1 = StringUtils.normalizeSpace("");
      assertTrue(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringUtils.repeat("Q", "Q", 236);
      String string0 = StringUtils.normalizeSpace((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = StringUtils.repeat("largumeu\"2lq#ptio", "largumeu\"2lq#ptio", 13);
      assertNotNull(string0);
      assertEquals("largumeu\"2lq#ptiolargumeu\"2lq#ptiolargumeu\"2lq#ptiolargumeu\"2lq#ptiolargumeu\"2lq#ptiolargumeu\"2lq#ptiolargumeu\"2lq#ptiolargumeu\"2lq#ptiolargumeu\"2lq#ptiolargumeu\"2lq#ptiolargumeu\"2lq#ptiolargumeu\"2lq#ptiolargumeu\"2lq#ptiolargumeu\"2lq#ptiolargumeu\"2lq#ptiolargumeu\"2lq#ptiolargumeu\"2lq#ptiolargumeu\"2lq#ptiolargumeu\"2lq#ptiolargumeu\"2lq#ptiolargumeu\"2lq#ptiolargumeu\"2lq#ptiolargumeu\"2lq#ptiolargumeu\"2lq#ptiolargumeu\"2lq#ptio", string0);
      
      String string1 = StringUtils.normalizeSpace("``ag41<");
      assertEquals("``ag41<", string1);
      assertNotNull(string1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = StringUtils.repeat("", "", 256);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase((String) null, "2DSko}u!-lCTYMxlI");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = StringUtils.repeat("", "", 236);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase("$", "Exception cloning Cloneable type p+T9D&sS");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = StringUtils.repeat("", "", 256);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[2];
      stringArray0[0] = "NFD";
      boolean boolean0 = StringUtils.endsWithAny("\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000B\f\r\u000E\u000F\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001A\u001B\u001C\u001D\u001E\u001F !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[]^_`abcdefghijklmnopqrstuvwxyz{|}~", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = StringUtils.repeat(";wnOL[0KQ_[l", "org.apache.commons.lang3.ArrayUtils", 1547);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase("K-`", string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = StringUtils.repeat("NFD", "", 48);
      assertEquals("NFDNFDNFDNFDNFDNFDNFDNFDNFDNFDNFDNFDNFDNFDNFDNFDNFDNFDNFDNFDNFDNFDNFDNFDNFDNFDNFDNFDNFDNFDNFDNFDNFDNFDNFDNFDNFDNFDNFDNFDNFDNFDNFDNFDNFDNFDNFDNFD", string0);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[2];
      stringArray0[0] = "NFD";
      boolean boolean0 = StringUtils.endsWithAny("\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000B\f\r\u000E\u000F\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001A\u001B\u001C\u001D\u001E\u001F !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[]^_`abcdefghijklmnopqrstuvwxyz{|}~", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = StringUtils.repeat("", "", 2854);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny("3F@8o7v", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = StringUtils.repeat("largumeu\"2lq#ptio", "largumeu\"2lq#ptio", 1);
      assertEquals("largumeu\"2lq#ptio", string0);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny("]7ok}1(Z", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = StringUtils.repeat("-'OI1t<RT[", "-'OI1t<RT[", 1);
      assertEquals("-'OI1t<RT[", string0);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[1];
      boolean boolean0 = StringUtils.endsWithAny("-'OI1t<RT[", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = StringUtils.repeat("", "", 256);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny("", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = StringUtils.repeat("Q", "Q", 236);
      assertNotNull(string0);
      assertEquals("QQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQ", string0);
      
      String[] stringArray0 = new String[2];
      boolean boolean0 = StringUtils.endsWithAny((String) null, stringArray0);
      assertFalse(boolean0);
  }
}
