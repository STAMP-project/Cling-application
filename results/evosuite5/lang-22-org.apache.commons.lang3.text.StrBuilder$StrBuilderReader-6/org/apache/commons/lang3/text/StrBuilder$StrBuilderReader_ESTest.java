/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 21:29:07 GMT 2019
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.text.StrBuilder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class StrBuilder$StrBuilderReader_ESTest extends StrBuilder$StrBuilderReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("");
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      long long0 = strBuilder_StrBuilderReader0.skip(2916L);
      assertEquals(0L, long0);
      assertFalse(strBuilder_StrBuilderReader0.ready());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      long long0 = strBuilder_StrBuilderReader0.skip((-525L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("");
      strBuilder0.appendln(0.0);
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      char[] charArray0 = new char[6];
      int int0 = strBuilder_StrBuilderReader0.read(charArray0);
      assertFalse(strBuilder_StrBuilderReader0.ready());
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      char[] charArray0 = new char[1];
      strBuilder0.insert(0, charArray0);
      int int0 = strBuilder_StrBuilderReader0.read(charArray0);
      assertEquals(1, int0);
      assertFalse(strBuilder_StrBuilderReader0.ready());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      char[] charArray0 = new char[1];
      int int0 = strBuilder_StrBuilderReader0.read(charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        strBuilder_StrBuilderReader0.read(charArray0, 1, Integer.MAX_VALUE);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder$StrBuilderReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      char[] charArray0 = new char[16];
      // Undeclared exception!
      try { 
        strBuilder_StrBuilderReader0.read(charArray0, 0, 802);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder$StrBuilderReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        strBuilder_StrBuilderReader0.read(charArray0, (int) ':', (int) ':');
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder$StrBuilderReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        strBuilder_StrBuilderReader0.read(charArray0, 0, (-3039));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder$StrBuilderReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      char[] charArray0 = new char[1];
      int int0 = strBuilder_StrBuilderReader0.read(charArray0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        strBuilder_StrBuilderReader0.read(charArray0, (-619), (-2463));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder$StrBuilderReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      assertFalse(strBuilder_StrBuilderReader0.ready());
      
      int int0 = strBuilder_StrBuilderReader0.read();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("");
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      boolean boolean0 = strBuilder_StrBuilderReader0.markSupported();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("na8_");
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      strBuilder_StrBuilderReader0.mark((-1));
      assertTrue(strBuilder_StrBuilderReader0.ready());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("!Xv2whdORdX8CBPy!");
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      strBuilder_StrBuilderReader0.reset();
      assertTrue(strBuilder_StrBuilderReader0.markSupported());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("AHoD?bs$");
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      strBuilder_StrBuilderReader0.close();
      assertTrue(strBuilder_StrBuilderReader0.ready());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      assertFalse(strBuilder_StrBuilderReader0.ready());
      
      strBuilder0.appendln('+');
      int int0 = strBuilder_StrBuilderReader0.read();
      assertTrue(strBuilder_StrBuilderReader0.ready());
      assertEquals(43, int0);
  }
}
