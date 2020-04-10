/*

 * Tue Mar 03 16:44:56 GMT 2020
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
      StrTokenizer strTokenizer0 = new StrTokenizer("GgN}@lg]^e_cbf");
      StrTokenizer strTokenizer1 = strTokenizer0.setIgnoredChar('f');
      boolean boolean0 = strTokenizer1.hasNext();
      assertFalse(strTokenizer1.isEmptyTokenAsNull());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher((char[]) null);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = '$';
      StrTokenizer strTokenizer0 = new StrTokenizer(charArray0, '\u0000', '$');
      strTokenizer0.setIgnoredChar('$');
      strTokenizer0.next();
      assertEquals(0, strTokenizer0.previousIndex());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer(" jM");
      boolean boolean0 = strTokenizer0.hasNext();
      assertTrue(boolean0);
      
      String string0 = strTokenizer0.toString();
      assertEquals("StrTokenizer[jM]", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = '$';
      charArray0[2] = '$';
      StrTokenizer strTokenizer0 = new StrTokenizer(charArray0, '\u0000', '$');
      String string0 = strTokenizer0.next();
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
      assertEquals("\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[5];
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance(charArray0);
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
      
      strTokenizer0.setEmptyTokenAsNull(true);
      String string0 = strTokenizer0.next();
      assertNull(string0);
      assertTrue(strTokenizer0.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("T");
      strTokenizer0.next();
      assertEquals(0, strTokenizer0.previousIndex());
      
      strTokenizer0.previousToken();
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance("Array element ");
      List<String> list0 = strTokenizer0.getTokenList();
      assertEquals((-1), strTokenizer0.previousIndex());
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("eA(r>G5\"u\"4L", (StrMatcher) null);
      StrTokenizer strTokenizer1 = strTokenizer0.setTrimmerMatcher((StrMatcher) null);
      assertTrue(strTokenizer1.isIgnoreEmptyTokens());
      assertFalse(strTokenizer1.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance((String) null);
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
      StrTokenizer strTokenizer0 = new StrTokenizer("org.apache.commons.lang3.text.StrTokenizer", 'T');
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("org.apache.commons.lang3.text.StrTokenizer");
      strTokenizer0.setQuoteMatcher(strMatcher0);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      strTokenizer0.forEachRemaining(consumer0);
      assertEquals(1, strTokenizer0.nextIndex());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[3];
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
      char[] charArray0 = new char[5];
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance(charArray0);
      String string0 = strTokenizer0.previousToken();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      char[] charArray0 = new char[2];
      StrMatcher.TrimMatcher strMatcher_TrimMatcher0 = new StrMatcher.TrimMatcher();
      StrTokenizer strTokenizer0 = new StrTokenizer(charArray0, strMatcher_TrimMatcher0);
      StrTokenizer strTokenizer1 = strTokenizer0.setTrimmerMatcher(strMatcher_TrimMatcher0);
      String string0 = strTokenizer1.nextToken();
      assertNull(string0);
      assertEquals((-1), strTokenizer0.previousIndex());
  }
}
