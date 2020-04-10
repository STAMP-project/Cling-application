/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 21:31:41 GMT 2019
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
      boolean boolean0 = CharUtils.isAsciiAlphanumeric('\u001A');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlphanumeric('|');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlphanumeric('l');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlphanumeric('C');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlphanumeric('2');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlphaLower('|');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlphaLower('m');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlphaLower('Z');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlphaUpper('|');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlphaUpper('E');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlphaUpper('#');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlpha('l');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlpha('\u008B');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlpha('D');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiAlpha('7');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiControl('!');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiControl('');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiControl('\u001F');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiPrintable('\u008B');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiPrintable('!');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      boolean boolean0 = CharUtils.isAsciiPrintable('\n');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      boolean boolean0 = CharUtils.isAscii('\u0019');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      boolean boolean0 = CharUtils.isAscii('\u0094');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = CharUtils.unicodeEscaped((Character) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Character character0 = CharUtils.toCharacterObject('U');
      String string0 = CharUtils.unicodeEscaped(character0);
      assertNotNull(string0);
      assertEquals("\\u0055", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = CharUtils.unicodeEscaped('\u000E');
      assertEquals("\\u000e", string0);
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
      String string0 = CharUtils.toString((Character) '\r');
      assertEquals("\r", string0);
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
      Character character0 = CharUtils.toCharacterObject('X');
      // Undeclared exception!
      try { 
        CharUtils.toIntValue(character0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The character X is not in the range '0' - '9'
         //
         verifyException("org.apache.commons.lang3.CharUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Character character0 = Character.valueOf('a');
      int int0 = CharUtils.toIntValue(character0, (int) 'a');
      assertEquals(97, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      int int0 = CharUtils.toIntValue('6', (-4275));
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        CharUtils.toIntValue('+');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The character + is not in the range '0' - '9'
         //
         verifyException("org.apache.commons.lang3.CharUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      int int0 = CharUtils.toIntValue('1');
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      char char0 = CharUtils.toChar("", 't');
      assertEquals('t', char0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      char char0 = CharUtils.toChar("is", '*');
      assertEquals('i', char0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
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
  public void test40()  throws Throwable  {
      char char0 = CharUtils.toChar("e& ");
      assertEquals('e', char0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      char char0 = CharUtils.toChar((Character) null, '\uD7BB');
      assertEquals('\uD7BB', char0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Character character0 = Character.valueOf('5');
      char char0 = CharUtils.toChar(character0, '5');
      assertEquals('5', char0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
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
  public void test44()  throws Throwable  {
      Character character0 = Character.valueOf('V');
      char char0 = CharUtils.toChar(character0);
      assertEquals('V', char0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Character character0 = CharUtils.toCharacterObject("");
      assertNull(character0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Character character0 = CharUtils.toCharacterObject("1");
      assertEquals('1', (char)character0);
      assertNotNull(character0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Character character0 = CharUtils.toCharacterObject('\uD7BA');
      assertEquals('\uD7BA', (char)character0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CharUtils charUtils0 = new CharUtils();
      assertEquals('\r', CharUtils.CR);
  }
}
