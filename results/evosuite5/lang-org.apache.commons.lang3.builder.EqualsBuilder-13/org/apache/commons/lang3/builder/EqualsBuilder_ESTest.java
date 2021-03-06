/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 16:52:31 GMT 2019
 */

package org.apache.commons.lang3.builder;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.LinkedHashSet;
import org.apache.commons.lang3.Pair;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.IDKey;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class EqualsBuilder_ESTest extends EqualsBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      boolean[] booleanArray0 = new boolean[8];
      booleanArray0[1] = true;
      boolean[] booleanArray1 = new boolean[8];
      equalsBuilder0.append(booleanArray0, booleanArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      boolean[] booleanArray0 = new boolean[8];
      boolean[] booleanArray1 = new boolean[8];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(booleanArray0, booleanArray1);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      boolean[] booleanArray0 = new boolean[0];
      equalsBuilder0.append(booleanArray0, (boolean[]) null);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      boolean[] booleanArray0 = new boolean[3];
      equalsBuilder0.append((boolean[]) null, booleanArray0);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append((boolean[]) null, (boolean[]) null);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      float[] floatArray0 = new float[1];
      float[] floatArray1 = new float[1];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(floatArray1, floatArray0);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      float[] floatArray0 = new float[2];
      float[] floatArray1 = new float[1];
      equalsBuilder0.append(floatArray1, floatArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      float[] floatArray0 = new float[1];
      equalsBuilder0.append(floatArray0, (float[]) null);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      float[] floatArray0 = new float[6];
      equalsBuilder0.append((float[]) null, floatArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append((float[]) null, (float[]) null);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[1];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(doubleArray0, doubleArray1);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[6];
      equalsBuilder0.append(doubleArray0, doubleArray1);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      double[] doubleArray0 = new double[9];
      equalsBuilder0.append(doubleArray0, (double[]) null);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      double[] doubleArray0 = new double[2];
      equalsBuilder0.append((double[]) null, doubleArray0);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append((double[]) null, (double[]) null);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      equalsBuilder0.append((double) 83, 0.0);
      equalsBuilder0.append((double[]) null, (double[]) null);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = new byte[3];
      equalsBuilder0.append(byteArray0, byteArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      byte[] byteArray0 = new byte[0];
      equalsBuilder0.append(byteArray0, (byte[]) null);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      byte[] byteArray0 = new byte[2];
      equalsBuilder0.append((byte[]) null, byteArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      byte[] byteArray0 = new byte[12];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(byteArray0, byteArray0);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      equalsBuilder0.append((-1.0), 1.32843747013197);
      equalsBuilder0.append((byte[]) null, (byte[]) null);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      char[] charArray0 = new char[7];
      equalsBuilder0.append(charArray0, (char[]) null);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      char[] charArray0 = new char[3];
      equalsBuilder0.append((char[]) null, charArray0);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append((char[]) null, (char[]) null);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      short[] shortArray0 = new short[8];
      shortArray0[0] = (short) (-1131);
      short[] shortArray1 = new short[8];
      equalsBuilder0.append(shortArray0, shortArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      short[] shortArray0 = new short[1];
      short[] shortArray1 = new short[0];
      equalsBuilder0.append(shortArray0, shortArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      short[] shortArray0 = new short[6];
      equalsBuilder0.append(shortArray0, (short[]) null);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      Object object0 = new Object();
      Pair<String, String> pair0 = new Pair<String, String>("}r", "Txp$GG/y>$kyg9>U{;#");
      equalsBuilder0.append((Object) pair0, object0);
      short[] shortArray0 = new short[0];
      equalsBuilder0.append(shortArray0, shortArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      int[] intArray0 = new int[4];
      intArray0[0] = 1730;
      int[] intArray1 = new int[4];
      equalsBuilder0.append(intArray0, intArray1);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      int[] intArray0 = new int[1];
      int[] intArray1 = new int[10];
      equalsBuilder0.append(intArray0, intArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      int[] intArray0 = new int[7];
      equalsBuilder0.append(intArray0, (int[]) null);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      long[] longArray0 = new long[3];
      long[] longArray1 = new long[3];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(longArray1, longArray0);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      long[] longArray0 = new long[3];
      long[] longArray1 = new long[2];
      equalsBuilder0.append(longArray0, longArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      long[] longArray0 = new long[3];
      equalsBuilder0.append(longArray0, (long[]) null);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      long[] longArray0 = new long[0];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(longArray0, longArray0);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Object object0 = new Object();
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      equalsBuilder0.append(object0, (Object) "java.home");
      equalsBuilder0.append((long[]) null, (long[]) null);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      Object[] objectArray0 = new Object[2];
      Object[] objectArray1 = new Object[1];
      equalsBuilder0.append(objectArray0, objectArray1);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      Object[] objectArray0 = new Object[3];
      equalsBuilder0.append(objectArray0, (Object[]) null);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      Object[] objectArray0 = new Object[3];
      equalsBuilder0.append((Object[]) null, objectArray0);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      Object[] objectArray0 = new Object[0];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(objectArray0, objectArray0);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      Object object0 = new Object();
      Pair<String, String> pair0 = new Pair<String, String>("}r", "Txp$GG/y>$kyg9>U{;#");
      equalsBuilder0.append((Object) pair0, object0);
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(false, true);
      assertFalse(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      int[] intArray0 = new int[0];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append((int[]) null, intArray0);
      equalsBuilder1.append(1909.97F, 1909.97F);
      assertFalse(equalsBuilder0.build());
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append('F', 'F');
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      int[] intArray0 = new int[4];
      intArray0[0] = 1730;
      int[] intArray1 = new int[4];
      intArray1[0] = 1730;
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(intArray0, intArray1);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append((-2185), 2010);
      equalsBuilder1.append((byte) (-1), (byte) (-1));
      assertFalse(equalsBuilder0.isEquals());
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      int[] intArray0 = new int[0];
      equalsBuilder0.append((int[]) null, intArray0);
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(0L, (-1544L));
      assertSame(equalsBuilder0, equalsBuilder1);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      Object[] objectArray0 = new Object[7];
      Object[] objectArray1 = new Object[7];
      objectArray1[2] = (Object) equalsBuilder0;
      equalsBuilder0.append(objectArray1, objectArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      Object object0 = new Object();
      equalsBuilder0.append((Object) null, object0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      Object[] objectArray0 = new Object[7];
      Object[] objectArray1 = new Object[7];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(objectArray1, objectArray0);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      equalsBuilder0.appendSuper(false);
      equalsBuilder0.append((int[]) null, (int[]) null);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Object object0 = new Object();
      Class<String> class0 = String.class;
      boolean boolean0 = EqualsBuilder.reflectionEquals(object0, (Object) class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Object object0 = new Object();
      Class<String> class0 = String.class;
      boolean boolean0 = EqualsBuilder.reflectionEquals((Object) class0, object0, true, (Class<?>) class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Object object0 = new Object();
      Object object1 = new Object();
      boolean boolean0 = EqualsBuilder.reflectionEquals(object1, object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Object object0 = new Object();
      boolean boolean0 = EqualsBuilder.reflectionEquals(object0, (Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Object object0 = new Object();
      boolean boolean0 = EqualsBuilder.reflectionEquals((Object) null, object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Object object0 = new Object();
      boolean boolean0 = EqualsBuilder.reflectionEquals(object0, object0, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      Boolean boolean0 = equalsBuilder0.build();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Integer integer0 = new Integer(100);
      Boolean boolean0 = Boolean.valueOf("xy2Z7=\"Di%8sFy=Vh");
      boolean boolean1 = EqualsBuilder.reflectionEquals((Object) integer0, (Object) boolean0, false);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      IDKey iDKey0 = new IDKey(boolean0);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      boolean boolean1 = EqualsBuilder.reflectionEquals((Object) iDKey0, (Object) boolean0, (Collection<String>) linkedHashSet0);
      assertFalse(boolean1);
  }
}
