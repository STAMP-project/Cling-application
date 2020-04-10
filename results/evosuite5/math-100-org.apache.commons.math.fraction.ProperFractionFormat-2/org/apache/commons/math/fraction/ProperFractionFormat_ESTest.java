/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 21:16:54 GMT 2019
 */

package org.apache.commons.math.fraction;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.Format;
import java.text.NumberFormat;
import java.text.ParseException;
import org.apache.commons.math.fraction.Fraction;
import org.apache.commons.math.fraction.ProperFractionFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ProperFractionFormat_ESTest extends ProperFractionFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DecimalFormat decimalFormat0 = new DecimalFormat();
      ProperFractionFormat properFractionFormat0 = null;
      try {
        properFractionFormat0 = new ProperFractionFormat((NumberFormat) null, decimalFormat0, decimalFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // whole format can not be null.
         //
         verifyException("org.apache.commons.math.fraction.ProperFractionFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ChoiceFormat choiceFormat0 = new ChoiceFormat("!UN*Z;@8|*3-Pi k");
      NumberFormat numberFormat0 = NumberFormat.getNumberInstance();
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat(choiceFormat0, numberFormat0, numberFormat0);
      try { 
        properFractionFormat0.parse("9/T");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable fraction number: \"9/T\"
         //
         verifyException("org.apache.commons.math.fraction.FractionFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ChoiceFormat choiceFormat0 = new ChoiceFormat(":5(;C&mlM");
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat(choiceFormat0);
      try { 
        properFractionFormat0.parse(":5(;C&mlM");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable fraction number: \":5(;C&mlM\"
         //
         verifyException("org.apache.commons.math.fraction.FractionFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ChoiceFormat choiceFormat0 = new ChoiceFormat("!UB*Z;@8|*3-P`i k");
      NumberFormat numberFormat0 = NumberFormat.getNumberInstance();
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat(numberFormat0, choiceFormat0, choiceFormat0);
      Fraction fraction0 = properFractionFormat0.parse("9/");
      assertEquals(0, fraction0.getNumerator());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      try { 
        properFractionFormat0.parse("5(;C&mlM");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable fraction number: \"5(;C&mlM\"
         //
         verifyException("org.apache.commons.math.fraction.FractionFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      try { 
        properFractionFormat0.parse("!dF8^fv");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable fraction number: \"!dF8^fv\"
         //
         verifyException("org.apache.commons.math.fraction.FractionFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ChoiceFormat choiceFormat0 = new ChoiceFormat("!U&*Z;@81*3-ei k");
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat(choiceFormat0);
      Fraction fraction0 = Fraction.ONE;
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0);
      // Undeclared exception!
      try { 
        properFractionFormat0.format(fraction0, (StringBuffer) null, fieldPosition0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("java.text.ChoiceFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ChoiceFormat choiceFormat0 = new ChoiceFormat("!U&*Z;@81*3-ei k");
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat(choiceFormat0);
      Fraction fraction0 = Fraction.ZERO;
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0);
      // Undeclared exception!
      try { 
        properFractionFormat0.format(fraction0, (StringBuffer) null, fieldPosition0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("java.text.ChoiceFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ChoiceFormat choiceFormat0 = new ChoiceFormat("!UN*Z;@8|*3-)i k");
      NumberFormat numberFormat0 = NumberFormat.getNumberInstance();
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat(numberFormat0, choiceFormat0, choiceFormat0);
      // Undeclared exception!
      try { 
        properFractionFormat0.parse("9/T");
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The denominator must not be zero
         //
         verifyException("org.apache.commons.math.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      Fraction fraction0 = properFractionFormat0.parse("9/");
      assertEquals(9, fraction0.intValue());
  }
}
