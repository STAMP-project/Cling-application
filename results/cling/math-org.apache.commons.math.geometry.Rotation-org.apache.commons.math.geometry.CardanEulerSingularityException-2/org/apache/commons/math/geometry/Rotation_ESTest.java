/*

 * Tue Mar 03 15:51:57 GMT 2020
 */

package org.apache.commons.math.geometry;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.geometry.CardanEulerSingularityException;
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
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      Vector3D vector3D0 = rotationOrder0.getA1();
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder1 = RotationOrder.ZYX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder1);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
      
      Rotation rotation1 = new Rotation((-1419.88), (-1419.88), (-1419.88), 0.9999, true);
      assertEquals(1.9106333531379902, rotation1.getAngle(), 0.01);
      assertEquals((-0.577350221469902), rotation1.getQ0(), 0.01);
      assertEquals((-0.577350221469902), rotation1.getQ2(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      Rotation rotation1 = rotation0.applyInverseTo(rotation0);
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      double[] doubleArray0 = rotation1.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {0.0, -0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, rotation1.getQ2(), 0.01);
      assertEquals((-1.0), rotation1.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      Rotation rotation0 = new Rotation(rotationOrder0, 1637.36, 0.5867319391742671, (-0.1));
      Rotation rotation1 = new Rotation(-0.0, -0.0, 0.5867319391742671, 1637.36, true);
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
  public void test03()  throws Throwable  {
      Rotation rotation0 = new Rotation(-0.0, (-0.17886427861278129), -0.0, -0.0, true);
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
  public void test04()  throws Throwable  {
      Rotation rotation0 = new Rotation((-0.9324959251430383), (-0.9324959251430383), 3.141592653589793, 2.157050445182718E8, true);
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
  public void test05()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      Rotation rotation0 = new Rotation(rotationOrder0, 630.1055339682, 3.141592653589793, 9.796494384);
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
      Rotation rotation0 = new Rotation(0.0, 843.85254978654, 0.0, 843.85254978654, true);
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
  public void test07()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Rotation rotation0 = new Rotation(rotationOrder0, (-6.742257922305534), 3.141592653589793, 630.1055339682);
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
  public void test08()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.5867319391742671, 0.5867319391742671, 0.5867319391742671, 0.5867319391742671, true);
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      Rotation rotation1 = new Rotation((-5.730558826978741E-18), 0.5867319391742671, 0.5867319391742671, (-5.730558826978741E-18), false);
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
      Rotation rotation0 = new Rotation((-11.756485411785123), (-11.756485411785123), -0.0, (-11.756485411785123), true);
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      Rotation rotation1 = new Rotation();
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
  public void test10()  throws Throwable  {
      Rotation rotation0 = new Rotation((-1701.46), (-1701.46), (-1701.46), (-1.0), false);
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
  public void test11()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      Vector3D vector3D0 = rotationOrder0.getA1();
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      Rotation rotation1 = new Rotation((-1419.88), (-1419.88), (-1419.88), 0.9999, true);
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
      Rotation rotation0 = new Rotation();
      Rotation rotation1 = rotation0.applyInverseTo(rotation0);
      RotationOrder rotationOrder0 = RotationOrder.XZX;
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
      Rotation rotation0 = new Rotation(0.5867319391742671, 0.5867319391742671, -0.0, 0.5867319391742671, true);
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      Rotation rotation1 = new Rotation((-2.67), (-317.7804423963), 0.5867319391742671, 0.5867319391742671, false);
      assertEquals((-317.7804423963), rotation1.getQ1(), 0.01);
      
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(1.9106332362490188, rotation0.getAngle(), 0.01);
      assertArrayEquals(new double[] {2.356194490192345, 1.2309594173407743, 2.356194490192345}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.5867319391742671, 0.5867319391742671, -0.0, 0.5867319391742671, true);
      Rotation rotation1 = new Rotation((-2.67), (-317.7804423963), 0.5867319391742671, 0.5867319391742671, false);
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
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
  public void test15()  throws Throwable  {
      Rotation rotation0 = new Rotation(71.8833102598527, 71.8833102598527, 71.8833102598527, 249.8612848613, true);
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(0.25749532128172997, rotation0.getQ0(), 0.01);
      assertArrayEquals(new double[] {(-0.6794654192861601), 0.3345320603014639, (-2.462127234303633)}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(15.2092, 3.141592653589793, 3.141592653589793);
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = new Rotation(0.0, 3.141592653589793, 0.0, 0.5867319391742671, false);
      assertFalse(rotation1.equals((Object)rotation0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      Rotation rotation0 = new Rotation(0.0, 3.141592653589793, 0.0, 0.5867319391742671, false);
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
  public void test18()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.5867319391742671, 0.5867319391742671, -0.0, 0.5867319391742671, true);
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {(-2.356194490192345), 1.2309594173407743, 0.7853981633974483}, doubleArray0, 0.01);
      assertEquals(0.5773502691896258, rotation0.getQ3(), 0.01);
      
      Rotation rotation1 = new Rotation((-3628.913438872337), 742.1627385196, -0.0, 3202.70752491746, false);
      assertEquals((-3628.913438872337), rotation1.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.5867319391742671, 0.5867319391742671, 0.5867319391742671, 0.5867319391742671, true);
      Rotation rotation1 = new Rotation(0.1, 658.323940995995, (-0.7439699968615593), 1964.7895535, false);
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
  public void test20()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.5867319391742671, 0.5867319391742671, 0.5867319391742671, 0.5867319391742671, true);
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
      RotationOrder rotationOrder0 = RotationOrder.YXZ;
      Rotation rotation0 = new Rotation(116281.99465420486, 630.1055339682, (-3565.4154), 630.1055339682, false);
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
      Rotation rotation0 = new Rotation(0.0, (-67.40894385798427), (-2357.7), 1254.1745333243757, true);
      Rotation rotation1 = rotation0.applyInverseTo(rotation0);
      RotationOrder rotationOrder0 = mock(RotationOrder.class, new ViolatedAssumptionAnswer());
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
  public void test23()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.23854665438248474, 0.23854665438248474, 0.23854665438248474, 0.23854665438248474, true);
      double[][] doubleArray0 = rotation0.getMatrix();
      Rotation rotation1 = new Rotation(doubleArray0, 0.23854665438248474);
      Rotation rotation2 = rotation0.applyInverseTo(rotation1);
      assertEquals(2.0943951023931953, rotation0.getAngle(), 0.01);
      assertEquals((-1.0), rotation2.getQ0(), 0.01);
      assertEquals(0.5, rotation0.getQ1(), 0.01);
      assertEquals(0.0, rotation2.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.5867319391742671, 0.5867319391742671, 0.5867319391742671, 0.5867319391742671, true);
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Rotation rotation1 = new Rotation(rotationOrder0, 0.5867319391742671, 0.5867319391742671, 0.5867319391742671);
      assertEquals((-0.5299886383790495), rotation1.getQ2(), 0.01);
      assertEquals(0.7971758107828294, rotation1.getQ0(), 0.01);
      assertEquals(1.3877787807814457E-17, rotation1.getQ1(), 0.01);
      assertEquals(1.2963868589712995, rotation1.getAngle(), 0.01);
      
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {3.141592653589793, 1.5707963267948966, 1.5707963267948966}, doubleArray0, 0.01);
      assertEquals(0.5, rotation0.getQ2(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.5867319391742671, 0.5867319391742671, -0.0, 0.5867319391742671, true);
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      Rotation rotation1 = new Rotation((-3628.913438872337), 742.1627385196, -0.0, 3202.70752491746, false);
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
  public void test26()  throws Throwable  {
      Rotation rotation0 = new Rotation(1254.58, 843.85254978654, 1254.58, 843.85254978654, true);
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(1.8875582957083377, rotation0.getAngle(), 0.01);
      assertEquals(0.5867319391742671, rotation0.getQ0(), 0.01);
      assertArrayEquals(new double[] {(-1.570796326794897), 0.0, (-1.1842223029018553)}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(1.0, rotation0.getQ0(), 0.01);
      assertArrayEquals(new double[] {-0.0, 0.0, -0.0}, doubleArray0, 0.01);
      
      Rotation rotation1 = new Rotation(rotationOrder0, 349.256338830829, 349.256338830829, (-1.0));
      assertEquals(0.3485839287636681, rotation1.getQ3(), 0.01);
      assertEquals(0.5077070787724544, rotation1.getQ0(), 0.01);
      assertEquals(2.076550166805384, rotation1.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.5867319391742671, 0.5867319391742671, 0.5867319391742671, 0.5867319391742671, true);
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
  public void test29()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.9999, 0.9999, -0.0, 0.9999, false);
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
}
