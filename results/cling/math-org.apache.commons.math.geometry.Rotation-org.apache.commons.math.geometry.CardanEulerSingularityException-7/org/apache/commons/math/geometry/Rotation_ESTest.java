/*

 * Tue Mar 03 15:51:50 GMT 2020
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
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      Rotation rotation0 = new Rotation(3929.360618153, (-3143.4), 845.38870001, (-3143.4), true);
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {0.9212504849352992, (-0.8259535589851338), 0.9212504849352992}, doubleArray0, 0.01);
      
      Rotation rotation1 = rotation0.revert();
      assertEquals((-0.6556544002530551), rotation1.getQ0(), 0.01);
      assertEquals(0.6556544002530551, rotation0.getQ0(), 0.01);
      assertEquals(1.7114946939198288, rotation0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      Rotation rotation1 = new Rotation(3.431994279168522E-10, (-0.19), (-0.19), 8.453520972799083E15, true);
      Rotation rotation2 = rotation0.applyTo(rotation1);
      RotationOrder rotationOrder0 = RotationOrder.XZX;
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
  public void test02()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      rotation0.applyInverseTo(rotation0);
      Rotation rotation1 = new Rotation(0.0, 0.0, 0.0, (-1786.66219), true);
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
      Vector3D vector3D0 = Vector3D.minusK;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      Rotation rotation1 = new Rotation(1553.70863910594, 736.8027497106821, 1.5822208072180158E158, 736.8027497106821, true);
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      rotation0.applyInverseTo(rotation1);
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
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Vector3D vector3D0 = rotationOrder0.getA3();
      Vector3D vector3D1 = new Vector3D((-0.9971138659710979), vector3D0);
      Rotation rotation0 = new Rotation(0.39962532958658953, 816.901632014604, 0.39962532958658953, (-1.0), true);
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
  public void test05()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Vector3D vector3D0 = rotationOrder0.getA3();
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      rotation0.revert();
      Vector3D vector3D1 = new Vector3D((-0.9971138659710979), vector3D0);
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
  public void test06()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Vector3D vector3D0 = rotationOrder0.getA3();
      Vector3D vector3D1 = Vector3D.minusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D1, vector3D1, vector3D0);
      Rotation rotation1 = new Rotation((-0.9971138659710979), 1.0087898117705233E-7, 0.1, Double.NaN, true);
      RotationOrder rotationOrder1 = RotationOrder.ZXZ;
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
  public void test07()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Vector3D vector3D0 = rotationOrder0.getA3();
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      rotation0.revert();
      Vector3D vector3D1 = Vector3D.minusI;
      Rotation rotation1 = new Rotation(vector3D0, vector3D1, vector3D1, vector3D0);
      RotationOrder rotationOrder1 = RotationOrder.ZXZ;
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
      Vector3D vector3D0 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(1343.683855).when(vector3D0).getNorm();
      doReturn(1133.764009).when(vector3D0).getX();
      doReturn(1343.683855).when(vector3D0).getY();
      doReturn(1343.683855).when(vector3D0).getZ();
      Rotation rotation0 = new Rotation(1598.3908689649663, 3321.41201507, 3321.41201507, 0.8654343840964558, true);
      Rotation rotation1 = new Rotation(vector3D0, (-724.1821));
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
  public void test09()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      Rotation rotation0 = new Rotation(rotationOrder0, 0.0, 0.0, 1747.0);
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
      Rotation rotation0 = new Rotation();
      Rotation rotation1 = new Rotation((-0.19), (-0.19), (-0.9999999999), (-0.9999999999), true);
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
  public void test11()  throws Throwable  {
      Rotation rotation0 = new Rotation();
      rotation0.applyTo(rotation0);
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
  public void test12()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Vector3D vector3D0 = rotationOrder0.getA3();
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      Rotation rotation1 = new Rotation((-0.9971138659710979), 1.0087898117705233E-7, 0.1, Double.NaN, true);
      RotationOrder rotationOrder1 = RotationOrder.ZXZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder1);
      assertEquals(3, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Vector3D vector3D0 = rotationOrder0.getA3();
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      rotation0.revert();
      RotationOrder rotationOrder1 = RotationOrder.ZXZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder1);
      assertEquals(3, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      Rotation rotation0 = new Rotation(3929.360618153, (-3143.4), 845.38870001, (-3143.4), true);
      Rotation rotation1 = new Rotation((-3143.4), (-4089.482383478716), 7.49840008, 845.38870001, false);
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
      Rotation rotation0 = new Rotation(3929.360618153, (-3143.4), 845.38870001, (-3143.4), true);
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {1.11473954231474, 0.37389408149159814, 1.11473954231474}, doubleArray0, 0.01);
      assertEquals(1.7114946939198288, rotation0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      Rotation rotation0 = new Rotation(rotationOrder0, 0.0, 0.0, 482.4946796129311);
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {0.0, 0.0, (-1.3105890398970363)}, doubleArray0, 0.01);
      assertEquals(1.3105890398970361, rotation0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Vector3D vector3D0 = rotationOrder0.getA3();
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      Rotation rotation1 = new Rotation((-0.9971138659710979), 1.0087898117705233E-7, 0.1, Double.NaN, true);
      RotationOrder rotationOrder1 = RotationOrder.XYX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder1);
      assertEquals(3, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Vector3D vector3D0 = rotationOrder0.getA3();
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      rotation0.revert();
      RotationOrder rotationOrder1 = RotationOrder.XYX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder1);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      Rotation rotation0 = new Rotation((-592.95294516), 0.10346266418175878, 0.39962532958658953, (-399.98144), true);
      Rotation rotation1 = new Rotation(3.141592653589793, 0.39962532958658953, (-3.231014356064321E-8), 0.39962532958658953, false);
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
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Rotation rotation0 = new Rotation(3049.23, 3049.23, 3049.23, 3049.23, true);
      Rotation rotation1 = new Rotation(rotationOrder0, 4758.21906, (-1.0), 1.0);
      RotationOrder rotationOrder1 = RotationOrder.YXZ;
      try { 
        rotation0.getAngles(rotationOrder1);
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
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Rotation rotation0 = new Rotation(1.0, 0.9999999999999999, (-399.98144), (-1174.372), true);
      Rotation rotation1 = new Rotation((-1174.372), 2178.007, 0.9999999999999999, 0.9946047890418797, false);
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
      Rotation rotation0 = new Rotation((-1321.87790632), (-1321.87790632), (-1321.87790632), (-1321.87790632), true);
      Rotation rotation1 = rotation0.applyInverseTo(rotation0);
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
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Rotation rotation0 = new Rotation(rotationOrder0, 1133.764009, 1133.764009, 1133.764009);
      double[][] doubleArray0 = rotation0.getMatrix();
      Rotation rotation1 = new Rotation(1133.764009, 1133.764009, 0.32214618510257537, 0.1, true);
      assertEquals(1.5707963710520603, rotation1.getAngle(), 0.01);
      assertEquals(0.7071067655392772, rotation1.getQ1(), 0.01);
      
      Rotation rotation2 = new Rotation(doubleArray0, 444.13347);
      assertEquals(2.812245337756446, rotation0.getAngle(), 0.01);
      assertEquals(2.995019355853199E-17, rotation2.getQ1(), 0.01);
      assertEquals((-2.7755575615628914E-17), rotation0.getQ1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Vector3D vector3D0 = rotationOrder0.getA3();
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = new Rotation((-0.9971138659710979), 1.0087898117705233E-7, 0.1, Double.NaN, true);
      assertEquals(Double.NaN, rotation1.getQ3(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Vector3D vector3D0 = rotationOrder0.getA3();
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      rotation0.revert();
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(3, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Rotation rotation0 = new Rotation(978.0, 0.0, 2579.7899776544314, 978.0, true);
      Rotation rotation1 = new Rotation((-1.0), 2579.7899776544314, 0.9999, (-0.1), false);
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
      Rotation rotation0 = new Rotation(3929.360618153, (-3143.4), 845.38870001, (-3143.4), true);
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(0.6556544002530551, rotation0.getQ0(), 0.01);
      assertArrayEquals(new double[] {(-1.0620956171445604), 0.570219234975027, 1.6903967727877398}, doubleArray0, 0.01);
      assertEquals(1.7114946939198288, rotation0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusI;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {-0.0, 0.0, -0.0}, doubleArray0, 0.01);
      
      Rotation rotation1 = rotation0.applyInverseTo(rotation0);
      assertEquals((-1.0), rotation1.getQ0(), 0.01);
      assertEquals(0.0, rotation0.getQ2(), 0.01);
      assertEquals(0.0, rotation1.getAngle(), 0.01);
  }
}
