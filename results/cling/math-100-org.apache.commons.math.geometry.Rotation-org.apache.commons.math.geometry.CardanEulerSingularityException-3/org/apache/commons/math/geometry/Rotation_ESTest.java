/*

 * Tue Mar 03 15:51:00 GMT 2020
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
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      Rotation rotation0 = new Rotation((-0.9999999999999982), 0.9999999999999999, (-2422.4696730141), 0.9999999999999999, true);
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals((-0.9999997443920278), rotation0.getQ2(), 0.01);
      assertEquals(4.128017599278351E-4, rotation0.getQ1(), 0.01);
      assertEquals((-4.128017599278344E-4), rotation0.getQ0(), 0.01);
      assertArrayEquals(new double[] {(-3.1407673907163884), (-8.259442133184561E-4), (-3.1407673907163884)}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {0.0, -0.0, 0.0}, doubleArray0, 0.01);
      
      Rotation rotation1 = rotation0.applyTo(rotation0);
      assertEquals(1.0, rotation0.getQ0(), 0.01);
      assertEquals(0.0, rotation1.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, 1883.59, 1883.59, true);
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
  public void test03()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      Rotation rotation0 = new Rotation(rotationOrder0, 330917.0147608005, 3.141592653589793, (-17.591987375038258));
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
  public void test04()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, (-0.034806879518113114), 0.0, 0.0, true);
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
  public void test05()  throws Throwable  {
      Rotation rotation0 = new Rotation((-2.220446049250313E-16), 0.0, 0.0, 0.0, false);
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
  public void test06()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      Rotation rotation0 = new Rotation((-2422.4696730141), (-2422.4696730141), (-1.0), (-1.0), true);
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals((-0.7071067209391553), rotation0.getQ0(), 0.01);
      assertArrayEquals(new double[] {3.141592653589793, 8.25603684203049E-4, 1.5707963267948966}, doubleArray0, 0.01);
      
      Rotation rotation1 = new Rotation(rotationOrder0, (-2422.4696730141), (-2422.4696730141), (-2422.4696730141));
      assertEquals(2.8535848475940155, rotation1.getAngle(), 0.01);
      assertEquals(0.0, rotation1.getQ3(), 0.01);
      assertEquals((-0.044665114729892735), rotation1.getQ1(), 0.01);
      assertEquals((-0.14350671432375345), rotation1.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      Vector3D vector3D0 = rotationOrder0.getA1();
      Rotation rotation0 = new Rotation(3.141592653589793, 3.141592653589793, (-5630.69123812219), 4790.157, true);
      RotationOrder rotationOrder1 = RotationOrder.YZY;
      Rotation rotation1 = new Rotation(vector3D0, 3.141592653589793);
      rotation1.applyTo(rotation0);
      try { 
        rotation1.getAngles(rotationOrder1);
        fail("Expecting exception: CardanEulerSingularityException");
      
      } catch(CardanEulerSingularityException e) {
         //
         // Euler angles singularity
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      Vector3D vector3D0 = rotationOrder0.getA1();
      Rotation rotation0 = new Rotation((-0.9999999999999982), 0.9999999999999999, (-2422.4696730141), 0.9999999999999999, true);
      Vector3D vector3D1 = new Vector3D((-2007.367631513), vector3D0, 0.9999996591892977, vector3D0, (-2007.367631513), vector3D0);
      Rotation rotation1 = new Rotation(vector3D1, vector3D0);
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
  public void test09()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, 0.0, 0.0, false);
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
  public void test10()  throws Throwable  {
      Rotation rotation0 = new Rotation((-0.5668003355757879), (-0.5668003355757879), (-0.5668003355757879), (-0.5668003355757879), true);
      Rotation rotation1 = new Rotation();
      RotationOrder rotationOrder0 = RotationOrder.YXY;
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
  public void test11()  throws Throwable  {
      Rotation rotation0 = new Rotation((-5506.31331011), 2960.3, 1423.91935983, 1423.91935983, false);
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
  public void test12()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      Rotation rotation0 = new Rotation(3.141592653589793, 0.1, 3.141592653589793, 0.8099999999999968, true);
      Rotation rotation1 = new Rotation(vector3D0, vector3D0);
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
  public void test13()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      Rotation rotation0 = new Rotation(rotationOrder0, 0.9999999999, (-0.19), 0.1);
      Rotation rotation1 = new Rotation(vector3D0, vector3D0);
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
  public void test14()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, 1883.59, 1883.59, true);
      Rotation rotation1 = rotation0.revert();
      assertEquals(0.7071067811865476, rotation1.getQ3(), 0.01);
      
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(0.7071067811865476, rotation0.getQ2(), 0.01);
      assertArrayEquals(new double[] {3.141592653589793, 1.5707963267948963, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      Vector3D vector3D0 = rotationOrder0.getA1();
      Rotation rotation0 = new Rotation((-0.9999999999999982), 0.9999999999999999, (-2422.4696730141), 0.9999999999999999, true);
      RotationOrder rotationOrder1 = RotationOrder.XZY;
      Vector3D vector3D1 = rotationOrder1.getA1();
      Rotation rotation1 = new Rotation(vector3D0, vector3D1);
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
  public void test16()  throws Throwable  {
      Rotation rotation0 = new Rotation(1597.53, (-3102.0552723530586), (-1672.9), 2088.887681941378, false);
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
  public void test17()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, 0.0, 0.0, true);
      rotation0.applyInverseTo(rotation0);
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(Double.NaN, rotation0.getQ3(), 0.01);
      assertEquals(Double.NaN, rotation0.getQ1(), 0.01);
      assertEquals(Double.NaN, rotation0.getQ0(), 0.01);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, 1883.59, 1883.59, true);
      Rotation rotation1 = rotation0.revert();
      RotationOrder rotationOrder0 = RotationOrder.XYX;
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
  public void test19()  throws Throwable  {
      Rotation rotation0 = new Rotation(2866.23885378902, 2866.23885378902, (-1187.82033), 2180.913, false);
      Rotation rotation1 = new Rotation((-857.6581107), 4148.88, 3175.37290619, 3.141592653589793, true);
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
  public void test20()  throws Throwable  {
      Rotation rotation0 = new Rotation(885.0, 885.0, 885.0, 885.0, true);
      RotationOrder rotationOrder0 = RotationOrder.YXZ;
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
  public void test21()  throws Throwable  {
      Rotation rotation0 = new Rotation((-0.19), (-477.542578), (-550.33817), (-972.531547), false);
      RotationOrder rotationOrder0 = RotationOrder.YXZ;
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
      Rotation rotation0 = new Rotation(0.0, 0.0, 0.0, 0.0, true);
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Rotation rotation1 = new Rotation(1.0, 1.0, 1.0, 1.0, false);
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
  public void test23()  throws Throwable  {
      Rotation rotation0 = new Rotation((-0.5668003355757879), (-0.5668003355757879), (-0.5668003355757879), (-0.5668003355757879), true);
      Rotation rotation1 = new Rotation();
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
  public void test24()  throws Throwable  {
      Rotation rotation0 = new Rotation((-1212.7777306), (-1212.7777306), (-1212.7777306), (-1212.7777306), false);
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
  public void test25()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.9238031677794855, (-0.5), 0.8767563116673482, 0.0, true);
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      double[][] doubleArray1 = new double[3][1];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray1, (-0.5));
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // unable to orthogonalize matrix in 10 iterations
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Rotation rotation0 = new Rotation(rotationOrder0, (-1.0), 1743.9683083930315, 1743.9683083930315);
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      double[][] doubleArray1 = new double[3][4];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      Rotation rotation1 = null;
      try {
        rotation1 = new Rotation(doubleArray1, 1743.9683083930315);
        fail("Expecting exception: NotARotationMatrixException");
      
      } catch(Throwable e) {
         //
         // unable to orthogonalize matrix in 10 iterations
         //
         verifyException("org.apache.commons.math.geometry.Rotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, 0.0, 0.0, true);
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      rotation0.getAngles(rotationOrder0);
      rotation0.applyTo(rotation0);
      assertEquals(Double.NaN, rotation0.getQ1(), 0.01);
      assertEquals(Double.NaN, rotation0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Rotation rotation0 = new Rotation((-0.9999999999999982), 0.9999999999999999, (-2422.4696730141), (-2422.4696730141), true);
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
  public void test29()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.9999999999999999, (-2259.44909349788), (-2422.4696730141), (-3724.315173), false);
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
  public void test30()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 0.0, 1883.59, 1883.59, true);
      Rotation rotation1 = rotation0.applyInverseTo(rotation0);
      assertEquals((-1.0000000000000002), rotation1.getQ0(), 0.01);
      assertEquals(0.0, rotation1.getAngle(), 0.01);
      
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {(-3.141592653589793), 0.0, (-1.5707963267948963)}, doubleArray0, 0.01);
      assertEquals(0.0, rotation0.getQ0(), 0.01);
  }
}
