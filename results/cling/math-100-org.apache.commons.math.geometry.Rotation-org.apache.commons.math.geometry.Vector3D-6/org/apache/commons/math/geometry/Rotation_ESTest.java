/*

 * Tue Mar 03 15:49:25 GMT 2020
 */

package org.apache.commons.math.geometry;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.geometry.CardanEulerSingularityException;
import org.apache.commons.math.geometry.NotARotationMatrixException;
import org.apache.commons.math.geometry.Rotation;
import org.apache.commons.math.geometry.RotationOrder;
import org.apache.commons.math.geometry.Vector3D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Rotation_ESTest extends Rotation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Vector3D vector3D1 = Vector3D.minusI;
      Vector3D vector3D2 = Vector3D.crossProduct(vector3D0, vector3D1);
      Rotation rotation0 = new Rotation(vector3D0, vector3D2, vector3D2, vector3D1);
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Cardan angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      double[][] doubleArray0 = new double[3][7];
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, 0.0);
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 3x7 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      rotation0.getAngles(rotationOrder0);
      Vector3D vector3D1 = Vector3D.zero;
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(vector3D1, 0.0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // zero norm for rotation axis
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      rotation0.getAngles(rotationOrder0);
      double[][] doubleArray0 = new double[3][3];
      double[] doubleArray1 = new double[0];
      doubleArray0[2] = doubleArray1;
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, 1.0);
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 3x3 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.ZYZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      double[][] doubleArray1 = new double[3][5];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray1, 0.0);
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 3x3 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      Rotation rotation1 = rotation0.revert();
      double double0 = rotation1.getAngle();
      assertEquals(0.0, rotation1.getQ1(), 0.01);
      assertEquals(0.0, rotation1.getQ2(), 0.01);
      assertEquals((-1.0), rotation1.getQ0(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, rotation1.getQ3(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZYZ;
      Rotation rotation0 = new Rotation(rotationOrder0, 3.141592653589793, 3.141592653589793, 3.141592653589793);
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Euler angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Rotation rotation0 = new Rotation(rotationOrder0, 0.6, 885.025617, 885.025617);
      double[][] doubleArray0 = rotation0.getMatrix();
      Rotation rotation1 = new Rotation(doubleArray0, 0.6);
      double[] doubleArray1 = rotation1.getAngles(rotationOrder0);
      assertEquals(1.1848328110681097, rotation0.getAngle(), 0.01);
      assertArrayEquals(new double[] {0.6000000000000005, (-0.9035113123216822), (-0.9035113123216829)}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      double[][] doubleArray1 = new double[3][7];
      doubleArray1[0] = doubleArray0;
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray1, 1.0);
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 3x3 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Vector3D vector3D1 = Vector3D.plusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D1);
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Cardan angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Euler angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D();
      RotationOrder rotationOrder0 = RotationOrder.ZYZ;
      Rotation rotation0 = new Rotation(rotationOrder0, (-782.01352), (-5146.49999999999), (-2103.877442766149));
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(vector3D0, (-782.01352));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // zero norm for rotation axis
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Vector3D vector3D1 = Vector3D.minusJ;
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      Vector3D vector3D2 = rotationOrder0.getA3();
      Rotation rotation0 = new Rotation(vector3D0, vector3D1, vector3D0, vector3D2);
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Cardan angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Rotation rotation0 = new Rotation(307.0, 307.0, 307.0, (-2127.087066), false);
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Cardan angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      rotation0.getAngles(rotationOrder0);
      double[][] doubleArray0 = new double[0][0];
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, 1.0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Euler angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      Vector3D vector3D1 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D1, vector3D0);
      assertEquals(-0.0, rotation0.getQ2(), 0.01);
      assertEquals((-1.0), rotation0.getQ3(), 0.01);
      assertEquals(0.0, rotation0.getQ0(), 0.01);
      assertEquals(0.0, rotation0.getQ1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D();
      // Undeclared exception!
      try { 
        vector3D0.orthogonal();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // null norm
         //
         verifyException("org.apache.commons.math.geometry.Vector3D", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      double[][] doubleArray0 = new double[3][7];
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, 0.0);
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 3x7 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Rotation rotation0 = new Rotation((-1773.755666), (-1773.755666), (-1773.755666), (-1773.755666), true);
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Cardan angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Euler angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(3, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Rotation rotation0 = new Rotation(1.0, 1.0, (-814.574639717), 1.0, false);
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Cardan angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      Rotation rotation0 = new Rotation(rotationOrder0, 0.0, 0.9999999999, 0.9999999999);
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(0.7701511529761434, rotation0.getQ0(), 0.01);
      assertArrayEquals(new double[] {1.0274091118937389E-16, 0.9999999999, 0.9999999998999999}, doubleArray0, 0.01);
      assertEquals(1.383436481310171, rotation0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      Rotation rotation0 = new Rotation(vector3D0, (-3188.6214674));
      double double0 = rotation0.getAngle();
      assertEquals(0.99887028220365, rotation0.getQ1(), 0.01);
      assertEquals(-0.0, rotation0.getQ2(), 0.01);
      assertEquals(-0.0, rotation0.getQ3(), 0.01);
      assertEquals(0.0, vector3D0.getDelta(), 0.01);
      assertEquals(3.0465166599494573, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusK;
      Vector3D vector3D1 = new Vector3D();
      Rotation rotation0 = null;
      try {
        rotation0 = new Rotation(vector3D0, vector3D1, vector3D0, vector3D1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // zero norm for rotation defining vector
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D();
      // Undeclared exception!
      try { 
        Vector3D.angle(vector3D0, vector3D0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // null norm
         //
         verifyException("org.apache.commons.math.geometry.Vector3D", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Rotation rotation0 = new Rotation((-1685.769909695792), 655.32, 655.32, 3.141592653589793, false);
      Vector3D vector3D0 = rotation0.getAxis();
      Vector3D vector3D1 = new Vector3D((-1685.769909695792), vector3D0);
      Rotation rotation1 = new Rotation(vector3D0, vector3D1);
      assertEquals(0.003389844595277138, vector3D0.getDelta(), 0.01);
      assertEquals(0.7071067811865476, rotation1.getQ2(), 0.01);
      assertEquals((-0.7071067811865476), rotation1.getQ1(), 0.01);
      assertEquals((-5.714487073009105), vector3D1.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      Vector3D vector3D1 = rotation0.getAxis();
      Vector3D vector3D2 = vector3D1.orthogonal();
      assertEquals(0.0, vector3D2.getZ(), 0.01);
      assertEquals(1.0, vector3D0.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Euler angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(3, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      Vector3D vector3D1 = rotationOrder0.getA2();
      Rotation rotation0 = new Rotation(vector3D1, vector3D0, vector3D0, vector3D1);
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Euler angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      rotation0.getAngles(rotationOrder0);
      double[][] doubleArray0 = new double[6][6];
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, 0.0);
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 6x6 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Vector3D vector3D1 = vector3D0.orthogonal();
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      Vector3D vector3D2 = rotationOrder0.getA3();
      Rotation rotation0 = new Rotation(vector3D1, vector3D2, vector3D0, vector3D1);
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Cardan angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Vector3D vector3D1 = vector3D0.normalize();
      assertEquals((-1.5707963267948966), vector3D1.getDelta(), 0.01);
      assertEquals((-1.0), vector3D1.getZ(), 0.01);
      assertEquals(0.0, vector3D1.getAlpha(), 0.01);
      assertEquals(1.0, vector3D0.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      double double0 = Vector3D.angle(vector3D0, vector3D0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(1.0, vector3D0.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusJ;
      Vector3D vector3D1 = Vector3D.plusJ;
      double double0 = Vector3D.angle(vector3D1, vector3D0);
      assertEquals(3.141592653589793, double0, 0.01);
      assertEquals(1.0, vector3D1.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.ZYZ;
      rotation0.getAngles(rotationOrder0);
      double[][] doubleArray0 = rotation0.getMatrix();
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, 1424.808995);
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // unable to orthogonalize matrix in 10 iterations
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, 0.0, 0.0, true);
      RotationOrder rotationOrder0 = mock(RotationOrder.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      double[][] doubleArray1 = new double[3][1];
      doubleArray1[0] = doubleArray0;
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray1, 0.0);
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 3x3 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      try { 
        rotation0.getAngles(rotationOrder0);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Euler angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      assertEquals(Double.NaN, rotation0.getAngle(), 0.01);
      
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      rotation0.getAngles(rotationOrder0);
      assertEquals((-1.0), vector3D0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      double double0 = rotation0.getAngle();
      assertEquals(0.0, vector3D0.getY(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      double double0 = rotation0.getAngle();
      assertEquals(0.0, double0, 0.01);
      assertEquals(1.0, rotation0.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {-0.0, 0.0, -0.0}, doubleArray0, 0.01);
  }
}
