/*

 * Tue Mar 03 15:53:37 GMT 2020
 */

package org.apache.commons.math.geometry;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.geometry.CardanEulerSingularityException;
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
      Rotation rotation0 = new Rotation((-657.975507), 5076.128541729347, 3.141592653589793, (-657.975507), true);
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals((-0.1274970260901974), rotation0.getQ0(), 0.01);
      assertArrayEquals(new double[] {(-0.03235440512236388), 0.2536821238207201, 2.8796606853491635}, doubleArray0, 0.01);
      assertEquals(2.8859026561919574, rotation0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      Rotation rotation1 = new Rotation((-657.975507), 1.0, 3.141592653589793, 1.0, false);
      assertEquals(1.0, rotation1.getQ3(), 0.01);
      
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      Rotation rotation0 = new Rotation(rotationOrder0, (-715.4101329082735), 614.531672892, (-715.4101329082735));
      Rotation rotation1 = new Rotation(614.531672892, (-715.4101329082735), 614.531672892, 1.292841022591366E9, true);
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
      Rotation rotation0 = new Rotation(3.141592653589793, 3.141592653589793, (-87.5448674098), 3.141592653589793, true);
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      Rotation rotation1 = new Rotation(rotationOrder0, 66.14161105486, 3.141592653589793, (-0.9999999999));
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
      Rotation rotation0 = new Rotation((-1266.916391), (-1.0), 3.141592653589793, (-1.0), true);
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      Rotation rotation1 = new Rotation(rotationOrder0, (-1266.916391), 3.141592653589793, 3.141592653589793);
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
      Vector3D vector3D0 = Vector3D.minusK;
      Vector3D vector3D1 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D1, vector3D1, vector3D0);
      Rotation rotation1 = new Rotation(1840.1906435473563, (-1.0), 1840.1906435473563, 1840.1906435473563, true);
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
  public void test06()  throws Throwable  {
      Rotation rotation0 = new Rotation(3.141592653589793, 3.141592653589793, (-87.5448674098), 3.141592653589793, true);
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      Rotation rotation1 = new Rotation(rotationOrder0, 66.14161105486, 3.141592653589793, (-0.9999999999));
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
      Rotation rotation0 = new Rotation((-0.11790556389257291), (-1784.930875206275), (-0.11790556389257291), (-0.11790556389257291), false);
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {(-2.3562605462874906), 2.8065403484174856, 0.785464219492594}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      Rotation rotation1 = new Rotation(1840.1906435473563, 1840.1906435473563, 1840.1906435473563, 1840.1906435473563, true);
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
  public void test09()  throws Throwable  {
      Rotation rotation0 = new Rotation((-817.4147), (-2333.853), (-817.4147), 447.02676, false);
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
  public void test10()  throws Throwable  {
      Rotation rotation0 = new Rotation(3.141592653589793, 3.141592653589793, (-87.5448674098), 3.141592653589793, true);
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      Rotation rotation1 = rotation0.applyInverseTo(rotation0);
      assertEquals((-1.0), rotation1.getQ0(), 0.01);
      assertEquals(0.0, rotation1.getAngle(), 0.01);
      
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {0.8212682862010969, 3.040245217261134, (-2.3920646129959935)}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Rotation rotation0 = new Rotation((-657.975507), 5076.128541729347, 3.141592653589793, (-657.975507), true);
      Rotation rotation1 = new Rotation((-657.975507), 1.0, 3.141592653589793, 1.0, false);
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
  public void test12()  throws Throwable  {
      Rotation rotation0 = new Rotation((-1.0), (-1.0), 0.5, (-1.0), true);
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {(-0.9272952180016121), 1.1760052070951352, (-0.9272952180016121)}, doubleArray0, 0.01);
      assertEquals((-0.5547001962252291), rotation0.getQ0(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      Rotation rotation0 = new Rotation(rotationOrder0, 4.841661555834321E9, 4.841661555834321E9, 4.841661555834321E9);
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(0.4114184568111179, rotation0.getQ3(), 0.01);
      assertArrayEquals(new double[] {(-0.6972526506937375), 0.6972526506937379, (-0.6972526506937373)}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Rotation rotation0 = new Rotation((-514.8969873027), (-514.8969873027), (-4245.0994054876855), 720.994678, true);
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
  public void test15()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      assertEquals(Double.NaN, rotation0.getQ0(), 0.01);
      
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = new Rotation((-5536676.772922898), 3.141592653589793, (-1.5027344655745671), (-5536676.772922898), true);
      assertEquals((-0.7071067811864776), rotation1.getQ0(), 0.01);
      assertEquals((-0.7071067811864776), rotation1.getQ3(), 0.01);
      assertEquals((-1.9191904720301273E-7), rotation1.getQ2(), 0.01);
      assertEquals(4.012228923933065E-7, rotation1.getQ1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = rotation0.applyInverseTo(rotation0);
      assertFalse(rotation1.equals((Object)rotation0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Rotation rotation0 = new Rotation((-6.698410663645342), (-3561.658502852), 275.15002043, 275.15002043, true);
      Rotation rotation1 = new Rotation(275.15002043, (-1.0), 275.15002043, (-840.44657), false);
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
  public void test18()  throws Throwable  {
      Rotation rotation0 = new Rotation(1818.791765, 1818.791765, 1818.791765, 1818.791765, true);
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
  public void test19()  throws Throwable  {
      Rotation rotation0 = new Rotation(1818.791765, 1818.791765, 1818.791765, 1818.791765, false);
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
  public void test20()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      Rotation rotation1 = new Rotation((-5536676.772922898), 3.141592653589793, (-1.5027344655745671), (-5536676.772922898), true);
      rotation1.applyInverseTo(rotation0);
      RotationOrder rotationOrder0 = RotationOrder.XZY;
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
  public void test21()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Vector3D vector3D1 = new Vector3D((-0.19), (-0.19), (-0.19));
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D1, vector3D1);
      Rotation rotation1 = new Rotation((-0.19), (-1.0), 4.0, (-1.0), true);
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
  public void test22()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Vector3D vector3D1 = new Vector3D((-0.19), (-0.19), (-0.19));
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D1, vector3D1);
      Rotation rotation1 = rotation0.applyTo(rotation0);
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
  public void test23()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      Rotation rotation0 = new Rotation(rotationOrder0, 1734.364166, (-0.9999999999), (-0.9999999999));
      double[][] doubleArray0 = rotation0.getMatrix();
      Rotation rotation1 = new Rotation(doubleArray0, 1734.364166);
      assertEquals(1.2561418417008396, rotation0.getAngle(), 0.01);
      assertEquals(0.39500609334793035, rotation1.getQ1(), 0.01);
      
      Rotation rotation2 = new Rotation((-0.9999999999), 1734.364166, (-0.9999999999), (-0.9999999999), true);
      assertEquals((-5.765798906809978E-4), rotation2.getQ0(), 0.01);
      assertEquals(0.9999995013333199, rotation2.getQ1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      Rotation rotation1 = new Rotation(1840.1906435473563, (-1.0), 1840.1906435473563, 1840.1906435473563, true);
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Rotation rotation0 = new Rotation(rotationOrder0, (-1266.916391), 3.141592653589793, 3.141592653589793);
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
      Rotation rotation0 = new Rotation(275.15002043, (-3561.658502852), 275.15002043, 1696.7592446456592, true);
      Rotation rotation1 = new Rotation(275.15002043, (-1.0), 0.0, (-840.44657), false);
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
  public void test27()  throws Throwable  {
      Rotation rotation0 = new Rotation(1675.7054369787045, 1675.7054369787045, 1840.1906435473563, 1840.1906435473563, true);
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {(-1.664294745687123), 0.0, (-1.5707963267948966)}, doubleArray0, 0.01);
      assertEquals(0.47608763585620734, rotation0.getQ0(), 0.01);
      assertEquals(2.1491918248190727, rotation0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      Rotation rotation0 = new Rotation(rotationOrder0, (-2084.18098241), (-456.4751), (-2084.18098241));
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {(-1.3050530799671531), 0.9441652294799775, (-1.3050530799671531)}, doubleArray0, 0.01);
      assertEquals(2.330317192589922, rotation0.getAngle(), 0.01);
  }
}
