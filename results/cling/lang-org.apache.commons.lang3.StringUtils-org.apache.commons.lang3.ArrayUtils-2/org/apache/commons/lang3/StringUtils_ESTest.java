/*

 * Tue Mar 03 16:13:05 GMT 2020
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
      boolean boolean0 = StringUtils.endsWith((String) null, (String) null);
      assertTrue(boolean0);
      
      String string0 = StringUtils.repeat("D$Q", 1);
      assertNotNull(string0);
      assertEquals("D$Q", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = StringUtils.repeat("|cC4}3KtULwln: Sk", 5);
      assertEquals("|cC4}3KtULwln: Sk|cC4}3KtULwln: Sk|cC4}3KtULwln: Sk|cC4}3KtULwln: Sk|cC4}3KtULwln: Sk", string0);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny("\u0001(u[Ba", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = StringUtils.repeat("|cC4}3KtULwln: Sk", 5);
      assertEquals("|cC4}3KtULwln: Sk|cC4}3KtULwln: Sk|cC4}3KtULwln: Sk|cC4}3KtULwln: Sk|cC4}3KtULwln: Sk", string0);
      assertNotNull(string0);
      
      String[] stringArray0 = StringUtils.splitPreserveAllTokens("|cC4}3KtULwln: Sk", "|cC4}3KtULwln: Sk|cC4}3KtULwln: Sk|cC4}3KtULwln: Sk|cC4}3KtULwln: Sk|cC4}3KtULwln: Sk", 5);
      boolean boolean0 = StringUtils.endsWithAny("|cC4}3KtULwln: Sk|cC4}3KtULwln: Sk|cC4}3KtULwln: Sk|cC4}3KtULwln: Sk|cC4}3KtULwln: Sk", stringArray0);
      assertEquals(5, stringArray0.length);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      boolean boolean0 = StringUtils.endsWithIgnoreCase((String) null, (String) null);
      assertTrue(boolean0);
      
      String string0 = StringUtils.repeat("|cC4}3KtULwln: Sk", 13);
      assertNotNull(string0);
      assertEquals("|cC4}3KtULwln: Sk|cC4}3KtULwln: Sk|cC4}3KtULwln: Sk|cC4}3KtULwln: Sk|cC4}3KtULwln: Sk|cC4}3KtULwln: Sk|cC4}3KtULwln: Sk|cC4}3KtULwln: Sk|cC4}3KtULwln: Sk|cC4}3KtULwln: Sk|cC4}3KtULwln: Sk|cC4}3KtULwln: Sk|cC4}3KtULwln: Sk", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = "\\u";
      String string1 = StringUtils.repeat(string0, 1);
      assertEquals("\\u", string1);
      assertNotNull(string1);
      
      String string2 = StringUtils.normalizeSpace("*[Qgwj'uQQr:");
      assertEquals("*[Qgwj'uQQr:", string2);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[2];
      StringUtils.endsWithAny("6Abix!1A7~Is.4", stringArray0);
      String string0 = StringUtils.repeat("", 1660);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = StringUtils.substring("%g.*xla", 1, 1);
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = StringUtils.repeat("%g.*xla", 1);
      assertEquals("%g.*xla", string0);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[4];
      stringArray0[0] = "%g.*xla";
      boolean boolean0 = StringUtils.endsWithAny("%g.*xla", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = StringUtils.repeat("5+ZtJh30o6C7Iblf5W", 1);
      assertNotNull(string0);
      assertEquals("5+ZtJh30o6C7Iblf5W", string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase("", "[iitX7H5i\" ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = StringUtils.chomp("%g.*xla", "%g.*xla");
      String[] stringArray0 = new String[1];
      boolean boolean0 = StringUtils.endsWithAny("", stringArray0);
      assertFalse(boolean0);
      
      String string1 = StringUtils.repeat(string0, 1);
      assertNotNull(string1);
      assertEquals("", string1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringUtils.repeat("", 1413);
      String string0 = StringUtils.normalizeSpace((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = StringUtils.repeat("", 831);
      String string1 = StringUtils.normalizeSpace("");
      assertTrue(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringUtils.repeat("9 L\ngt9:", 1784);
      String string0 = StringUtils.normalizeSpace((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = StringUtils.repeat("'g**xla", 97);
      assertNotNull(string0);
      assertEquals("'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla'g**xla", string0);
      
      String string1 = StringUtils.normalizeSpace("'g**xla");
      assertNotNull(string1);
      assertEquals("'g**xla", string1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = StringUtils.endsWithIgnoreCase((String) null, "L");
      assertFalse(boolean0);
      
      String string0 = StringUtils.repeat("xVh", 89);
      assertEquals("xVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVhxVh", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = StringUtils.repeat("bix!A7~Is.4", 1);
      assertNotNull(string0);
      assertEquals("bix!A7~Is.4", string0);
      
      boolean boolean0 = StringUtils.endsWithIgnoreCase((String) null, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = StringUtils.repeat("", 831);
      assertNotNull(string0);
      
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      boolean boolean0 = StringUtils.endsWithAny("Kt8", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringUtils.endsWith("xyD|~5t1:", ", Length: ");
      String string0 = StringUtils.repeat("Dl6lI*Lm^.Vx&2[1S 6", "Dl6lI*Lm^.Vx&2[1S 6", 2571);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = StringUtils.repeat("|cC4}3KtULwln: Sk", 5);
      assertNotNull(string0);
      assertEquals("|cC4}3KtULwln: Sk|cC4}3KtULwln: Sk|cC4}3KtULwln: Sk|cC4}3KtULwln: Sk|cC4}3KtULwln: Sk", string0);
      
      String[] stringArray0 = Locale.getISOCountries();
      boolean boolean0 = StringUtils.endsWithAny("|cC4}3KtULwln: Sk|cC4}3KtULwln: Sk|cC4}3KtULwln: Sk|cC4}3KtULwln: Sk|cC4}3KtULwln: Sk", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = StringUtils.repeat("", (int) '4');
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.endsWithAny("c5qppc{f^f ", (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = "\\u";
      String string1 = StringUtils.repeat(string0, 1);
      assertEquals("\\u", string1);
      assertNotNull(string1);
      
      boolean boolean0 = StringUtils.endsWithAny(string0, (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[13];
      boolean boolean0 = StringUtils.endsWithAny("?/T@", stringArray0);
      assertFalse(boolean0);
      
      String string0 = StringUtils.repeat("?/T@", 1);
      assertNotNull(string0);
      assertEquals("?/T@", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = StringUtils.repeat("", 1413);
      assertNotNull(string0);
      
      String[] stringArray0 = StringUtils.splitByWholeSeparator("The character must not be null", ", Length: ");
      boolean boolean0 = StringUtils.endsWithAny("T%M7'20[&@(d/Nv", stringArray0);
      assertFalse(boolean0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = StringUtils.repeat("", 831);
      assertNotNull(string0);
      
      String[] stringArray0 = Locale.getISOCountries();
      boolean boolean0 = StringUtils.endsWithAny("", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String[] stringArray0 = new String[1];
      StringUtils.endsWithAny("00", stringArray0);
      String string0 = StringUtils.repeat("00", "00", 521);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String[] stringArray0 = new String[1];
      boolean boolean0 = StringUtils.endsWithAny("", stringArray0);
      assertFalse(boolean0);
      
      String string0 = StringUtils.repeat("%g.*xla", 85);
      assertEquals("%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla%g.*xla", string0);
      assertNotNull(string0);
  }
}
