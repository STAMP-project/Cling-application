/*

 * Tue Mar 03 16:45:55 GMT 2020
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
import org.junit.Ignore;
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
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance("zT)@3*> RIyqn%~");
      StrTokenizer strTokenizer1 = strTokenizer0.setIgnoredChar('q');
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
  @Ignore
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[6];
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance(charArray0);
      strTokenizer0.size();
      String string0 = strTokenizer0.toString();
      assertEquals("StrTokenizer[null]", string0);
      assertEquals((-1), strTokenizer0.previousIndex());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("", (StrMatcher) null);
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[0] = '\"';
      charArray0[2] = '\"';
      charArray0[5] = '\"';
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance(charArray0);
      int int0 = strTokenizer0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[6];
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance(charArray0);
      StrMatcher.CharMatcher strMatcher_CharMatcher0 = new StrMatcher.CharMatcher('\u0000');
      strTokenizer0.setQuoteMatcher(strMatcher_CharMatcher0);
      boolean boolean0 = strTokenizer0.hasNext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      char[] charArray0 = new char[3];
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance(charArray0);
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
      
      strTokenizer0.setEmptyTokenAsNull(true);
      strTokenizer0.previousToken();
      assertTrue(strTokenizer0.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer();
      StrTokenizer strTokenizer1 = strTokenizer0.setTrimmerMatcher((StrMatcher) null);
      assertFalse(strTokenizer1.isEmptyTokenAsNull());
      assertTrue(strTokenizer1.isIgnoreEmptyTokens());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("f1j(sU", 'M');
      String string0 = strTokenizer0.next();
      assertEquals("f1j(sU", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance();
      strTokenizer0.next();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[3];
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher(charArray0);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("", "");
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[1];
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance(charArray0);
      strTokenizer0.nextToken();
      assertEquals(1, strTokenizer0.nextIndex());
      
      strTokenizer0.previousToken();
      assertEquals((-1), strTokenizer0.previousIndex());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = new StrMatcher.StringMatcher("f1j(sU");
      StrTokenizer strTokenizer0 = new StrTokenizer("f1j(sU", strMatcher_StringMatcher0);
      StrTokenizer strTokenizer1 = strTokenizer0.setIgnoredMatcher(strMatcher_StringMatcher0);
      boolean boolean0 = strTokenizer1.hasNext();
      assertFalse(boolean0);
  }
}
