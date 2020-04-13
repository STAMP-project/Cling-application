/*

 * Tue Mar 03 16:10:14 GMT 2020
 */

package org.apache.commons.lang3.builder;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.builder.StandardToStringStyle;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ToStringStyle_ESTest extends ToStringStyle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringStyle.unregister((Object) null);
      toStringStyle0.appendClassName(stringBuffer0, toStringStyle0);
      assertEquals(38, stringBuffer0.length());
      assertEquals("ToStringStyle.ShortPrefixToStringStyle", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringStyle.unregister(stringBuffer0);
      toStringStyle0.appendClassName(stringBuffer0, toStringStyle0);
      assertEquals("ToStringStyle.ShortPrefixToStringStyle", stringBuffer0.toString());
      assertEquals(38, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      Object object0 = new Object();
      toStringStyle0.NO_FIELD_NAMES_STYLE.appendIdentityHashCode(stringBuffer0, object0);
      toStringStyle0.appendInternal(stringBuffer0, "zBI{5TAWP", object0, true);
      toStringStyle0.appendClassName(stringBuffer0, toStringStyle0);
      assertEquals(72, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      toStringStyle0.appendClassName(stringBuffer0, toStringStyle0);
      ToStringStyle.register((Object) null);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      toStringStyle0.appendToString(stringBuffer0, "[java.lang.StringBuffer");
      toStringStyle0.appendClassName(stringBuffer0, toStringStyle0);
      assertEquals("ToStringStyle.ShortPrefixToStringStyle", stringBuffer0.toString());
      assertEquals(38, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      Boolean boolean0 = Boolean.valueOf("<size=");
      standardToStringStyle0.DEFAULT_STYLE.append(stringBuffer0, "<size=", (Object) toStringStyle0, boolean0);
      assertEquals(46, stringBuffer0.length());
      assertEquals("<size==<ToStringStyle.MultiLineToStringStyle>,", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      toStringStyle0.appendToString((StringBuffer) null, "]");
      // Undeclared exception!
      try { 
        toStringStyle0.appendStart((StringBuffer) null, toStringStyle0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.builder.ToStringStyle", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      toStringStyle0.appendToString((StringBuffer) null, (String) null);
      // Undeclared exception!
      try { 
        toStringStyle0.appendStart((StringBuffer) null, toStringStyle0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.builder.ToStringStyle", e);
      }
  }
}
