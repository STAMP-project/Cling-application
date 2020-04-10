/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 15:27:10 GMT 2019
 */

package org.apache.commons.math.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.util.ResizableDoubleArray;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ResizableDoubleArray_ESTest extends ResizableDoubleArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setExpansionMode(1);
      double double0 = resizableDoubleArray0.addElementRolling(1.0);
      assertEquals(1, resizableDoubleArray0.getExpansionMode());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setNumElements(0);
      assertEquals(0, resizableDoubleArray0.getExpansionMode());
      assertEquals(2.0F, resizableDoubleArray0.getExpansionFactor(), 0.01F);
      assertEquals(0, resizableDoubleArray0.start());
      assertEquals(0, resizableDoubleArray0.getNumElements());
      assertEquals(2.5F, resizableDoubleArray0.getContractionCriteria(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setNumElements((-1244));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of elements must be zero or a positive integer
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = null;
      try {
        resizableDoubleArray0 = new ResizableDoubleArray((-1), 653.81F);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The initial capacity supplied: -1must be a positive integer
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1657, 1657, 1657);
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setExpansionMode(1657);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal expansionMode setting.
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setExpansionMode(0);
      assertEquals(0, resizableDoubleArray0.getExpansionMode());
      assertEquals(2.0F, resizableDoubleArray0.getExpansionFactor(), 0.01F);
      assertEquals(0, resizableDoubleArray0.start());
      assertEquals(0, resizableDoubleArray0.getNumElements());
      assertEquals(2.5F, resizableDoubleArray0.getContractionCriteria(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setElement(1, (-1609.1));
      resizableDoubleArray0.setElement(1, 673.1031F);
      assertEquals(2, resizableDoubleArray0.getNumElements());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      // Undeclared exception!
      try { 
        resizableDoubleArray0.getElement((-1));
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
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1, 148.0F);
      // Undeclared exception!
      try { 
        resizableDoubleArray0.getElement(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // The index specified: 0 is larger than the current number of elements
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1, 148.0F);
      resizableDoubleArray0.addElement(0);
      double double0 = resizableDoubleArray0.getElement(0);
      assertEquals(1, resizableDoubleArray0.getNumElements());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      assertEquals(0, resizableDoubleArray0.getExpansionMode());
      
      resizableDoubleArray0.setExpansionMode(1);
      resizableDoubleArray0.expand();
      assertEquals(1, resizableDoubleArray0.getExpansionMode());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.numElements = 2143781089;
      resizableDoubleArray0.discardFrontElements(0);
      assertEquals(2143781089, resizableDoubleArray0.getNumElements());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      // Undeclared exception!
      try { 
        resizableDoubleArray0.discardFrontElements((-1282));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot discard a negative number of elements.
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      // Undeclared exception!
      try { 
        resizableDoubleArray0.discardFrontElements(1513);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot discard more elements than arecontained in this array.
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1, 148.0F);
      resizableDoubleArray0.discardFrontElements(0);
      assertEquals(148.5F, resizableDoubleArray0.getContractionCriteria(), 0.01F);
      assertEquals(0, resizableDoubleArray0.getNumElements());
      assertEquals(0, resizableDoubleArray0.start());
      assertEquals(148.0F, resizableDoubleArray0.getExpansionFactor(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.contractionCriteria = (float) 1;
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setExpansionFactor(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The contraction criteria must be a number larger than one.  If the contractionCriteria is less than or equal to one an endless loop of contraction and expansion would ensue as an internalArray.length == numElements would satisfy the contraction criteria
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setContractionCriteria((-1895.2751F));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setElement(16, (-1354.691941589967));
      double double0 = resizableDoubleArray0.addElementRolling(1.0);
      assertEquals(17, resizableDoubleArray0.getNumElements());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.addElement(0);
      assertEquals(1, resizableDoubleArray0.getNumElements());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      int int0 = resizableDoubleArray0.getNumElements();
      assertEquals(0, resizableDoubleArray0.start());
      assertEquals(0, int0);
      assertEquals(2.0F, resizableDoubleArray0.getExpansionFactor(), 0.01F);
      assertEquals(0, resizableDoubleArray0.getExpansionMode());
      assertEquals(2.5F, resizableDoubleArray0.getContractionCriteria(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      int int0 = resizableDoubleArray0.start();
      assertEquals(2.5F, resizableDoubleArray0.getContractionCriteria(), 0.01F);
      assertEquals(0, resizableDoubleArray0.getExpansionMode());
      assertEquals(2.0F, resizableDoubleArray0.getExpansionFactor(), 0.01F);
      assertEquals(0, resizableDoubleArray0.getNumElements());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      double[] doubleArray0 = resizableDoubleArray0.getElements();
      assertEquals(2.5F, resizableDoubleArray0.getContractionCriteria(), 0.01F);
      assertEquals(2.0F, resizableDoubleArray0.getExpansionFactor(), 0.01F);
      assertEquals(0, resizableDoubleArray0.start());
      assertEquals(0, resizableDoubleArray0.getExpansionMode());
      assertEquals(0, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.clear();
      assertEquals(0, resizableDoubleArray0.getExpansionMode());
      assertEquals(2.0F, resizableDoubleArray0.getExpansionFactor(), 0.01F);
      assertEquals(0, resizableDoubleArray0.start());
      assertEquals(0, resizableDoubleArray0.getNumElements());
      assertEquals(2.5F, resizableDoubleArray0.getContractionCriteria(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      int int0 = resizableDoubleArray0.getInternalLength();
      assertEquals(16, int0);
      assertEquals(0, resizableDoubleArray0.getExpansionMode());
      assertEquals(0, resizableDoubleArray0.start());
      assertEquals(2.5F, resizableDoubleArray0.getContractionCriteria(), 0.01F);
      assertEquals(0, resizableDoubleArray0.getNumElements());
      assertEquals(2.0F, resizableDoubleArray0.getExpansionFactor(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = null;
      try {
        resizableDoubleArray0 = new ResizableDoubleArray(0, (-4423.49F), 720.0F, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The expansion factor must be a number greater than 1.0
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(132);
      assertEquals(2.5F, resizableDoubleArray0.getContractionCriteria(), 0.01F);
      assertEquals(2.0F, resizableDoubleArray0.getExpansionFactor(), 0.01F);
      assertEquals(0, resizableDoubleArray0.getNumElements());
      assertEquals(0, resizableDoubleArray0.getExpansionMode());
      assertEquals(0, resizableDoubleArray0.start());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1, 148.0F);
      double[] doubleArray0 = resizableDoubleArray0.getValues();
      assertEquals(148.0F, resizableDoubleArray0.getExpansionFactor(), 0.01F);
      assertEquals(0, resizableDoubleArray0.start());
      assertEquals(148.5F, resizableDoubleArray0.getContractionCriteria(), 0.01F);
      assertEquals(0, resizableDoubleArray0.getExpansionMode());
      assertEquals(1, doubleArray0.length);
      assertEquals(0, resizableDoubleArray0.getNumElements());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      int int0 = resizableDoubleArray0.getExpansionMode();
      assertEquals(0, resizableDoubleArray0.start());
      assertEquals(0, resizableDoubleArray0.getNumElements());
      assertEquals(2.5F, resizableDoubleArray0.getContractionCriteria(), 0.01F);
      assertEquals(2.0F, resizableDoubleArray0.getExpansionFactor(), 0.01F);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setNumElements(23);
      resizableDoubleArray0.addElement(23);
      assertEquals(24, resizableDoubleArray0.getNumElements());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1, 580.0F, 2795.4277F);
      resizableDoubleArray0.setExpansionMode(1);
      double double0 = resizableDoubleArray0.addElementRolling(1.0);
      assertEquals(1, resizableDoubleArray0.start());
      assertEquals(0.0, double0, 0.01);
  }
}
