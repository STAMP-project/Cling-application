/*

 * Tue Mar 03 15:49:27 GMT 2020
 */

package org.apache.commons.math.geometry;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.geometry.CardanEulerSingularityException;
import org.apache.commons.math.geometry.NotARotationMatrixException;
import org.apache.commons.math.geometry.Rotation;
import org.apache.commons.math.geometry.RotationOrder;
import org.apache.commons.math.geometry.Vector3D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Rotation_ESTest extends Rotation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      Vector3D vector3D1 = rotation0.getAxis();
      assertEquals(Double.NaN, vector3D1.getAlpha(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Rotation rotation0 = new Rotation(rotationOrder0, 385.731648, 0.49986393424306264, 0.49986393424306264);
      Vector3D vector3D0 = rotation0.getAxis();
      assertEquals(2.962952690938122, rotation0.getAngle(), 0.01);
      assertEquals(0.1390314661598113, vector3D0.getDelta(), 0.01);
      assertEquals(0.2060612965488703, vector3D0.getX(), 0.01);
      assertEquals(1.36119596950982, vector3D0.getAlpha(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusJ;
      Vector3D vector3D1 = Vector3D.minusI;
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Rotation rotation0 = new Rotation(vector3D1, vector3D0, vector3D0, vector3D1);
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
  public void test03()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      Rotation rotation0 = new Rotation();
      rotation0.getAngles(rotationOrder0);
      double[][] doubleArray0 = new double[3][1];
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, 0.9999999999);
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 3x1 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      rotation0.getAngles(rotationOrder0);
      Vector3D vector3D1 = new Vector3D();
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(vector3D1, Double.NaN);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // zero norm for rotation axis
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      Rotation rotation1 = new Rotation(vector3D0, 0.5);
      assertEquals(0.5, rotation1.getAngle(), 0.01);
      assertEquals(-0.0, rotation1.getQ3(), 0.01);
      
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {0.0, -0.0, 0.0}, doubleArray0, 0.01);
      
      double[][] doubleArray1 = rotation0.getMatrix();
      Rotation rotation1 = new Rotation(doubleArray1, 160.0553);
      assertEquals(1.0, rotation1.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusJ;
      Rotation rotation0 = new Rotation(vector3D0, 3689.085929301);
      double double0 = rotation0.getAngle();
      assertEquals(0.856153986582589, double0, 0.01);
      assertEquals(0.0, rotation0.getQ1(), 0.01);
      assertEquals(0.415122085487452, rotation0.getQ2(), 0.01);
      assertEquals(0.0, rotation0.getQ3(), 0.01);
      assertEquals((-0.9097657138739339), rotation0.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Vector3D vector3D1 = Vector3D.plusK;
      Rotation rotation0 = new Rotation(vector3D1, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.ZYZ;
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
  public void test09()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.ZYZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      RotationOrder rotationOrder1 = RotationOrder.XZY;
      double[] doubleArray1 = rotation0.getAngles(rotationOrder1);
      double[][] doubleArray2 = new double[3][4];
      doubleArray2[0] = doubleArray0;
      doubleArray2[1] = doubleArray1;
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray2, 1.0);
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 3x3 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      double[][] doubleArray0 = new double[3][6];
      double[] doubleArray1 = new double[3];
      doubleArray0[0] = doubleArray1;
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, 0.0);
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 3x3 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Vector3D vector3D1 = vector3D0.orthogonal();
      Rotation rotation0 = new Rotation(vector3D1, vector3D0);
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
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
      Rotation rotation0 = new Rotation(4653.124357654341, 0.0, 0.0, 4653.124357654341, false);
      RotationOrder rotationOrder0 = RotationOrder.YZX;
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
      Vector3D vector3D0 = Vector3D.minusK;
      Vector3D vector3D1 = vector3D0.orthogonal();
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      Vector3D vector3D2 = rotationOrder0.getA3();
      Rotation rotation0 = new Rotation(vector3D1, vector3D2);
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
  public void test15()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      Rotation rotation0 = new Rotation();
      rotation0.getAngles(rotationOrder0);
      double[][] doubleArray0 = new double[7][1];
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, 0.9999999999);
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 7x1 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Vector3D vector3D1 = vector3D0.orthogonal();
      Rotation rotation0 = new Rotation(vector3D0, vector3D1);
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
  public void test18()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.zero;
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
  public void test19()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      rotation0.getAngles(rotationOrder0);
      double[][] doubleArray0 = new double[0][9];
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, (-453.4079));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(0.0, rotation0.getAngle(), 0.01);
      assertArrayEquals(new double[] {0.0, -0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      rotation0.getAngles(rotationOrder0);
      Vector3D vector3D1 = new Vector3D();
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(vector3D1, Double.NaN);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // zero norm for rotation axis
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.1, 0.1, 0.1, 925035.8651406281, false);
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
  public void test24()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Rotation rotation0 = new Rotation(rotationOrder0, 385.731648, 0.49986393424306264, 0.49986393424306264);
      double double0 = rotation0.getAngle();
      assertEquals(2.962952690938122, double0, 0.01);
      assertEquals(0.964814504678525, rotation0.getQ2(), 0.01);
      assertEquals((-0.08920126201211434), rotation0.getQ0(), 0.01);
      assertEquals(0.2052398582930259, rotation0.getQ1(), 0.01);
      assertEquals(0.13803154344292862, rotation0.getQ3(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusJ;
      Vector3D vector3D1 = Vector3D.crossProduct(vector3D0, vector3D0);
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
      Vector3D vector3D0 = Vector3D.zero;
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
      Vector3D vector3D0 = new Vector3D((-5.53), 0.0);
      Vector3D vector3D1 = vector3D0.orthogonal();
      assertEquals(0.0, vector3D1.getDelta(), 0.01);
      assertEquals(0.0, vector3D0.getZ(), 0.01);
      assertEquals(1.0, vector3D1.getNorm(), 0.01);
      assertEquals((-0.8176110196153104), vector3D1.getAlpha(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      Vector3D vector3D1 = rotation0.applyTo(vector3D0);
      Vector3D vector3D2 = vector3D1.orthogonal();
      assertEquals(0.0, vector3D0.getDelta(), 0.01);
      assertEquals(0.0, vector3D2.getZ(), 0.01);
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
      Vector3D vector3D0 = Vector3D.plusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      assertEquals(Double.NaN, rotation0.getQ2(), 0.01);
      
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      rotation0.getAngles(rotationOrder0);
      assertEquals(1.0, vector3D0.getY(), 0.01);
      assertEquals(0.0, vector3D0.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Rotation rotation0 = new Rotation(rotationOrder0, 0.999998484, 0.999998484, 0.999998484);
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(2.1535705000450927, rotation0.getAngle(), 0.01);
      assertEquals(0.4741611976328991, rotation0.getQ0(), 0.01);
      assertArrayEquals(new double[] {0.999998484, 0.9999984840000005, 0.999998484}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Vector3D vector3D1 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D1, vector3D1, vector3D0);
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
  public void test33()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      rotation0.getAngles(rotationOrder0);
      double[][] doubleArray0 = new double[3][4];
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, 1.0);
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 3x4 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusJ;
      Vector3D vector3D1 = vector3D0.normalize();
      assertEquals(0.0, vector3D1.getX(), 0.01);
      assertEquals(1.0, vector3D1.getNorm(), 0.01);
      assertEquals(1.0, vector3D1.getY(), 0.01);
      assertEquals(0.0, vector3D0.getDelta(), 0.01);
      assertEquals(0.0, vector3D1.getDelta(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      double double0 = Vector3D.angle(vector3D0, vector3D0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Vector3D vector3D1 = new Vector3D((-1.0), vector3D0, (-1348.7175409695), vector3D0, (-1348.7175409695), vector3D0);
      double double0 = Vector3D.angle(vector3D0, vector3D1);
      assertEquals(2698.435081939, vector3D1.getNorm(), 0.01);
      assertEquals((-3.141592653589793), vector3D1.getAlpha(), 0.01);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      rotation0.getAngles(rotationOrder0);
      double[][] doubleArray0 = new double[3][6];
      double[] doubleArray1 = new double[3];
      doubleArray0[0] = doubleArray1;
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, (-0.1));
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 3x3 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      double[][] doubleArray0 = rotation0.getMatrix();
      Rotation rotation1 = new Rotation(doubleArray0, 0.0);
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      try { 
        rotation1.getAngles(rotationOrder0);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Euler angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      double[][] doubleArray0 = rotation0.getMatrix();
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, 0.25);
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // unable to orthogonalize matrix in 10 iterations
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      assertEquals(Double.NaN, rotation0.getQ0(), 0.01);
      
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      rotation0.getAngles(rotationOrder0);
      assertEquals(0.0, vector3D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      double double0 = rotation0.getAngle();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      double double0 = rotation0.getAngle();
      assertEquals(1.0, rotation0.getQ0(), 0.01);
      assertEquals(0.0, rotation0.getQ2(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, vector3D0.getDelta(), 0.01);
      assertEquals(0.0, vector3D0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.1, 0.1, 0.1, 925035.8651406281, false);
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
  public void test44()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(3, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(1.0, rotation0.getQ0(), 0.01);
      assertEquals(0.0, rotation0.getQ2(), 0.01);
      assertArrayEquals(new double[] {-0.0, 0.0, -0.0}, doubleArray0, 0.01);
  }
}
