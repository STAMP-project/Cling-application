/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 16:07:04 GMT 2019
 */

package org.apache.commons.lang3.builder;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.StandardToStringStyle;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ReflectionToStringBuilder_ESTest extends ReflectionToStringBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object object0 = new Object();
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder(object0);
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        reflectionToStringBuilder0.setUpToClass(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Specified class is not a superclass of the object
         //
         verifyException("org.apache.commons.lang3.builder.ReflectionToStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder((Object) null);
      Class<Object> class0 = Object.class;
      reflectionToStringBuilder0.setUpToClass(class0);
      assertFalse(reflectionToStringBuilder0.isAppendTransients());
      assertFalse(reflectionToStringBuilder0.isAppendStatics());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder("gH'+c~");
      ReflectionToStringBuilder reflectionToStringBuilder1 = reflectionToStringBuilder0.setExcludeFieldNames((String[]) null);
      assertFalse(reflectionToStringBuilder1.isAppendTransients());
      assertFalse(reflectionToStringBuilder1.isAppendStatics());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      Class<String> class0 = String.class;
      String string0 = ReflectionToStringBuilder.toString("java.runtime.version", (ToStringStyle) standardToStringStyle0, true, true, (Class<? super String>) class0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      String string0 = ReflectionToStringBuilder.toString((Object) linkedList0, toStringStyle0, true);
      assertFalse(linkedList0.contains(string0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      Set<String> set0 = hashMap0.keySet();
      String string0 = ReflectionToStringBuilder.toStringExclude((Object) set0, (Collection<String>) set0);
      assertFalse(set0.contains(string0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = ReflectionToStringBuilder.toStringExclude((Object) null, (String) null);
      assertEquals("<null>", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = ReflectionToStringBuilder.toStringExclude((Object) null, (Collection<String>) null);
      assertEquals("<null>", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder("long");
      // Undeclared exception!
      try { 
        reflectionToStringBuilder0.reflectionAppendArray("long");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Argument is not an array
         //
         verifyException("java.lang.reflect.Array", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      String string0 = ReflectionToStringBuilder.toStringExclude((Object) linkedList0, (Collection<String>) linkedList0);
      assertFalse(linkedList0.contains(string0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      String string0 = ReflectionToStringBuilder.toString((Object) null, toStringStyle0, true, true);
      assertEquals("<null>", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder((Object) null);
      // Undeclared exception!
      try { 
        reflectionToStringBuilder0.getExcludeFieldNames();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.builder.ReflectionToStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder(object0, toStringStyle0);
      assertFalse(reflectionToStringBuilder0.isAppendTransients());
      assertFalse(reflectionToStringBuilder0.isAppendStatics());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      String string0 = ToStringBuilder.reflectionToString((Object) toStringStyle0, toStringStyle0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder("awt.toolkit", toStringStyle0, stringBuffer0);
      assertFalse(reflectionToStringBuilder0.isAppendStatics());
      assertFalse(reflectionToStringBuilder0.isAppendTransients());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = ReflectionToStringBuilder.toString((Object) "'dCWv&u");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = ReflectionToStringBuilder.toStringExclude((Object) "0", "0");
      assertNotNull(string0);
  }
}
