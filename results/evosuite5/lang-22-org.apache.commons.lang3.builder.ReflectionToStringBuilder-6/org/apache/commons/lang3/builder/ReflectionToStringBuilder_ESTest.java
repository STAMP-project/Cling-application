/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 21:25:12 GMT 2019
 */

package org.apache.commons.lang3.builder;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.IntStream;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
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
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder(toStringStyle0);
      ReflectionToStringBuilder reflectionToStringBuilder1 = reflectionToStringBuilder0.setExcludeFieldNames((String[]) null);
      assertFalse(reflectionToStringBuilder1.isAppendTransients());
      assertFalse(reflectionToStringBuilder1.isAppendStatics());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      String string0 = ReflectionToStringBuilder.toStringExclude((Object) linkedList0, (Collection<String>) linkedList0);
      assertFalse(linkedList0.contains(string0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      IntStream intStream0 = stringBuffer0.chars();
      String string0 = ReflectionToStringBuilder.toStringExclude((Object) intStream0, "Specified class is not a superclass of the object");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[1];
      String string0 = ReflectionToStringBuilder.toStringExclude((Object) "zwbD=bTd", stringArray0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = ReflectionToStringBuilder.toNoNullStringArray((Collection<String>) null);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "java.lang.String@1[value={z,w,b,D,=,b,T,d},hash=-1016377932]");
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      Class<Object> class0 = Object.class;
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder((Object) linkedList0, toStringStyle0, stringBuffer0, (Class<? super Object>) class0, true, true);
      reflectionToStringBuilder0.toString();
      assertEquals(176, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder("?");
      // Undeclared exception!
      try { 
        reflectionToStringBuilder0.reflectionAppendArray("?");
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
      String string0 = ReflectionToStringBuilder.toString((Object) null);
      assertEquals("<null>", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      String string0 = ReflectionToStringBuilder.toString(object0, toStringStyle0, false);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      String string0 = ReflectionToStringBuilder.toString((Object) toStringStyle0, toStringStyle0, false, false);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder("java.lang.String@1[value={z,w,b,D,=,b,T,d},hash=-1016377932]", toStringStyle0);
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
  public void test13()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      String string0 = ReflectionToStringBuilder.toString((Object) null, toStringStyle0);
      assertEquals("<null>", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object object0 = new Object();
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder(object0, (ToStringStyle) null, (StringBuffer) null);
      assertFalse(reflectionToStringBuilder0.isAppendStatics());
      assertFalse(reflectionToStringBuilder0.isAppendTransients());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      Integer integer0 = new Integer((-801));
      Class<Integer> class0 = Integer.class;
      String string0 = ReflectionToStringBuilder.toString(integer0, toStringStyle0, false, false, (Class<? super Integer>) class0);
      assertNotNull(string0);
  }
}
