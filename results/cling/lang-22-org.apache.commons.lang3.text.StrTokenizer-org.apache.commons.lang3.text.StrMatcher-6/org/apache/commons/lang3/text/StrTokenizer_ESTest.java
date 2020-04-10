/*

 * Tue Mar 03 16:44:36 GMT 2020
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
      char[] charArray0 = new char[6];
      charArray0[0] = 'O';
      charArray0[3] = 'O';
      StrTokenizer strTokenizer0 = new StrTokenizer(charArray0, '>', 'O');
      StrMatcher.TrimMatcher strMatcher_TrimMatcher0 = new StrMatcher.TrimMatcher();
      StrTokenizer strTokenizer1 = strTokenizer0.setIgnoredMatcher(strMatcher_TrimMatcher0);
      boolean boolean0 = strTokenizer1.hasPrevious();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher((char[]) null);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[1] = 'O';
      charArray0[3] = 'O';
      StrTokenizer strTokenizer0 = new StrTokenizer(charArray0, '>', '\u0000');
      strTokenizer0.previousToken();
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance(" \t\n\r\f");
      strTokenizer0.setEmptyTokenAsNull(true);
      boolean boolean0 = strTokenizer0.hasPrevious();
      assertTrue(strTokenizer0.isEmptyTokenAsNull());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance(" \t\n\r\f");
      boolean boolean0 = strTokenizer0.hasPrevious();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance("Index: ");
      String string0 = strTokenizer0.nextToken();
      assertNotNull(string0);
      assertEquals(1, strTokenizer0.nextIndex());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("", (StrMatcher) null);
      StrTokenizer strTokenizer1 = strTokenizer0.setTrimmerMatcher((StrMatcher) null);
      assertFalse(strTokenizer1.isEmptyTokenAsNull());
      assertTrue(strTokenizer1.isIgnoreEmptyTokens());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("iYmb]SM4}vac~{%F");
      strTokenizer0.next();
      boolean boolean0 = strTokenizer0.hasPrevious();
      assertEquals(1, strTokenizer0.nextIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("");
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
  public void test09()  throws Throwable  {
      char[] charArray0 = new char[3];
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher(charArray0);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("", "");
      strTokenizer0.getTokenList();
      String string0 = strTokenizer0.toString();
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
      assertEquals("StrTokenizer[]", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[6];
      StrTokenizer strTokenizer0 = new StrTokenizer(charArray0, '>', '\u0000');
      StrMatcher.TrimMatcher strMatcher_TrimMatcher0 = new StrMatcher.TrimMatcher();
      StrTokenizer strTokenizer1 = strTokenizer0.setIgnoredMatcher(strMatcher_TrimMatcher0);
      boolean boolean0 = strTokenizer1.hasPrevious();
      assertTrue(strTokenizer1.isIgnoreEmptyTokens());
      assertFalse(boolean0);
      assertFalse(strTokenizer1.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("<0=C1}4t<:\"Wblh", "<0=C1}4t<:\"Wblh");
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = new StrMatcher.StringMatcher("<0=C1}4t<:\"Wblh");
      strTokenizer0.setTrimmerMatcher(strMatcher_StringMatcher0);
      strTokenizer0.previousToken();
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
  }
}
