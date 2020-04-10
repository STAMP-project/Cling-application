/*

 * Tue Mar 03 16:47:24 GMT 2020
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import java.util.NoSuchElementException;
import org.apache.commons.lang3.text.StrMatcher;
import org.apache.commons.lang3.text.StrTokenizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class StrTokenizer_ESTest extends StrTokenizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance("org.apache.commons.lang3.text.SrTokenizer");
      StrTokenizer strTokenizer1 = strTokenizer0.setIgnoredChar('g');
      boolean boolean0 = strTokenizer1.hasNext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher((char[]) null);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[2] = '<';
      StrTokenizer strTokenizer0 = new StrTokenizer(charArray0, 'P', '<');
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      strTokenizer0.setIgnoredMatcher(strMatcher_CharSetMatcher0);
      List<String> list0 = strTokenizer0.getTokenList();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance();
      boolean boolean0 = strTokenizer0.hasNext();
      assertTrue(boolean0);
      
      String string0 = strTokenizer0.toString();
      assertEquals("StrTokenizer[, Length: 0]", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("set() is unsupported", (StrMatcher) null);
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("", '[', '[');
      char[] charArray0 = new char[7];
      charArray0[0] = '[';
      charArray0[1] = '[';
      charArray0[3] = '[';
      charArray0[6] = '[';
      StrTokenizer strTokenizer1 = strTokenizer0.reset(charArray0);
      StrTokenizer strTokenizer2 = strTokenizer1.setDelimiterString("StrTokenizer[not tokenized yet]");
      strTokenizer2.previousToken();
      assertFalse(strTokenizer2.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance(", Length: 0");
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
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      StrTokenizer strTokenizer0 = new StrTokenizer("", strMatcher0, strMatcher0);
      StrTokenizer strTokenizer1 = strTokenizer0.setTrimmerMatcher((StrMatcher) null);
      assertTrue(strTokenizer1.isIgnoreEmptyTokens());
      assertFalse(strTokenizer1.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("-9o[|B,8`t8{r", 'a', 'a');
      strTokenizer0.next();
      assertEquals(1, strTokenizer0.nextIndex());
      
      String string0 = strTokenizer0.previous();
      assertEquals("-9o[|B,8`t8{r", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = '_';
      StrTokenizer strTokenizer0 = new StrTokenizer(charArray0, '_', '_');
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
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[4];
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher(charArray0);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance("");
      StrTokenizer strTokenizer1 = strTokenizer0.setDelimiterString("");
      assertEquals(0, strTokenizer1.nextIndex());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance(" \t\n\r\f");
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
}
