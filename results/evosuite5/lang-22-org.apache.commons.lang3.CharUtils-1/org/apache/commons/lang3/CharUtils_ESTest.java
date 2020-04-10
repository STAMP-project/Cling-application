/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 21:26:41 GMT 2019
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.CharUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class CharUtils_ESTest extends CharUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlphanumeric('5');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlphanumeric('u');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlphanumeric('\u0081');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlphanumeric('B');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlphanumeric('\r');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlphaLower('i');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlphaLower('');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlphaLower('\r');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlphaUpper('\u0096');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlphaUpper('J');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlphaUpper('\r');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlpha('p');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlpha('F');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlpha('\u0099');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlpha('$');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiControl('E');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiControl('');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiControl('\r');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiPrintable('/');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiPrintable('\u008D');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiPrintable('\r');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      boolean boolean0 = CharUtils.isAscii('y');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      boolean boolean0 = CharUtils.isAscii('\u0087');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = CharUtils.unicodeEscaped((Character) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Character character0 = new Character(' ');
      String string0 = CharUtils.unicodeEscaped(character0);
      assertNotNull(string0);
      assertEquals("\\u0020", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = CharUtils.unicodeEscaped('\r');
      assertEquals("\\u000d", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = CharUtils.unicodeEscaped('\uD7BC');
      assertEquals("\\ud7bc", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = CharUtils.toString((Character) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Character character0 = CharUtils.toCharacterObject("U");
      String string0 = CharUtils.toString(character0);
      assertEquals("U", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = CharUtils.toString('\u0085');
      assertEquals("\u0085", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int int0 = CharUtils.toIntValue((Character) null, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        CharUtils.toIntValue((Character) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The character must not be null
         //
         verifyException("org.apache.commons.lang3.CharUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Character character0 = new Character('0');
      int int0 = CharUtils.toIntValue(character0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int int0 = CharUtils.toIntValue('u', (int) 'u');
      assertEquals(117, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Character character0 = Character.valueOf('0');
      int int0 = CharUtils.toIntValue(character0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        CharUtils.toIntValue('%');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The character % is not in the range '0' - '9'
         //
         verifyException("org.apache.commons.lang3.CharUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      char char0 = CharUtils.toChar("", '`');
      assertEquals('`', char0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      char char0 = CharUtils.toChar("Qpa\"|J<", '\r');
      assertEquals('Q', char0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      // Undeclared exception!
      try { 
        CharUtils.toChar("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String must not be empty
         //
         verifyException("org.apache.commons.lang3.CharUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      char char0 = CharUtils.toChar("gN(/</^X)9Q5?W/");
      assertEquals('g', char0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      char char0 = CharUtils.toChar((Character) null, '|');
      assertEquals('|', char0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Character character0 = CharUtils.toCharacterObject('@');
      char char0 = CharUtils.toChar(character0, '@');
      assertEquals('@', char0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      // Undeclared exception!
      try { 
        CharUtils.toChar((Character) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Character must not be null
         //
         verifyException("org.apache.commons.lang3.CharUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      char char0 = CharUtils.toChar((Character) '\r');
      assertEquals('\r', char0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Character character0 = CharUtils.toCharacterObject("");
      assertNull(character0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Character character0 = CharUtils.toCharacterObject('\u008F');
      assertEquals('\u008F', (char)character0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CharUtils charUtils0 = new CharUtils();
      assertEquals('\r', CharUtils.CR);
  }
}
