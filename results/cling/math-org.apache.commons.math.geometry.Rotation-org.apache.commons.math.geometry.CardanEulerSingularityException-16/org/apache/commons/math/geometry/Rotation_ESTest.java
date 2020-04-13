/*

 * Tue Mar 03 15:54:08 GMT 2020
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
      Rotation rotation0 = new Rotation(2.282439466768159E7, 2.282439466768159E7, 2.282439466768159E7, 903.41, true);
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(1.9106332366182808, rotation0.getAngle(), 0.01);
      assertEquals(0.577350269038875, rotation0.getQ0(), 0.01);
      assertArrayEquals(new double[] {1.1071328855608757, (-0.7297630585503304), (-2.034459768028918)}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = rotation0.revert();
      assertEquals(Double.NaN, rotation1.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusJ;
      Vector3D vector3D1 = Vector3D.minusK;
      Rotation rotation0 = new Rotation(vector3D1, vector3D0, vector3D0, vector3D1);
      Rotation rotation1 = new Rotation(0.5137511876950985, (-1079.8138), 1688.24062572038, 0.5137511876950985, true);
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
      Vector3D vector3D0 = Vector3D.plusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      Vector3D vector3D1 = Vector3D.minusK;
      Rotation rotation1 = new Rotation(vector3D1, vector3D0, vector3D0, vector3D1);
      rotation1.applyTo(rotation0);
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
  public void test04()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.0, 2.05890174031024E7, 1.0, (-810.0), true);
      rotation0.applyInverseTo(rotation0);
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
      Vector3D vector3D0 = Vector3D.minusK;
      Vector3D vector3D1 = Vector3D.minusJ;
      Rotation rotation0 = new Rotation(vector3D1, vector3D0, vector3D0, vector3D1);
      Rotation rotation1 = new Rotation((-1.4919874436648528), (-1.4919874436648528), (-1505.9), (-3543.710570345), true);
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
  public void test06()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      Vector3D vector3D1 = Vector3D.minusJ;
      Rotation rotation1 = new Rotation(vector3D1, vector3D0, vector3D0, vector3D1);
      rotation0.applyInverseTo(rotation1);
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
  public void test07()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-0.19), 0.0);
      Rotation rotation0 = new Rotation(vector3D0, 375.0452171787);
      Vector3D vector3D1 = rotation0.getAxis();
      Rotation rotation1 = new Rotation((-2227.1413200321977), (-0.5), (-0.1561013399695025), (-0.19), true);
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Rotation rotation2 = new Rotation(vector3D0, vector3D1);
      try { 
        rotation2.getAngles(rotationOrder0);
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
      Vector3D vector3D0 = new Vector3D((-0.19), 0.0);
      Rotation rotation0 = new Rotation(vector3D0, 375.0452171787);
      Vector3D vector3D1 = rotation0.getAxis();
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      rotation0.revert();
      Rotation rotation1 = new Rotation(vector3D0, vector3D1);
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
      Vector3D vector3D0 = Vector3D.minusK;
      Vector3D vector3D1 = Vector3D.plusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D1);
      Rotation rotation1 = new Rotation(-0.0, 0.6554764940467184, 1.0, -0.0, true);
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
      Vector3D vector3D0 = Vector3D.minusK;
      Vector3D vector3D1 = Vector3D.plusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D1);
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      Rotation rotation1 = new Rotation(0.5, 1.0, 0.25, 1841.06983, false);
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
      Rotation rotation0 = new Rotation((-0.1), (-2366.87585624581), (-2366.87585624581), (-0.1), true);
      Vector3D vector3D0 = Vector3D.minusJ;
      Rotation rotation1 = new Rotation(vector3D0, (-0.1));
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
  public void test12()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      Rotation rotation0 = new Rotation();
      rotation0.revert();
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
      Rotation rotation0 = new Rotation((-876.3638008447756), (-876.3638008447756), (-876.3638008447756), (-876.3638008447756), true);
      Vector3D vector3D0 = Vector3D.minusI;
      Rotation rotation1 = new Rotation(vector3D0, (-876.3638008447756));
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
  public void test14()  throws Throwable  {
      Rotation rotation0 = new Rotation(1.534221479380398, 1.534221479380398, (-1.0), (-1.0), false);
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
  public void test15()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-0.19), 0.0);
      Rotation rotation0 = new Rotation(vector3D0, 375.0452171787);
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {2.951592653589793, 1.9459012520751888, (-2.951592653589793)}, doubleArray0, 0.01);
      
      Rotation rotation1 = new Rotation((-2227.1413200321977), (-0.5), (-0.1561013399695025), (-0.19), true);
      assertEquals(5.003689743825772E-4, rotation1.getAngle(), 0.01);
      assertEquals((-8.531115306638324E-5), rotation1.getQ3(), 0.01);
      assertEquals((-2.2450303438521907E-4), rotation1.getQ1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-0.19), 0.0);
      Rotation rotation0 = new Rotation(vector3D0, 375.0452171787);
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {2.951592653589793, 1.9459012520751888, (-2.951592653589793)}, doubleArray0, 0.01);
      
      Rotation rotation1 = rotation0.revert();
      assertEquals(0.8116757062282198, rotation1.getQ1(), 0.01);
      assertEquals(1.945901252075189, rotation1.getAngle(), 0.01);
      assertEquals(1.945901252075189, rotation0.getAngle(), 0.01);
      assertEquals((-0.562863144626335), rotation1.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      Rotation rotation0 = new Rotation(Double.NaN, 0.6554764940467184, (-638.2477911106), 3192.16651, true);
      Rotation rotation1 = new Rotation(1085.59661322, 0.9999, (-638.2477911106), (-4396.36302), false);
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
  public void test18()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.6, 0.6, 0.6, 0.6, true);
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {(-1.5707963267948966), 0.0, (-1.5707963267948966)}, doubleArray0, 0.01);
      assertEquals(0.5, rotation0.getQ2(), 0.01);
      assertEquals(0.5, rotation0.getQ3(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      Rotation rotation1 = rotation0.revert();
      assertEquals((-1.0), rotation1.getQ0(), 0.01);
      
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {-0.0, 0.0, -0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      Rotation rotation1 = new Rotation((-1.4919874436648528), (-1.4919874436648528), (-1505.9), (-3543.710570345), true);
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(3, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      rotation0.applyInverseTo(rotation0);
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(3, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Rotation rotation0 = new Rotation(327.0187315, Double.NaN, 327.0187315, 327.0187315, true);
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      Rotation rotation1 = new Rotation((-0.1), (-0.1), (-2371.569), 3.0, false);
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
      Rotation rotation0 = new Rotation(2.4051166862914596E7, 2.4051166862914596E7, 2.0, 296.988, true);
      rotation0.applyTo(rotation0);
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
  public void test24()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Rotation rotation0 = new Rotation(4227.1975914, 0.6554764940467184, 0.6554764940467184, 4227.1975914, false);
      Rotation rotation1 = new Rotation((-177.50821321), Double.NaN, (-914.0459247), (-177.50821321), true);
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
      Rotation rotation0 = new Rotation(0.25, 0.25, 0.25, (-3146.3650179), true);
      Rotation rotation1 = new Rotation();
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
  public void test26()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      rotation0.applyTo(rotation0);
      RotationOrder rotationOrder0 = mock(RotationOrder.class, new ViolatedAssumptionAnswer());
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
      Rotation rotation0 = new Rotation(2.4051166862914596E7, 2.4051166862914596E7, 2.0, 296.988, true);
      double[][] doubleArray0 = rotation0.getMatrix();
      Rotation rotation1 = new Rotation(doubleArray0, 296.988);
      Rotation rotation2 = rotation0.applyTo(rotation1);
      assertEquals(1.234817427653766E-5, rotation2.getQ3(), 0.01);
      assertEquals(8.315604857123941E-8, rotation2.getQ2(), 0.01);
      assertEquals(1.570796326871139, rotation0.getAngle(), 0.01);
      assertEquals(3.1415926534373093, rotation2.getAngle(), 0.01);
      assertEquals(0.9999999999237579, rotation2.getQ1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-0.19), 0.0);
      Rotation rotation0 = new Rotation(vector3D0, 375.0452171787);
      Rotation rotation1 = new Rotation((-2227.1413200321977), (-0.5), (-0.1561013399695025), (-0.19), true);
      assertEquals(5.003689743825772E-4, rotation1.getAngle(), 0.01);
      assertEquals((-7.009044898950398E-5), rotation1.getQ2(), 0.01);
      assertEquals((-0.9999999687038613), rotation1.getQ0(), 0.01);
      
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {(-1.300261095371668), 1.894030502431649, 1.8413315582181253}, doubleArray0, 0.01);
      assertEquals(0.8116757062282198, rotation0.getQ1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-0.19), 0.0);
      Rotation rotation0 = new Rotation(vector3D0, 375.0452171787);
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Rotation rotation1 = rotation0.revert();
      assertEquals((-0.562863144626335), rotation1.getQ0(), 0.01);
      assertEquals(0.0, rotation1.getQ3(), 0.01);
      
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {(-1.300261095371668), 1.894030502431649, 1.8413315582181253}, doubleArray0, 0.01);
      assertEquals((-0.1561013399695025), rotation0.getQ2(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Rotation rotation0 = new Rotation((-1213.364480177866), (-2366.87585624581), 0.6233494546814937, (-1213.364480177866), true);
      Rotation rotation1 = new Rotation(0.9999, (-2366.87585624581), 0.500117181259429, 1126.58, false);
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
  public void test31()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(0.0, rotation0.getQ1(), 0.01);
      assertArrayEquals(new double[] {-0.0, 0.0, -0.0}, doubleArray0, 0.01);
      assertEquals(1.0, rotation0.getQ0(), 0.01);
      
      Rotation rotation1 = new Rotation(-0.0, 0.6554764940467184, 1.0, -0.0, true);
      assertEquals(0.8363445315879342, rotation1.getQ2(), 0.01);
      assertEquals(-0.0, rotation1.getQ3(), 0.01);
      assertEquals(-0.0, rotation1.getQ0(), 0.01);
      assertEquals(0.548204181380404, rotation1.getQ1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = new Rotation(0.5, 1.0, 0.25, 1841.06983, false);
      assertEquals(0.5, rotation1.getQ0(), 0.01);
  }
}
