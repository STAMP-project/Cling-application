/*

 * Tue Mar 03 15:52:56 GMT 2020
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
      Vector3D vector3D0 = Vector3D.minusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = new Rotation(0.8253356149096778, (-1620.387884633211), 1988.204, 901.64, true);
      assertEquals(0.7312951145928852, rotation1.getQ2(), 0.01);
      assertEquals(0.3316384672405493, rotation1.getQ3(), 0.01);
      assertEquals(3.0357242168457674E-4, rotation1.getQ0(), 0.01);
      assertEquals((-0.5960061159608203), rotation1.getQ1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = rotation0.revert();
      assertEquals(Double.NaN, rotation1.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusJ;
      Vector3D vector3D1 = new Vector3D(2318.371040481456, vector3D0, (-1620.387884633211), vector3D0);
      Vector3D vector3D2 = vector3D1.add(vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      Vector3D vector3D3 = Vector3D.minusI;
      Rotation rotation0 = new Rotation(vector3D3, vector3D0, vector3D3, vector3D2);
      Rotation rotation1 = new Rotation(0.8253356149096778, (-1620.387884633211), 1988.204, 901.64, true);
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
      Vector3D vector3D0 = Vector3D.minusJ;
      Vector3D vector3D1 = new Vector3D(2318.371040481456, vector3D0, (-1620.387884633211), vector3D0);
      Rotation rotation0 = new Rotation(vector3D1, vector3D0, vector3D0, vector3D1);
      Vector3D vector3D2 = vector3D1.add(vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      Vector3D vector3D3 = Vector3D.minusI;
      Rotation rotation1 = new Rotation(vector3D3, vector3D0, vector3D3, vector3D2);
      rotation0.revert();
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
      Vector3D vector3D0 = Vector3D.minusJ;
      Vector3D vector3D1 = new Vector3D(2318.371040481456, vector3D0, 2318.371040481456, vector3D0, 2318.371040481456, vector3D0, 2318.371040481456, vector3D0);
      Vector3D vector3D2 = vector3D1.add(vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      Rotation rotation0 = new Rotation(2318.371040481456, 1988.204, 1173.2, (-1620.387884633211), true);
      Vector3D vector3D3 = rotationOrder0.getA3();
      Rotation rotation1 = new Rotation(vector3D0, vector3D3, vector3D2, vector3D0);
      RotationOrder rotationOrder1 = RotationOrder.YXY;
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
  public void test05()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusJ;
      Vector3D vector3D1 = new Vector3D(2318.371040481456, vector3D0, 2318.371040481456, vector3D0, 2318.371040481456, vector3D0, 2318.371040481456, vector3D0);
      Rotation rotation0 = new Rotation(vector3D1, vector3D0, vector3D0, vector3D1);
      Vector3D vector3D2 = vector3D1.add(vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      rotation0.applyInverseTo(rotation0);
      Vector3D vector3D3 = rotationOrder0.getA3();
      Rotation rotation1 = new Rotation(vector3D0, vector3D3, vector3D2, vector3D0);
      RotationOrder rotationOrder1 = RotationOrder.YXY;
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
  public void test06()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusJ;
      Vector3D vector3D1 = Vector3D.minusK;
      Rotation rotation0 = new Rotation(vector3D1, vector3D0, vector3D0, vector3D1);
      Rotation rotation1 = new Rotation(2318.371040481456, 1988.204, 1173.2, (-1620.387884633211), true);
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
  public void test07()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusK;
      Vector3D vector3D1 = Vector3D.minusI;
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      Rotation rotation0 = new Rotation(vector3D0, (-1992.0));
      rotation0.revert();
      Vector3D vector3D2 = Vector3D.plusI;
      Rotation rotation1 = new Rotation(vector3D1, vector3D0, vector3D2, vector3D0);
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
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Vector3D vector3D0 = rotationOrder0.getA1();
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      rotation0.revert();
      Rotation rotation1 = new Rotation(0.0, 1988.204, 0.0, 0.0, true);
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
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      Rotation rotation0 = new Rotation(2318.371040481456, 7.916831588275971E8, 1173.2, (-1620.387884633211), true);
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
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Vector3D vector3D0 = rotationOrder0.getA1();
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder1 = RotationOrder.ZXZ;
      rotation0.revert();
      Vector3D vector3D1 = rotationOrder0.getA2();
      Vector3D vector3D2 = Vector3D.minusK;
      Rotation rotation1 = new Rotation(vector3D1, vector3D0, vector3D2, vector3D0);
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
  public void test11()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      Rotation rotation0 = new Rotation(3.469626569084802, 3.469626569084802, 3.469626569084802, 3.469626569084802, true);
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
  public void test12()  throws Throwable  {
      Rotation rotation0 = new Rotation(1.0, 1.0, (-28.749026301676), 1.0, false);
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
  public void test13()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusK;
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      Rotation rotation0 = new Rotation(2318.371040481456, 2318.371040481456, 1173.2, (-1620.097856), true);
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
      Rotation rotation0 = new Rotation();
      RotationOrder rotationOrder0 = RotationOrder.XZX;
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
  public void test15()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      assertEquals(Double.NaN, rotation0.getAngle(), 0.01);
      
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = new Rotation(0.8253356149096778, (-1620.387884633211), 1988.204, 901.64, true);
      assertEquals(3.140985508737099, rotation1.getAngle(), 0.01);
      assertEquals(0.3316384672405493, rotation1.getQ3(), 0.01);
      assertEquals(0.7312951145928852, rotation1.getQ2(), 0.01);
      assertEquals((-0.5960061159608203), rotation1.getQ1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      Rotation rotation1 = rotation0.revert();
      double[] doubleArray0 = rotation1.getAngles(rotationOrder0);
      assertEquals(3, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZYX;
      Rotation rotation0 = new Rotation(0.6, 1988.204, 0.6, 0.6, true);
      Rotation rotation1 = new Rotation(0.9999999999, 982.7778428, (-2630.700691989607), 1.0, false);
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
      Rotation rotation0 = new Rotation(2049.3393571, 2049.3393571, 296.87273879, 296.87273879, true);
      RotationOrder rotationOrder0 = RotationOrder.XYZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(0.6998021642093691, rotation0.getQ0(), 0.01);
      assertEquals(1.591351636207524, rotation0.getAngle(), 0.01);
      assertArrayEquals(new double[] {(-1.570796326794897), 0.0, (-0.2877238031922369)}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      Rotation rotation0 = new Rotation(rotationOrder0, 135.43, 135.43, 135.43);
      RotationOrder rotationOrder1 = RotationOrder.XYZ;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder1);
      assertArrayEquals(new double[] {(-0.43217474197965344), 0.21145542548731094, 0.3286471182063854}, doubleArray0, 0.01);
      assertEquals(0.5538029559066929, rotation0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      Rotation rotation1 = new Rotation(2318.371040481456, 1988.204, 1173.2, (-1620.387884633211), true);
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusJ;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      rotation0.getAngles(rotationOrder0);
      Rotation rotation1 = rotation0.applyInverseTo(rotation0);
      assertEquals(Double.NaN, rotation1.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      Rotation rotation0 = new Rotation(0.6, 0.6, -0.0, -0.0, true);
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
      Rotation rotation0 = new Rotation(0.9999, 0.9999, 0.1, 0.9999, false);
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
  public void test24()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YXZ;
      Rotation rotation0 = new Rotation(2.969809270239367, 2.969809270239367, 2.969809270239367, 2.969809270239367, true);
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
      Rotation rotation0 = new Rotation((-1381.19926973), (-1381.19926973), (-1849338.335074831), (-1849338.335074831), false);
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
  public void test26()  throws Throwable  {
      Rotation rotation0 = new Rotation((-1.0), (-1.0), (-0.9999999999), (-1.0), true);
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
  public void test27()  throws Throwable  {
      Rotation rotation0 = new Rotation((-180.0), (-180.0), (-0.9999999999), (-180.0), false);
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
  public void test28()  throws Throwable  {
      Rotation rotation0 = new Rotation(1163.6672079747, 1163.6672079747, (-1353.0), 5451.684737, true);
      RotationOrder rotationOrder0 = mock(RotationOrder.class, new ViolatedAssumptionAnswer());
      Vector3D vector3D0 = Vector3D.plusK;
      Vector3D vector3D1 = rotation0.applyTo(vector3D0);
      Rotation rotation1 = new Rotation(vector3D1, vector3D1, vector3D1, vector3D0);
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
  public void test29()  throws Throwable  {
      Rotation rotation0 = new Rotation((-1.0), (-1.0), (-0.9999999999), (-1.0), false);
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
  public void test30()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      Rotation rotation0 = new Rotation(rotationOrder0, 0.9999, 0.0, 0.0);
      double[][] doubleArray0 = rotation0.getMatrix();
      Rotation rotation1 = new Rotation(doubleArray0, 0.9999);
      assertEquals((-0.4793816588768448), rotation1.getQ1(), 0.01);
      assertEquals(0.9999, rotation0.getAngle(), 0.01);
      assertEquals(0.0, rotation1.getQ2(), 0.01);
      assertEquals(0.0, rotation1.getQ3(), 0.01);
      assertEquals(0.8776065320703147, rotation0.getQ0(), 0.01);
      
      Rotation rotation2 = new Rotation(0.0, 0.9999, 0.0, 1988.204, true);
      assertEquals(0.0, rotation2.getQ2(), 0.01);
      assertEquals(0.0, rotation2.getQ0(), 0.01);
      assertEquals(5.029161361461491E-4, rotation2.getQ1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Rotation rotation0 = new Rotation(0.6, 1988.204, 0.6, 0.6, true);
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(3.1409890938674074, rotation0.getAngle(), 0.01);
      assertArrayEquals(new double[] {(-2.3564962700810215), 3.140739091231675, 0.7856999432861247}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Rotation rotation0 = new Rotation(rotationOrder0, 0.6, 0.6, 0.6);
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertEquals(0.7884732286981352, rotation0.getQ0(), 0.01);
      assertArrayEquals(new double[] {0.5999999999999999, 0.600000000000001, 0.5999999999999999}, doubleArray0, 0.01);
      assertEquals(0.0, rotation0.getQ1(), 0.01);
      assertEquals(1.3249471403010027, rotation0.getAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.6, 1988.204, 0.6, 0.6, true);
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      Rotation rotation1 = new Rotation((-1200.61533), 1988.204, 1988.204, 1988.204, false);
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
  public void test34()  throws Throwable  {
      Rotation rotation0 = new Rotation(0.9999969449093496, 0.9999969449093496, 0.9999969449093496, 0.9999969449093496, true);
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      double[] doubleArray0 = rotation0.getAngles(rotationOrder0);
      assertArrayEquals(new double[] {(-1.570796326794897), 0.0, (-1.570796326794897)}, doubleArray0, 0.01);
      
      Rotation rotation1 = rotation0.revert();
      assertEquals((-0.49999999999999994), rotation1.getQ0(), 0.01);
  }
}
