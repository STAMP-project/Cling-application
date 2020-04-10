/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 23:04:34 GMT 2019
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigDecimal;
import org.apache.commons.math.linear.BigMatrixImpl;
import org.apache.commons.math.linear.MatrixUtils;
import org.apache.commons.math.linear.RealMatrix;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MatrixUtils_ESTest extends MatrixUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      BigMatrixImpl bigMatrixImpl0 = (BigMatrixImpl)MatrixUtils.createColumnBigMatrix(doubleArray0);
      assertEquals(4, bigMatrixImpl0.getRoundingMode());
      assertEquals(1, bigMatrixImpl0.getColumnDimension());
      assertEquals(1, bigMatrixImpl0.getRowDimension());
      assertEquals(64, bigMatrixImpl0.getScale());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      RealMatrix realMatrix0 = MatrixUtils.createColumnRealMatrix(doubleArray0);
      assertEquals(7, realMatrix0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BigDecimal[] bigDecimalArray0 = new BigDecimal[1];
      BigMatrixImpl bigMatrixImpl0 = (BigMatrixImpl)MatrixUtils.createColumnBigMatrix(bigDecimalArray0);
      assertEquals(64, bigMatrixImpl0.getScale());
      assertEquals(4, bigMatrixImpl0.getRoundingMode());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RealMatrix realMatrix0 = MatrixUtils.createRealIdentityMatrix(8);
      assertEquals(1.0, realMatrix0.getNorm(), 0.01);
      assertEquals(8, realMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      MatrixUtils.createBigIdentityMatrix(2888);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[4];
      // Undeclared exception!
      try { 
        MatrixUtils.createColumnBigMatrix(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BigMatrixImpl bigMatrixImpl0 = (BigMatrixImpl)MatrixUtils.createBigIdentityMatrix(1);
      assertTrue(bigMatrixImpl0.isSquare());
      assertEquals(4, bigMatrixImpl0.getRoundingMode());
      assertEquals(64, bigMatrixImpl0.getScale());
      assertEquals(1, bigMatrixImpl0.getRowDimension());
  }
}
