/*

 * Tue Mar 03 15:47:32 GMT 2020
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
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      Rotation rotation0 = new Rotation(rotationOrder0, (-1.0), (-1.0), (-1.0));
      Vector3D vector3D0 = rotation0.getAxis();
      assertEquals(0.4741598817790378, rotation0.getQ0(), 0.01);
      assertEquals((-0.8387412025322779), vector3D0.getZ(), 0.01);
      assertEquals((-3.141592653589793), vector3D0.getAlpha(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D0, (-1237.34605));
      Vector3D vector3D1 = rotation0.getAxis();
      assertEquals(1.0, vector3D1.getX(), 0.01);
      assertEquals(0.0, vector3D1.getDelta(), 0.01);
      assertEquals(0.0, vector3D1.getAlpha(), 0.01);
      assertEquals(0.21893978161233224, rotation0.getQ1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Vector3D vector3D1 = Vector3D.plusJ;
      RotationOrder rotationOrder0 = RotationOrder.XZY;
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
  public void test03()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      Vector3D vector3D0 = rotationOrder0.getA1();
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      double[][] doubleArray0 = new double[3][7];
      rotation0.getAngles((RotationOrder) null);
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, Double.NaN);
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 3x7 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Rotation rotation0 = new Rotation();
      rotation0.getAngles(rotationOrder0);
      Vector3D vector3D0 = Vector3D.zero;
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(vector3D0, (-0.6949809077113371));
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
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Rotation rotation0 = new Rotation(rotationOrder0, (-1.0), (-1.0), (-1.0));
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(1.9390875288225065, rotation0.getAngle(), 0.01);
      assertArrayEquals(new double[] {(-0.9999999999999999), (-1.0000000000000004), (-0.9999999999999999)}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      rotation0.getAngles(rotationOrder0);
      double[][] doubleArray0 = rotation0.getMatrix();
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, (-1742.01));
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // unable to orthogonalize matrix in 10 iterations
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {-0.0, 0.0, -0.0}, doubleArray0, 0.01);
      
      double[][] doubleArray1 = rotation0.getMatrix();
      Rotation rotation1 = new Rotation(doubleArray1, 0.6961551111710222);
      assertEquals(1.0, rotation1.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      Rotation rotation0 = new Rotation(rotationOrder0, 3570753.6904702876, 3570753.6904702876, 3570753.6904702876);
      double double0 = rotation0.getAngle();
      assertEquals(1.3911330187430786, double0, 0.01);
      assertEquals((-0.7676907942117462), rotation0.getQ0(), 0.01);
      assertEquals(0.31021777811510776, rotation0.getQ2(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, 0.0, 0.0, false);
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
  public void test10()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      double[][] doubleArray1 = new double[3][8];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      RotationOrder rotationOrder1 = RotationOrder.XZY;
      rotation0.getAngles(rotationOrder1);
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray1, Double.NaN);
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
      Vector3D vector3D0 = Vector3D.plusI;
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      double[][] doubleArray1 = new double[3][8];
      doubleArray1[0] = doubleArray0;
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray1, 1147.90446);
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 3x3 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusK;
      Vector3D vector3D1 = vector3D0.orthogonal();
      Rotation rotation0 = new Rotation(vector3D0, vector3D1, vector3D1, vector3D0);
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
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      Rotation rotation0 = new Rotation(2404.304055, 2404.304055, (-8.669019705085684E7), 4497.5216299, false);
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
  public void test15()  throws Throwable  {
      Vector3D vector3D0 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(0.67669924560831).when(vector3D0).getNorm();
      doReturn(0.0).when(vector3D0).getX();
      doReturn(0.0).when(vector3D0).getY();
      doReturn(0.0).when(vector3D0).getZ();
      Rotation rotation0 = new Rotation(vector3D0, 1613.4);
      RotationOrder rotationOrder0 = mock(RotationOrder.class, new ViolatedAssumptionAnswer());
      rotation0.getAngles(rotationOrder0);
      Vector3D vector3D1 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(vector3D1).getNorm();
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(vector3D1, (-128.1285969));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // zero norm for rotation axis
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Vector3D vector3D1 = vector3D0.orthogonal();
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      Vector3D vector3D2 = rotationOrder0.getA1();
      Rotation rotation0 = new Rotation(vector3D1, vector3D0, vector3D0, vector3D2);
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
      Rotation rotation0 = new Rotation();
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      rotation0.getAngles(rotationOrder0);
      double[][] doubleArray0 = new double[0][0];
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, (-1.0));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(354158.2125276768, 354158.2125276768, 0.25);
      Vector3D vector3D1 = vector3D0.orthogonal();
      assertEquals(4.991461133569152E-7, vector3D0.getDelta(), 0.01);
      assertEquals(1.0, vector3D1.getNorm(), 0.01);
      assertEquals((-0.7853981633974483), vector3D1.getAlpha(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      double[][] doubleArray0 = new double[3][8];
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, Double.NaN);
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 3x8 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Rotation rotation0 = new Rotation();
      rotation0.getAngles(rotationOrder0);
      double[][] doubleArray0 = new double[0][0];
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, 0.1399884092557222);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Vector3D vector3D1 = vector3D0.orthogonal();
      Rotation rotation0 = new Rotation(vector3D0, vector3D1);
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
  public void test25()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YXY;
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
  public void test26()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusK;
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(3, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Vector3D vector3D1 = vector3D0.orthogonal();
      Rotation rotation0 = new Rotation(vector3D1, vector3D0, vector3D0, vector3D1);
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
  public void test28()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D0, (-28.37501));
      double double0 = rotation0.getAngle();
      assertEquals(0.0, rotation0.getQ2(), 0.01);
      assertEquals(0.9987333074245253, rotation0.getQ1(), 0.01);
      assertEquals(0.0, rotation0.getQ3(), 0.01);
      assertEquals(3.040916535897933, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      Vector3D vector3D1 = new Vector3D();
      Rotation rotation0 = null;
      try {
        rotation0 = new Rotation(vector3D0, vector3D1, vector3D1, vector3D0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // zero norm for rotation defining vector
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
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
  public void test31()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-1686.14), (-1686.14), (-1.0));
      Vector3D vector3D1 = vector3D0.orthogonal();
      assertEquals(0.9999999999999999, vector3D1.getNorm(), 0.01);
      assertEquals((-4.193641926141699E-4), vector3D0.getDelta(), 0.01);
      assertEquals(0.7071067811865475, vector3D1.getY(), 0.01);
      assertEquals((-0.7071067811865475), vector3D1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZY;
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
  public void test33()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(3, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Rotation rotation0 = new Rotation(rotationOrder0, (-1911.8745207159961), (-1911.8745207159961), (-1911.8745207159961));
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {1.3554053201879412, 1.7861873334018519, 1.3554053201879412}, doubleArray0, 0.01);
      assertEquals((-5.551115123125783E-17), rotation0.getQ1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Vector3D vector3D1 = vector3D0.orthogonal();
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
  public void test36()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Vector3D vector3D1 = vector3D0.normalize();
      assertEquals(0.0, vector3D1.getZ(), 0.01);
      assertEquals(0.0, vector3D1.getAlpha(), 0.01);
      assertEquals(1.0, vector3D1.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      double double0 = Vector3D.angle(vector3D0, vector3D0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Vector3D vector3D1 = Vector3D.minusI;
      double double0 = Vector3D.angle(vector3D0, vector3D1);
      assertEquals(3.141592653589793, double0, 0.01);
      assertEquals(0.0, vector3D1.getDelta(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      double[][] doubleArray0 = new double[3][3];
      double[] doubleArray1 = new double[7];
      rotation0.getAngles(rotationOrder0);
      doubleArray0[1] = doubleArray1;
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
      Vector3D vector3D0 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(3, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      Vector3D vector3D0 = rotationOrder0.getA1();
      Vector3D vector3D1 = new Vector3D((-2958.22259), vector3D0, (-2958.22259), vector3D0);
      Rotation rotation0 = new Rotation(vector3D1, vector3D0);
      double double0 = rotation0.getAngle();
      assertEquals((-5916.44518), vector3D1.getY(), 0.01);
      assertEquals(3.141592653589793, double0, 0.01);
      assertEquals((-0.9999999999999999), rotation0.getQ3(), 0.01);
      assertEquals(-0.0, rotation0.getQ1(), 0.01);
      assertEquals(0.0, rotation0.getQ2(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusJ;
      Rotation rotation0 = new Rotation(vector3D0, 3657.0);
      double double0 = rotation0.getAngle();
      assertEquals(0.0, vector3D0.getDelta(), 0.01);
      assertEquals(0.9956715914718879, rotation0.getQ0(), 0.01);
      assertEquals(0.18615122148067043, double0, 0.01);
      assertEquals(-0.0, rotation0.getQ1(), 0.01);
      assertEquals(-0.0, rotation0.getQ3(), 0.01);
      assertEquals(0.0929412821938558, rotation0.getQ2(), 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(0.0, rotation0.getQ2(), 0.01);
      assertArrayEquals(new double[] {0.0, -0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      assertEquals(Double.NaN, rotation0.getAngle(), 0.01);
      
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      rotation0.getAngles(rotationOrder0);
      assertEquals(0.0, vector3D0.getZ(), 0.01);
      assertEquals(0.0, vector3D0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }
}
