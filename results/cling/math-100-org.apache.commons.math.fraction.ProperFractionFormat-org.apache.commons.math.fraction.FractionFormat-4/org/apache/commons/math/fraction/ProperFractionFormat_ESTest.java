/*

 * Tue Mar 03 14:44:21 GMT 2020
 */

package org.apache.commons.math.fraction;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.AttributedCharacterIterator;
import java.text.NumberFormat;
import java.text.ParseException;
import org.apache.commons.math.fraction.Fraction;
import org.apache.commons.math.fraction.FractionFormat;
import org.apache.commons.math.fraction.ProperFractionFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ProperFractionFormat_ESTest extends ProperFractionFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE;
      String string0 = FractionFormat.formatFraction(fraction0);
      assertEquals("1 / 1", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Integer integer0 = new Integer(452);
      NumberFormat numberFormat0 = mock(NumberFormat.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null).when(numberFormat0).toString();
      doReturn((StringBuffer) null, (StringBuffer) null, (StringBuffer) null).when(numberFormat0).format(anyLong() , any(java.lang.StringBuffer.class) , any(java.text.FieldPosition.class));
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat(numberFormat0, numberFormat0, numberFormat0);
      AttributedCharacterIterator attributedCharacterIterator0 = properFractionFormat0.formatToCharacterIterator(integer0);
      assertEquals(4, attributedCharacterIterator0.getRunLimit());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      // Undeclared exception!
      try { 
        properFractionFormat0.format((Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot format given object as a fraction
         //
         verifyException("org.apache.commons.math.fraction.FractionFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      try { 
        properFractionFormat0.parse("");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable fraction number: \"\"
         //
         verifyException("org.apache.commons.math.fraction.FractionFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NumberFormat numberFormat0 = NumberFormat.getNumberInstance();
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat(numberFormat0);
      Fraction fraction0 = properFractionFormat0.parse("1 / 1");
      assertEquals((byte)1, fraction0.byteValue());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = null;
      try {
        properFractionFormat0 = new ProperFractionFormat((NumberFormat) null, (NumberFormat) null, (NumberFormat) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // whole format can not be null.
         //
         verifyException("org.apache.commons.math.fraction.ProperFractionFormat", e);
      }
  }
}
