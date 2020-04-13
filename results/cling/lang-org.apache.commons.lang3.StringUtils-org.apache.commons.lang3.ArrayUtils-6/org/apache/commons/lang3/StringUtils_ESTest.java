/*

 * Tue Mar 03 16:13:40 GMT 2020
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
      String string0 = StringUtils.repeat("hC4rJ&w.JsE ~eption occurred", 48);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny("hC4rJ&w.JsE ~eption occurred", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = StringUtils.repeat("-", 16);
      assertEquals("----------------", string0);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[1];
      stringArray0[0] = "----------------";
      boolean boolean0 = StringUtils.endsWithAny("----------------", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringUtils.endsWithIgnoreCase((String) null, "");
      String string0 = StringUtils.repeat("", 34);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = StringUtils.repeat("#b.E?z}", 8192);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase((String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringUtils.endsWithIgnoreCase((String) null, "");
      String string0 = StringUtils.repeat("Cannot store ", 122);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringUtils.repeat("ep7", 1);
      String string0 = StringUtils.normalizeSpace((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = StringUtils.normalizeSpace("org.apache.commons.lang3.ObjectUtils");
      String string1 = StringUtils.repeat("org.apache.commons.lang3.ObjectUtils", 1);
      assertTrue(string1.equals((Object)string0));
      assertNotNull(string1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = StringUtils.repeat("", 1579);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWith("OI#lW.6?Ir38*3:", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = StringUtils.substring("Cannot store ", 6, 6);
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = StringUtils.repeat("c&\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t", 1);
      assertEquals("c&\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t", string0);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[1];
      stringArray0[0] = "c&\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t";
      boolean boolean0 = StringUtils.endsWithAny("c&\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = StringUtils.repeat("|", 1);
      assertNotNull(string0);
      assertEquals("|", string0);
      
      String[] stringArray0 = new String[1];
      stringArray0[0] = "e5\"Vpmg";
      boolean boolean0 = StringUtils.endsWithAny("|", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = StringUtils.repeat("-FT|k-3\"N@]@:5-", 1);
      assertEquals("-FT|k-3\"N@]@:5-", string0);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[12];
      boolean boolean0 = StringUtils.endsWithAny((String) null, stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = StringUtils.repeat("", 1562);
      assertNotNull(string0);
      
      String string1 = StringUtils.normalizeSpace("}z\"hG5;}cXjGb");
      assertEquals("}z\"hG5;}cXjGb", string1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringUtils.repeat("ep7", 9);
      String string0 = StringUtils.normalizeSpace((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = StringUtils.repeat("fu4P!5kZ&8@J 5w!Tc", 16);
      assertNotNull(string0);
      assertEquals("fu4P!5kZ&8@J 5w!Tcfu4P!5kZ&8@J 5w!Tcfu4P!5kZ&8@J 5w!Tcfu4P!5kZ&8@J 5w!Tcfu4P!5kZ&8@J 5w!Tcfu4P!5kZ&8@J 5w!Tcfu4P!5kZ&8@J 5w!Tcfu4P!5kZ&8@J 5w!Tcfu4P!5kZ&8@J 5w!Tcfu4P!5kZ&8@J 5w!Tcfu4P!5kZ&8@J 5w!Tcfu4P!5kZ&8@J 5w!Tcfu4P!5kZ&8@J 5w!Tcfu4P!5kZ&8@J 5w!Tcfu4P!5kZ&8@J 5w!Tcfu4P!5kZ&8@J 5w!Tc", string0);
      
      String string1 = StringUtils.normalizeSpace("+!31)Wu0/*>");
      assertNotNull(string1);
      assertEquals("+!31)Wu0/*>", string1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = StringUtils.repeat("", 1562);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[4];
      boolean boolean0 = StringUtils.endsWith(stringArray0[0], stringArray0[3]);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = StringUtils.repeat("org.apache.commons.lang3.ObjectUtils", 1);
      assertNotNull(string0);
      assertEquals("org.apache.commons.lang3.ObjectUtils", string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase((String) null, "_3");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = StringUtils.repeat("", 1578);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      boolean boolean0 = StringUtils.endsWithAny("lgUSN;3@", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = StringUtils.repeat("Q%gCh)$i%}/U", 73);
      assertNotNull(string0);
      assertEquals("Q%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/UQ%gCh)$i%}/U", string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase("iPH", "org.apache.commons.lang3.ObjectUtils$Null");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringUtils.endsWithAny("1o", (String[]) null);
      String string0 = StringUtils.repeat("", 46);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = StringUtils.repeat("ep7", 1);
      assertEquals("ep7", string0);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny("ep7", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = StringUtils.repeat("|", 1);
      assertNotNull(string0);
      assertEquals("|", string0);
      
      String[] stringArray0 = new String[1];
      boolean boolean0 = StringUtils.endsWithAny("|", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringUtils.repeat("", 8192);
      String[] stringArray0 = StringUtils.splitByWholeSeparator("?tovs@oxN646", "", 0);
      assertNotNull(stringArray0);
      
      boolean boolean0 = StringUtils.endsWithAny("'m8", stringArray0);
      assertFalse(boolean0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = StringUtils.repeat("", 16);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny("", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = StringUtils.repeat("LeLN!;-'kX8(IT9sY=", "LeLN!;-'kX8(IT9sY=", 1606);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[17];
      boolean boolean0 = StringUtils.endsWithAny("yv&", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      boolean boolean0 = StringUtils.endsWithAny((String) null, (String[]) null);
      assertFalse(boolean0);
      
      String string0 = StringUtils.repeat("Gk9C$O9(+", 20);
      assertNotNull(string0);
      assertEquals("Gk9C$O9(+Gk9C$O9(+Gk9C$O9(+Gk9C$O9(+Gk9C$O9(+Gk9C$O9(+Gk9C$O9(+Gk9C$O9(+Gk9C$O9(+Gk9C$O9(+Gk9C$O9(+Gk9C$O9(+Gk9C$O9(+Gk9C$O9(+Gk9C$O9(+Gk9C$O9(+Gk9C$O9(+Gk9C$O9(+Gk9C$O9(+Gk9C$O9(+", string0);
  }
}
