/*

 * Tue Mar 03 15:52:10 GMT 2020
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
      Rotation rotation0 = new Rotation();
      assertEquals(0.0, rotation0.getAngle(), 0.01);
      
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {0.0, -0.0, 0.0}, doubleArray0, 0.01);
      
      Rotation rotation1 = new Rotation((-295.610905), (-0.19), 1.0, (-295.610905), true);
      assertEquals(1.5708022550679852, rotation1.getAngle(), 0.01);
      assertEquals((-4.5448218560223343E-4), rotation1.getQ1(), 0.01);
      assertEquals(0.0023920115031696495, rotation1.getQ2(), 0.01);
      assertEquals((-0.7071046852223904), rotation1.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      Rotation rotation1 = rotation0.applyTo(rotation0);
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      double[] doubleArray0 = rotation1.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {0.0, -0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1.0, rotation1.getQ0(), 0.01);
      assertEquals(0.0, rotation1.getQ2(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Rotation rotation0 = new Rotation(3.179365626097074E-6, 3.179365626097074E-6, (-0.999999999999998), (-0.19), true);
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
      Rotation rotation0 = new Rotation(0.0, 0.0, 8.56051180810946, 0.0, false);
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
  public void test04()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      Rotation rotation0 = new Rotation(rotationOrder0, 77.66, 77.66, 77.66);
      Rotation rotation1 = new Rotation((-0.9855571810588236), 498.270238380726, 0.1, 314527.9609866782, true);
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
  public void test05()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      rotation0.applyTo(rotation0);
      Vector3D vector3D0 = Vector3D.plusK;
      Rotation rotation1 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      double[] doubleArray0 = rotation1.getAngles(rotationOrder0);
      assertEquals(3, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Rotation rotation0 = new Rotation((-295.610905), (-0.19), 1.0, (-295.610905), true);
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      Vector3D vector3D0 = Vector3D.plusI;
      Vector3D vector3D1 = new Vector3D(0.0, vector3D0, 0.10095685040485458, vector3D0, (-1.0), vector3D0, 0.0, vector3D0);
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
  public void test07()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      rotation0.applyTo(rotation0);
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      Vector3D vector3D0 = Vector3D.plusI;
      Vector3D vector3D1 = new Vector3D(0.0, vector3D0, 0.10095685040485458, vector3D0, (-1.0), vector3D0, 0.0, vector3D0);
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
  public void test08()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      rotation0.revert();
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      Rotation rotation1 = new Rotation(0.509103998482026, (-0.5561661565239896), 1636542.7921689397, 0.8993990834742891, true);
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
      Rotation rotation0 = new Rotation(755.4808766144594, 755.4808766144594, 2443.5149386493354, 2058.214980485887, true);
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {2.22244007338036, 1.4173541191563777, 1.5188635703821605}, doubleArray0, 0.01);
      assertEquals(0.7253463745009159, rotation0.getQ2(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      Rotation rotation0 = new Rotation(rotationOrder0, 0.9999, 0.9999, 0.9999);
      RotationOrder rotationOrder1 = RotationOrder.YZY;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder1);
      assertEquals(0.0, rotation0.getQ2(), 0.01);
      assertEquals(2.1533763167131954, rotation0.getAngle(), 0.01);
      assertArrayEquals(new double[] {0.5758040005966509, 2.1533763167131954, (-0.5758040005966509)}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      rotation0.revert();
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
      Rotation rotation0 = new Rotation(0.0, 77.66, 0.0, 77.66, true);
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      Rotation rotation1 = new Rotation((-350.64375594), (-3281.4), 0.9249632855019225, 77.66, false);
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
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      Rotation rotation0 = new Rotation(rotationOrder0, 77.66, 77.66, 77.66);
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals((-0.9047907734805456), rotation0.getQ1(), 0.01);
      assertArrayEquals(new double[] {2.261776313844959, 2.261776313844959, 2.261776313844959}, doubleArray0, 0.01);
      
      Rotation rotation1 = new Rotation((-1691.8698498489816), (-3703.758301431234), (-3703.758301431234), (-0.32817422977773714), true);
      assertEquals(2.516739694113483, rotation1.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Rotation rotation0 = new Rotation(1.0, 0.0, Double.NaN, 314528.1535981981, true);
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      Rotation rotation1 = new Rotation(543.1655554942665, 3130.0, 1.0, (-3691.7305), false);
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
      Rotation rotation0 = new Rotation();
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {-0.0, 0.0, -0.0}, doubleArray0, 0.01);
      assertEquals(1.0, rotation0.getQ0(), 0.01);
      
      Rotation rotation1 = new Rotation((-7.93512486838384E-8), (-0.999999999999998), 0.3150622895694166, 498.270238380726, true);
      assertEquals((-1.5925308578122802E-10), rotation1.getQ0(), 0.01);
      assertEquals((-0.0020069386231808986), rotation1.getQ1(), 0.01);
      assertEquals(0.9999977861878344, rotation1.getQ3(), 0.01);
      assertEquals(6.323106776446678E-4, rotation1.getQ2(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {-0.0, 0.0, -0.0}, doubleArray0, 0.01);
      
      Rotation rotation1 = rotation0.revert();
      assertEquals(0.0, rotation1.getQ1(), 0.01);
      assertEquals(0.0, rotation1.getAngle(), 0.01);
      assertEquals(0.0, rotation1.getQ2(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      Rotation rotation1 = new Rotation((-7.93512486838384E-8), (-0.999999999999998), 0.3150622895694166, 498.270238380726, true);
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
  public void test18()  throws Throwable  {
      Rotation rotation0 = new Rotation((-295.610905), (-0.19), 1.0, (-295.610905), true);
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {(-1.5680562512496867), 1.5708018419598708, 1.5667707778749047}, doubleArray0, 0.01);
      assertEquals((-0.7071046852223904), rotation0.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      Rotation rotation0 = new Rotation((-2656.455628), 994.0, (-3974.723896728792), 2539.0, true);
      Rotation rotation1 = new Rotation(1.0000000000000004, (-0.8414709847538663), 1.0000000000000004, (-3974.723896728792), false);
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
      Rotation rotation0 = new Rotation(2536.4653986240905, 2536.4653986240905, 2536.4653986240905, 2536.4653986240905, true);
      RotationOrder rotationOrder0 = RotationOrder.YXZ;
      rotation0.applyTo(rotation0);
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
      Vector3D vector3D0 = Vector3D.plusK;
      Vector3D vector3D1 = Vector3D.plusI;
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Rotation rotation0 = new Rotation(1.0, 0.0, 498.270238380726, 1.0, true);
      Vector3D vector3D2 = Vector3D.crossProduct(vector3D0, vector3D1);
      Rotation rotation1 = new Rotation(vector3D2, vector3D1, vector3D1, vector3D0);
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
  public void test22()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      Vector3D vector3D0 = Vector3D.plusK;
      Vector3D vector3D1 = Vector3D.plusI;
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Vector3D vector3D2 = Vector3D.crossProduct(vector3D0, vector3D1);
      rotation0.revert();
      Rotation rotation1 = new Rotation(vector3D2, vector3D1, vector3D1, vector3D0);
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
      RotationOrder rotationOrder0 = mock(RotationOrder.class, new ViolatedAssumptionAnswer());
      Rotation rotation0 = new Rotation(0.7916533164632289, 529.3094234179609, 529.3094234179609, 1.0, false);
      Rotation rotation1 = new Rotation(0.9999999999, 950.9, 0.7916533164632289, 0.9999, true);
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
  public void test24()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusJ;
      Rotation rotation0 = new Rotation(vector3D0, 1261.7041292559447);
      double[][] doubleArray0 = rotation0.getMatrix();
      Rotation rotation1 = new Rotation(doubleArray0, 16.0);
      assertEquals(1.2161174871521463, rotation0.getAngle(), 0.01);
      assertEquals(0.5712752347014038, rotation1.getQ2(), 0.01);
      
      Rotation rotation2 = new Rotation((-3834.0), (-1148.196838571795), (-0.1), 1261.7041292559447, true);
      assertEquals((-0.9136393203807316), rotation2.getQ0(), 0.01);
      assertEquals(0.837296380673749, rotation2.getAngle(), 0.01);
      assertEquals((-0.27361444425040155), rotation2.getQ1(), 0.01);
      assertEquals((-2.382992489255951E-5), rotation2.getQ2(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusJ;
      Rotation rotation0 = new Rotation(vector3D0, 1261.7041292559447);
      double[][] doubleArray0 = rotation0.getMatrix();
      RotationOrder rotationOrder0 = RotationOrder.YXZ;
      Rotation rotation1 = new Rotation(rotationOrder0, Double.NaN, 1261.7041292559447, Double.NaN);
      assertEquals(Double.NaN, rotation1.getQ1(), 0.01);
      assertEquals(Double.NaN, rotation1.getQ2(), 0.01);
      
      Rotation rotation2 = new Rotation(doubleArray0, 16.0);
      assertEquals(0.5712752347014038, rotation2.getQ2(), 0.01);
      assertEquals(1.2161174871521463, rotation0.getAngle(), 0.01);
      assertEquals(-0.0, rotation0.getQ1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 77.66, 0.0, 77.66, true);
      Rotation rotation1 = new Rotation(77.66, 77.66, (-469.46544), 0.0, false);
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
  public void test27()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusK;
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      Vector3D vector3D1 = rotationOrder0.getA3();
      Rotation rotation0 = new Rotation(vector3D1, vector3D0);
      Rotation rotation1 = new Rotation(0.0, 0.7916533164632289, 0.1, 159.32831529, true);
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
      Rotation rotation0 = new Rotation();
      rotation0.applyTo(rotation0);
      Vector3D vector3D0 = Vector3D.plusK;
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      Vector3D vector3D1 = rotationOrder0.getA3();
      Rotation rotation1 = new Rotation(vector3D1, vector3D0);
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
  public void test29()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 77.66, 0.0, 77.66, true);
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = new Rotation(77.66, 77.66, (-469.46544), 0.0, false);
      assertEquals(0.0, rotation1.getQ3(), 0.01);
  }
}
