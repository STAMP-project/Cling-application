/*

 * Tue Mar 03 16:10:47 GMT 2020
 */

package org.apache.commons.lang3.builder;

import org.junit.Test;
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
      ToStringStyle.unregister((Object) null);
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
  public void test1()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      ToStringStyle.register(standardToStringStyle0);
      ToStringStyle.isRegistered(standardToStringStyle0);
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      Boolean boolean0 = new Boolean("f");
      standardToStringStyle0.append(stringBuffer0, "f", (Object) toStringStyle0, boolean0);
      assertEquals("f=<ToStringStyle.DefaultToStringStyle>,", stringBuffer0.toString());
      assertEquals(",", standardToStringStyle0.getFieldSeparator());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ToStringStyle.register((Object) null);
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
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
  public void test3()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "]");
      standardToStringStyle0.appendToString(stringBuffer0, "]");
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      Boolean boolean0 = new Boolean("java.lang.Long");
      toStringStyle0.append(stringBuffer0, "p)y(!!ad\"'uO", (Object) toStringStyle0, boolean0);
      assertEquals(51, stringBuffer0.length());
      assertEquals("]p)y(!!ad\"'uO=<ToStringStyle.DefaultToStringStyle>,", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      Boolean boolean0 = Boolean.FALSE;
      toStringStyle0.append(stringBuffer0, "N/9W-DYe0y&gS-dwh", (Object) toStringStyle0, boolean0);
      toStringStyle0.appendToString(stringBuffer0, "N/9W-DYe0y&gS-dwh");
      assertEquals("<ToStringStyle.SimpleToStringStyle>,N/9W-DYe0y&gS-dwh,", stringBuffer0.toString());
      assertEquals(54, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("N/9W@Y0y&gS-dh");
      toStringStyle0.appendToString(stringBuffer0, (String) null);
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
