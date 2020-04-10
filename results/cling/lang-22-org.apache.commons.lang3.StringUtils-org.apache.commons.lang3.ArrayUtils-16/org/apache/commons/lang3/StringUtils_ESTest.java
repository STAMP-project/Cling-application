/*

 * Tue Mar 03 16:14:49 GMT 2020
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
      boolean boolean0 = StringUtils.endsWith((String) null, (String) null);
      assertTrue(boolean0);
      
      String string0 = StringUtils.repeat("I", 1);
      assertEquals("I", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = StringUtils.repeat("The Sring must not be empty", 64);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny("The Sring must not be empty", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = StringUtils.repeat("D", 8192);
      String[] stringArray0 = new String[2];
      stringArray0[1] = "D";
      boolean boolean0 = StringUtils.endsWithAny(string0, stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringUtils.endsWithIgnoreCase((String) null, "*Zq?&LP<");
      String string0 = StringUtils.repeat("", 122);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      boolean boolean0 = StringUtils.endsWith((String) null, (String) null);
      assertTrue(boolean0);
      
      String string0 = StringUtils.repeat("9{;p_vX7", "9{;p_vX7", 28);
      assertEquals("9{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX79{;p_vX7", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringUtils.repeat("{qxP*V;7;h9", 1);
      String string0 = StringUtils.normalizeSpace((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = StringUtils.repeat("java.text.Normalizer", 1);
      assertNotNull(string0);
      assertEquals("java.text.Normalizer", string0);
      
      String string1 = StringUtils.normalizeSpace("JAVA.TEXT.NORMALIZER");
      assertEquals("JAVA.TEXT.NORMALIZER", string1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = StringUtils.substring("er of type ma(p.", 1, 1);
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = StringUtils.repeat("2K;xsUV.ktEA", 1);
      assertNotNull(string0);
      assertEquals("2K;xsUV.ktEA", string0);
      
      String[] stringArray0 = new String[2];
      stringArray0[1] = "D,E@:vc!|b sK_[+>o}\"v0SJtOEYj#byw";
      boolean boolean0 = StringUtils.endsWithAny("D,E@:vc!|b sK_[+>o}\"v0SJtOEYj#byw", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = StringUtils.endsWithIgnoreCase(";%[&", "decompose");
      assertFalse(boolean0);
      
      String string0 = StringUtils.repeat("decompose", 1);
      assertNotNull(string0);
      assertEquals("decompose", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = StringUtils.repeat("", 1);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny("", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringUtils.repeat("", 3766);
      String string0 = StringUtils.normalizeSpace("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = "\\u0}\"v0SJtOEYj#byw";
      StringUtils.repeat(string0, 8);
      String string1 = StringUtils.normalizeSpace((String) null);
      assertNull(string1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = "\\u0}\"v0SJtOEYj#byw";
      String string1 = StringUtils.repeat(string0, 8);
      assertEquals("\\u0}\"v0SJtOEYj#byw\\u0}\"v0SJtOEYj#byw\\u0}\"v0SJtOEYj#byw\\u0}\"v0SJtOEYj#byw\\u0}\"v0SJtOEYj#byw\\u0}\"v0SJtOEYj#byw\\u0}\"v0SJtOEYj#byw\\u0}\"v0SJtOEYj#byw", string1);
      assertNotNull(string1);
      
      String string2 = StringUtils.normalizeSpace(string0);
      assertNotNull(string2);
      assertEquals("\\u0}\"v0SJtOEYj#byw", string2);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = StringUtils.endsWith((String) null, "npk");
      assertFalse(boolean0);
      
      String string0 = StringUtils.repeat("LVf-\"IFYs2U:Uz&q", 6);
      assertEquals("LVf-\"IFYs2U:Uz&qLVf-\"IFYs2U:Uz&qLVf-\"IFYs2U:Uz&qLVf-\"IFYs2U:Uz&qLVf-\"IFYs2U:Uz&qLVf-\"IFYs2U:Uz&q", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      boolean boolean0 = StringUtils.endsWithIgnoreCase((String) null, "decompose");
      assertFalse(boolean0);
      
      String string0 = StringUtils.repeat("decompose", 1);
      assertNotNull(string0);
      assertEquals("decompose", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = StringUtils.repeat("", 8);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWith("", ":&-3GIq<L8`U@Mr");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = StringUtils.repeat("", 8);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[3];
      stringArray0[0] = "The stripAccents(CharSequence) method requires at least Java 1.6 or a Sun JVM";
      boolean boolean0 = StringUtils.endsWithAny("The stripAccents(CharSequence) method requires at least Java 1.6 or a Sun JVM", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = StringUtils.repeat("Array element ", 2787);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[1];
      stringArray0[0] = string0;
      boolean boolean0 = StringUtils.endsWithAny("Array element ", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = StringUtils.repeat("", 64);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[0];
      boolean boolean0 = StringUtils.endsWithAny("2MP^@/waj,EHtmiDL]Q", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = StringUtils.repeat(" i(Qless]zthan 0: ", 1);
      assertNotNull(string0);
      assertEquals(" i(Qless]zthan 0: ", string0);
      
      boolean boolean0 = StringUtils.endsWithAny(" i(Qless]zthan 0: ", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = StringUtils.repeat(" is less than 0: ", 1);
      assertEquals(" is less than 0: ", string0);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[2];
      boolean boolean0 = StringUtils.endsWithAny("`7V*:c~UGC", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = StringUtils.repeat("", 64);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[1];
      boolean boolean0 = StringUtils.endsWithAny("2MP^@/Vaj,EHtmi;L]Q", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = StringUtils.repeat("", 8);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[0];
      boolean boolean0 = StringUtils.endsWithAny("", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String[] stringArray0 = new String[8];
      StringUtils.endsWithAny(stringArray0[0], stringArray0);
      String string0 = StringUtils.repeat("3--U}Y>9Iu5Df?", 5036);
      assertNotNull(string0);
  }
}
