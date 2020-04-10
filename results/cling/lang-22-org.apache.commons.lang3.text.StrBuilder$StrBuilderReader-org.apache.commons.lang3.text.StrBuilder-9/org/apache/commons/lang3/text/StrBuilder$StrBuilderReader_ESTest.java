/*

 * Tue Mar 03 16:38:54 GMT 2020
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.text.StrBuilder;
import org.apache.commons.lang3.text.StrMatcher;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class StrBuilder$StrBuilderReader_ESTest extends StrBuilder$StrBuilderReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("9=U;>^kG3A5Q?fZX");
      strBuilder0.insert(2, 2);
      assertEquals(17, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.toCharArray(115, 115);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      boolean boolean0 = strBuilder_StrBuilderReader0.ready();
      assertEquals(32, strBuilder0.capacity());
      assertFalse(boolean0);
      assertEquals(0, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.appendSeparator("HR.*dzeyz'%U'b:s");
      StrMatcher strMatcher0 = StrMatcher.doubleQuoteMatcher();
      StrBuilder strBuilder1 = strBuilder0.deleteFirst(strMatcher0);
      assertEquals(32, strBuilder1.capacity());
      assertEquals(0, strBuilder1.length());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("%W<qr7E);n\"gITbq");
      StrMatcher.CharMatcher strMatcher_CharMatcher0 = new StrMatcher.CharMatcher('z');
      strBuilder0.deleteAll((StrMatcher) strMatcher_CharMatcher0);
      strBuilder0.appendSeparator("%W<qr7E);n\"gITbq");
      assertEquals(34, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      assertEquals(32, strBuilder0.capacity());
      
      strBuilder0.minimizeCapacity();
      StrBuilder strBuilder1 = strBuilder0.minimizeCapacity();
      strBuilder1.replaceFirst((StrMatcher) null, "3^\"H tSR(");
      assertEquals(0, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.validateIndex(3);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 3
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.insert((-4229), (-4229));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -4229
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("*nNb");
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      int int0 = strBuilder_StrBuilderReader0.read();
      assertEquals(42, int0);
      
      StrMatcher.NoMatcher strMatcher_NoMatcher0 = new StrMatcher.NoMatcher();
      StrBuilder strBuilder1 = strBuilder0.deleteFirst((StrMatcher) strMatcher_NoMatcher0);
      assertEquals(36, strBuilder1.capacity());
      assertEquals(4, strBuilder1.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrMatcher strMatcher0 = StrMatcher.commaMatcher();
      strBuilder0.deleteFirst(strMatcher0);
      // Undeclared exception!
      try { 
        strBuilder0.charAt((-931));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -931
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder(4094);
      // Undeclared exception!
      try { 
        strBuilder0.toCharArray((-3121), 4094);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -3121
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrMatcher strMatcher0 = StrMatcher.quoteMatcher();
      strBuilder0.replaceAll(strMatcher0, "");
      // Undeclared exception!
      try { 
        strBuilder0.charAt(32);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 32
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }
}
