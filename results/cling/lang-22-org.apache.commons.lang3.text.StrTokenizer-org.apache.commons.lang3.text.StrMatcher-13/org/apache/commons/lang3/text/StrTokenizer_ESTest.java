/*

 * Tue Mar 03 16:46:03 GMT 2020
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
      StrMatcher strMatcher0 = StrMatcher.trimMatcher();
      StrTokenizer strTokenizer0 = new StrTokenizer("P c 'Hv.8l:JpoD", '-');
      StrTokenizer strTokenizer1 = strTokenizer0.setIgnoredMatcher(strMatcher0);
      // Undeclared exception!
      try { 
        strTokenizer1.previous();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.StrTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher((char[]) null);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance();
      assertEquals(0, strTokenizer0.nextIndex());
      
      strTokenizer0.previousToken();
      String string0 = strTokenizer0.toString();
      assertEquals("StrTokenizer[]", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      char[] charArray0 = new char[0];
      StrTokenizer strTokenizer0 = new StrTokenizer(charArray0, (StrMatcher) null);
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[1] = 's';
      charArray0[5] = 's';
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      StrTokenizer strTokenizer0 = new StrTokenizer(charArray0, strMatcher_CharSetMatcher0, strMatcher_CharSetMatcher0);
      StrTokenizer strTokenizer1 = strTokenizer0.setDelimiterString("");
      boolean boolean0 = strTokenizer1.hasNext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[10];
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      StrTokenizer strTokenizer0 = new StrTokenizer(charArray0, strMatcher_CharSetMatcher0, strMatcher_CharSetMatcher0);
      StrTokenizer strTokenizer1 = strTokenizer0.setDelimiterString("");
      boolean boolean0 = strTokenizer1.hasNext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      char[] charArray0 = new char[3];
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance(charArray0);
      StrTokenizer strTokenizer1 = strTokenizer0.setEmptyTokenAsNull(true);
      String string0 = strTokenizer1.previousToken();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance("', is neither of type Map.Entry nor an Array");
      List<String> list0 = strTokenizer0.getTokenList();
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance("PEU$VJX_I9Q}");
      StrTokenizer strTokenizer1 = strTokenizer0.setTrimmerMatcher((StrMatcher) null);
      assertEquals(0, strTokenizer1.nextIndex());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("Cannot store ");
      String string0 = strTokenizer0.next();
      assertEquals("Cannot", string0);
      
      boolean boolean0 = strTokenizer0.hasPrevious();
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
      assertTrue(boolean0);
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer(" \t\n\r\f");
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

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[4];
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher(charArray0);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[3];
      StrTokenizer strTokenizer0 = new StrTokenizer(charArray0, 't', '\u0000');
      StrTokenizer strTokenizer1 = strTokenizer0.setIgnoredChar('\u0000');
      boolean boolean0 = strTokenizer1.hasPrevious();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      char[] charArray0 = new char[3];
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance(charArray0);
      StrTokenizer strTokenizer1 = strTokenizer0.setDelimiterChar('\u0000');
      String string0 = strTokenizer1.previousToken();
      assertNull(string0);
  }
}
