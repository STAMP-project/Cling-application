/*

 * Tue Mar 03 15:25:34 GMT 2020
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
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1402);
      resizableDoubleArray0.setNumElements(1402);
      assertEquals(1402, resizableDoubleArray0.getNumElements());
      
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      String string0 = descriptiveStatisticsImpl0.toString();
      assertEquals("DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setExpansionMode(1);
      // Undeclared exception!
      try { 
        descriptiveStatisticsImpl0.getElement(1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // The index specified: 1 is larger than the current number of elements
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setExpansionMode(0);
      assertEquals(0, resizableDoubleArray0.start());
      assertEquals(0, resizableDoubleArray0.getExpansionMode());
      assertEquals(0, resizableDoubleArray0.getNumElements());
      assertEquals(2.5F, resizableDoubleArray0.getContractionCriteria(), 0.01F);
      assertEquals(2.0F, resizableDoubleArray0.getExpansionFactor(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = DescriptiveStatistics.newInstance();
      descriptiveStatistics0.addValue(1);
      descriptiveStatistics0.addValue(1);
      descriptiveStatistics0.setWindowSize(1);
      descriptiveStatistics0.addValue(Double.NaN);
      assertEquals(1L, descriptiveStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1402);
      resizableDoubleArray0.setNumElements(1402);
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(1);
      // Undeclared exception!
      try { 
        descriptiveStatisticsImpl0.getElement((-1136));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Elements cannot be retrieved from a negative array index
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setElement(31, 31);
      resizableDoubleArray0.addElement(31);
      resizableDoubleArray0.setElement(31, (-1));
      assertEquals(33, resizableDoubleArray0.getNumElements());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1300, 1300, 1300, 1);
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setElement((-2855), 872.6723959074);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Cannot set an element at a negative index
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setExpansionMode(1);
      descriptiveStatisticsImpl0.addValue(821.0);
      assertEquals(1L, descriptiveStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(31);
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setElement(31, 31);
      resizableDoubleArray0.setElement(31, (-1));
      descriptiveStatisticsImpl0.windowSize = 0;
      descriptiveStatisticsImpl0.addValue(2660);
      assertEquals(0L, descriptiveStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1386);
      resizableDoubleArray0.setNumElements(1386);
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setElement((-3840), 1386);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Cannot set an element at a negative index
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setNumElements(1);
      resizableDoubleArray0.setElement(1, 1.0);
      assertEquals(2, resizableDoubleArray0.getNumElements());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1402);
      resizableDoubleArray0.setNumElements(1402);
      DescriptiveStatistics descriptiveStatistics0 = DescriptiveStatistics.newInstance();
      // Undeclared exception!
      try { 
        descriptiveStatistics0.getElement(1402);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // The index specified: 1402 is larger than the current number of elements
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      descriptiveStatistics0.addValue(1);
      descriptiveStatistics0.addValue(1);
      assertEquals(2L, descriptiveStatistics0.getN());
      
      descriptiveStatistics0.getElement(1);
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setNumElements(1);
      assertEquals(2.5F, resizableDoubleArray0.getContractionCriteria(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      descriptiveStatistics0.addValue(1);
      descriptiveStatistics0.addValue(1);
      descriptiveStatistics0.setWindowSize(1);
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1);
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
  public void test16()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(31);
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
  public void test17()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(1);
      assertEquals(0L, descriptiveStatisticsImpl0.getN());
      
      descriptiveStatisticsImpl0.addValue(1);
      descriptiveStatisticsImpl0.getElement(0);
      assertEquals(1L, descriptiveStatisticsImpl0.getN());
      
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setExpansionMode(1);
      assertEquals(2.5F, resizableDoubleArray0.getContractionCriteria(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setExpansionMode(1);
      DescriptiveStatistics descriptiveStatistics0 = DescriptiveStatistics.newInstance();
      // Undeclared exception!
      try { 
        descriptiveStatistics0.getElement((-531));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Elements cannot be retrieved from a negative array index
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(31);
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setElement(31, 31);
      assertEquals(32, resizableDoubleArray0.getNumElements());
      
      String string0 = descriptiveStatisticsImpl0.toString();
      assertEquals("DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics((-1));
      descriptiveStatistics0.addValue((-1));
      assertEquals(1L, descriptiveStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(31);
      descriptiveStatisticsImpl0.addValue(2660);
      // Undeclared exception!
      try { 
        descriptiveStatisticsImpl0.getElement(907);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // The index specified: 907 is larger than the current number of elements
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = null;
      try {
        resizableDoubleArray0 = new ResizableDoubleArray((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The initial capacity supplied: -1must be a positive integer
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      descriptiveStatistics0.addValue(1);
      descriptiveStatistics0.addValue(1);
      descriptiveStatistics0.setWindowSize(1);
      assertEquals(1L, descriptiveStatistics0.getN());
      
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setNumElements(1);
      assertEquals(1, resizableDoubleArray0.getNumElements());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setElement(31, 31);
      resizableDoubleArray0.getElement(31);
      resizableDoubleArray0.setElement(31, (-1));
      assertEquals(32, resizableDoubleArray0.getNumElements());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setElement(31, 31);
      resizableDoubleArray0.setElement(31, 31);
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(31);
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
  public void test26()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setElement(31, 31);
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setNumElements((-1952));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of elements must be zero or a positive integer
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setExpansionMode(1);
      resizableDoubleArray0.setContractionCriteria(4863.735F);
      resizableDoubleArray0.discardFrontElements(0);
      assertEquals(4863.735F, resizableDoubleArray0.getContractionCriteria(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.toString();
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
  public void test29()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(31);
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setElement(31, 31);
      resizableDoubleArray0.setElement(31, (-1));
      // Undeclared exception!
      try { 
        descriptiveStatisticsImpl0.getElement(907);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // The index specified: 907 is larger than the current number of elements
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = DescriptiveStatistics.newInstance();
      descriptiveStatistics0.addValue(1);
      descriptiveStatistics0.addValue(1);
      descriptiveStatistics0.getElement(1);
      assertEquals(2L, descriptiveStatistics0.getN());
      
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setElement(1, 1.0);
      assertEquals(2, resizableDoubleArray0.getNumElements());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(2143342372);
      descriptiveStatisticsImpl0.addValue(2143342372);
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setElement((-1), 2143342372);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Cannot set an element at a negative index
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setNumElements(0);
      assertEquals(0, resizableDoubleArray0.getNumElements());
      assertEquals(2.0F, resizableDoubleArray0.getExpansionFactor(), 0.01F);
      assertEquals(2.5F, resizableDoubleArray0.getContractionCriteria(), 0.01F);
      assertEquals(0, resizableDoubleArray0.start());
      assertEquals(0, resizableDoubleArray0.getExpansionMode());
      
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics((-1));
      assertEquals((-1), descriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(31);
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setElement(31, 31);
      resizableDoubleArray0.setElement(31, (-1));
      descriptiveStatisticsImpl0.addValue(2660);
      assertEquals(1L, descriptiveStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setElement(32, 32);
      resizableDoubleArray0.setElement(32, (-1));
      descriptiveStatisticsImpl0.addValue(0.0);
      assertEquals(1L, descriptiveStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setElement(31, 31);
      resizableDoubleArray0.setElement(31, (-1));
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setElement((-1), 0.0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Cannot set an element at a negative index
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(31);
      double double0 = descriptiveStatisticsImpl0.getPercentile(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
      
      descriptiveStatisticsImpl0.addValue(2660);
      assertEquals(1L, descriptiveStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(31);
      descriptiveStatisticsImpl0.addValue(31);
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setElement(31, 31);
      descriptiveStatisticsImpl0.toString();
      assertEquals(1L, descriptiveStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(4);
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(4);
      resizableDoubleArray0.setElement(4, 0);
      descriptiveStatisticsImpl0.eDA = resizableDoubleArray0;
      descriptiveStatisticsImpl0.addValue(1);
      assertEquals(5L, descriptiveStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      descriptiveStatistics0.addValue(1);
      descriptiveStatistics0.addValue(1);
      descriptiveStatistics0.getElement(1);
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1);
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
  public void test40()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setElement(31, 31);
      resizableDoubleArray0.addElement(31);
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setExpansionMode((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal expansionMode setting.
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(1);
      descriptiveStatisticsImpl0.addValue(1);
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setExpansionMode(1);
      assertEquals(0, resizableDoubleArray0.getNumElements());
      
      descriptiveStatisticsImpl0.addValue(1.0);
      assertEquals(1L, descriptiveStatisticsImpl0.getN());
  }
}
