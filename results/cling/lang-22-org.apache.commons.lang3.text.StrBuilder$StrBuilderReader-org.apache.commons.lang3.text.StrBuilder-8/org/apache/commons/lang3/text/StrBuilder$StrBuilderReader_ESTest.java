/*

 * Tue Mar 03 16:38:36 GMT 2020
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashSet;
import org.apache.commons.lang3.text.StrBuilder;
import org.apache.commons.lang3.text.StrMatcher;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class StrBuilder$StrBuilderReader_ESTest extends StrBuilder$StrBuilderReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("startIndex must be valid");
      HashSet<Object> hashSet0 = new HashSet<Object>();
      hashSet0.add(strBuilder0);
      assertEquals(24, strBuilder0.length());
      assertEquals(56, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.validateIndex(53);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 53
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.substring(3, 3);
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
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      assertFalse(strBuilder_StrBuilderReader0.ready());
      
      int int0 = strBuilder_StrBuilderReader0.read();
      assertEquals(0, strBuilder0.size());
      assertEquals(32, strBuilder0.capacity());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.deleteAll((StrMatcher) null);
      // Undeclared exception!
      try { 
        strBuilder0.charAt(578);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 578
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder strBuilder1 = strBuilder0.appendSeparator("startIndex must be valid", "startIndex must be valid");
      assertFalse(strBuilder0.isEmpty());
      
      StrMatcher strMatcher0 = StrMatcher.stringMatcher("startIndex must be valid");
      strBuilder1.deleteFirst(strMatcher0);
      assertEquals(0, strBuilder0.length());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("java.specification.name");
      StrBuilder strBuilder1 = strBuilder0.appendSeparator("java.specification.name", "java.specification.name");
      StrMatcher strMatcher0 = StrMatcher.stringMatcher("java.specification.name");
      strBuilder1.deleteFirst(strMatcher0);
      assertEquals(23, strBuilder0.size());
      assertEquals(55, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      assertEquals(32, strBuilder0.capacity());
      
      strBuilder0.minimizeCapacity();
      StrMatcher.NoMatcher strMatcher_NoMatcher0 = new StrMatcher.NoMatcher();
      strBuilder0.deleteAll((StrMatcher) strMatcher_NoMatcher0);
      strBuilder0.minimizeCapacity();
      assertEquals(0, strBuilder0.capacity());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("startIndex must be valid");
      strBuilder0.insert(15, "startIndex must be valid");
      assertEquals(48, strBuilder0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      try { 
        strBuilder0.validateIndex((-1040));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1040
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("startIndex must be valid");
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      StrMatcher strMatcher0 = StrMatcher.trimMatcher();
      strBuilder0.deleteFirst(strMatcher0);
      int int0 = strBuilder_StrBuilderReader0.read();
      assertEquals(23, strBuilder0.size());
      assertEquals(115, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrMatcher.TrimMatcher strMatcher_TrimMatcher0 = new StrMatcher.TrimMatcher();
      strBuilder0.deleteFirst((StrMatcher) strMatcher_TrimMatcher0);
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
  public void test12()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder((-2009));
      // Undeclared exception!
      try { 
        strBuilder0.validateRange((-2009), (-2009));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2009
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }
}
