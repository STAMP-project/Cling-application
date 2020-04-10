/*

 * Tue Mar 03 16:16:07 GMT 2020
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
      boolean boolean0 = StringUtils.endsWith((String) null, "\u0003\u0004\u0005");
      assertFalse(boolean0);
      
      String string0 = StringUtils.repeat("yO@n5E-:;3#zN{1", "", 1);
      assertEquals("yO@n5E-:;3#zN{1", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringUtils.endsWithAny("bZSH'~q|<", (String[]) null);
      String string0 = StringUtils.repeat("", 8);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = StringUtils.repeat("DD", 114);
      assertEquals("DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", string0);
      assertNotNull(string0);
      
      String[] stringArray0 = StringUtils.split("DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", "pX");
      boolean boolean0 = StringUtils.endsWithAny("DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringUtils.endsWith((String) null, (String) null);
      String string0 = StringUtils.repeat("", 4096);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = StringUtils.repeat("", 2196);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWith((String) null, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringUtils.endsWith((String) null, (String) null);
      String string0 = StringUtils.repeat("[", 2437);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringUtils.normalizeSpace((String) null);
      String string0 = StringUtils.repeat("The character must not be null", 1);
      assertEquals("The character must not be null", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = StringUtils.repeat("j", 1);
      assertNotNull(string0);
      
      String string1 = StringUtils.normalizeSpace("j");
      assertTrue(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = StringUtils.substring("*cL3s8+SmmN)9,[ns.lang3.ObjectUtils$Null", 35, 35);
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[10];
      stringArray0[1] = "hMQ3Mkx0=dqW)=Vtg";
      String string0 = StringUtils.repeat("hMQ3Mkx0=dqW)=Vtg", "hMQ3Mkx0=dqW)=Vtg", 1);
      assertEquals("hMQ3Mkx0=dqW)=Vtg", string0);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny("vI48|Iv#&ZnbBu-X", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = StringUtils.repeat("IllegalArgumentExcetion occurred", 1);
      assertNotNull(string0);
      assertEquals("IllegalArgumentExcetion occurred", string0);
      
      String[] stringArray0 = new String[1];
      stringArray0[0] = "IllegalArgumentExcetion occurred";
      boolean boolean0 = StringUtils.endsWithAny("IllegalArgumentExcetion occurred", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[10];
      String string0 = StringUtils.repeat("", stringArray0[1], 1);
      assertEquals("", string0);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny("", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringUtils.repeat("", 10);
      String string0 = StringUtils.normalizeSpace("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringUtils.normalizeSpace((String) null);
      String string0 = StringUtils.repeat("\"{w4ks", 22);
      assertEquals("\"{w4ks\"{w4ks\"{w4ks\"{w4ks\"{w4ks\"{w4ks\"{w4ks\"{w4ks\"{w4ks\"{w4ks\"{w4ks\"{w4ks\"{w4ks\"{w4ks\"{w4ks\"{w4ks\"{w4ks\"{w4ks\"{w4ks\"{w4ks\"{w4ks\"{w4ks", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = StringUtils.repeat("Cannot clone Cloneable type ", 2196);
      String string1 = StringUtils.normalizeSpace(string0);
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringUtils.endsWith((String) null, "', has a length less than 2rayUtils");
      String string0 = StringUtils.repeat("P", 2196);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = StringUtils.endsWith((String) null, (String) null);
      assertTrue(boolean0);
      
      String string0 = StringUtils.repeat("k9,ofiT2WrY9S", 1);
      assertEquals("k9,ofiT2WrY9S", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringUtils.endsWith("", "\u0003\u0004\u0005");
      String string0 = StringUtils.repeat("", 2827);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = StringUtils.repeat("", 2210);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      boolean boolean0 = StringUtils.endsWithAny("L", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = StringUtils.repeat("nY=e/", 2158);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWith("DD", string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringUtils.endsWithAny("IllegaArgumenException occred", (String[]) null);
      String string0 = StringUtils.repeat("IllegaArgumenException occred", 55);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[0];
      boolean boolean0 = StringUtils.endsWithAny("FPbg'[", stringArray0);
      assertFalse(boolean0);
      
      String string0 = StringUtils.repeat("OF GhSm", 1);
      assertEquals("OF GhSm", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = StringUtils.repeat("", 2210);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[1];
      boolean boolean0 = StringUtils.endsWithAny("h[", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = StringUtils.repeat("", 114);
      assertNotNull(string0);
      
      String[] stringArray0 = StringUtils.splitByWholeSeparatorPreserveAllTokens("", "");
      assertNotNull(stringArray0);
      
      boolean boolean0 = StringUtils.endsWithAny("", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String[] stringArray0 = new String[4];
      StringUtils.endsWithAny("-&c", stringArray0);
      String string0 = StringUtils.repeat("', has a length less than{M)Aq2pHP(", "6rq8", 4543);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = StringUtils.repeat("rCbo/OXXm]#$RA", 4177);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny("", (String[]) null);
      assertFalse(boolean0);
  }
}
