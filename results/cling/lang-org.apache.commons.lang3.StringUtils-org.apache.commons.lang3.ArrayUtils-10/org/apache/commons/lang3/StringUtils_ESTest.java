/*

 * Tue Mar 03 16:13:57 GMT 2020
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.StringUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class StringUtils_ESTest extends StringUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      boolean boolean0 = StringUtils.endsWith((String) null, "BGDA(|");
      assertFalse(boolean0);
      
      String string0 = StringUtils.repeat("BGDA(|", 1);
      assertNotNull(string0);
      assertEquals("BGDA(|", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = StringUtils.endsWithAny("tUi50?S)l ", (String[]) null);
      assertFalse(boolean0);
      
      String string0 = StringUtils.repeat("tUi50?S)l ", 10);
      assertNotNull(string0);
      assertEquals("tUi50?S)l tUi50?S)l tUi50?S)l tUi50?S)l tUi50?S)l tUi50?S)l tUi50?S)l tUi50?S)l tUi50?S)l tUi50?S)l ", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = StringUtils.repeat("nnot bot", 41);
      assertEquals("nnot botnnot botnnot botnnot botnnot botnnot botnnot botnnot botnnot botnnot botnnot botnnot botnnot botnnot botnnot botnnot botnnot botnnot botnnot botnnot botnnot botnnot botnnot botnnot botnnot botnnot botnnot botnnot botnnot botnnot botnnot botnnot botnnot botnnot botnnot botnnot botnnot botnnot botnnot botnnot botnnot bot", string0);
      
      String[] stringArray0 = StringUtils.split("oE7Qm[@cq$XT!3`]", 'z');
      boolean boolean0 = StringUtils.endsWithAny("oE7Qm[@cq$XT!3`]", stringArray0);
      assertTrue(boolean0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = StringUtils.repeat("9zt$u~nnzxug", (String) null, 4145);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[4];
      boolean boolean0 = StringUtils.endsWith(stringArray0[2], stringArray0[2]);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = "\\u0";
      boolean boolean0 = StringUtils.endsWith((String) null, string0);
      assertFalse(boolean0);
      
      String string1 = StringUtils.repeat(string0, 33);
      assertNotNull(string1);
      assertEquals("\\u0\\u0\\u0\\u0\\u0\\u0\\u0\\u0\\u0\\u0\\u0\\u0\\u0\\u0\\u0\\u0\\u0\\u0\\u0\\u0\\u0\\u0\\u0\\u0\\u0\\u0\\u0\\u0\\u0\\u0\\u0\\u0\\u0", string1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = StringUtils.repeat(" is not in the range '0' - '9'", 1);
      assertEquals(" is not in the range '0' - '9'", string0);
      assertNotNull(string0);
      
      String string1 = StringUtils.normalizeSpace("\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000B\f\r\u000E\u000F\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001A\u001B\u001C\u001D\u001E\u001F !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[]^_`abcdefghijklmnopqrstuvwxyz{|}~");
      assertEquals("!\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[]^_`abcdefghijklmnopqrstuvwxyz{|}~", string1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = StringUtils.substring("/LdAA9(BYDtUcj", 0, 0);
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = StringUtils.repeat("", (String) null, 4145);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[8];
      stringArray0[3] = "";
      boolean boolean0 = StringUtils.endsWithAny("sun.text.Normalizer is not available", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = StringUtils.repeat("java.text.Normalizer is not available", 1);
      assertEquals("java.text.Normalizer is not available", string0);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[8];
      stringArray0[0] = "', has a length less than 2";
      boolean boolean0 = StringUtils.endsWithAny("Cannot store ", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = StringUtils.repeat("BGDA|", 1);
      assertEquals("BGDA|", string0);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[2];
      stringArray0[0] = "BGDA|";
      boolean boolean0 = StringUtils.endsWithAny("BGDA|", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = StringUtils.repeat("Cannot store ", 1);
      assertEquals("Cannot store ", string0);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[2];
      boolean boolean0 = StringUtils.endsWithAny((String) null, stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringUtils.repeat("", (String) null, 4145);
      String string0 = StringUtils.normalizeSpace((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = StringUtils.repeat("", Integer.MAX_VALUE);
      assertNotNull(string0);
      
      String string1 = StringUtils.normalizeSpace("BGDA(|");
      assertEquals("BGDA(|", string1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringUtils.repeat("elA'|i", 4);
      String string0 = StringUtils.normalizeSpace((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = StringUtils.repeat("BGDA|", 4);
      assertNotNull(string0);
      assertEquals("BGDA|BGDA|BGDA|BGDA|", string0);
      
      String string1 = StringUtils.normalizeSpace("BGDA|");
      assertNotNull(string1);
      assertEquals("BGDA|", string1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[3];
      StringUtils.endsWith(stringArray0[2], stringArray0[1]);
      String string0 = StringUtils.repeat("", (String) null, 4145);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[3];
      boolean boolean0 = StringUtils.endsWith(stringArray0[2], stringArray0[1]);
      assertTrue(boolean0);
      
      String string0 = StringUtils.repeat("\u0006\u0007\b\t\n\u000B\f\r\u000E\u000F\u0010\u0011\u0012\u0013", 1);
      assertEquals("\u0006\u0007\b\t\n\u000B\f\r\u000E\u000F\u0010\u0011\u0012\u0013", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = StringUtils.repeat("", 256);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWith("", "*'>s jJ7\"/U");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = StringUtils.repeat("", (String) null, 4145);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[8];
      stringArray0[0] = "9zt$u~nnzxug";
      boolean boolean0 = StringUtils.endsWithAny("sun.text.Normalizer is not available", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = StringUtils.repeat("BGDA|", 256);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase("BGDA|", string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringUtils.endsWithAny("The haracter m9st not be null", (String[]) null);
      String string0 = StringUtils.repeat("", 1962);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      boolean boolean0 = StringUtils.endsWithAny("S{A[GTHyutO\"k`", (String[]) null);
      assertFalse(boolean0);
      
      String string0 = StringUtils.repeat("S{A[GTHyutO\"k`", 1);
      assertEquals("S{A[GTHyutO\"k`", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = StringUtils.repeat("", "", 4145);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny("", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String[] stringArray0 = new String[2];
      StringUtils.endsWithAny("The haracter m9st not be null", stringArray0);
      String string0 = StringUtils.repeat(" in an array of ", 3339);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = StringUtils.repeat("9zt$u~nnzxug", (String) null, 4145);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[4];
      boolean boolean0 = StringUtils.endsWithAny((String) null, stringArray0);
      assertFalse(boolean0);
  }
}
