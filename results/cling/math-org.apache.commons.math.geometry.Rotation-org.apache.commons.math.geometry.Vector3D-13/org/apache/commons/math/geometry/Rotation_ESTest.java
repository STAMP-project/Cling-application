/*

 * Tue Mar 03 15:48:51 GMT 2020
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
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      Rotation rotation0 = new Rotation(rotationOrder0, 1059.0, 1059.0, (-1.0));
      Vector3D vector3D0 = rotation0.getAxis();
      assertEquals((-0.9174730041555177), vector3D0.getDelta(), 0.01);
      assertEquals(0.5932425767157637, vector3D0.getY(), 0.01);
      assertEquals((-0.049512256901549846), rotation0.getQ0(), 0.01);
      assertEquals(0.13235927011855536, vector3D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector3D vector3D0 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(2368.734729272, 2368.734729272).when(vector3D0).getNorm();
      doReturn(171.27394, 2368.734729272, 171.27394, 171.27394).when(vector3D0).getX();
      doReturn(4.999999987487236E-5, 1.5186728326076469E13, 0.6, 171.27394).when(vector3D0).getY();
      doReturn(4.999999987487236E-5, 2368.734729272, 864.7155, (-0.6)).when(vector3D0).getZ();
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
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
  public void test02()  throws Throwable  {
      Vector3D vector3D0 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(2368.734729272, 2368.734729272).when(vector3D0).getNorm();
      doReturn(2368.734729272, 2368.734729272, (-316.6331495543), 2992.613).when(vector3D0).getX();
      doReturn(231.596319, 0.0, 1368.799, (-305.78822)).when(vector3D0).getY();
      doReturn(570.499633552108, 632.371742, 570.499633552108, 2368.734729272).when(vector3D0).getZ();
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      RotationOrder rotationOrder0 = mock(RotationOrder.class, new ViolatedAssumptionAnswer());
      rotation0.getAngles(rotationOrder0);
      double[][] doubleArray0 = new double[3][7];
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, 570.499633552108);
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 3x7 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      rotation0.getAngles(rotationOrder0);
      Vector3D vector3D1 = Vector3D.zero;
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(vector3D1, 920.13355243);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // zero norm for rotation axis
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Rotation rotation0 = new Rotation(rotationOrder0, (-2944.1), (-2944.1), (-2258.10591));
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {(-0.42768358636364456), 0.4276835863636445, 0.6992079310611168}, doubleArray0, 0.01);
      assertEquals((-0.3694111834935716), rotation0.getQ2(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-1377.88542551), (-1377.88542551));
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      double[][] doubleArray1 = new double[3][7];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray1, 171.27394);
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 3x3 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Vector3D vector3D0 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(2368.734729272, 2368.734729272).when(vector3D0).getNorm();
      doReturn(0.0, 0.0, 0.0, 0.0).when(vector3D0).getX();
      doReturn(0.0, 0.0, 0.0, 0.0).when(vector3D0).getY();
      doReturn(0.0, 0.0, 0.0, 0.0).when(vector3D0).getZ();
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      RotationOrder rotationOrder0 = mock(RotationOrder.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      double[][] doubleArray1 = new double[3][7];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray1, (-970.0137910399961));
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
      Rotation rotation0 = new Rotation();
      Rotation rotation1 = rotation0.revert();
      double double0 = rotation1.getAngle();
      assertEquals(0.0, rotation1.getQ3(), 0.01);
      assertEquals((-1.0), rotation1.getQ0(), 0.01);
      assertEquals(0.0, rotation1.getQ2(), 0.01);
      assertEquals(0.0, rotation1.getQ1(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Vector3D vector3D0 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(2368.734729272, 2368.734729272).when(vector3D0).getNorm();
      doReturn(2368.734729272, 2368.734729272, (-316.6331495543), 2992.613).when(vector3D0).getX();
      doReturn(231.596319, 0.0, 1368.799, (-305.78822)).when(vector3D0).getY();
      doReturn(570.499633552108, 632.371742, 570.499633552108, 2368.734729272).when(vector3D0).getZ();
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      double[][] doubleArray0 = new double[3][7];
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, 570.499633552108);
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // a 3x7 matrix cannot be a rotation matrix
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Vector3D vector3D0 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(2368.734729272, 2368.734729272).when(vector3D0).getNorm();
      doReturn(2368.734729272, 2368.734729272, 2368.734729272, 2368.734729272).when(vector3D0).getX();
      doReturn(4.999999987487236E-5, 1.5186728326077729E13, 0.6, 2368.734729272).when(vector3D0).getY();
      doReturn(4.999999987487236E-5, 2368.734729272, 1.5186728326077729E13, (-0.6)).when(vector3D0).getZ();
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      RotationOrder rotationOrder0 = mock(RotationOrder.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      double[][] doubleArray1 = new double[3][7];
      doubleArray1[0] = doubleArray0;
      Rotation rotation1 = new Rotation();
      RotationOrder rotationOrder1 = RotationOrder.XZY;
      rotation1.getAngles(rotationOrder1);
      Rotation rotation2 = null;
      try {
        rotation2 = new Rotation(doubleArray1, 0.8564569654900706);
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
      Vector3D vector3D0 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(2368.734729272, 2368.734729272).when(vector3D0).getNorm();
      doReturn(2368.734729272, 2368.734729272, 2368.734729272, 2368.734729272).when(vector3D0).getX();
      doReturn(2368.734729272, 1.5186728326077729E13, 0.6, 2368.734729272).when(vector3D0).getY();
      doReturn(2368.734729272, 2368.734729272, 1.5186728326077729E13, (-0.6)).when(vector3D0).getZ();
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      Vector3D vector3D1 = rotation0.getAxis();
      Rotation rotation1 = new Rotation(vector3D1, vector3D1);
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      double[] doubleArray0 = rotation1.getAngles(rotationOrder0);
      assertEquals(1.0, rotation1.getQ0(), 0.01);
      assertEquals((-0.7071067812417067), vector3D1.getY(), 0.01);
      assertEquals((-0.785398163475455), vector3D1.getAlpha(), 0.01);
      assertEquals((-4.533491424357517E9), rotation0.getQ1(), 0.01);
      assertArrayEquals(new double[] {-0.0, 0.0, -0.0}, doubleArray0, 0.01);
      assertEquals(1.1026233498144344E-10, vector3D1.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
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
  public void test12()  throws Throwable  {
      Vector3D vector3D0 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(2368.734729272, 2368.734729272).when(vector3D0).getNorm();
      doReturn(171.27394, 2368.734729272, 171.27394, 171.27394).when(vector3D0).getX();
      doReturn(4.999999987487236E-5, 1.5186728326077729E13, 0.6, 171.27394).when(vector3D0).getY();
      doReturn(4.999999987487236E-5, (-2258.10591), 864.7155, 1276.54346492063).when(vector3D0).getZ();
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
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
  public void test13()  throws Throwable  {
      Rotation rotation0 = new Rotation((-1.0), (-1.0), (-1.0), 0.9999, false);
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
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      Vector3D vector3D0 = new Vector3D((-3292.0), (-3292.0));
      Rotation rotation0 = new Rotation(vector3D0, (-3292.0));
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {0.1106428454571945, 0.16715004270473202, 0.3249477307529863}, doubleArray0, 0.01);
      assertEquals(0.38910096210331396, rotation0.getAngle(), 0.01);
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
      Vector3D vector3D1 = vector3D0.orthogonal();
      assertEquals(0.0, vector3D0.getDelta(), 0.01);
      assertEquals((-1.5707963267948966), vector3D1.getDelta(), 0.01);
      assertEquals(3.141592653589793, vector3D1.getAlpha(), 0.01);
      assertEquals(1.0, vector3D1.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Vector3D vector3D0 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      Vector3D vector3D1 = Vector3D.crossProduct(vector3D0, vector3D0);
      // Undeclared exception!
      try { 
        vector3D1.orthogonal();
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
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      rotation0.getAngles(rotationOrder0);
      double[][] doubleArray0 = new double[0][2];
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, (-2258.10591));
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
      Rotation rotation0 = new Rotation((-0.18936601277714168), (-0.18936601277714168), (-0.18936601277714168), (-0.18936601277714168), true);
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
      Vector3D vector3D0 = Vector3D.plusJ;
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
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
      Vector3D vector3D0 = Vector3D.plusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      rotation0.getAngles(rotationOrder0);
      assertEquals(Double.NaN, rotation0.getQ1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Rotation rotation0 = new Rotation((-41.912322), (-0.1), 171.27394, 171.27394, false);
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
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      Rotation rotation0 = new Rotation();
      assertEquals(0.0, rotation0.getAngle(), 0.01);
      
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {-0.0, 0.0, -0.0}, doubleArray0, 0.01);
      assertEquals(1.0, rotation0.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Vector3D vector3D0 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(2368.734729272, 2368.734729272).when(vector3D0).getNorm();
      doReturn(2368.734729272, 2368.734729272, 2368.734729272, 2368.734729272).when(vector3D0).getX();
      doReturn(2368.734729272, 1.5186728326077729E13, 0.6, 2368.734729272).when(vector3D0).getY();
      doReturn(2368.734729272, 2368.734729272, 1.5186728326077729E13, (-0.6)).when(vector3D0).getZ();
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
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
  public void test25()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      double double0 = rotation0.getAngle();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(1.0, vector3D0.getY(), 0.01);
      assertEquals(0.0, vector3D0.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Vector3D vector3D0 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      Vector3D vector3D1 = Vector3D.minusI;
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
  public void test27()  throws Throwable  {
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
  public void test28()  throws Throwable  {
      Vector3D vector3D0 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(2368.734729272, 2368.734729272).when(vector3D0).getNorm();
      doReturn(2368.734729272, 2368.734729272, 2368.734729272, 2368.734729272).when(vector3D0).getX();
      doReturn(2368.734729272, 1.5186728326077729E13, 0.6, 2368.734729272).when(vector3D0).getY();
      doReturn(2368.734729272, (-2258.10591), 1.5186728326077729E13, (-0.6)).when(vector3D0).getZ();
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      Vector3D vector3D1 = rotation0.getAxis();
      Vector3D vector3D2 = new Vector3D(202.624020413, vector3D1, (-3.18420722620689E7), vector3D1, (-1243.91202), vector3D1);
      Rotation rotation1 = new Rotation(vector3D2, vector3D1);
      try { 
        rotation1.getAngles((RotationOrder) null);
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
      Vector3D vector3D0 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(2368.734729272, 2368.734729272).when(vector3D0).getNorm();
      doReturn(2368.734729272, 2368.734729272, 2368.734729272, 2368.734729272).when(vector3D0).getX();
      doReturn(2368.734729272, 1.5186728326077729E13, 0.6, 2368.734729272).when(vector3D0).getY();
      doReturn(2368.734729272, 2368.734729272, 1.5186728326077729E13, (-0.6)).when(vector3D0).getZ();
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      Vector3D vector3D1 = rotation0.getAxis();
      Vector3D vector3D2 = new Vector3D((-0.7069276711901984), vector3D1);
      Rotation rotation1 = new Rotation(vector3D1, vector3D2);
      assertEquals(0.7071067812417067, rotation1.getQ1(), 0.01);
      assertEquals(4.533491425064803E9, rotation0.getQ2(), 0.01);
      assertEquals((-0.49987335006800976), vector3D2.getX(), 0.01);
      assertEquals((-1.1026233498144344E-10), vector3D2.getDelta(), 0.01);
      assertEquals((-7.794749568842536E-11), vector3D2.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
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
  public void test31()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      assertEquals(Double.NaN, rotation0.getAngle(), 0.01);
      
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      rotation0.getAngles(rotationOrder0);
      assertEquals(0.0, vector3D0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      rotation0.getAngles(rotationOrder0);
      double[][] doubleArray0 = new double[0][4];
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray0, 2.220446049250313E-16);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.6, 0.6, (-1.0), 1.5186728326077729E13, true);
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
  public void test34()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusK;
      Vector3D vector3D1 = new Vector3D((-2258.10591), vector3D0);
      Rotation rotation0 = new Rotation(vector3D0, vector3D1);
      assertEquals((-3.141592653589793), vector3D1.getAlpha(), 0.01);
      assertEquals(-0.0, rotation0.getQ1(), 0.01);
      assertEquals((-1.0), rotation0.getQ2(), 0.01);
      assertEquals(0.0, rotation0.getQ3(), 0.01);
      assertEquals(2258.10591, vector3D1.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusJ;
      Vector3D vector3D1 = vector3D0.normalize();
      assertEquals(1.0, vector3D0.getNorm(), 0.01);
      assertEquals(1.0, vector3D1.getNorm(), 0.01);
      assertEquals(0.0, vector3D1.getZ(), 0.01);
      assertEquals(1.5707963267948966, vector3D1.getAlpha(), 0.01);
      assertEquals(0.0, vector3D1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusK;
      double double0 = Vector3D.angle(vector3D0, vector3D0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusK;
      Vector3D vector3D1 = new Vector3D((-2258.10591), vector3D0);
      double double0 = Vector3D.angle(vector3D0, vector3D1);
      assertEquals(-0.0, vector3D1.getX(), 0.01);
      assertEquals((-2258.10591), vector3D1.getZ(), 0.01);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusJ;
      Rotation rotation0 = new Rotation(vector3D0, (-0.1));
      double[][] doubleArray0 = rotation0.getMatrix();
      RotationOrder rotationOrder0 = RotationOrder.ZYZ;
      double[] doubleArray1 = rotation0.getAngles(rotationOrder0);
      assertEquals(0.0, vector3D0.getDelta(), 0.01);
      assertArrayEquals(new double[] {3.141592653589793, 0.09999999999999834, 3.141592653589793}, doubleArray1, 0.01);
      
      Rotation rotation1 = new Rotation(doubleArray0, 673.9);
      assertEquals(0.09999999999999998, rotation1.getAngle(), 0.01);
      assertEquals(0.0, rotation0.getQ3(), 0.01);
      assertEquals(0.0, rotation1.getQ3(), 0.01);
      assertEquals(0.0, rotation1.getQ1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      double[][] doubleArray1 = new double[3][7];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray1, Double.NaN);
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
      Vector3D vector3D0 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
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
      Vector3D vector3D0 = Vector3D.plusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(3, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      Rotation rotation0 = new Rotation(rotationOrder0, 1059.0, 1059.0, (-1.0));
      double double0 = rotation0.getAngle();
      assertEquals(3.04252763592367, double0, 0.01);
      assertEquals(0.5925149742328941, rotation0.getQ2(), 0.01);
      assertEquals(0.13219693360167517, rotation0.getQ1(), 0.01);
      assertEquals((-0.7930942645566301), rotation0.getQ3(), 0.01);
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
      Vector3D vector3D0 = Vector3D.plusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(0.0, vector3D0.getX(), 0.01);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Vector3D vector3D0 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(2368.7347, 2368.7347).when(vector3D0).getNorm();
      doReturn(171.27394, 2368.7347, 171.27394, 171.27394).when(vector3D0).getX();
      doReturn(4.999999987487236E-5, 1.5186728326077729E13, 0.6, 171.27394).when(vector3D0).getY();
      doReturn(4.999999987487236E-5, (-2258.10591), 1.5186728326077729E13, (-0.6)).when(vector3D0).getZ();
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
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
  public void test46()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      rotation0.getAngles(rotationOrder0);
      Vector3D vector3D1 = Vector3D.zero;
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(vector3D1, 920.13355243);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // zero norm for rotation axis
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }
}
