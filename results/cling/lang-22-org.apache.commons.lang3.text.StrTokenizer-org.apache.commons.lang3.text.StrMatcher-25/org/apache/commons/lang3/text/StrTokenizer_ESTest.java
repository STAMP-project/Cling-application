/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 21:29:28 GMT 2019
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
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
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance();
      StrTokenizer strTokenizer1 = strTokenizer0.reset("C[cu_K+<4OLlk_))");
      strTokenizer1.setIgnoredChar('L');
      boolean boolean0 = strTokenizer1.hasNext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("}#g?\"kH", '{', 'r');
      char[] charArray0 = new char[7];
      charArray0[0] = 'r';
      charArray0[1] = 'r';
      charArray0[3] = 'r';
      StrTokenizer strTokenizer1 = strTokenizer0.reset(charArray0);
      strTokenizer1.next();
      assertEquals(1, strTokenizer1.nextIndex());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance("ejq< *tart");
      String string0 = strTokenizer0.previousToken();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher((char[]) null);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      char[] charArray0 = new char[2];
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher(charArray0);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance();
      strTokenizer0.reset("C[cu_K+<4OLlk_))");
      StrTokenizer strTokenizer1 = strTokenizer0.setDelimiterString("C[cu_K+<4OLlk_))");
      assertFalse(strTokenizer1.isEmptyTokenAsNull());
      
      strTokenizer1.setEmptyTokenAsNull(true);
      strTokenizer1.previousToken();
      assertTrue(strTokenizer0.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      char[] charArray0 = new char[0];
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance(charArray0);
      StrTokenizer strTokenizer1 = strTokenizer0.reset(" \t\n\r\f");
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
  public void test07()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("j");
      StrTokenizer strTokenizer1 = strTokenizer0.setIgnoredChar('j');
      StrTokenizer strTokenizer2 = strTokenizer1.setQuoteChar('j');
      List<String> list0 = strTokenizer2.getTokenList();
      assertFalse(strTokenizer2.isEmptyTokenAsNull());
      assertFalse(list0.contains("j"));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("end < start", (StrMatcher) null);
      StrTokenizer strTokenizer1 = strTokenizer0.setTrimmerMatcher((StrMatcher) null);
      assertTrue(strTokenizer1.isIgnoreEmptyTokens());
      assertFalse(strTokenizer1.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("", "");
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("org.pache.comQons.lang3.text.3trTokenizer");
      Consumer<String> consumer0 = (Consumer<String>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      strTokenizer0.forEachRemaining(consumer0);
      assertEquals(1, strTokenizer0.nextIndex());
      
      String string0 = strTokenizer0.previousToken();
      assertEquals("org.pache.comQons.lang3.text.3trTokenizer", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance();
      assertEquals(0, strTokenizer0.nextIndex());
      
      strTokenizer0.previousToken();
      String string0 = strTokenizer0.toString();
      assertEquals("StrTokenizer[]", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[2];
      StrTokenizer strTokenizer0 = new StrTokenizer(charArray0, (StrMatcher) null);
      strTokenizer0.setQuoteChar('\u0000');
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
