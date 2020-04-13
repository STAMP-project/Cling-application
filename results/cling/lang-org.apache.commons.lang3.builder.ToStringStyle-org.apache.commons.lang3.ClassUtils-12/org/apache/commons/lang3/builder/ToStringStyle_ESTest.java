/*

 * Tue Mar 03 16:11:13 GMT 2020
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
      ToStringStyle.unregister((Object) null);
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      Boolean boolean0 = Boolean.FALSE;
      toStringStyle0.append(stringBuffer0, "vu6J[F", (Object) toStringStyle0, boolean0);
      assertEquals("<ToStringStyle.NoFieldNameToStringStyle>,", stringBuffer0.toString());
      assertEquals(41, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      ToStringStyle.unregister("int");
      StringBuffer stringBuffer0 = new StringBuffer();
      Boolean boolean0 = Boolean.valueOf("int");
      toStringStyle0.append(stringBuffer0, "int", (Object) toStringStyle0, boolean0);
      assertEquals("<ToStringStyle.SimpleToStringStyle>,", stringBuffer0.toString());
      assertEquals(36, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringStyle.register(stringBuffer0);
      ToStringStyle.isRegistered(stringBuffer0);
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      ToStringStyle toStringStyle1 = ToStringStyle.SHORT_PREFIX_STYLE;
      toStringStyle1.appendStart(stringBuffer0, toStringStyle0);
      assertEquals(39, stringBuffer0.length());
      assertEquals("ToStringStyle.NoFieldNameToStringStyle[", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ToStringStyle.register((Object) null);
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      Boolean boolean0 = Boolean.valueOf(false);
      standardToStringStyle0.append(stringBuffer0, "K3sE4_*", (Object) toStringStyle0, boolean0);
      assertEquals(49, stringBuffer0.length());
      assertEquals("K3sE4_*=<ToStringStyle.NoFieldNameToStringStyle>,", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      toStringStyle0.SHORT_PREFIX_STYLE.appendToString(stringBuffer0, "'XE=nVn)S|lQ:");
      ToStringStyle toStringStyle1 = ToStringStyle.SHORT_PREFIX_STYLE;
      toStringStyle1.appendStart(stringBuffer0, toStringStyle0);
      assertEquals(39, stringBuffer0.length());
      assertEquals("ToStringStyle.NoFieldNameToStringStyle[", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      StringBuffer stringBuffer0 = new StringBuffer();
      standardToStringStyle0.appendToString(stringBuffer0, "]");
      Boolean boolean0 = new Boolean((String) null);
      toStringStyle0.append(stringBuffer0, (String) null, (Object) toStringStyle0, boolean0);
      assertEquals(36, stringBuffer0.length());
      assertEquals("<ToStringStyle.SimpleToStringStyle>,", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      ToStringStyle toStringStyle1 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      toStringStyle1.appendStart(stringBuffer0, toStringStyle0);
      toStringStyle0.appendToString(stringBuffer0, (String) null);
      assertEquals("ToStringStyle.NoFieldNameToStringStyle[", stringBuffer0.toString());
      assertEquals(39, stringBuffer0.length());
  }
}
