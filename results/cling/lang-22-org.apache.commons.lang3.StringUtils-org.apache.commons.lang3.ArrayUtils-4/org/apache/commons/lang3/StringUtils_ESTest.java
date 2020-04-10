/*

 * Tue Mar 03 16:13:21 GMT 2020
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
      
      String string0 = StringUtils.repeat("(", 1);
      assertNotNull(string0);
      assertEquals("(", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[0];
      boolean boolean0 = StringUtils.endsWithAny("dqUi", stringArray0);
      assertFalse(boolean0);
      
      String string0 = StringUtils.repeat("dqUi", 28);
      assertNotNull(string0);
      assertEquals("dqUidqUidqUidqUidqUidqUidqUidqUidqUidqUidqUidqUidqUidqUidqUidqUidqUidqUidqUidqUidqUidqUidqUidqUidqUidqUidqUidqUi", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = StringUtils.repeat("", Integer.MAX_VALUE);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[4];
      stringArray0[1] = "";
      boolean boolean0 = StringUtils.endsWithAny("*d&(VY1?qBK4X", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = StringUtils.repeat("", 101);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWith((String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = StringUtils.repeat("", 101);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWith((String) null, "jOuL?H**3R\"-");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = StringUtils.repeat("D.V^8$", 1026);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase((String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = StringUtils.repeat("dqUi", 1);
      assertEquals("dqUi", string0);
      assertNotNull(string0);
      
      String string1 = StringUtils.normalizeSpace("F8d(\"KmlUG");
      assertEquals("F8d(\"KmlUG", string1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = StringUtils.substring("Zq<uc;:&3", 7, 7);
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = StringUtils.repeat("dqUi", 1);
      assertNotNull(string0);
      assertEquals("dqUi", string0);
      
      String string1 = StringUtils.removeEndIgnoreCase("d", "JMD#%wx&C");
      assertEquals("d", string1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "{}";
      boolean boolean0 = StringUtils.endsWithAny("{}", stringArray0);
      assertTrue(boolean0);
      
      String string0 = StringUtils.repeat("The String must not be empty", 1);
      assertNotNull(string0);
      assertEquals("The String must not be empty", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = StringUtils.repeat("ava.text.Normalizer is not available", 1);
      assertNotNull(string0);
      assertEquals("ava.text.Normalizer is not available", string0);
      
      boolean boolean0 = StringUtils.endsWithAny((String) null, (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringUtils.repeat("", Integer.MAX_VALUE);
      String string0 = StringUtils.normalizeSpace((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = StringUtils.repeat("", Integer.MAX_VALUE);
      assertNotNull(string0);
      
      String string1 = StringUtils.normalizeSpace("=etuen2Dd");
      assertEquals("=etuen2Dd", string1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringUtils.normalizeSpace((String) null);
      String string0 = StringUtils.repeat("z|'j3i8?qspyp-fa", 16);
      assertEquals("z|'j3i8?qspyp-faz|'j3i8?qspyp-faz|'j3i8?qspyp-faz|'j3i8?qspyp-faz|'j3i8?qspyp-faz|'j3i8?qspyp-faz|'j3i8?qspyp-faz|'j3i8?qspyp-faz|'j3i8?qspyp-faz|'j3i8?qspyp-faz|'j3i8?qspyp-faz|'j3i8?qspyp-faz|'j3i8?qspyp-faz|'j3i8?qspyp-faz|'j3i8?qspyp-faz|'j3i8?qspyp-fa", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = StringUtils.normalizeSpace("z|'j3i8?qspyp-fa");
      assertNotNull(string0);
      assertEquals("z|'j3i8?qspyp-fa", string0);
      
      String string1 = StringUtils.repeat("z|'j3i8?qspyp-fa", 16);
      assertNotNull(string1);
      assertEquals("z|'j3i8?qspyp-faz|'j3i8?qspyp-faz|'j3i8?qspyp-faz|'j3i8?qspyp-faz|'j3i8?qspyp-faz|'j3i8?qspyp-faz|'j3i8?qspyp-faz|'j3i8?qspyp-faz|'j3i8?qspyp-faz|'j3i8?qspyp-faz|'j3i8?qspyp-faz|'j3i8?qspyp-faz|'j3i8?qspyp-faz|'j3i8?qspyp-faz|'j3i8?qspyp-faz|'j3i8?qspyp-fa", string1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = StringUtils.repeat("{}", 8192);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase((String) null, "java.text.Normalizer$Form");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = StringUtils.repeat("The String must not be empty", 1);
      assertEquals("The String must not be empty", string0);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase((String) null, "java.text.Normalizer$Form");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = StringUtils.repeat("", 101);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWith("", "HX;5_`V`>");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[2] = "8gH@%dZ;:ZW(";
      String string0 = StringUtils.repeat("", 65);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny("Cannot pad a negative amount: ", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = StringUtils.repeat("z|'j3i8?qspyp-fa", 101);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWith("c?b{ ", "teP#xB$'&g");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "{}";
      StringUtils.endsWithAny("{}", stringArray0);
      String string0 = StringUtils.repeat("{}", 8192);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringUtils.endsWithAny("dPUi", (String[]) null);
      String string0 = StringUtils.repeat("", 113);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      boolean boolean0 = StringUtils.endsWithAny("dqUi", (String[]) null);
      assertFalse(boolean0);
      
      String string0 = StringUtils.repeat("dqUi", 1);
      assertEquals("dqUi", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String[] stringArray0 = new String[2];
      boolean boolean0 = StringUtils.endsWithAny("{}", stringArray0);
      assertFalse(boolean0);
      
      String string0 = StringUtils.repeat("The String must not be empty", 1);
      assertNotNull(string0);
      assertEquals("The String must not be empty", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = StringUtils.repeat("", Integer.MAX_VALUE);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny("", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String[] stringArray0 = new String[2];
      StringUtils.endsWithAny("{}", stringArray0);
      String string0 = StringUtils.repeat("{}", 8192);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringUtils.endsWithAny((String) null, (String[]) null);
      String string0 = StringUtils.repeat("clone", 1829);
      assertNotNull(string0);
  }
}
