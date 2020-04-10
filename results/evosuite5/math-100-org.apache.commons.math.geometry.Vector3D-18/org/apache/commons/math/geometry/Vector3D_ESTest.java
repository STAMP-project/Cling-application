/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 15:51:37 GMT 2019
 */

package org.apache.commons.math.geometry;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.geometry.Vector3D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Vector3D_ESTest extends Vector3D_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(3.141592653589793, (-0.4314189127254199));
      Vector3D vector3D1 = Vector3D.plusI;
      double double0 = Vector3D.angle(vector3D0, vector3D1);
      assertEquals(1.1124364929388377E-16, vector3D0.getY(), 0.01);
      assertEquals(2.710173740864373, double0, 0.01);
      assertEquals((-0.4181601254199195), vector3D0.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      Vector3D vector3D1 = new Vector3D((-351.6), vector3D0, 0.0, vector3D0, 1.0, vector3D0, 1.0, vector3D0);
      double double0 = Vector3D.angle(vector3D0, vector3D1);
      assertEquals(3.141592653589793, double0, 0.01);
      assertEquals(349.6, vector3D1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
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
  public void test03()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D();
      Vector3D vector3D1 = Vector3D.minusJ;
      Vector3D vector3D2 = vector3D0.add(vector3D1);
      Vector3D vector3D3 = vector3D2.orthogonal();
      assertEquals(1.5707963267948966, vector3D3.getDelta(), 0.01);
      assertEquals(1.0, vector3D3.getZ(), 0.01);
      assertEquals(0.0, vector3D3.getY(), 0.01);
      assertEquals(1.0, vector3D2.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusK;
      // Undeclared exception!
      try { 
        vector3D0.zero.orthogonal();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // null norm
         //
         verifyException("org.apache.commons.math.geometry.Vector3D", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D();
      Vector3D vector3D1 = vector3D0.minusI.normalize();
      assertEquals(0.0, vector3D0.getNorm(), 0.01);
      assertEquals(3.141592653589793, vector3D1.getAlpha(), 0.01);
      assertEquals(0.0, vector3D1.getZ(), 0.01);
      assertEquals(1.0, vector3D1.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      Vector3D vector3D1 = new Vector3D((-351.6), vector3D0, 0.0, vector3D0, 1.0, vector3D0, 1.0, vector3D0);
      Vector3D vector3D2 = vector3D1.minusI.orthogonal();
      Vector3D vector3D3 = Vector3D.crossProduct(vector3D2, vector3D1);
      Vector3D vector3D4 = vector3D3.negate();
      Vector3D vector3D5 = vector3D1.subtract(vector3D4);
      Vector3D vector3D6 = new Vector3D(0.9999, vector3D5, (-3975.6124), vector3D5, 489.69706, vector3D4, 0.9999, vector3D1);
      Vector3D vector3D7 = vector3D6.orthogonal();
      assertEquals(0.0, vector3D4.getDelta(), 0.01);
      assertEquals(0.7469657033724652, vector3D7.getX(), 0.01);
      assertEquals((-1.5707963267948966), vector3D2.getDelta(), 0.01);
      assertEquals(0.0, vector3D6.getDelta(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      double double0 = vector3D0.getY();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D();
      double double0 = vector3D0.getX();
      assertEquals(0.0, double0, 0.01);
      assertEquals(Double.NaN, vector3D0.getDelta(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(1.0, 1.0);
      double double0 = vector3D0.getDelta();
      assertEquals(1.0, vector3D0.getAlpha(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D();
      Vector3D vector3D1 = vector3D0.plusI.add(vector3D0);
      Vector3D vector3D2 = vector3D1.orthogonal();
      assertEquals(1.0, vector3D1.getNorm(), 0.01);
      assertEquals(1.5707963267948966, vector3D2.getDelta(), 0.01);
      assertEquals(-0.0, vector3D2.getX(), 0.01);
      assertEquals(1.0, vector3D2.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D();
      double double0 = vector3D0.getZ();
      assertEquals(0.0, double0, 0.01);
      assertEquals(Double.NaN, vector3D0.getDelta(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.plusK;
      Vector3D vector3D1 = new Vector3D(0.0, vector3D0, 0.0, vector3D0);
      assertEquals(0.0, vector3D1.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      double double0 = vector3D0.getAlpha();
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      Vector3D vector3D1 = new Vector3D((-351.6), vector3D0, (-351.6), vector3D0, (-351.6), vector3D0);
      assertEquals(-0.0, vector3D1.getDelta(), 0.01);
      assertEquals(1054.8000000000002, vector3D1.getNorm(), 0.01);
      assertEquals(-0.0, vector3D1.getAlpha(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      Vector3D vector3D1 = vector3D0.add((-351.6), vector3D0);
      assertEquals(0.0, vector3D1.getAlpha(), 0.01);
      assertEquals(350.6, vector3D1.getNorm(), 0.01);
      assertEquals(0.0, vector3D1.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(170.9461246863, 170.9461246863);
      Vector3D vector3D1 = vector3D0.subtract(0.0, vector3D0);
      assertEquals(1.300121392451175, vector3D1.getAlpha(), 0.01);
      assertEquals(1.300121392451175, vector3D1.getDelta(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      double double0 = Vector3D.angle(vector3D0, vector3D0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, vector3D0.getDelta(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.minusI;
      Vector3D vector3D1 = new Vector3D((-351.6), vector3D0);
      assertEquals(-0.0, vector3D1.getZ(), 0.01);
      assertEquals(-0.0, vector3D1.getAlpha(), 0.01);
      assertEquals(351.6, vector3D1.getNorm(), 0.01);
  }
}
