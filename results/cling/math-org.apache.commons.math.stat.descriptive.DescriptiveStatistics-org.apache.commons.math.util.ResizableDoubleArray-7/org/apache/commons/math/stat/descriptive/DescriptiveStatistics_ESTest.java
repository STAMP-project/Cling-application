/*

 * Tue Mar 03 15:26:25 GMT 2020
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
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(1);
      descriptiveStatisticsImpl0.addValue(1);
      ResizableDoubleArray resizableDoubleArray0 = descriptiveStatisticsImpl0.eDA;
      descriptiveStatisticsImpl0.addValue(1);
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
  public void test01()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      ResizableDoubleArray resizableDoubleArray0 = descriptiveStatisticsImpl0.eDA;
      descriptiveStatisticsImpl0.toString();
      resizableDoubleArray0.setNumElements(14);
      assertEquals(14, resizableDoubleArray0.getNumElements());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1);
      resizableDoubleArray0.setExpansionMode(1);
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
  public void test03()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setExpansionMode(0);
      assertEquals(0, resizableDoubleArray0.start());
      assertEquals(0, resizableDoubleArray0.getExpansionMode());
      assertEquals(2.0F, resizableDoubleArray0.getExpansionFactor(), 0.01F);
      assertEquals(0, resizableDoubleArray0.getNumElements());
      assertEquals(2.5F, resizableDoubleArray0.getContractionCriteria(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(3566);
      resizableDoubleArray0.setNumElements(3566);
      double double0 = resizableDoubleArray0.addElementRolling(3566);
      assertEquals(3566, resizableDoubleArray0.getNumElements());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setNumElements(0);
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      // Undeclared exception!
      try { 
        descriptiveStatisticsImpl0.getElement((-2846));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Elements cannot be retrieved from a negative array index
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics(307);
      ResizableDoubleArray resizableDoubleArray0 = descriptiveStatistics0.eDA;
      resizableDoubleArray0.addElement((-1));
      descriptiveStatistics0.addValue(349.3624572753906);
      resizableDoubleArray0.setElement(0, 1);
      descriptiveStatistics0.addValue(1);
      assertEquals(3L, descriptiveStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics(307);
      ResizableDoubleArray resizableDoubleArray0 = descriptiveStatistics0.eDA;
      resizableDoubleArray0.addElement((-1));
      resizableDoubleArray0.setElement(0, 1);
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setElement((-1893), 0);
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
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setNumElements(412);
      resizableDoubleArray0.setElement(1, 1774.7000282301);
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
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
  public void test09()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics(307);
      ResizableDoubleArray resizableDoubleArray0 = descriptiveStatistics0.eDA;
      resizableDoubleArray0.setExpansionMode(1);
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setElement((-1893), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Cannot set an element at a negative index
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics(307);
      ResizableDoubleArray resizableDoubleArray0 = descriptiveStatistics0.eDA;
      resizableDoubleArray0.setExpansionMode(1);
      resizableDoubleArray0.setElement(0, 1);
      assertEquals(1, resizableDoubleArray0.getExpansionMode());
      assertEquals(1, resizableDoubleArray0.getNumElements());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl((-1));
      ResizableDoubleArray resizableDoubleArray0 = descriptiveStatistics0.eDA;
      descriptiveStatisticsImpl0.addValue((-1));
      assertEquals(1L, descriptiveStatisticsImpl0.getN());
      
      resizableDoubleArray0.setExpansionMode(1);
      assertEquals(2.0F, resizableDoubleArray0.getExpansionFactor(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      descriptiveStatistics0.getStandardDeviation();
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      ResizableDoubleArray resizableDoubleArray0 = descriptiveStatisticsImpl0.eDA;
      resizableDoubleArray0.addElementRolling(1055.7);
      resizableDoubleArray0.setElement(1, (-1));
      assertEquals(2, resizableDoubleArray0.getNumElements());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(1);
      assertEquals(0L, descriptiveStatisticsImpl0.getN());
      
      descriptiveStatisticsImpl0.addValue(3566);
      descriptiveStatisticsImpl0.addValue(1);
      ResizableDoubleArray resizableDoubleArray0 = descriptiveStatisticsImpl0.eDA;
      resizableDoubleArray0.setElement(0, 1827.5150146484375);
      assertEquals(1L, descriptiveStatisticsImpl0.getN());
      assertEquals(1, resizableDoubleArray0.start());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
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
  public void test15()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setNumElements(1);
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
  public void test16()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setElement(3, (-11.73317813873291));
      resizableDoubleArray0.getElement(1);
      assertEquals(4, resizableDoubleArray0.getNumElements());
      
      resizableDoubleArray0.setNumElements(0);
      assertEquals(2.0F, resizableDoubleArray0.getExpansionFactor(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      descriptiveStatistics0.addValue(1);
      ResizableDoubleArray resizableDoubleArray0 = descriptiveStatistics0.eDA;
      resizableDoubleArray0.addElement((-323.7763916207188));
      descriptiveStatistics0.setWindowSize(1);
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setNumElements((-541));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of elements must be zero or a positive integer
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(1);
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
  public void test19()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      ResizableDoubleArray resizableDoubleArray0 = descriptiveStatistics0.eDA;
      resizableDoubleArray0.setNumElements(1951);
      resizableDoubleArray0.setExpansionMode(1);
      descriptiveStatistics0.getElement(1);
      assertEquals(1951L, descriptiveStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setExpansionMode(1);
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(1705);
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
  public void test21()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      ResizableDoubleArray resizableDoubleArray0 = descriptiveStatistics0.eDA;
      resizableDoubleArray0.setElement(23, Double.NaN);
      double double0 = descriptiveStatistics0.getStandardDeviation();
      assertEquals(24L, descriptiveStatistics0.getN());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics(1);
      ResizableDoubleArray resizableDoubleArray0 = descriptiveStatistics0.eDA;
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      resizableDoubleArray0.addElementRolling(1);
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
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1);
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
  public void test25()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      ResizableDoubleArray resizableDoubleArray0 = descriptiveStatistics0.eDA;
      resizableDoubleArray0.addElement(0);
      resizableDoubleArray0.setElement(0, Double.NaN);
      double double0 = descriptiveStatistics0.getElement(0);
      assertEquals(1L, descriptiveStatistics0.getN());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      descriptiveStatistics0.addValue((-1));
      ResizableDoubleArray resizableDoubleArray0 = descriptiveStatistics0.eDA;
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      resizableDoubleArray0.setElement(0, Double.NaN);
      // Undeclared exception!
      try { 
        descriptiveStatisticsImpl0.getElement((-1725));
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
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      ResizableDoubleArray resizableDoubleArray0 = descriptiveStatistics0.eDA;
      resizableDoubleArray0.setElement(1, Double.NaN);
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setNumElements((-541));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of elements must be zero or a positive integer
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      descriptiveStatisticsImpl0.toString();
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setNumElements((-1701));
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
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      ResizableDoubleArray resizableDoubleArray0 = descriptiveStatistics0.eDA;
      resizableDoubleArray0.setNumElements(14);
      assertEquals(14, resizableDoubleArray0.getNumElements());
      
      descriptiveStatistics0.setWindowSize(1);
      assertEquals(1L, descriptiveStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics((-1));
      ResizableDoubleArray resizableDoubleArray0 = descriptiveStatisticsImpl0.eDA;
      resizableDoubleArray0.setNumElements(14);
      assertEquals(14L, descriptiveStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      descriptiveStatistics0.addValue((-2170.126));
      descriptiveStatistics0.toString();
      assertEquals(1L, descriptiveStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(5);
      descriptiveStatisticsImpl0.addValue((-1));
      ResizableDoubleArray resizableDoubleArray0 = descriptiveStatisticsImpl0.eDA;
      resizableDoubleArray0.setElement(5, Double.NaN);
      assertEquals(6L, descriptiveStatisticsImpl0.getN());
      assertEquals(5, descriptiveStatisticsImpl0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics(1);
      descriptiveStatistics0.windowSize = (-621);
      descriptiveStatistics0.addValue(1);
      ResizableDoubleArray resizableDoubleArray0 = descriptiveStatistics0.eDA;
      resizableDoubleArray0.setElement(676, (-1));
      assertEquals(677, resizableDoubleArray0.getNumElements());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      descriptiveStatistics0.addValue(1);
      ResizableDoubleArray resizableDoubleArray0 = descriptiveStatistics0.eDA;
      resizableDoubleArray0.addElement((-323.7763916207188));
      descriptiveStatistics0.getElement(1);
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setNumElements((-541));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of elements must be zero or a positive integer
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics(307);
      ResizableDoubleArray resizableDoubleArray0 = descriptiveStatistics0.eDA;
      resizableDoubleArray0.addElement((-1));
      descriptiveStatistics0.addValue(349.3624572753906);
      resizableDoubleArray0.setExpansionMode(1);
      descriptiveStatistics0.addValue(1);
      assertEquals(3L, descriptiveStatistics0.getN());
  }
}
