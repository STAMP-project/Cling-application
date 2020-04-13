/*

 * Tue Mar 03 16:46:27 GMT 2020
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
      StrMatcher.NoMatcher strMatcher_NoMatcher0 = new StrMatcher.NoMatcher();
      StrTokenizer strTokenizer0 = new StrTokenizer("add() is unsupported", strMatcher_NoMatcher0);
      StrTokenizer strTokenizer1 = strTokenizer0.setIgnoredChar('s');
      int int0 = strTokenizer1.size();
      assertFalse(strTokenizer1.isEmptyTokenAsNull());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher((char[]) null);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[1];
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance(charArray0);
      StrMatcher strMatcher0 = StrMatcher.trimMatcher();
      strTokenizer0.setQuoteMatcher(strMatcher0);
      String string0 = strTokenizer0.nextToken();
      assertEquals(1, strTokenizer0.nextIndex());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("g<diV");
      strTokenizer0.getTokenList();
      String string0 = strTokenizer0.toString();
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
      assertEquals("StrTokenizer[g<diV]", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("", (StrMatcher) null);
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("org.apache.commons.lang3.text.StrTokenizer", 'Z', 'o');
      strTokenizer0.nextToken();
      assertEquals(1, strTokenizer0.nextIndex());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      char[] charArray0 = new char[2];
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance(charArray0);
      strTokenizer0.setEmptyTokenAsNull(true);
      // Undeclared exception!
      try { 
        strTokenizer0.previous();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.StrTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("M0X");
      strTokenizer0.nextToken();
      assertEquals(1, strTokenizer0.nextIndex());
      
      String string0 = strTokenizer0.previous();
      assertEquals("M0X", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance("Dg D[>");
      List<String> list0 = strTokenizer0.getTokenList();
      assertTrue(list0.contains("Dg D[>"));
      assertEquals(1, list0.size());
      assertEquals(0, strTokenizer0.nextIndex());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer(" in an array of ", " in an array of ");
      StrTokenizer strTokenizer1 = strTokenizer0.setTrimmerMatcher((StrMatcher) null);
      assertFalse(strTokenizer1.isEmptyTokenAsNull());
      assertTrue(strTokenizer1.isIgnoreEmptyTokens());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("XJK-4m", 'D');
      strTokenizer0.next();
      assertEquals(1, strTokenizer0.nextIndex());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[2];
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher(charArray0);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("", "");
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("Array element ", "Array element ");
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
  public void test14()  throws Throwable  {
      char[] charArray0 = new char[13];
      charArray0[0] = 'h';
      StrTokenizer strTokenizer0 = new StrTokenizer(charArray0, 'h', '\u0000');
      StrTokenizer strTokenizer1 = strTokenizer0.setIgnoredChar('h');
      String string0 = strTokenizer1.previousToken();
      assertNull(string0);
  }
}
