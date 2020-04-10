/*

 * Tue Mar 03 16:11:36 GMT 2020
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
  @Ignore
  public void test0()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringStyle.register(stringBuffer0);
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      standardToStringStyle0.appendInternal(stringBuffer0, "=", stringBuffer0, false);
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      Boolean boolean0 = new Boolean((String) null);
      standardToStringStyle0.append(stringBuffer0, "waQy9IrJx~", (Object) toStringStyle0, boolean0);
      assertEquals(82, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      standardToStringStyle0.setContentEnd("=");
      standardToStringStyle0.appendToString(stringBuffer0, "=");
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      Boolean boolean0 = new Boolean((String) null);
      standardToStringStyle0.append(stringBuffer0, "waQy9IrJx~", (Object) toStringStyle0, boolean0);
      assertEquals("=", standardToStringStyle0.getContentEnd());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      standardToStringStyle0.appendToString(stringBuffer0, "=");
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      Boolean boolean0 = new Boolean((String) null);
      standardToStringStyle0.append(stringBuffer0, "waQy9IrJx~", (Object) toStringStyle0, boolean0);
      assertEquals("waQy9IrJx~=<ToStringStyle.NoFieldNameToStringStyle>,", stringBuffer0.toString());
      assertEquals(53, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) toStringStyle0;
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      standardToStringStyle0.DEFAULT_STYLE.appendInternal(stringBuffer0, "", objectArray0[0], false);
      standardToStringStyle0.appendToString(stringBuffer0, (String) null);
      assertEquals(40, stringBuffer0.length());
      assertEquals("=", standardToStringStyle0.getFieldNameValueSeparator());
  }
}
