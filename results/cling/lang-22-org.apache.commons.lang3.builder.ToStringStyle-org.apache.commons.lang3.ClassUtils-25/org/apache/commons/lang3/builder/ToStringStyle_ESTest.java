/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 19:47:25 GMT 2019
 */

package org.apache.commons.lang3.builder;

import org.junit.Test;
import org.junit.Ignore;
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
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      ToStringStyle.unregister(toStringStyle0);
      StringBuffer stringBuffer0 = new StringBuffer();
      toStringStyle0.appendStart(stringBuffer0, toStringStyle0);
      assertEquals("ToStringStyle.ShortPrefixToStringStyle[", stringBuffer0.toString());
      assertEquals(39, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ToStringStyle.register((Object) null);
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      Boolean boolean0 = Boolean.valueOf("(\"},FZ,gAM");
      toStringStyle0.append(stringBuffer0, "(\"},FZ,gAM", (Object) toStringStyle0, boolean0);
      assertEquals("(\"},FZ,gAM=<ToStringStyle.DefaultToStringStyle>,", stringBuffer0.toString());
      assertEquals(48, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      toStringStyle0.appendStart(stringBuffer0, toStringStyle0);
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      Object[] objectArray0 = new Object[9];
      objectArray0[6] = (Object) toStringStyle0;
      Boolean boolean0 = new Boolean(true);
      standardToStringStyle0.append(stringBuffer0, (String) null, objectArray0, boolean0);
      assertEquals(178, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ToStringStyle.unregister((Object) null);
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      Boolean boolean0 = Boolean.FALSE;
      toStringStyle0.append(stringBuffer0, "s)5B/J", (Object) toStringStyle0, boolean0);
      assertEquals("s)5B/J=<ToStringStyle.ShortPrefixToStringStyle>,", stringBuffer0.toString());
      assertEquals(48, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      toStringStyle0.appendToString(stringBuffer0, (String) null);
      toStringStyle0.appendStart(stringBuffer0, toStringStyle0);
      assertEquals(39, stringBuffer0.length());
      assertEquals("ToStringStyle.ShortPrefixToStringStyle[", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      toStringStyle0.appendToString(stringBuffer0, "java.vm.specification.vendor");
      ToStringStyle toStringStyle1 = ToStringStyle.SHORT_PREFIX_STYLE;
      toStringStyle1.appendStart(stringBuffer0, toStringStyle0);
      assertEquals("java.vm.specification.vendor,ToStringStyle.SimpleToStringStyle[", stringBuffer0.toString());
      assertEquals(63, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      toStringStyle0.appendToString(stringBuffer0, "");
      Boolean boolean0 = new Boolean("[org.apache.commons.lang3.builder.StandardToStringStyle");
      toStringStyle0.append(stringBuffer0, "", (Object) toStringStyle0, boolean0);
      assertEquals("<ToStringStyle.SimpleToStringStyle>,", stringBuffer0.toString());
      assertEquals(36, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test7()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      toStringStyle0.appendStart(stringBuffer0, toStringStyle0);
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      Object[] objectArray0 = new Object[9];
      objectArray0[2] = (Object) standardToStringStyle0;
      Boolean boolean0 = new Boolean(true);
      standardToStringStyle0.append(stringBuffer0, (String) null, objectArray0, boolean0);
      assertEquals(161, stringBuffer0.length());
  }
}
