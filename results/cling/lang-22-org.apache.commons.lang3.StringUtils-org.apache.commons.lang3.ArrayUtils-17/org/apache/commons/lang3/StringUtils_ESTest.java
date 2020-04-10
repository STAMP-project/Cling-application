/*

 * Tue Mar 03 16:16:14 GMT 2020
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
      String string0 = StringUtils.repeat("", 9998);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[0];
      boolean boolean0 = StringUtils.endsWithAny("m#vChJ", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = StringUtils.repeat("7^^d!\"g7c?", 9998);
      String[] stringArray0 = StringUtils.split("7^^d!\"g7c?", 'd');
      boolean boolean0 = StringUtils.endsWithAny(string0, stringArray0);
      assertEquals(2, stringArray0.length);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringUtils.endsWith((String) null, (String) null);
      String string0 = StringUtils.repeat("", 93);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = StringUtils.repeat("", 64);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase((String) null, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[2];
      StringUtils.endsWithIgnoreCase(stringArray0[1], "=/'\"sxh%U>/*&`2q_");
      String string0 = StringUtils.repeat("=/'\"sxh%U>/*&`2q_", 65);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringUtils.repeat("Ov=kSGQWtB'c=", 1);
      String string0 = StringUtils.normalizeSpace((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = StringUtils.normalizeSpace("Ov=kSGQWtB'c=");
      String string1 = StringUtils.repeat("Ov=kSGQWtB'c=", 1);
      assertNotNull(string1);
      assertTrue(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = StringUtils.substring("Ov=kSGQWtB'c=", 0, 0);
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = StringUtils.repeat("Ov=kSGQWtB'c=", 1);
      assertNotNull(string0);
      assertEquals("Ov=kSGQWtB'c=", string0);
      
      String[] stringArray0 = new String[3];
      stringArray0[2] = "";
      boolean boolean0 = StringUtils.endsWithAny("Ov=kSGQWtB'c=", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = StringUtils.repeat("x", 1);
      assertEquals("x", string0);
      assertNotNull(string0);
      
      String string1 = "org.apache.commons.lang3.ObjectUtils$Nu\\u";
      boolean boolean0 = StringUtils.endsWith("x", string1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = StringUtils.repeat("Ov=kSGQWtB'c=", 1);
      assertNotNull(string0);
      assertEquals("Ov=kSGQWtB'c=", string0);
      
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Ov=kSGQWtB'c=";
      boolean boolean0 = StringUtils.endsWithAny("NBw)E3WqHQ%P", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = StringUtils.repeat("Ov=kSGQWtB'c=", 1);
      assertNotNull(string0);
      assertEquals("Ov=kSGQWtB'c=", string0);
      
      boolean boolean0 = StringUtils.endsWithAny("", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringUtils.repeat("", 64);
      String string0 = StringUtils.normalizeSpace((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringUtils.repeat("", 64);
      String string0 = StringUtils.normalizeSpace("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringUtils.repeat("7^^d!\"g7c?", 9998);
      String string0 = StringUtils.normalizeSpace((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = StringUtils.repeat("gx<[QgUm8j", 20);
      assertEquals("gx<[QgUm8jgx<[QgUm8jgx<[QgUm8jgx<[QgUm8jgx<[QgUm8jgx<[QgUm8jgx<[QgUm8jgx<[QgUm8jgx<[QgUm8jgx<[QgUm8jgx<[QgUm8jgx<[QgUm8jgx<[QgUm8jgx<[QgUm8jgx<[QgUm8jgx<[QgUm8jgx<[QgUm8jgx<[QgUm8jgx<[QgUm8jgx<[QgUm8j", string0);
      assertNotNull(string0);
      
      String string1 = StringUtils.normalizeSpace("The String must not be empty");
      assertEquals("The String must not be empty", string1);
      assertNotNull(string1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = StringUtils.endsWith((String) null, (String) null);
      assertTrue(boolean0);
      
      String string0 = StringUtils.repeat(", Length: ", 46);
      assertEquals(", Length: , Length: , Length: , Length: , Length: , Length: , Length: , Length: , Length: , Length: , Length: , Length: , Length: , Length: , Length: , Length: , Length: , Length: , Length: , Length: , Length: , Length: , Length: , Length: , Length: , Length: , Length: , Length: , Length: , Length: , Length: , Length: , Length: , Length: , Length: , Length: , Length: , Length: , Length: , Length: , Length: , Length: , Length: , Length: , Length: , Length: ", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = StringUtils.repeat("", 64);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase("", "/Fn'a");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = StringUtils.repeat("", 64);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[3];
      stringArray0[1] = "";
      boolean boolean0 = StringUtils.endsWithAny("{<3?K/0cCa9uh", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = StringUtils.repeat("Ov=kSGQWtB'c=K$(j&aSKT7SB^G9'", 2337);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase("Ov=kSGQWtB'c=K$(j&aSKT7SB^G9'", string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = StringUtils.repeat("}a{", 9998);
      assertNotNull(string0);
      
      String[] stringArray0 = Locale.getISOLanguages();
      boolean boolean0 = StringUtils.endsWithAny("Mc:X{#|-%Ca)s|", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = StringUtils.repeat("7^^d!\"g7c?", 9998);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny("7^^d!\"g7c?", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = StringUtils.repeat("QI", 1);
      assertNotNull(string0);
      assertEquals("QI", string0);
      
      boolean boolean0 = StringUtils.endsWithAny("QI", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = StringUtils.repeat("", 64);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[3];
      boolean boolean0 = StringUtils.endsWithAny("{<3?K/0cCa9uh", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = StringUtils.repeat("", 64);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[10];
      boolean boolean0 = StringUtils.endsWithAny("", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = StringUtils.repeat("Ov=kSGQWtB'c=", 5);
      assertNotNull(string0);
      assertEquals("Ov=kSGQWtB'c=Ov=kSGQWtB'c=Ov=kSGQWtB'c=Ov=kSGQWtB'c=Ov=kSGQWtB'c=", string0);
      
      String[] stringArray0 = new String[6];
      boolean boolean0 = StringUtils.endsWithAny("=M ^yaNu/[6(9XB(", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringUtils.repeat("Mj", 9946);
      String[] stringArray0 = StringUtils.splitByCharacterType("Mj");
      assertNotNull(stringArray0);
      
      StringUtils.endsWithAny("", stringArray0);
      assertEquals(2, stringArray0.length);
  }
}
