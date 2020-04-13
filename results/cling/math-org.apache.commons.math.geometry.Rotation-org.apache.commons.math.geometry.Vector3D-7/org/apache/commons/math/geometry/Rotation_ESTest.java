/*

 * Tue Mar 03 15:52:19 GMT 2020
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
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Rotation rotation0 = new Rotation(rotationOrder0, (-351.492381977634), (-351.492381977634), (-351.492381977634));
      Vector3D vector3D0 = rotation0.getAxis();
      assertEquals(0.716892655823349, vector3D0.getZ(), 0.01);
      assertEquals(0.7853981633974483, vector3D0.getAlpha(), 0.01);
      assertEquals(0.9567659661006714, rotation0.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Rotation rotation0 = new Rotation((-2123.3510652561317), (-2123.3510652561317), (-594.353), (-594.353), false);
      Vector3D vector3D0 = rotation0.getAxis();
      assertEquals((-2123.3510652561317), rotation0.getQ0(), 0.01);
      assertEquals(0.9999999999999998, vector3D0.getNorm(), 0.01);
      assertEquals((-2.868664874909892), vector3D0.getAlpha(), 0.01);
      assertEquals((-0.26026265729669634), vector3D0.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusJ;
      Vector3D vector3D1 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D1, vector3D0, vector3D0, vector3D1);
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
  public void test03()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      rotation0.getAngles(rotationOrder0);
      double[][] doubleArray0 = new double[3][1];
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, (-1534.8134299));
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
      Vector3D vector3D0 = new Vector3D((-0.389), (-0.389), (-0.389));
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      Rotation rotation1 = new Rotation(vector3D0, (-1404.05));
      assertEquals(0.5731318517490019, rotation1.getQ1(), 0.01);
      assertEquals(2.899676498952168, rotation1.getAngle(), 0.01);
      
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {0.0, -0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, rotation0.getQ3(), 0.01);
      assertEquals(1.0, rotation0.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      Rotation rotation0 = new Rotation(vector3D0, (-1596160.0564042346));
      double double0 = rotation0.getAngle();
      assertEquals((-0.6777791007798637), rotation0.getQ1(), 0.01);
      assertEquals(1.4894757460012036, double0, 0.01);
      assertEquals((-0.7352655918415056), rotation0.getQ0(), 0.01);
      assertEquals(0.0, rotation0.getQ2(), 0.01);
      assertEquals(0.0, rotation0.getQ3(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Vector3D vector3D1 = new Vector3D((-2.306), vector3D0, (-2.306), vector3D0, (-2.306), vector3D0);
      Rotation rotation0 = new Rotation(vector3D0, vector3D1);
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
  public void test07()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      double[][] doubleArray0 = rotation0.getMatrix();
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, (-4739.59461));
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // unable to orthogonalize matrix in 10 iterations
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-0.389), (-0.389), (-0.389));
      Vector3D vector3D1 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn((-1404.05)).when(vector3D1).getNorm();
      Rotation rotation0 = new Rotation(vector3D0, vector3D1);
      RotationOrder rotationOrder0 = RotationOrder.ZYZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      RotationOrder rotationOrder1 = RotationOrder.XZY;
      double[][] doubleArray1 = new double[3][5];
      doubleArray1[0] = doubleArray0;
      rotation0.getAngles(rotationOrder1);
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
      Rotation rotation0 = new Rotation();
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {-0.0, 0.0, -0.0}, doubleArray0, 0.01);
      assertEquals(0.0, rotation0.getAngle(), 0.01);
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
      Rotation rotation0 = new Rotation(0.9863925596330552, (-0.43734), 1253.6693634396502, 1253.6693634396502, false);
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
      Vector3D vector3D0 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(vector3D0).getNorm();
      RotationOrder rotationOrder0 = RotationOrder.ZYZ;
      Rotation rotation0 = new Rotation(rotationOrder0, 1.0, 1873.65057544718, (-312.0));
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(vector3D0, 1873.65057544718);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // zero norm for rotation axis
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Rotation rotation0 = new Rotation(530.8283753, 1515.9771013482955, 1515.9771013482955, 3128.9, false);
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
      Rotation rotation0 = new Rotation((-0.389), (-0.389), (-1404.05), (-0.389), false);
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
  public void test15()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      rotation0.getAngles(rotationOrder0);
      double[][] doubleArray0 = new double[1][9];
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, 499.632235071);
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 1x9 matrix cannot be a rotation matrix
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
      assertEquals(1.0, vector3D0.getNorm(), 0.01);
      assertEquals(1.0, vector3D1.getZ(), 0.01);
      assertEquals(1.5707963267948966, vector3D1.getDelta(), 0.01);
      assertEquals(3.141592653589793, vector3D1.getAlpha(), 0.01);
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
      Vector3D vector3D0 = new Vector3D((-0.389), (-0.389), (-0.389));
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      double[][] doubleArray0 = new double[3][5];
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, 1.0);
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 3x5 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Rotation rotation0 = new Rotation();
      rotation0.getAngles(rotationOrder0);
      double[][] doubleArray0 = new double[4][1];
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, (-0.389));
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 4x1 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      Rotation rotation0 = new Rotation(1344662.7096202166, 1344662.7096202166, 2033.0, 0.9990260569282321, false);
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
  public void test23()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(34.268830948594, 34.268830948594, 34.268830948594);
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(3, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Rotation rotation0 = new Rotation(2584262.500974436, (-2317.685098441), (-2317.685098441), 3347.739697654, false);
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
  public void test25()  throws Throwable  {
      Rotation rotation0 = new Rotation((-2775.788870029), 463.07011, (-2775.788870029), (-2775.788870029), false);
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
  public void test26()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Rotation rotation0 = new Rotation(rotationOrder0, (-0.389), (-0.9999999999), (-1404.05));
      double double0 = rotation0.getAngle();
      assertEquals((-0.4874152065449514), rotation0.getQ1(), 0.01);
      assertEquals(0.11161802776096175, rotation0.getQ3(), 0.01);
      assertEquals((-0.011910975876412738), rotation0.getQ0(), 0.01);
      assertEquals(3.1177701385256094, double0, 0.01);
      assertEquals((-0.8659249164686088), rotation0.getQ2(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Vector3D vector3D0 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      Vector3D vector3D1 = Vector3D.plusI;
      Rotation rotation0 = null;
      try {
        rotation0 = new Rotation(vector3D1, vector3D0, vector3D1, vector3D0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // zero norm for rotation defining vector
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
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
  public void test29()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      Vector3D vector3D0 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn((-950820.0099999981)).when(vector3D0).getX();
      doReturn((-950820.0099999981)).when(vector3D0).getY();
      doReturn((-647.9277655647)).when(vector3D0).getZ();
      Vector3D vector3D1 = rotation0.applyTo(vector3D0);
      Vector3D vector3D2 = new Vector3D((-950820.0099999981), vector3D1, (-647.9277655647), vector3D1, (-647.9277655647), vector3D1, (-647.9277655647), vector3D1);
      Rotation rotation1 = new Rotation(vector3D2, vector3D1);
      assertEquals(0.7071067811865476, rotation1.getQ2(), 0.01);
      assertEquals(1344662.7096202164, vector3D1.getNorm(), 0.01);
      assertEquals(1.0, rotation0.getQ0(), 0.01);
      assertEquals((-0.7071067811865476), rotation1.getQ1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      Vector3D vector3D0 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn((-950820.0099999981)).when(vector3D0).getX();
      doReturn((-950820.0099999981)).when(vector3D0).getY();
      doReturn((-647.9277655647)).when(vector3D0).getZ();
      Vector3D vector3D1 = rotation0.applyTo(vector3D0);
      Vector3D vector3D2 = new Vector3D((-950820.0099999981), vector3D1, (-647.9277655647), vector3D1, (-647.9277655647), vector3D1, (-647.9277655647), vector3D1);
      Rotation rotation1 = new Rotation(vector3D1, vector3D2);
      assertEquals(0.0, rotation1.getQ0(), 0.01);
      assertEquals(0.7071067811865476, rotation1.getQ1(), 0.01);
      assertEquals((-0.7071067811865476), rotation1.getQ2(), 0.01);
      assertEquals(1.2811459439223657E12, vector3D2.getNorm(), 0.01);
      assertEquals(6.173221157016735E8, vector3D2.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
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
  public void test32()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      Rotation rotation0 = new Rotation(rotationOrder0, (-0.389), (-0.389), (-0.389));
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(0.37211209018672037, rotation0.getQ1(), 0.01);
      assertArrayEquals(new double[] {2.7525926535897933, 0.3889999999999992, 2.7525926535897933}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-0.389), (-0.389), (-0.389));
      Rotation rotation0 = new Rotation(vector3D0, (-0.389));
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {0.8986439884902107, 0.3169432801318941, (-0.6721523383046859)}, doubleArray0, 0.01);
      assertEquals((-0.1115879430803495), rotation0.getQ2(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusJ;
      Vector3D vector3D1 = new Vector3D((-0.389), vector3D0, (-0.389), vector3D0);
      Rotation rotation0 = new Rotation(vector3D0, vector3D1);
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
  public void test35()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-0.389), (-0.389), (-0.389));
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      rotation0.getAngles(rotationOrder0);
      Vector3D vector3D1 = Vector3D.crossProduct(vector3D0, vector3D0);
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(vector3D1, (-1862.0));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // zero norm for rotation axis
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      Vector3D vector3D0 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn((-950820.0099999981)).when(vector3D0).getX();
      doReturn((-950820.0099999981)).when(vector3D0).getY();
      doReturn((-647.9277655647)).when(vector3D0).getZ();
      Vector3D vector3D1 = rotation0.applyTo(vector3D0);
      Vector3D vector3D2 = vector3D1.normalize();
      assertEquals((-4.8185153496257976E-4), vector3D2.getDelta(), 0.01);
      assertEquals((-2.356194490192345), vector3D2.getAlpha(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-0.1240981492962196), (-0.1240981492962196), (-0.1240981492962196));
      double double0 = Vector3D.angle(vector3D0, vector3D0);
      assertEquals((-2.356194490192345), vector3D0.getAlpha(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals((-0.6154797086703874), vector3D0.getDelta(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-0.1240981492962196), (-0.1240981492962196), (-0.1240981492962196));
      Vector3D vector3D1 = new Vector3D((-0.1240981492962196), vector3D0, (-0.1240981492962196), vector3D0);
      double double0 = Vector3D.angle(vector3D1, vector3D0);
      assertEquals(3.141592653589793, double0, 0.01);
      assertEquals((-0.6154797086703874), vector3D0.getDelta(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      Rotation rotation0 = new Rotation(rotationOrder0, (-2629.876503891419), (-4814.93871265344), 5226370.595921943);
      double[][] doubleArray0 = rotation0.getMatrix();
      Rotation rotation1 = new Rotation(doubleArray0, 1796.3730247336);
      double[] doubleArray1 = rotation1.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {(-0.3634528367619664), (-1.1228252997128008), 1.3494466949837243}, doubleArray1, 0.01);
      assertEquals(0.7102374534438878, rotation0.getQ0(), 0.01);
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
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      Rotation rotation0 = new Rotation(rotationOrder0, (-1.0), (-1.0), (-1.0));
      RotationOrder rotationOrder1 = RotationOrder.ZXZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder1);
      assertArrayEquals(new double[] {(-2.0661636160135703), 1.2745557823062945, 1.64622536437112}, doubleArray0, 0.01);
      assertEquals(1.3327530933687308, rotation0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      double double0 = rotation0.getAngle();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(1.0, vector3D0.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      double double0 = rotation0.getAngle();
      assertEquals(1.0, rotation0.getQ0(), 0.01);
      assertEquals(0.0, double0, 0.01);
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
      Rotation rotation0 = new Rotation();
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {-0.0, 0.0, -0.0}, doubleArray0, 0.01);
  }
}
