/*

 * Tue Mar 03 15:33:39 GMT 2020
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
      double[] doubleArray0 = new double[4];
      BigMatrixImpl bigMatrixImpl0 = (BigMatrixImpl)MatrixUtils.createColumnBigMatrix(doubleArray0);
      assertEquals(1, bigMatrixImpl0.getColumnDimension());
      assertEquals(4, bigMatrixImpl0.getRowDimension());
      assertEquals(64, bigMatrixImpl0.getScale());
      assertEquals(4, bigMatrixImpl0.getRoundingMode());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      MatrixUtils.createBigIdentityMatrix(1393);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      RealMatrix realMatrix0 = MatrixUtils.createColumnRealMatrix(doubleArray0);
      assertEquals(10, realMatrix0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[1];
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
  public void test4()  throws Throwable  {
      RealMatrix realMatrix0 = MatrixUtils.createRealIdentityMatrix(12);
      assertEquals(12, realMatrix0.getColumnDimension());
      assertEquals(1.0, realMatrix0.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BigDecimal[] bigDecimalArray0 = new BigDecimal[7];
      BigMatrixImpl bigMatrixImpl0 = (BigMatrixImpl)MatrixUtils.createColumnBigMatrix(bigDecimalArray0);
      assertEquals(64, bigMatrixImpl0.getScale());
      assertEquals(4, bigMatrixImpl0.getRoundingMode());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BigMatrixImpl bigMatrixImpl0 = (BigMatrixImpl)MatrixUtils.createBigIdentityMatrix(1);
      assertTrue(bigMatrixImpl0.isSquare());
      assertEquals(64, bigMatrixImpl0.getScale());
      assertEquals(1, bigMatrixImpl0.getRowDimension());
      assertEquals(4, bigMatrixImpl0.getRoundingMode());
  }
}
