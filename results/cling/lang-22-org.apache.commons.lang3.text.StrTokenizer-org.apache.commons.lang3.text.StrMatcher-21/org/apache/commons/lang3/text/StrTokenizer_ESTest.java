/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 21:27:31 GMT 2019
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance("Z@5.}");
      strTokenizer0.setQuoteChar('V');
      char[] charArray0 = new char[7];
      charArray0[0] = 'V';
      charArray0[2] = 'V';
      charArray0[5] = 'V';
      // Undeclared exception!
      try { 
        strTokenizer0.tokenize(charArray0, 0, '}');
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.commons.lang3.text.StrTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      char[] charArray0 = new char[13];
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher(charArray0);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher((char[]) null);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance("Index: ");
      StrMatcher strMatcher0 = StrMatcher.splitMatcher();
      strTokenizer0.setDelimiterMatcher(strMatcher0);
      strTokenizer0.setEmptyTokenAsNull(true);
      String string0 = strTokenizer0.previousToken();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = new StrMatcher.StringMatcher("org.apache.commons.lang3.text.StrTokenizer");
      StrTokenizer strTokenizer0 = new StrTokenizer("org.apache.commons.lang3.text.StrTokenizer", strMatcher_StringMatcher0, strMatcher_StringMatcher0);
      strTokenizer0.setTrimmerMatcher(strMatcher_StringMatcher0);
      strTokenizer0.previousToken();
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer((char[]) null, (StrMatcher) null, (StrMatcher) null);
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = new StrMatcher.StringMatcher("org.apache.commons.lang3.text.StrToenizer");
      StrTokenizer strTokenizer0 = new StrTokenizer("org.apache.commons.lang3.text.StrToenizer", strMatcher_StringMatcher0, strMatcher_StringMatcher0);
      strTokenizer0.setDelimiterChar(':');
      strTokenizer0.setTrimmerMatcher(strMatcher_StringMatcher0);
      strTokenizer0.previousToken();
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer();
      boolean boolean0 = strTokenizer0.hasPrevious();
      assertFalse(boolean0);
      
      String string0 = strTokenizer0.toString();
      assertEquals("StrTokenizer[]", string0);
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = 'p';
      charArray0[2] = 'p';
      StrTokenizer strTokenizer0 = new StrTokenizer(charArray0, 'T', 'p');
      strTokenizer0.nextToken();
      assertEquals(0, strTokenizer0.previousIndex());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance("Z@5.}");
      StrTokenizer strTokenizer1 = strTokenizer0.setTrimmerMatcher((StrMatcher) null);
      assertEquals((-1), strTokenizer1.previousIndex());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[1];
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance("Index: ");
      StrTokenizer strTokenizer1 = strTokenizer0.reset(charArray0);
      String string0 = strTokenizer1.previousToken();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("<}z=H,BM%k,cgOK<");
      StrMatcher strMatcher0 = StrMatcher.commaMatcher();
      StrTokenizer strTokenizer1 = strTokenizer0.setIgnoredMatcher(strMatcher0);
      strTokenizer1.next();
      assertEquals(1, strTokenizer1.nextIndex());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[1];
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance(charArray0);
      StrTokenizer strTokenizer1 = strTokenizer0.setDelimiterString("");
      assertEquals((-1), strTokenizer1.previousIndex());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("9w");
      strTokenizer0.next();
      boolean boolean0 = strTokenizer0.hasPrevious();
      assertEquals(0, strTokenizer0.previousIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance();
      // Undeclared exception!
      try { 
        strTokenizer0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.StrTokenizer", e);
      }
  }
}
