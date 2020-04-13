/*

 * Tue Mar 03 15:50:12 GMT 2020
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
      Rotation rotation0 = new Rotation((-2718.60647593797), 0.0, 2.964792086968481E9, (-2718.60647593797), true);
      Vector3D vector3D0 = rotation0.getAxis();
      assertEquals(0.0, vector3D0.getX(), 0.01);
      assertEquals((-9.169636170728845E-7), rotation0.getQ0(), 0.01);
      assertEquals(0.9999999999995797, vector3D0.getY(), 0.01);
      assertEquals((-9.169636170733986E-7), vector3D0.getDelta(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D0, 293.5462164987538);
      rotation0.getAngles((RotationOrder) null);
      double[][] doubleArray0 = new double[3][1];
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, 293.5462164987538);
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 3x1 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      rotation0.getAngles(rotationOrder0);
      Vector3D vector3D0 = Vector3D.zero;
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(vector3D0, (-5071.173681893291));
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
      Vector3D vector3D0 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D0, 2321.04971167848);
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      double[][] doubleArray1 = new double[3][7];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      Rotation rotation1 = new Rotation(doubleArray1, 2321.04971167848);
      try { 
        rotation1.getAngles(rotationOrder0);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Cardan angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D0, 293.5462164987538);
      double double0 = rotation0.getAngle();
      assertEquals((-0.6358041013544297), rotation0.getQ0(), 0.01);
      assertEquals((-0.7718504678374472), rotation0.getQ1(), 0.01);
      assertEquals(-0.0, rotation0.getQ3(), 0.01);
      assertEquals(-0.0, rotation0.getQ2(), 0.01);
      assertEquals(1.7634929386867855, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 1.0, 1978.5127466, 0.0, true);
      try { 
        rotation0.getAngles((RotationOrder) null);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Euler angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D0, 293.5462164987538);
      double[] doubleArray0 = rotation0.getAngles((RotationOrder) null);
      double[][] doubleArray1 = new double[3][1];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray1, (-1682.44));
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 3x3 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D0, 293.5462164987538);
      double[] doubleArray0 = rotation0.getAngles((RotationOrder) null);
      double[][] doubleArray1 = new double[3][1];
      doubleArray1[0] = doubleArray0;
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray1, (-1.0));
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 3x3 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.1, 0.1, 0.1, 0.1, true);
      Rotation rotation1 = rotation0.revert();
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      try { 
        rotation1.getAngles(rotationOrder0);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Cardan angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      Rotation rotation0 = new Rotation((-1969.149826635735), 3835.7210912073306, (-310.48586066), (-1969.149826635735), false);
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
  public void test11()  throws Throwable  {
      Rotation rotation0 = new Rotation(1947.836, 2442.058256, 1947.836, (-1706.4), false);
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
  public void test12()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusJ;
      Rotation rotation0 = new Rotation(vector3D0, 2114.0);
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {(-2.849736787658944), 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Vector3D vector3D1 = Vector3D.plusK;
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D1);
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
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      rotation0.getAngles(rotationOrder0);
      double[][] doubleArray0 = new double[1][7];
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, 1.0);
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 1x7 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      Rotation rotation0 = new Rotation(rotationOrder0, 0.7071067811865476, 0.7071067811865476, 0.7071067811865476);
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(0.7132222029694518, rotation0.getQ0(), 0.01);
      assertArrayEquals(new double[] {0.7071067811865477, 0.7071067811865471, 0.7071067811865477}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Vector3D vector3D1 = Vector3D.plusJ;
      Vector3D vector3D2 = vector3D0.add(vector3D1);
      Vector3D vector3D3 = vector3D2.orthogonal();
      assertEquals(0.9999999999999999, vector3D3.getNorm(), 0.01);
      assertEquals(1.4142135623730951, vector3D2.getNorm(), 0.01);
      assertEquals(0.0, vector3D2.getDelta(), 0.01);
      assertEquals((-0.7071067811865475), vector3D3.getY(), 0.01);
      assertEquals(0.7071067811865475, vector3D3.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
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
  public void test18()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      double[][] doubleArray0 = new double[3][1];
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, (-1682.44));
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 3x1 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      rotation0.getAngles(rotationOrder0);
      assertEquals(0.0, vector3D0.getX(), 0.01);
      assertEquals(Double.NaN, rotation0.getQ3(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Rotation rotation0 = new Rotation((-504.3503), (-504.3503), (-1448.8871819252834), (-6022.83881632), false);
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
  public void test22()  throws Throwable  {
      Rotation rotation0 = new Rotation((-2718.60647593797), 0.0, 2.964792086968481E9, (-2718.60647593797), true);
      double double0 = rotation0.getAngle();
      assertEquals(3.141590819662559, double0, 0.01);
      assertEquals(0.0, rotation0.getQ1(), 0.01);
      assertEquals((-9.169636170728845E-7), rotation0.getQ3(), 0.01);
      assertEquals(0.9999999999991591, rotation0.getQ2(), 0.01);
      assertEquals((-9.169636170728845E-7), rotation0.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusJ;
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
  public void test24()  throws Throwable  {
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
  public void test25()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Vector3D vector3D1 = vector3D0.orthogonal();
      Rotation rotation0 = new Rotation(vector3D0, vector3D1, vector3D1, vector3D0);
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
  public void test26()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      Vector3D vector3D1 = rotation0.getAxis();
      Vector3D vector3D2 = vector3D1.orthogonal();
      assertEquals(1.0, vector3D0.getNorm(), 0.01);
      assertEquals(0.0, vector3D0.getY(), 0.01);
      assertEquals(0.0, vector3D2.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      double[][] doubleArray0 = rotation0.getMatrix();
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, (-256.502951034));
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // unable to orthogonalize matrix in 10 iterations
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
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
  public void test29()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(3, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      rotation0.getAngles(rotationOrder0);
      double[][] doubleArray0 = new double[0][3];
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, 293.5462164987538);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D();
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      Vector3D vector3D1 = rotationOrder0.getA1();
      Vector3D vector3D2 = new Vector3D(1.6933825776112812, vector3D0, 1.6933825776112812, vector3D0, (-4616.0), vector3D1);
      Rotation rotation0 = new Rotation(vector3D2, vector3D1);
      RotationOrder rotationOrder1 = RotationOrder.YXY;
      try { 
        rotation0.getAngles(rotationOrder1);
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
      Vector3D vector3D0 = Vector3D.plusI;
      Vector3D vector3D1 = vector3D0.normalize();
      assertEquals(0.0, vector3D1.getZ(), 0.01);
      assertEquals(1.0, vector3D1.getNorm(), 0.01);
      assertEquals(0.0, vector3D1.getAlpha(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      double double0 = Vector3D.angle(vector3D0, vector3D0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, vector3D0.getDelta(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Vector3D vector3D1 = Vector3D.minusI;
      double double0 = Vector3D.angle(vector3D0, vector3D1);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusJ;
      Rotation rotation0 = new Rotation(vector3D0, 2114.0);
      double[][] doubleArray0 = rotation0.getMatrix();
      assertEquals(2.8497367876589443, rotation0.getAngle(), 0.01);
      
      Rotation rotation1 = new Rotation(doubleArray0, 0.0);
      assertEquals(0.0, rotation1.getQ3(), 0.01);
      
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      double[] doubleArray1 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {(-2.849736787658944), 0.0, 0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      Rotation rotation0 = new Rotation();
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
  public void test38()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      Rotation rotation0 = new Rotation(rotationOrder0, (-866.591), (-866.591), 0.6);
      rotation0.getAngles(rotationOrder0);
      Vector3D vector3D0 = Vector3D.plusI;
      Vector3D vector3D1 = new Vector3D(0.0, vector3D0);
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(vector3D1, 1.0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // zero norm for rotation axis
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      double double0 = rotation0.getAngle();
      assertEquals(0.0, vector3D0.getZ(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      double double0 = rotation0.getAngle();
      assertEquals(0.0, rotation0.getQ1(), 0.01);
      assertEquals(0.0, rotation0.getQ2(), 0.01);
      assertEquals(1.0, rotation0.getQ0(), 0.01);
      assertEquals(0.0, vector3D0.getZ(), 0.01);
      assertEquals(1.0, vector3D0.getX(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      assertEquals(1.0, vector3D0.getNorm(), 0.01);
      
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(0.0, rotation0.getQ1(), 0.01);
      assertEquals(1.0, rotation0.getQ0(), 0.01);
      assertEquals(0.0, rotation0.getQ2(), 0.01);
      assertArrayEquals(new double[] {0.0, -0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
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
  public void test43()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D0, 1007.0);
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {1.6903508512661636, 0.0, -0.0}, doubleArray0, 0.01);
      assertEquals(-0.0, rotation0.getQ3(), 0.01);
      assertEquals(0.0, vector3D0.getDelta(), 0.01);
      assertEquals(-0.0, rotation0.getQ2(), 0.01);
  }
}
