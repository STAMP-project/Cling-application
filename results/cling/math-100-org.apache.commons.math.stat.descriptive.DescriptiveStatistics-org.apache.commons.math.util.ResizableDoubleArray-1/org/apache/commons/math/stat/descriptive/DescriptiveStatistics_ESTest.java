/*

 * Tue Mar 03 15:25:24 GMT 2020
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
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setNumElements(8);
      assertEquals(8, resizableDoubleArray0.getNumElements());
      
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      String string0 = descriptiveStatisticsImpl0.toString();
      assertEquals("DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setExpansionMode(1);
      DescriptiveStatistics descriptiveStatistics0 = DescriptiveStatistics.newInstance();
      // Undeclared exception!
      try { 
        descriptiveStatistics0.getElement(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // The index specified: 0 is larger than the current number of elements
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setExpansionMode(0);
      assertEquals(2.0F, resizableDoubleArray0.getExpansionFactor(), 0.01F);
      assertEquals(2.5F, resizableDoubleArray0.getContractionCriteria(), 0.01F);
      assertEquals(0, resizableDoubleArray0.getNumElements());
      assertEquals(0, resizableDoubleArray0.start());
      assertEquals(0, resizableDoubleArray0.getExpansionMode());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setNumElements(1125);
      double double0 = resizableDoubleArray0.addElementRolling(1125);
      assertEquals(1, resizableDoubleArray0.start());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setNumElements(0);
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(1);
      // Undeclared exception!
      try { 
        descriptiveStatisticsImpl0.getElement((-28));
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
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(2343);
      resizableDoubleArray0.setElement(2343, 2343);
      resizableDoubleArray0.addElement(2343);
      resizableDoubleArray0.setElement(2343, 2343);
      assertEquals(2345, resizableDoubleArray0.getNumElements());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(2363);
      resizableDoubleArray0.setElement(2363, 2363);
      resizableDoubleArray0.setElement(0, 2363);
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setElement((-1), 0);
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
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(2363);
      resizableDoubleArray0.setElement(2363, 2363);
      resizableDoubleArray0.setElement(0, 2363);
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(1);
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
  public void test08()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setExpansionMode(1);
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setElement((-379), 0.0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Cannot set an element at a negative index
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(2363);
      resizableDoubleArray0.setElement(0, 2363);
      resizableDoubleArray0.setExpansionMode(1);
      assertEquals(1, resizableDoubleArray0.getExpansionMode());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(2363);
      resizableDoubleArray0.setExpansionMode(1);
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(1);
      descriptiveStatisticsImpl0.addValue(2363);
      descriptiveStatisticsImpl0.addValue(2363);
      assertEquals(1L, descriptiveStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(2331);
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics((-1));
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
  public void test13()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(2363);
      resizableDoubleArray0.setNumElements(2363);
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setElement((-1), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Cannot set an element at a negative index
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setNumElements(1);
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(1);
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
  public void test15()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = DescriptiveStatistics.newInstance();
      ResizableDoubleArray resizableDoubleArray0 = descriptiveStatistics0.eDA;
      resizableDoubleArray0.setNumElements(2385);
      resizableDoubleArray0.addElement((-1));
      descriptiveStatistics0.setWindowSize(2385);
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setNumElements((-2398));
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
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(2331);
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics(1);
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
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.addElement(1);
      assertEquals(0, resizableDoubleArray0.getExpansionMode());
      
      resizableDoubleArray0.setExpansionMode(1);
      double double0 = resizableDoubleArray0.getElement(0);
      assertEquals(1, resizableDoubleArray0.getExpansionMode());
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setExpansionMode(1);
      // Undeclared exception!
      try { 
        resizableDoubleArray0.getElement((-2144034040));
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
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(2229, 2229);
      resizableDoubleArray0.setElement(2229, (-1));
      assertEquals(2230, resizableDoubleArray0.getNumElements());
      
      descriptiveStatisticsImpl0.addValue(493.4207166239);
      descriptiveStatisticsImpl0.toString();
      assertEquals(1L, descriptiveStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(2209, 2209);
      resizableDoubleArray0.setElement(2209, 2209);
      assertEquals(2210, resizableDoubleArray0.getNumElements());
      
      String string0 = descriptiveStatisticsImpl0.toString();
      assertEquals("DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = DescriptiveStatistics.newInstance();
      descriptiveStatistics0.addValue((-1));
      assertEquals(1L, descriptiveStatistics0.getN());
      
      DescriptiveStatistics descriptiveStatistics1 = new DescriptiveStatistics((-1));
      assertEquals(0L, descriptiveStatistics1.getN());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = DescriptiveStatistics.newInstance();
      descriptiveStatistics0.addValue((-1));
      // Undeclared exception!
      try { 
        descriptiveStatistics0.getElement(639);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // The index specified: 639 is larger than the current number of elements
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
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
  public void test24()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = DescriptiveStatistics.newInstance();
      ResizableDoubleArray resizableDoubleArray0 = descriptiveStatistics0.eDA;
      resizableDoubleArray0.setNumElements(2385);
      resizableDoubleArray0.addElement((-1));
      descriptiveStatistics0.setWindowSize(2385);
      resizableDoubleArray0.discardFrontElements(2385);
      assertEquals(2385, descriptiveStatistics0.getWindowSize());
      assertEquals(0L, descriptiveStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = DescriptiveStatistics.newInstance();
      ResizableDoubleArray resizableDoubleArray0 = descriptiveStatistics0.eDA;
      resizableDoubleArray0.setNumElements(2385);
      resizableDoubleArray0.addElement((-1));
      descriptiveStatistics0.setWindowSize(2385);
      resizableDoubleArray0.setNumElements(2385);
      assertEquals(2385, resizableDoubleArray0.getNumElements());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(2363);
      resizableDoubleArray0.setElement(2363, 2363);
      resizableDoubleArray0.setElement(0, 2363);
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
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
  public void test27()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.addElement(1);
      resizableDoubleArray0.setExpansionMode(1);
      resizableDoubleArray0.discardFrontElements(0);
      assertEquals(1, resizableDoubleArray0.getNumElements());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.toString();
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
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(2390);
      resizableDoubleArray0.setElement(0, 2390);
      assertEquals(1, resizableDoubleArray0.getNumElements());
      
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.addValue(1);
      double double0 = descriptiveStatisticsImpl0.getElement(0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.addElementRolling((-1));
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
  public void test31()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setNumElements(0);
      assertEquals(2.5F, resizableDoubleArray0.getContractionCriteria(), 0.01F);
      assertEquals(0, resizableDoubleArray0.start());
      assertEquals(0, resizableDoubleArray0.getExpansionMode());
      assertEquals(0, resizableDoubleArray0.getNumElements());
      assertEquals(2.0F, resizableDoubleArray0.getExpansionFactor(), 0.01F);
      
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl((-1));
      assertEquals((-1), descriptiveStatisticsImpl0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(2363);
      resizableDoubleArray0.setNumElements(8);
      resizableDoubleArray0.setElement(0, 2363);
      assertEquals(8, resizableDoubleArray0.getNumElements());
      
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(1);
      descriptiveStatisticsImpl0.addValue(2363);
      descriptiveStatisticsImpl0.addValue(2363);
      assertEquals(1L, descriptiveStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(2390);
      resizableDoubleArray0.setNumElements(2390);
      resizableDoubleArray0.setElement(0, 2390);
      assertEquals(2390, resizableDoubleArray0.getNumElements());
      
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.addValue(1);
      double double0 = descriptiveStatisticsImpl0.getElement(0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(2343);
      resizableDoubleArray0.setElement(2343, 2343);
      assertEquals(2344, resizableDoubleArray0.getNumElements());
      
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(1);
      descriptiveStatisticsImpl0.addValue(0);
      assertEquals(1L, descriptiveStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(2343);
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(1);
      descriptiveStatisticsImpl0.eDA = resizableDoubleArray0;
      resizableDoubleArray0.setElement(2343, 2343);
      assertEquals(2344, resizableDoubleArray0.getNumElements());
      
      descriptiveStatisticsImpl0.addValue(0);
      assertEquals(2344L, descriptiveStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setElement(1076, Double.NaN);
      resizableDoubleArray0.getElement(1);
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setNumElements((-8));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of elements must be zero or a positive integer
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics(2372);
      ResizableDoubleArray resizableDoubleArray0 = descriptiveStatistics0.eDA;
      resizableDoubleArray0.setNumElements(2372);
      resizableDoubleArray0.addElement((-1));
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
  public void test38()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(2363);
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      resizableDoubleArray0.setExpansionMode(1);
      assertEquals(1, resizableDoubleArray0.getExpansionMode());
      
      descriptiveStatisticsImpl0.addValue(2363);
      assertEquals(1L, descriptiveStatisticsImpl0.getN());
  }
}
