/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 21:25:08 GMT 2019
 */

package org.apache.commons.lang3.builder;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Stream;
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
      Integer integer0 = new Integer(13);
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      Class<Integer> class0 = Integer.class;
      String string0 = ToStringBuilder.reflectionToString(integer0, (ToStringStyle) standardToStringStyle0, true, (Class<? super Integer>) class0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      Class<Object> class0 = Object.class;
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder((Object) null, toStringStyle0, stringBuffer0, (Class<? super Object>) class0, false, false);
      assertFalse(reflectionToStringBuilder0.isAppendStatics());
      assertFalse(reflectionToStringBuilder0.isAppendTransients());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder("java.version");
      ReflectionToStringBuilder reflectionToStringBuilder1 = reflectionToStringBuilder0.setExcludeFieldNames((String[]) null);
      assertFalse(reflectionToStringBuilder1.isAppendStatics());
      assertFalse(reflectionToStringBuilder1.isAppendTransients());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      String string0 = ReflectionToStringBuilder.toString((Object) linkedList0, (ToStringStyle) standardToStringStyle0, true, true);
      assertFalse(linkedList0.contains(string0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Stream<String> stream0 = linkedList0.stream();
      String string0 = ToStringBuilder.reflectionToString((Object) stream0);
      assertFalse(linkedList0.contains(string0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = ReflectionToStringBuilder.toStringExclude((Object) null, (String) null);
      assertEquals("<null>", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      String string0 = ReflectionToStringBuilder.toStringExclude((Object) linkedList0, (Collection<String>) linkedList0);
      assertFalse(linkedList0.contains(string0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder("{va.NeRsMo");
      // Undeclared exception!
      try { 
        reflectionToStringBuilder0.reflectionAppendArray("{va.NeRsMo");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Argument is not an array
         //
         verifyException("java.lang.reflect.Array", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      String string0 = ReflectionToStringBuilder.toString((Object) "", toStringStyle0, false);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = ReflectionToStringBuilder.toStringExclude((Object) "java.veRsMon", (Collection<String>) null);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      Class<Object> class0 = Object.class;
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder((Object) "fnL&`!d%{", toStringStyle0, stringBuffer0, (Class<? super Object>) class0, true, true);
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
  public void test11()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder("java.lang.String@1[value={U,j,a,v,a,.,h,o,m,e},hash=-412542858]", standardToStringStyle0);
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
  public void test12()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      String string0 = ReflectionToStringBuilder.toString((Object) linkedList0, (ToStringStyle) standardToStringStyle0);
      assertFalse(linkedList0.contains(string0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder(object0, toStringStyle0, stringBuffer0);
      assertFalse(reflectionToStringBuilder0.isAppendStatics());
      assertFalse(reflectionToStringBuilder0.isAppendTransients());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = ReflectionToStringBuilder.toStringExclude((Object) "", "");
      assertNotNull(string0);
  }
}
