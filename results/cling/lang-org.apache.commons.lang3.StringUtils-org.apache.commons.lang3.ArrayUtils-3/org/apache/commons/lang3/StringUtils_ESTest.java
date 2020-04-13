/*

 * Tue Mar 03 16:13:08 GMT 2020
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
      boolean boolean0 = StringUtils.endsWithIgnoreCase((String) null, (String) null);
      assertTrue(boolean0);
      
      String string0 = StringUtils.repeat("bD2KBZ", "bD2KBZ", 1);
      assertEquals("bD2KBZ", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = StringUtils.repeat("", 2578);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny("KPm&jl}8#&}nZCsRk", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = StringUtils.repeat("fQdAo;AGib", "fQdAo;AGib", 256);
      String[] stringArray0 = new String[1];
      stringArray0[0] = string0;
      boolean boolean0 = StringUtils.endsWithAny(string0, stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = StringUtils.repeat("", 2578);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase((String) null, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = StringUtils.repeat("s]35`\":p&-g", "s]35`\":p&-g", 48);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase((String) null, "P?");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringUtils.normalizeSpace((String) null);
      String string0 = StringUtils.repeat("java.text.Normalizer is not available", "normalize", 1);
      assertEquals("java.text.Normalizer is not available", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = StringUtils.repeat("qq", "qq", 1);
      assertNotNull(string0);
      
      String string1 = StringUtils.normalizeSpace("qq");
      assertTrue(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = StringUtils.substring("clone", 0, 0);
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = StringUtils.repeat("q5", "q5", 1);
      assertNotNull(string0);
      assertEquals("q5", string0);
      
      String[] stringArray0 = new String[3];
      stringArray0[1] = "Exception cloning Cloneable type ";
      boolean boolean0 = StringUtils.endsWithAny("Exception cloning Cloneable type ", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = StringUtils.repeat(")", ")", 1);
      assertNotNull(string0);
      assertEquals(")", string0);
      
      boolean boolean0 = StringUtils.endsWith(")", "Gv<`>:W'M1O'>>)4");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = StringUtils.repeat("clone", (String) null, 1);
      assertEquals("clone", string0);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[0];
      boolean boolean0 = StringUtils.endsWithAny((String) null, stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringUtils.repeat("", 2578);
      String string0 = StringUtils.normalizeSpace((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringUtils.normalizeSpace("");
      String string0 = StringUtils.repeat("", "", 256);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringUtils.repeat("CK>dN*6bK", 45);
      String string0 = StringUtils.normalizeSpace((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = StringUtils.normalizeSpace("");
      assertNotNull(string0);
      
      String string1 = StringUtils.repeat("3G5gLyH6LPKj3G5gLyH6LPKj", 2578);
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      boolean boolean0 = StringUtils.endsWithIgnoreCase((String) null, (String) null);
      assertTrue(boolean0);
      
      String string0 = StringUtils.repeat("5}~*TG", (String) null, 18);
      assertNotNull(string0);
      assertEquals("5}~*TG5}~*TG5}~*TG5}~*TG5}~*TG5}~*TG5}~*TG5}~*TG5}~*TG5}~*TG5}~*TG5}~*TG5}~*TG5}~*TG5}~*TG5}~*TG5}~*TG5}~*TG", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = StringUtils.repeat("clone", (String) null, 1);
      assertEquals("clone", string0);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWith((String) null, "clone");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = StringUtils.repeat("", (String) null, 13);
      assertNotNull(string0);
      assertEquals("", string0);
      
      boolean boolean0 = StringUtils.endsWith("", "[");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = StringUtils.repeat("", 2578);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[8];
      stringArray0[1] = "";
      boolean boolean0 = StringUtils.endsWithAny("Cloneable type ", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = StringUtils.repeat("v+^?D?N<`hr]6K>5t.", "IllegalArgumentException occurred", 675);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWith("Minimum abbreviation width with offset is 7", string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = StringUtils.repeat("SecurityExceptaon occurred", "SecurityExceptaon occurred", 795);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny(string0, (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = StringUtils.repeat("q", "q", 1);
      assertNotNull(string0);
      assertEquals("q", string0);
      
      String[] stringArray0 = new String[0];
      boolean boolean0 = StringUtils.endsWithAny("q", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[1];
      boolean boolean0 = StringUtils.endsWithAny("#,U+wsZI!De$L[", stringArray0);
      assertFalse(boolean0);
      
      String string0 = StringUtils.repeat("8JNW", "C;DH1S;p(&O@zbyNx3Q", 1);
      assertNotNull(string0);
      assertEquals("8JNW", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = StringUtils.repeat("", 2578);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[8];
      boolean boolean0 = StringUtils.endsWithAny("Cloneable type ", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = StringUtils.repeat("", 2578);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny("", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String[] stringArray0 = new String[1];
      boolean boolean0 = StringUtils.endsWithAny("#,U+wsZI!De$L[", stringArray0);
      assertFalse(boolean0);
      
      String string0 = StringUtils.repeat("#,U+wsZI!De$L[", 48);
      assertNotNull(string0);
      assertEquals("#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[#,U+wsZI!De$L[", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = StringUtils.repeat("8JNW", "8JNW", 23);
      assertNotNull(string0);
      assertEquals("8JNW8JNW8JNW8JNW8JNW8JNW8JNW8JNW8JNW8JNW8JNW8JNW8JNW8JNW8JNW8JNW8JNW8JNW8JNW8JNW8JNW8JNW8JNW8JNW8JNW8JNW8JNW8JNW8JNW8JNW8JNW8JNW8JNW8JNW8JNW8JNW8JNW8JNW8JNW8JNW8JNW8JNW8JNW8JNW8JNW", string0);
      
      boolean boolean0 = StringUtils.endsWithAny((String) null, (String[]) null);
      assertFalse(boolean0);
  }
}
