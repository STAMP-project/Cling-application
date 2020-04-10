/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 19:42:08 GMT 2019
 */

package org.apache.commons.lang3.builder;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.builder.StandardToStringStyle;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ToStringStyle_ESTest extends ToStringStyle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      ToStringStyle toStringStyle1 = ToStringStyle.SHORT_PREFIX_STYLE;
      toStringStyle1.SHORT_PREFIX_STYLE.appendEnd(stringBuffer0, toStringStyle0);
      toStringStyle1.appendStart(stringBuffer0, toStringStyle0);
      assertEquals(35, stringBuffer0.length());
      assertEquals("]ToStringStyle.SimpleToStringStyle[", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ToStringStyle.register((Object) null);
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("FK-Y:w0");
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      Boolean boolean0 = new Boolean("'2w8M");
      standardToStringStyle0.append(stringBuffer0, "'2w8M", (Object) toStringStyle0, boolean0);
      assertEquals(49, stringBuffer0.length());
      assertEquals("FK-Y:w0'2w8M=<ToStringStyle.SimpleToStringStyle>,", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringStyle.register(stringBuffer0);
      ToStringStyle.isRegistered(stringBuffer0);
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      ToStringStyle toStringStyle1 = ToStringStyle.SHORT_PREFIX_STYLE;
      toStringStyle1.appendStart(stringBuffer0, toStringStyle0);
      assertEquals("ToStringStyle.SimpleToStringStyle[", stringBuffer0.toString());
      assertEquals(34, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ToStringStyle.unregister((Object) null);
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      Boolean boolean0 = Boolean.FALSE;
      StringBuffer stringBuffer0 = new StringBuffer(1072);
      standardToStringStyle0.append(stringBuffer0, "4:u", (Object) toStringStyle0, boolean0);
      assertEquals(40, stringBuffer0.length());
      assertFalse(standardToStringStyle0.isUseShortClassName());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      toStringStyle0.appendSuper(stringBuffer0, (String) null);
      Boolean boolean0 = Boolean.valueOf((String) null);
      toStringStyle0.append(stringBuffer0, (String) null, (Object) toStringStyle0, boolean0);
      assertEquals("<ToStringStyle.DefaultToStringStyle>,", stringBuffer0.toString());
      assertEquals(37, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      ToStringStyle toStringStyle1 = ToStringStyle.SHORT_PREFIX_STYLE;
      toStringStyle1.appendStart(stringBuffer0, toStringStyle0);
      toStringStyle0.appendToString(stringBuffer0, "org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle");
      assertEquals(106, stringBuffer0.length());
      assertEquals("ToStringStyle.SimpleToStringStyle[org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle,", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      standardToStringStyle0.appendToString(stringBuffer0, "]");
      Boolean boolean0 = Boolean.FALSE;
      standardToStringStyle0.append(stringBuffer0, "]", (Object) toStringStyle0, boolean0);
      assertEquals(43, stringBuffer0.length());
      assertEquals("]=<ToStringStyle.NoFieldNameToStringStyle>,", stringBuffer0.toString());
  }
}
