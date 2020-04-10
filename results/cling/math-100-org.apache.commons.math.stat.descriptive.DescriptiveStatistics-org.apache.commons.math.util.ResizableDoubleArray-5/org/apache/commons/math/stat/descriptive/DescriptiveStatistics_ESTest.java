/*

 * Tue Mar 03 15:25:45 GMT 2020
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
      resizableDoubleArray0.setNumElements(2551);
      resizableDoubleArray0.setElement(5, 2551);
      resizableDoubleArray0.addElement(0);
      assertEquals(2552, resizableDoubleArray0.getNumElements());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setNumElements(0);
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      // Undeclared exception!
      try { 
        descriptiveStatistics0.getPercentile(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal quantile value: 0.0
         //
         verifyException("org.apache.commons.math.stat.descriptive.rank.Percentile", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1);
      resizableDoubleArray0.setExpansionMode(1);
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      // Undeclared exception!
      try { 
        descriptiveStatistics0.getElement(1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // The index specified: 1 is larger than the current number of elements
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(1);
      descriptiveStatisticsImpl0.addValue(673.62);
      descriptiveStatisticsImpl0.addValue(1);
      descriptiveStatisticsImpl0.addValue(673.62);
      assertEquals(1L, descriptiveStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setNumElements(0);
      DescriptiveStatistics descriptiveStatistics0 = DescriptiveStatistics.newInstance();
      descriptiveStatistics0.addValue(1);
      assertEquals(1L, descriptiveStatistics0.getN());
      
      double double0 = descriptiveStatistics0.getElement(0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.addValue((-1));
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setElement(1, (-1));
      descriptiveStatisticsImpl0.addValue((-1));
      descriptiveStatisticsImpl0.addValue(0);
      assertEquals(3L, descriptiveStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setNumElements(16);
      resizableDoubleArray0.setElement(5, 2551);
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setElement((-1), 16);
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
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(1);
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(2551, 5.1896524F, 25.0F, 0);
      resizableDoubleArray0.setElement(15, 2551);
      resizableDoubleArray0.setElement(1, 25.0F);
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
  public void test09()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(2551, 2.6666667F, 25.0F, 0);
      resizableDoubleArray0.setExpansionMode(1);
      resizableDoubleArray0.setElement(0, 2551);
      assertEquals(1, resizableDoubleArray0.getNumElements());
      assertEquals(1, resizableDoubleArray0.getExpansionMode());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.addValue(8);
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setExpansionMode(8);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal expansionMode setting.
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = DescriptiveStatistics.newInstance();
      descriptiveStatistics0.addValue((-1));
      // Undeclared exception!
      try { 
        descriptiveStatistics0.getElement((-1));
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
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(5);
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      descriptiveStatisticsImpl0.setWindowSize((-1));
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
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics(1);
      ResizableDoubleArray resizableDoubleArray0 = descriptiveStatistics0.eDA;
      resizableDoubleArray0.setElement(2291, 1);
      descriptiveStatistics0.setWindowSize(19);
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setNumElements((-2146948171));
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
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setNumElements(32);
      resizableDoubleArray0.getElement(4);
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setExpansionMode(1579);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal expansionMode setting.
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1);
      resizableDoubleArray0.setExpansionMode(1);
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(1);
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
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setElement(23, 1);
      descriptiveStatisticsImpl0.eDA = resizableDoubleArray0;
      descriptiveStatisticsImpl0.toString();
      assertEquals(24L, descriptiveStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setElement(16, 1);
      assertEquals(17, resizableDoubleArray0.getNumElements());
      
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics(16);
      String string0 = descriptiveStatistics0.toString();
      assertEquals("DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(16);
      descriptiveStatisticsImpl0.addValue(16);
      assertEquals(1L, descriptiveStatisticsImpl0.getN());
      
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics((-1));
      assertEquals(0L, descriptiveStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(1);
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(2551, 5.1896524F, 25.0F, 0);
      resizableDoubleArray0.addElement(2551);
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
  public void test20()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = null;
      try {
        resizableDoubleArray0 = new ResizableDoubleArray((-1235));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The initial capacity supplied: -1235must be a positive integer
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(5);
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setNumElements(16);
      resizableDoubleArray0.setElement(0, 2046.853);
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
  public void test22()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1, 25.0F, 363.5F, 1);
      resizableDoubleArray0.addElement(1674.9116772278414);
      assertEquals(1, resizableDoubleArray0.getNumElements());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(24);
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
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
  public void test24()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(1);
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(2551, 2.6666667F, 25.0F, 0);
      resizableDoubleArray0.setElement(2551, 25.0);
      descriptiveStatisticsImpl0.addValue(25.0);
      assertEquals(1L, descriptiveStatisticsImpl0.getN());
      
      resizableDoubleArray0.setElement(2551, (-1583.0));
      assertEquals(2552, resizableDoubleArray0.getNumElements());
      
      double double0 = descriptiveStatisticsImpl0.getElement(0);
      assertEquals(25.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.addElement((-1));
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
  public void test26()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(1);
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(2551, 5.1896524F, 25.0F, 0);
      resizableDoubleArray0.setNumElements(0);
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
  public void test27()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setNumElements(1);
      assertEquals(1, resizableDoubleArray0.getNumElements());
      
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics((-1));
      assertEquals(0L, descriptiveStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(1);
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(2551, 5.1896524F, 25.0F, 0);
      resizableDoubleArray0.setElement(15, 2551);
      descriptiveStatisticsImpl0.addValue(25.0F);
      resizableDoubleArray0.setElement(1, 25.0F);
      descriptiveStatisticsImpl0.addValue(1);
      assertEquals(1L, descriptiveStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(2551, 2.6666667F, 2551, 0);
      resizableDoubleArray0.setElement(2551, 25.0);
      descriptiveStatisticsImpl0.addValue(25.0);
      assertEquals(1L, descriptiveStatisticsImpl0.getN());
      
      resizableDoubleArray0.setElement(2551, (-1583.0));
      assertEquals(2552, resizableDoubleArray0.getNumElements());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics(1);
      ResizableDoubleArray resizableDoubleArray0 = descriptiveStatistics0.eDA;
      resizableDoubleArray0.setElement(2291, 1);
      descriptiveStatistics0.addValue(1);
      assertEquals(2292L, descriptiveStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(1);
      descriptiveStatisticsImpl0.addValue(0);
      descriptiveStatisticsImpl0.getElement(0);
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setNumElements((-200));
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
      String string0 = descriptiveStatisticsImpl0.toString();
      assertEquals("DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n", string0);
      
      descriptiveStatisticsImpl0.addValue((-1));
      assertEquals(1L, descriptiveStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.discardFrontElements(0);
      resizableDoubleArray0.setNumElements(1);
      resizableDoubleArray0.addElement(956.9682839);
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setExpansionMode(3044);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal expansionMode setting.
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(1);
      assertEquals(0L, descriptiveStatisticsImpl0.getN());
      
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(2551, 2.6666667F, 25.0F, 0);
      resizableDoubleArray0.setExpansionMode(1);
      descriptiveStatisticsImpl0.addValue(1);
      descriptiveStatisticsImpl0.addValue(0);
      assertEquals(1L, descriptiveStatisticsImpl0.getN());
  }
}
