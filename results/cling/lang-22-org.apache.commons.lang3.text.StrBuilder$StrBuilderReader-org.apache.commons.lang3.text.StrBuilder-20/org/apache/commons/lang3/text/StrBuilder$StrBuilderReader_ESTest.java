/*

 * Tue Mar 03 16:41:27 GMT 2020
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
import org.junit.Ignore;
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
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.insert(2366, (double) 2366);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 2366
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      assertFalse(strBuilder_StrBuilderReader0.ready());
      
      int int0 = strBuilder_StrBuilderReader0.read();
      assertEquals(32, strBuilder0.capacity());
      assertEquals((-1), int0);
      assertEquals(0, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("EJ<g,Il9WHB)=");
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      strBuilder_StrBuilderReader0.read();
      // Undeclared exception!
      try { 
        strBuilder0.substring(69);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.appendSeparator("D0n$n{\"2$bB+DM]");
      StrMatcher strMatcher0 = StrMatcher.trimMatcher();
      StrBuilder strBuilder1 = strBuilder0.deleteAll(strMatcher0);
      assertEquals(32, strBuilder1.capacity());
      assertTrue(strBuilder1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("EJ<g,Il9WHB)=");
      StrBuilder strBuilder1 = strBuilder0.appendSeparator("EJ<g,Il9WHB)=");
      // Undeclared exception!
      try { 
        strBuilder1.substring(69);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.minimizeCapacity();
      strBuilder1.minimizeCapacity();
      // Undeclared exception!
      try { 
        strBuilder0.delete(97, 1379);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // end < start
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.insert((-531), (float) (-531));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -531
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      strBuilder0.insert(0, (Object) strBuilder_StrBuilderReader0);
      char char0 = strBuilder0.charAt(0);
      assertEquals(66, strBuilder0.size());
      assertEquals('o', char0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrMatcher strMatcher0 = StrMatcher.trimMatcher();
      strBuilder0.deleteAll(strMatcher0);
      // Undeclared exception!
      try { 
        strBuilder0.charAt((-1));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.substring((-2031));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2031
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrMatcher strMatcher0 = StrMatcher.commaMatcher();
      strBuilder0.deleteAll(strMatcher0);
      // Undeclared exception!
      try { 
        strBuilder0.charAt(0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 0
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }
}
