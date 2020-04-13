/*

 * Tue Mar 03 16:11:18 GMT 2020
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
      StringBuffer stringBuffer0 = new StringBuffer("NK#%/D#ji");
      toStringStyle0.appendStart(stringBuffer0, toStringStyle0);
      toStringStyle0.appendEnd(stringBuffer0, (Object) null);
      assertEquals(49, stringBuffer0.length());
      assertEquals("NK#%/D#jiToStringStyle.ShortPrefixToStringStyle[]", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      StringBuffer stringBuffer0 = new StringBuffer("]E ,Aw##");
      ToStringStyle.unregister(standardToStringStyle0);
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      Boolean boolean0 = Boolean.FALSE;
      standardToStringStyle0.append(stringBuffer0, "c}5>", (Object) toStringStyle0, boolean0);
      assertEquals("]E ,Aw##c}5>=<ToStringStyle.ShortPrefixToStringStyle>,", stringBuffer0.toString());
      assertEquals(">", standardToStringStyle0.getSizeEndText());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      toStringStyle0.appendStart(stringBuffer0, toStringStyle0);
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) toStringStyle0;
      Boolean boolean0 = Boolean.TRUE;
      toStringStyle0.append(stringBuffer0, ">", objectArray0, boolean0);
      assertEquals(131, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ToStringStyle.register((Object) null);
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      toStringStyle0.appendStart(stringBuffer0, toStringStyle0);
      assertEquals(39, stringBuffer0.length());
      assertEquals("ToStringStyle.ShortPrefixToStringStyle[", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      toStringStyle0.appendStart(stringBuffer0, toStringStyle0);
      toStringStyle0.appendToString(stringBuffer0, ">");
      assertEquals(39, stringBuffer0.length());
      assertEquals("ToStringStyle.ShortPrefixToStringStyle[", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      toStringStyle0.appendStart(stringBuffer0, toStringStyle0);
      Object[] objectArray0 = new Object[2];
      objectArray0[1] = (Object) ">";
      Boolean boolean0 = Boolean.TRUE;
      toStringStyle0.append(stringBuffer0, ">", objectArray0, boolean0);
      assertEquals(52, stringBuffer0.length());
      assertEquals("ToStringStyle.ShortPrefixToStringStyle[>={<null>,>},", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      StringBuffer stringBuffer0 = new StringBuffer("]E ,Aw##");
      standardToStringStyle0.appendSuper(stringBuffer0, "]E ,Aw##");
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      Boolean boolean0 = Boolean.FALSE;
      standardToStringStyle0.append(stringBuffer0, "c}5>", (Object) toStringStyle0, boolean0);
      assertEquals(54, stringBuffer0.length());
      assertEquals("]E ,Aw##c}5>=<ToStringStyle.ShortPrefixToStringStyle>,", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      toStringStyle0.appendSuper(stringBuffer0, (String) null);
      toStringStyle0.appendStart(stringBuffer0, toStringStyle0);
      assertEquals("ToStringStyle.ShortPrefixToStringStyle[", stringBuffer0.toString());
      assertEquals(39, stringBuffer0.length());
  }
}
