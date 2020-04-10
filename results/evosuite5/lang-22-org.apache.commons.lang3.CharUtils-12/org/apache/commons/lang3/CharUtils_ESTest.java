/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 16:07:13 GMT 2019
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
      boolean boolean0 = CharUtils.isAsciiAlphanumeric('\r');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlphanumeric('i');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlphanumeric('I');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlphanumeric('\u008E');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlphanumeric('5');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiNumeric('\u008E');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlphaLower('~');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlphaLower('i');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlphaLower(']');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlphaUpper(']');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlphaUpper('J');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlphaUpper('4');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlpha('~');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlpha('i');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlpha('D');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlpha('<');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiControl(']');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiControl('');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiControl('\n');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiPrintable('i');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiPrintable('');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiPrintable('\n');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      boolean boolean0 = CharUtils.isAscii('i');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      boolean boolean0 = CharUtils.isAscii('\u0097');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = CharUtils.unicodeEscaped((Character) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Character character0 = new Character('@');
      String string0 = CharUtils.unicodeEscaped(character0);
      assertEquals("\\u0040", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = CharUtils.unicodeEscaped('\n');
      assertEquals("\\u000a", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = CharUtils.unicodeEscaped('\uD7BF');
      assertEquals("\\ud7bf", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String string0 = CharUtils.toString((Character) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = CharUtils.toString('\uD7B8');
      assertEquals("\uD7B8", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int int0 = CharUtils.toIntValue((Character) null, (int) 'J');
      assertEquals(74, int0);
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
      int int0 = CharUtils.toIntValue('\u001E', (int) '\u001E');
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int int0 = CharUtils.toIntValue('2', (int) '2');
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        CharUtils.toIntValue((Character) '\r');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The character \r is not in the range '0' - '9'
         //
         verifyException("org.apache.commons.lang3.CharUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Character character0 = CharUtils.toCharacterObject('5');
      assertEquals('5', (char)character0);
      
      int int0 = CharUtils.toIntValue(character0);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      char char0 = CharUtils.toChar("", '\n');
      assertEquals('\n', char0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      char char0 = CharUtils.toChar("\uD7B8", '\uD7B8');
      assertEquals('\uD7B8', char0);
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
      char char0 = CharUtils.toChar("Dz");
      assertEquals('D', char0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      char char0 = CharUtils.toChar((Character) null, '\uD7BF');
      assertEquals('\uD7BF', char0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Character character0 = CharUtils.toCharacterObject('Q');
      char char0 = CharUtils.toChar(character0, 'Q');
      assertEquals('Q', char0);
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
      Character character0 = CharUtils.toCharacterObject('L');
      char char0 = CharUtils.toChar(character0);
      assertEquals('L', char0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Character character0 = CharUtils.toCharacterObject("");
      assertNull(character0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Character character0 = CharUtils.toCharacterObject("...");
      assertNotNull(character0);
      assertEquals('.', (char)character0);
      
      int int0 = CharUtils.toIntValue(character0, 65);
      assertEquals(65, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Character character0 = CharUtils.toCharacterObject('Y');
      String string0 = CharUtils.toString(character0);
      assertNotNull(string0);
      assertEquals("Y", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Character character0 = CharUtils.toCharacterObject('\uD7BF');
      assertEquals('\uD7BF', (char)character0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CharUtils charUtils0 = new CharUtils();
      assertEquals('\n', CharUtils.LF);
  }
}
