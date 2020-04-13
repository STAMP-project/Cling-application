/*

 * Tue Mar 03 16:11:13 GMT 2020
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
      ToStringStyle.unregister((Object) null);
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      Boolean boolean0 = Boolean.FALSE;
      toStringStyle0.append(stringBuffer0, "F", (Object) toStringStyle0, boolean0);
      assertEquals("<ToStringStyle.NoFieldNameToStringStyle>,", stringBuffer0.toString());
      assertEquals(41, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ToStringStyle.getRegistry();
      ToStringStyle.register((Object) null);
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      Boolean boolean0 = Boolean.FALSE;
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringStyle.unregister(standardToStringStyle0);
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      standardToStringStyle0.append(stringBuffer0, "a$s0r2qJntjH<D9U_K", (Object) toStringStyle0, boolean0);
      assertEquals("a$s0r2qJntjH<D9U_K=<ToStringStyle.NoFieldNameToStringStyle>,", stringBuffer0.toString());
      assertEquals(",", standardToStringStyle0.getArraySeparator());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("]");
      toStringStyle0.appendToString(stringBuffer0, "]");
      ToStringStyle toStringStyle1 = ToStringStyle.SHORT_PREFIX_STYLE;
      toStringStyle1.appendStart(stringBuffer0, toStringStyle0);
      assertEquals(40, stringBuffer0.length());
      assertEquals("]ToStringStyle.NoFieldNameToStringStyle[", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
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
  public void test4()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("+gEOqV0v9Q}b%;Vd'");
      toStringStyle0.appendToString(stringBuffer0, "+gEOqV0v9Q}b%;Vd'");
      ToStringStyle toStringStyle1 = ToStringStyle.SHORT_PREFIX_STYLE;
      toStringStyle1.appendStart(stringBuffer0, toStringStyle0);
      assertEquals("+gEOqV0v9Q}b%;Vd'ToStringStyle.NoFieldNameToStringStyle[", stringBuffer0.toString());
      assertEquals(56, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("]");
      toStringStyle0.appendToString(stringBuffer0, (String) null);
      ToStringStyle toStringStyle1 = ToStringStyle.SHORT_PREFIX_STYLE;
      toStringStyle1.appendStart(stringBuffer0, toStringStyle0);
      assertEquals("]ToStringStyle.NoFieldNameToStringStyle[", stringBuffer0.toString());
      assertEquals(40, stringBuffer0.length());
  }
}
