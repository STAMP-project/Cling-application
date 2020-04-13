/*

 * Tue Mar 03 16:15:59 GMT 2020
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Locale;
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
      
      String string0 = StringUtils.repeat(">2@~~<h#", 1);
      assertNotNull(string0);
      assertEquals(">2@~~<h#", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = StringUtils.repeat(">2@~~<h#", 2);
      assertEquals(">2@~~<h#>2@~~<h#", string0);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny(">2@~~<h#", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = StringUtils.repeat("{}", 123);
      assertEquals("{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}", string0);
      
      String[] stringArray0 = StringUtils.split("{}");
      boolean boolean0 = StringUtils.endsWithAny("{}", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      boolean boolean0 = StringUtils.endsWithIgnoreCase((String) null, (String) null);
      assertTrue(boolean0);
      
      String string0 = StringUtils.repeat(">2@~~<h#", 120);
      assertEquals(">2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#>2@~~<h#", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = StringUtils.repeat("_rHuLM", 269);
      boolean boolean0 = StringUtils.endsWith((String) null, string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringUtils.normalizeSpace((String) null);
      String string0 = StringUtils.repeat("vYp6U';T", 1);
      assertEquals("vYp6U';T", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = StringUtils.repeat("IllegalArgumentException occurred", 1);
      assertNotNull(string0);
      
      String string1 = StringUtils.normalizeSpace("IllegalArgumentException occurred");
      assertTrue(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = StringUtils.repeat("", 386);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase("tLW}Z", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = StringUtils.substring("The String must not be empty", 13, 13);
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringUtils.repeat("", 97);
      String[] stringArray0 = StringUtils.split("Z:GYQh5d</#Q");
      boolean boolean0 = StringUtils.endsWithAny("Z:GYQh5d</#Q", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = StringUtils.repeat("}{(uZ*s(`bJ", 1);
      assertEquals("}{(uZ*s(`bJ", string0);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[1];
      stringArray0[0] = "}{(uZ*s(`bJ";
      boolean boolean0 = StringUtils.endsWithAny("}{(uZ*s(`bJ", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = StringUtils.removeEndIgnoreCase("...", " has no clone method");
      assertEquals("...", string0);
      
      String string1 = StringUtils.repeat(" has no clone method", 1);
      assertEquals(" has no clone method", string1);
      assertNotNull(string1);
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
      String string0 = StringUtils.repeat("", 97);
      String string1 = StringUtils.normalizeSpace("");
      assertTrue(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringUtils.normalizeSpace((String) null);
      String string0 = StringUtils.repeat("?BQ,`H(.Gve,gk0", 122);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = StringUtils.normalizeSpace(" has no clone method");
      assertNotNull(string0);
      assertEquals("has no clone method", string0);
      
      String string1 = StringUtils.repeat("has no clone method", 97);
      assertNotNull(string1);
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = StringUtils.repeat("", 97);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase((String) null, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      boolean boolean0 = StringUtils.endsWith((String) null, " has no clone method");
      assertFalse(boolean0);
      
      String string0 = StringUtils.repeat(" has no clone method", 1);
      assertEquals(" has no clone method", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = StringUtils.repeat("xpaG_+EysfA:Vr~", 1);
      assertNotNull(string0);
      assertEquals("xpaG_+EysfA:Vr~", string0);
      
      String[] stringArray0 = new String[1];
      boolean boolean0 = StringUtils.endsWithAny("xpaG_+EysfA:Vr~", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringUtils.endsWithIgnoreCase("", "Z:r-\"HMOuB-0Ay`i4");
      String string0 = StringUtils.repeat("", 1060);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = StringUtils.repeat(" has no clone method", 6);
      assertNotNull(string0);
      assertEquals(" has no clone method has no clone method has no clone method has no clone method has no clone method has no clone method", string0);
      
      String string1 = StringUtils.removeEndIgnoreCase(" has no clone method", " has no clone method has no clone method has no clone method has no clone method has no clone method has no clone method");
      assertEquals(" has no clone method", string1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = StringUtils.repeat(" has no clone method", 66);
      assertNotNull(string0);
      
      String[] stringArray0 = Locale.getISOLanguages();
      boolean boolean0 = StringUtils.endsWithAny(" has no clone method", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String[] stringArray0 = StringUtils.splitByCharacterType("");
      StringUtils.endsWithAny("Cloneable type ", stringArray0);
      String string0 = StringUtils.repeat("", 1169);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = StringUtils.repeat("}{(uZ*s(`bJ", 1);
      assertNotNull(string0);
      assertEquals("}{(uZ*s(`bJ", string0);
      
      boolean boolean0 = StringUtils.endsWithAny("}{(uZ*s(`bJ", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String[] stringArray0 = StringUtils.split("Cloneable type ");
      StringUtils.endsWithAny("Cloneable type ", stringArray0);
      String string0 = StringUtils.repeat("", 1169);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = StringUtils.repeat("", 386);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[1];
      boolean boolean0 = StringUtils.endsWithAny("", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = StringUtils.repeat(" has no clonE method", 15);
      assertNotNull(string0);
      assertEquals(" has no clonE method has no clonE method has no clonE method has no clonE method has no clonE method has no clonE method has no clonE method has no clonE method has no clonE method has no clonE method has no clonE method has no clonE method has no clonE method has no clonE method has no clonE method", string0);
      
      String[] stringArray0 = new String[12];
      boolean boolean0 = StringUtils.endsWithAny(" has no clonE method", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = StringUtils.repeat(" has no clon method", 32);
      assertEquals(" has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method", string0);
      assertNotNull(string0);
      
      String[] stringArray0 = StringUtils.splitByCharacterTypeCamelCase(" has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method has no clon method");
      assertNotNull(stringArray0);
      
      boolean boolean0 = StringUtils.endsWithAny((String) null, stringArray0);
      assertFalse(boolean0);
      assertEquals(256, stringArray0.length);
  }
}
