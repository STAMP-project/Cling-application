/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 21:30:13 GMT 2019
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.text.StrMatcher;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class StrMatcher_ESTest extends StrMatcher_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      char[] charArray0 = new char[2];
      StrMatcher.TrimMatcher strMatcher_TrimMatcher0 = new StrMatcher.TrimMatcher();
      int int0 = strMatcher_TrimMatcher0.isMatch(charArray0, 1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[5] = 'U';
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = new StrMatcher.StringMatcher("UZGe?");
      int int0 = strMatcher_StringMatcher0.isMatch(charArray0, 5, (-2435), 4953);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[8];
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = new StrMatcher.StringMatcher("");
      int int0 = strMatcher_StringMatcher0.isMatch(charArray0, 0, 0, 1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      char[] charArray0 = new char[2];
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = new StrMatcher.StringMatcher("GRi(j55FNw{;w&Mr2");
      int int0 = strMatcher_StringMatcher0.isMatch(charArray0, 10, 1, 1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StrMatcher.CharMatcher strMatcher_CharMatcher0 = new StrMatcher.CharMatcher('o');
      char[] charArray0 = new char[2];
      charArray0[0] = 'o';
      int int0 = strMatcher_CharMatcher0.isMatch(charArray0, 0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[6];
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher(charArray0);
      int int0 = strMatcher0.isMatch(charArray0, 2);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      char[] charArray0 = new char[6];
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("cdw0xJ\"v");
      int int0 = strMatcher0.isMatch(charArray0, 1, 32, 32);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.stringMatcher("R_0FQO+ioyV<?Mb)");
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.stringMatcher("");
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.stringMatcher((String) null);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("i");
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("");
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher((String) null);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      char[] charArray0 = new char[1];
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher(charArray0);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      char[] charArray0 = new char[0];
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher(charArray0);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher((char[]) null);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StrMatcher.CharMatcher strMatcher_CharMatcher0 = new StrMatcher.CharMatcher('o');
      char[] charArray0 = new char[2];
      int int0 = strMatcher_CharMatcher0.isMatch(charArray0, 1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.doubleQuoteMatcher();
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.spaceMatcher();
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.noneMatcher();
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.singleQuoteMatcher();
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.splitMatcher();
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.quoteMatcher();
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.tabMatcher();
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.commaMatcher();
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.trimMatcher();
      char[] charArray0 = new char[8];
      charArray0[0] = 'q';
      int int0 = strMatcher0.isMatch(charArray0, 0, 0, (-1144));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StrMatcher.NoMatcher strMatcher_NoMatcher0 = new StrMatcher.NoMatcher();
      char[] charArray0 = new char[2];
      int int0 = strMatcher_NoMatcher0.isMatch(charArray0, (-2354), (-1), (-2354));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charMatcher('p');
      assertNotNull(strMatcher0);
  }
}
