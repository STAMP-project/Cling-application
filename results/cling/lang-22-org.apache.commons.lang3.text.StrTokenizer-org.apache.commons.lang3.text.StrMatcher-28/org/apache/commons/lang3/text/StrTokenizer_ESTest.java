/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 21:30:30 GMT 2019
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import java.util.NoSuchElementException;
import org.apache.commons.lang3.text.StrMatcher;
import org.apache.commons.lang3.text.StrTokenizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class StrTokenizer_ESTest extends StrTokenizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance(", Length: ");
      StrMatcher.TrimMatcher strMatcher_TrimMatcher0 = new StrMatcher.TrimMatcher();
      strTokenizer0.setIgnoredMatcher(strMatcher_TrimMatcher0);
      List<String> list0 = strTokenizer0.getTokenList();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance();
      char[] charArray0 = new char[8];
      charArray0[0] = '2';
      charArray0[1] = '2';
      charArray0[3] = '2';
      strTokenizer0.reset(charArray0);
      strTokenizer0.setQuoteChar('2');
      String string0 = strTokenizer0.previousToken();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher((char[]) null);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("kmWd}iU", 'Y', 'Y');
      StrTokenizer strTokenizer1 = strTokenizer0.setEmptyTokenAsNull(true);
      strTokenizer1.setIgnoreEmptyTokens(false);
      StrTokenizer strTokenizer2 = strTokenizer1.setDelimiterString("kmWd}iU");
      strTokenizer2.next();
      assertEquals(1, strTokenizer2.nextIndex());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      char[] charArray0 = new char[8];
      StrTokenizer strTokenizer0 = new StrTokenizer(charArray0, '\u0000');
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher(charArray0);
      strTokenizer0.setIgnoredMatcher(strMatcher0);
      List<String> list0 = strTokenizer0.getTokenList();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("d8.", (StrMatcher) null, (StrMatcher) null);
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.doubleQuoteMatcher();
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance("\"n^~oNj[h)");
      StrTokenizer strTokenizer1 = strTokenizer0.setTrimmerMatcher(strMatcher0);
      String[] stringArray0 = strTokenizer1.getTokenArray();
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = 'C';
      StrTokenizer strTokenizer0 = new StrTokenizer(charArray0, 'C');
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher(charArray0);
      StrTokenizer strTokenizer1 = strTokenizer0.setQuoteMatcher(strMatcher0);
      List<String> list0 = strTokenizer1.getTokenList();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer();
      StrTokenizer strTokenizer1 = strTokenizer0.setTrimmerMatcher((StrMatcher) null);
      assertFalse(strTokenizer1.isEmptyTokenAsNull());
      assertTrue(strTokenizer1.isIgnoreEmptyTokens());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      char[] charArray0 = new char[6];
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance(charArray0);
      String string0 = strTokenizer0.nextToken();
      assertNotNull(string0);
      assertEquals(0, strTokenizer0.previousIndex());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("kmWd}iU", 'Y', 'Y');
      StrTokenizer strTokenizer1 = strTokenizer0.setDelimiterString("kmWd}iU");
      // Undeclared exception!
      try { 
        strTokenizer1.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.StrTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("", "");
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("kmWd}iU", 'Y', 'Y');
      strTokenizer0.previousToken();
      String string0 = strTokenizer0.toString();
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
      assertEquals("StrTokenizer[kmWd}iU]", string0);
  }
}
