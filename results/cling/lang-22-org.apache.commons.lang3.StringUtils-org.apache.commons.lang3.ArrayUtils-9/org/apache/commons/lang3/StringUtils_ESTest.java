/*

 * Tue Mar 03 16:13:52 GMT 2020
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
      String string0 = StringUtils.repeat("]4t)Dyb>>d5b", 74);
      assertEquals("]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b]4t)Dyb>>d5b", string0);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[0];
      boolean boolean0 = StringUtils.endsWithAny("]4t)Dyb>>d5b", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = StringUtils.repeat("", 5);
      assertNotNull(string0);
      
      String string1 = "\\u0";
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      boolean boolean0 = StringUtils.endsWithAny(string1, stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringUtils.endsWith((String) null, (String) null);
      String string0 = StringUtils.repeat("twZq`X6wiT*,)?Uc)4", 1997);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      boolean boolean0 = StringUtils.endsWith((String) null, " in an array of ");
      assertFalse(boolean0);
      
      String string0 = StringUtils.repeat(" in an array of ", 13);
      assertNotNull(string0);
      assertEquals(" in an array of  in an array of  in an array of  in an array of  in an array of  in an array of  in an array of  in an array of  in an array of  in an array of  in an array of  in an array of  in an array of ", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringUtils.normalizeSpace((String) null);
      String string0 = StringUtils.repeat("hQsI&-c.hId-9YCcJ{%", 1);
      assertNotNull(string0);
      assertEquals("hQsI&-c.hId-9YCcJ{%", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = StringUtils.repeat("", 1);
      String string1 = StringUtils.normalizeSpace("");
      assertTrue(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = StringUtils.repeat("", 32);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWith("", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = StringUtils.substring(">=C5e", 1, 1);
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = StringUtils.repeat(" in an array of ", 97);
      String[] stringArray0 = new String[1];
      stringArray0[0] = string0;
      boolean boolean0 = StringUtils.endsWithAny(string0, stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = StringUtils.repeat("lM%", 1);
      assertEquals("lM%", string0);
      
      String[] stringArray0 = StringUtils.splitByCharacterTypeCamelCase("lM%");
      boolean boolean0 = StringUtils.endsWithAny("lM%", stringArray0);
      assertEquals(3, stringArray0.length);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = StringUtils.repeat("lM%", 1);
      assertEquals("lM%", string0);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWith("tPiSaT`", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000B\f\r\u000E\u000F\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001A\u001B\u001C\u001D\u001E\u001F !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[]^_`abcdefghijklmnopqrstuvwxyz{|}~");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[1] = "Rnh<";
      String string0 = StringUtils.repeat("lM%", 1);
      assertEquals("lM%", string0);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny("The stripAccents(CharSequence) method requires at least Java 1.6 or a Sun JVM", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = StringUtils.repeat("", 1);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[0];
      boolean boolean0 = StringUtils.endsWithAny("", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringUtils.repeat("", 5);
      String string0 = StringUtils.normalizeSpace((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = StringUtils.repeat("", 32);
      assertNotNull(string0);
      
      String string1 = StringUtils.normalizeSpace("rnh<");
      assertEquals("rnh<", string1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringUtils.repeat("t=RFyXy5&~J", 90);
      String string0 = StringUtils.normalizeSpace((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = StringUtils.repeat(" in an array of ", 97);
      assertNotNull(string0);
      
      String string1 = StringUtils.normalizeSpace(" in an array of ");
      assertNotNull(string1);
      assertEquals("in an array of", string1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringUtils.endsWith((String) null, (String) null);
      String string0 = StringUtils.repeat("", 91);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = StringUtils.repeat("{}", 1419);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[1];
      boolean boolean0 = StringUtils.endsWithAny("6N+Hde\"", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = StringUtils.repeat("##Wpo>oAjLsZfdh", 1);
      assertNotNull(string0);
      assertEquals("##Wpo>oAjLsZfdh", string0);
      
      boolean boolean0 = StringUtils.endsWith((String) null, "St03E8,vd7=XX");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = StringUtils.repeat("", 1574);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWith("", "*k");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = StringUtils.repeat(" in an array of ", 97);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWith(" in an array of ", string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = StringUtils.repeat("", 2765);
      assertNotNull(string0);
      
      String[] stringArray0 = StringUtils.splitByCharacterTypeCamelCase("");
      assertNotNull(stringArray0);
      
      boolean boolean0 = StringUtils.endsWithAny("The Character must not be nuCs", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = StringUtils.repeat("", 1);
      assertNotNull(string0);
      
      String[] stringArray0 = StringUtils.splitByCharacterTypeCamelCase("");
      assertNotNull(stringArray0);
      
      boolean boolean0 = StringUtils.endsWithAny("h~@e", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringUtils.repeat("", 32);
      String[] stringArray0 = StringUtils.splitByCharacterTypeCamelCase("K");
      assertNotNull(stringArray0);
      
      boolean boolean0 = StringUtils.endsWithAny("Array element ", stringArray0);
      assertFalse(boolean0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = StringUtils.repeat("", 118);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny("", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringUtils.endsWithAny((String) null, (String[]) null);
      String string0 = StringUtils.repeat("Ev.VgP7*h'voVu23aXQ", 492);
      assertNotNull(string0);
  }
}
