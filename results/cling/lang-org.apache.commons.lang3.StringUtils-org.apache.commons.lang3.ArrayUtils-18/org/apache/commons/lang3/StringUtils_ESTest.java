/*

 * Tue Mar 03 16:15:53 GMT 2020
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
      String string0 = StringUtils.repeat("d", 69);
      assertEquals("ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd", string0);
      
      String[] stringArray0 = new String[1];
      stringArray0[0] = "d";
      boolean boolean0 = StringUtils.endsWithAny("d", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = StringUtils.repeat("", 104);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase((String) null, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean boolean0 = StringUtils.endsWithIgnoreCase((String) null, (String) null);
      assertTrue(boolean0);
      
      String string0 = StringUtils.repeat("j)+iEc\"<}", 7);
      assertEquals("j)+iEc\"<}j)+iEc\"<}j)+iEc\"<}j)+iEc\"<}j)+iEc\"<}j)+iEc\"<}j)+iEc\"<}", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      boolean boolean0 = StringUtils.endsWithIgnoreCase((String) null, "n!m2}}UsFk{7GRv");
      assertFalse(boolean0);
      
      String string0 = StringUtils.repeat(" vs ", 105);
      assertNotNull(string0);
      assertEquals(" vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs  vs ", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringUtils.repeat("n!m2}}UsFk{7GRv", 1);
      String string0 = StringUtils.normalizeSpace((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = StringUtils.repeat("kZym)Yq&x#o:i", 1);
      assertNotNull(string0);
      
      String string1 = StringUtils.normalizeSpace("kZym)Yq&x#o:i");
      assertTrue(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[1];
      StringUtils.endsWithAny("The String must not be empty", stringArray0);
      String string0 = StringUtils.repeat("IllegalAccessException occurred", 236);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = StringUtils.substring("?g9,]f4", 1, 1);
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = StringUtils.repeat("-7m;zBm+aVnS|1 >", 1);
      assertNotNull(string0);
      assertEquals("-7m;zBm+aVnS|1 >", string0);
      
      boolean boolean0 = StringUtils.endsWith("-7m;zBm+aVnS|1 >", "*oYcf:t[6eZD@uSearch and Replace array lengths don't match: ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = StringUtils.repeat("-\"m;zBm!aVnST|1 >", 1);
      assertEquals("-\"m;zBm!aVnST|1 >", string0);
      
      String[] stringArray0 = StringUtils.splitPreserveAllTokens("Index: ");
      boolean boolean0 = StringUtils.endsWithAny("-\"m;zBm!aVnST|1 >", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean boolean0 = StringUtils.endsWithAny((String) null, (String[]) null);
      assertFalse(boolean0);
      
      String string0 = StringUtils.repeat("kB{9VH>cc", 1);
      assertEquals("kB{9VH>cc", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringUtils.repeat("", 13);
      String string0 = StringUtils.normalizeSpace((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringUtils.repeat("", 88);
      String string0 = StringUtils.normalizeSpace("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringUtils.normalizeSpace((String) null);
      String string0 = StringUtils.repeat("6f9V@kZym)Yq&x#o:i", 108);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = StringUtils.repeat("rbeq", 2241);
      assertNotNull(string0);
      
      String string1 = StringUtils.normalizeSpace("rbeq");
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertEquals("rbeq", string1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringUtils.endsWithIgnoreCase((String) null, (String) null);
      String string0 = StringUtils.repeat("", 7);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = StringUtils.endsWithIgnoreCase((String) null, "90sL/~E74>mwALxz-AS");
      assertFalse(boolean0);
      
      String string0 = StringUtils.repeat("The CharacXer must?not be null", 1);
      assertEquals("The CharacXer must?not be null", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = StringUtils.repeat("", 27);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWith("", "H");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = StringUtils.repeat("", 69);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[2];
      stringArray0[0] = "kJ";
      boolean boolean0 = StringUtils.endsWithAny("kJ", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = StringUtils.repeat("n!m2}}UsFk{7GRv", 57);
      assertNotNull(string0);
      assertEquals("n!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRv", string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase("java.text.Normalizer is not available", "n!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRvn!m2}}UsFk{7GRv");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = StringUtils.repeat("", 69);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[1];
      boolean boolean0 = StringUtils.endsWithAny("s+", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[0];
      boolean boolean0 = StringUtils.endsWithAny("n!m2}}UsFk{7GRv", stringArray0);
      assertFalse(boolean0);
      
      String string0 = StringUtils.repeat("n!m2}}UsFk{7GRv", 1);
      assertNotNull(string0);
      assertEquals("n!m2}}UsFk{7GRv", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[9];
      boolean boolean0 = StringUtils.endsWithAny("n!m2}}UsFk{7GRA9v", stringArray0);
      assertFalse(boolean0);
      
      String string0 = StringUtils.repeat("n!m2}}UsFk{7GRA9v", 1);
      assertNotNull(string0);
      assertEquals("n!m2}}UsFk{7GRA9v", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringUtils.endsWithAny("xa/N", (String[]) null);
      String string0 = StringUtils.repeat("", 109);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = StringUtils.repeat("", 69);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[0];
      boolean boolean0 = StringUtils.endsWithAny("", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      boolean boolean0 = StringUtils.endsWithAny("xa/N", (String[]) null);
      assertFalse(boolean0);
      
      String string0 = StringUtils.repeat("xa/N", 109);
      assertNotNull(string0);
      assertEquals("xa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/Nxa/N", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringUtils.endsWithAny((String) null, (String[]) null);
      String string0 = StringUtils.repeat("n!m2}}UsF0{7GRv", 67);
      assertNotNull(string0);
  }
}
