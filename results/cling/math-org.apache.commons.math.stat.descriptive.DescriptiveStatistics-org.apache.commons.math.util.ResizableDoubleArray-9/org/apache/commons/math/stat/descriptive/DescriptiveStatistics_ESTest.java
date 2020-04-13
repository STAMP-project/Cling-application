/*

 * Tue Mar 03 15:27:15 GMT 2020
 */

package org.apache.commons.math.stat.descriptive;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math.stat.descriptive.DescriptiveStatisticsImpl;
import org.apache.commons.math.util.ResizableDoubleArray;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DescriptiveStatistics_ESTest extends DescriptiveStatistics_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.windowSize = 0;
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1, 595.8234F, 595.8234F, 1);
      assertEquals(0, resizableDoubleArray0.start());
      assertEquals(1, resizableDoubleArray0.getExpansionMode());
      
      descriptiveStatisticsImpl0.addValue(Double.NaN);
      assertEquals(0L, descriptiveStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(31);
      resizableDoubleArray0.setNumElements(31);
      assertEquals(31, resizableDoubleArray0.getNumElements());
      
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      String string0 = descriptiveStatistics0.toString();
      assertEquals("DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1, 595.8234F, 595.8234F, 1);
      // Undeclared exception!
      try { 
        descriptiveStatisticsImpl0.getElement(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // The index specified: 0 is larger than the current number of elements
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setExpansionMode(0);
      assertEquals(2.5F, resizableDoubleArray0.getContractionCriteria(), 0.01F);
      assertEquals(0, resizableDoubleArray0.getExpansionMode());
      assertEquals(0, resizableDoubleArray0.start());
      assertEquals(0, resizableDoubleArray0.getNumElements());
      assertEquals(2.0F, resizableDoubleArray0.getExpansionFactor(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(1);
      descriptiveStatisticsImpl0.addValue(1);
      descriptiveStatisticsImpl0.addValue((-1));
      descriptiveStatisticsImpl0.addValue(1);
      assertEquals(1L, descriptiveStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1, 2233.0F, 2233.0F, 1);
      resizableDoubleArray0.setElement(0, 1);
      descriptiveStatisticsImpl0.eDA = resizableDoubleArray0;
      descriptiveStatisticsImpl0.addValue((-1));
      assertEquals(2L, descriptiveStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(11);
      resizableDoubleArray0.setNumElements(11);
      resizableDoubleArray0.setElement(0, 11);
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      // Undeclared exception!
      try { 
        descriptiveStatisticsImpl0.getElement(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // The index specified: 0 is larger than the current number of elements
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1, 595.8234F, 595.8234F, 1);
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setElement((-1), 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Cannot set an element at a negative index
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1, 595.8234F, 595.8234F, 1);
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(1);
      assertEquals(0L, descriptiveStatisticsImpl0.getN());
      
      descriptiveStatisticsImpl0.addValue(Double.NaN);
      assertEquals(1L, descriptiveStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.addValue((-1));
      // Undeclared exception!
      try { 
        descriptiveStatisticsImpl0.getElement((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Elements cannot be retrieved from a negative array index
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(22);
      resizableDoubleArray0.setElement(22, 1);
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(1);
      descriptiveStatisticsImpl0.addValue((-1376.0));
      descriptiveStatisticsImpl0.addValue(595.8234252929688);
      resizableDoubleArray0.setElement(22, (-1));
      assertEquals(23, resizableDoubleArray0.getNumElements());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl((-1));
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setNumElements((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of elements must be zero or a positive integer
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setNumElements(0);
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setElement((-821), (-821));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Cannot set an element at a negative index
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.addValue((-375.25059093956276));
      descriptiveStatisticsImpl0.addValue(0);
      descriptiveStatisticsImpl0.setWindowSize(1);
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setNumElements((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of elements must be zero or a positive integer
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1, 595.8234F, 595.8234F, 1);
      descriptiveStatisticsImpl0.addValue((-1));
      double double0 = descriptiveStatisticsImpl0.getElement(0);
      assertEquals(1L, descriptiveStatisticsImpl0.getN());
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1, 2233.0F, 2233.0F, 1);
      // Undeclared exception!
      try { 
        descriptiveStatisticsImpl0.getElement((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Elements cannot be retrieved from a negative array index
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(33);
      resizableDoubleArray0.setElement(33, 4.7300341);
      assertEquals(34, resizableDoubleArray0.getNumElements());
      
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.addValue((-1376.0));
      String string0 = descriptiveStatisticsImpl0.toString();
      assertEquals("DescriptiveStatistics:\nn: 1\nmin: -1376.0\nmax: -1376.0\nmean: -1376.0\nstd dev: 0.0\nmedian: -1376.0\nskewness: NaN\nkurtosis: NaN\n", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(2959);
      resizableDoubleArray0.setElement(2959, 2959);
      assertEquals(2960, resizableDoubleArray0.getNumElements());
      
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      double double0 = descriptiveStatisticsImpl0.getStandardDeviation();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.addValue((-1));
      assertEquals(1L, descriptiveStatisticsImpl0.getN());
      
      DescriptiveStatisticsImpl descriptiveStatisticsImpl1 = new DescriptiveStatisticsImpl((-1));
      assertEquals(0L, descriptiveStatisticsImpl1.getN());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.addValue(31);
      // Undeclared exception!
      try { 
        descriptiveStatisticsImpl0.getElement(31);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // The index specified: 31 is larger than the current number of elements
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = null;
      try {
        resizableDoubleArray0 = new ResizableDoubleArray((-1), (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The initial capacity supplied: -1must be a positive integer
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(31);
      resizableDoubleArray0.setNumElements(31);
      resizableDoubleArray0.setElement(1, 1);
      assertEquals(31, resizableDoubleArray0.getNumElements());
      
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(31);
      descriptiveStatisticsImpl0.addValue(1232.98810556);
      double double0 = descriptiveStatisticsImpl0.getElement(0);
      assertEquals(1232.98810556, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(31);
      resizableDoubleArray0.setNumElements(31);
      resizableDoubleArray0.setElement(16, 16);
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      // Undeclared exception!
      try { 
        descriptiveStatisticsImpl0.getElement((-1522));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Elements cannot be retrieved from a negative array index
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setExpansionMode((-1151));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal expansionMode setting.
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setElement(1, 1);
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setNumElements((-1007));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of elements must be zero or a positive integer
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(1);
      descriptiveStatisticsImpl0.toString();
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setNumElements((-5566));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of elements must be zero or a positive integer
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.addValue((-1));
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setElement((-1), (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Cannot set an element at a negative index
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setNumElements(0);
      assertEquals(0, resizableDoubleArray0.getNumElements());
      assertEquals(0, resizableDoubleArray0.getExpansionMode());
      assertEquals(2.5F, resizableDoubleArray0.getContractionCriteria(), 0.01F);
      assertEquals(0, resizableDoubleArray0.start());
      assertEquals(2.0F, resizableDoubleArray0.getExpansionFactor(), 0.01F);
      
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl((-1));
      assertEquals((-1), descriptiveStatisticsImpl0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(31);
      resizableDoubleArray0.setElement(31, 0);
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      resizableDoubleArray0.setElement(31, 0);
      assertEquals(32, resizableDoubleArray0.getNumElements());
      
      descriptiveStatisticsImpl0.addValue((-1376.0));
      descriptiveStatisticsImpl0.addValue(1);
      descriptiveStatisticsImpl0.addValue(3513.9566);
      assertEquals(3L, descriptiveStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(14);
      resizableDoubleArray0.setElement(14, 14);
      resizableDoubleArray0.setElement(14, 1);
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setElement((-1065), 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Cannot set an element at a negative index
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(22);
      resizableDoubleArray0.setElement(22, 22);
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(1);
      descriptiveStatisticsImpl0.eDA = resizableDoubleArray0;
      assertEquals(23, resizableDoubleArray0.getNumElements());
      
      descriptiveStatisticsImpl0.addValue((-1376.0));
      assertEquals(23L, descriptiveStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.addValue((-1));
      descriptiveStatisticsImpl0.getElement(0);
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setNumElements((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of elements must be zero or a positive integer
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1, 595.8234F, 595.8234F, 1);
      descriptiveStatisticsImpl0.addValue((-1));
      descriptiveStatisticsImpl0.addValue(1);
      descriptiveStatisticsImpl0.setWindowSize(1);
      assertEquals(1, descriptiveStatisticsImpl0.getWindowSize());
      
      resizableDoubleArray0.setNumElements(1);
      assertEquals(1, resizableDoubleArray0.getExpansionMode());
  }
}
