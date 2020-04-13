/*

 * Tue Mar 03 16:11:19 GMT 2020
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
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      ToStringStyle toStringStyle1 = ToStringStyle.SHORT_PREFIX_STYLE;
      // Undeclared exception!
      try { 
        toStringStyle1.appendStart((StringBuffer) null, toStringStyle0);
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
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      ToStringStyle toStringStyle1 = ToStringStyle.SHORT_PREFIX_STYLE;
      ToStringStyle.register((Object) null);
      // Undeclared exception!
      try { 
        toStringStyle1.appendStart((StringBuffer) null, toStringStyle0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.builder.ToStringStyle", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      toStringStyle0.NO_FIELD_NAMES_STYLE.appendToString((StringBuffer) null, ";T?b85ThhD`PNA");
      ToStringStyle toStringStyle1 = ToStringStyle.SHORT_PREFIX_STYLE;
      // Undeclared exception!
      try { 
        toStringStyle1.appendStart((StringBuffer) null, toStringStyle0);
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
      ToStringStyle.unregister((Object) null);
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      Class<Boolean> class0 = Boolean.TYPE;
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      standardToStringStyle0.appendInternal(stringBuffer0, "A", toStringStyle0, false);
      assertEquals(35, stringBuffer0.length());
      
      String string0 = standardToStringStyle0.getFieldNameValueSeparator();
      assertEquals("=", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      standardToStringStyle0.appendToString(stringBuffer0, "]");
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      Boolean boolean0 = new Boolean("]");
      standardToStringStyle0.append(stringBuffer0, "[java.lang.Byte", (Object) toStringStyle0, boolean0);
      assertEquals("[java.lang.Byte=<ToStringStyle.NoFieldNameToStringStyle>,", stringBuffer0.toString());
      assertEquals(57, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      standardToStringStyle0.appendSuper(stringBuffer0, (String) null);
      standardToStringStyle0.DEFAULT_STYLE.appendInternal(stringBuffer0, (String) null, toStringStyle0, false);
      assertEquals(35, stringBuffer0.length());
      assertEquals("<ToStringStyle.SimpleToStringStyle>", stringBuffer0.toString());
  }
}
