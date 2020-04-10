/*

 * Tue Mar 03 14:46:34 GMT 2020
 */

package org.apache.commons.math.fraction;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.AttributedCharacterIterator;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import org.apache.commons.math.fraction.Fraction;
import org.apache.commons.math.fraction.FractionFormat;
import org.apache.commons.math.fraction.ProperFractionFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
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
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      DecimalFormat decimalFormat0 = new DecimalFormat();
      // Undeclared exception!
      try { 
        properFractionFormat0.format((Object) decimalFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot format given object as a fraction
         //
         verifyException("org.apache.commons.math.fraction.FractionFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      try { 
        properFractionFormat0.parse(")S!\"nr9");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable fraction number: \")S!\"nr9\"
         //
         verifyException("org.apache.commons.math.fraction.FractionFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      Fraction fraction0 = properFractionFormat0.parse("0");
      assertEquals(0.0F, fraction0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
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

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DecimalFormat decimalFormat0 = (DecimalFormat)FractionFormat.getDefaultNumberFormat();
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat(decimalFormat0);
      Integer integer0 = new Integer((-2653));
      AttributedCharacterIterator attributedCharacterIterator0 = properFractionFormat0.formatToCharacterIterator(integer0);
      assertEquals("#,##0", decimalFormat0.toLocalizedPattern());
      assertEquals(12, attributedCharacterIterator0.getRunLimit());
      assertTrue(decimalFormat0.isParseIntegerOnly());
  }
}
