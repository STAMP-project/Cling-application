/*

 * Tue Mar 03 16:41:00 GMT 2020
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
      StrBuilder strBuilder0 = new StrBuilder("end < start");
      // Undeclared exception!
      try { 
        strBuilder0.insert(108, (long) 108);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 108
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.toCharArray(2147483646, 102);
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
      assertFalse(strBuilder_StrBuilderReader0.ready());
      
      int int0 = strBuilder_StrBuilderReader0.read();
      assertEquals(0, strBuilder0.size());
      assertEquals(32, strBuilder0.capacity());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.singleQuoteMatcher();
      StrBuilder strBuilder0 = new StrBuilder(37);
      StrBuilder strBuilder1 = strBuilder0.deleteFirst(strMatcher0);
      // Undeclared exception!
      try { 
        strBuilder1.charAt(37);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 37
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.appendSeparator("Vr>TAg");
      StrMatcher strMatcher0 = StrMatcher.tabMatcher();
      StrBuilder strBuilder1 = strBuilder0.replaceFirst(strMatcher0, "");
      assertEquals(32, strBuilder1.capacity());
      assertEquals(0, strBuilder1.length());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("Vr>TAg");
      strBuilder0.appendSeparator("Vr>TAg");
      StrMatcher strMatcher0 = StrMatcher.tabMatcher();
      strBuilder0.replaceFirst(strMatcher0, "");
      assertEquals(12, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      assertEquals(32, strBuilder0.capacity());
      
      strBuilder0.minimizeCapacity();
      StrBuilder strBuilder1 = strBuilder0.minimizeCapacity();
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher((char[]) null);
      strBuilder1.deleteAll(strMatcher0);
      assertEquals(0, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("V>Tj|g");
      strBuilder0.validateIndex(2);
      assertEquals(6, strBuilder0.length());
      assertEquals(38, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.insert((-4659), (-4659));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -4659
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder((-1460));
      StrMatcher strMatcher0 = StrMatcher.splitMatcher();
      StrBuilder strBuilder1 = strBuilder0.deleteFirst(strMatcher0);
      // Undeclared exception!
      try { 
        strBuilder1.charAt((-1460));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1460
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder((-1955));
      // Undeclared exception!
      try { 
        strBuilder0.substring((-1955));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1955
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("Vr>TAg");
      StrMatcher strMatcher0 = StrMatcher.tabMatcher();
      strBuilder0.replaceFirst(strMatcher0, "");
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      int int0 = strBuilder_StrBuilderReader0.read();
      assertEquals(6, strBuilder0.size());
      assertEquals(38, strBuilder0.capacity());
      assertEquals(86, int0);
  }
}
