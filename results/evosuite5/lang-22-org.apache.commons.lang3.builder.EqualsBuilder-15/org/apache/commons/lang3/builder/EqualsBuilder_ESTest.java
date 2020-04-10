/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 16:48:40 GMT 2019
 */

package org.apache.commons.lang3.builder;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.LinkedList;
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
      assertTrue(equalsBuilder0.isEquals());
      
      boolean[] booleanArray0 = new boolean[8];
      booleanArray0[0] = true;
      boolean[] booleanArray1 = new boolean[8];
      equalsBuilder0.append(booleanArray0, booleanArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      boolean[] booleanArray0 = new boolean[1];
      boolean[] booleanArray1 = new boolean[8];
      equalsBuilder0.append(booleanArray0, booleanArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      boolean[] booleanArray0 = new boolean[3];
      equalsBuilder0.append(booleanArray0, (boolean[]) null);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      boolean[] booleanArray0 = new boolean[1];
      equalsBuilder0.append((boolean[]) null, booleanArray0);
      assertFalse(equalsBuilder0.isEquals());
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
      assertTrue(equalsBuilder0.isEquals());
      
      Object[] objectArray0 = new Object[3];
      equalsBuilder0.append(objectArray0, (Object[]) null);
      boolean[] booleanArray0 = new boolean[3];
      equalsBuilder0.append(booleanArray0, booleanArray0);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      float[] floatArray0 = new float[3];
      floatArray0[0] = (float) (byte)24;
      float[] floatArray1 = new float[3];
      equalsBuilder0.append(floatArray0, floatArray1);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      float[] floatArray0 = new float[3];
      float[] floatArray1 = new float[3];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(floatArray0, floatArray1);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      float[] floatArray0 = new float[0];
      float[] floatArray1 = new float[5];
      equalsBuilder0.append(floatArray0, floatArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      float[] floatArray0 = new float[6];
      equalsBuilder0.append(floatArray0, (float[]) null);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      float[] floatArray0 = new float[8];
      equalsBuilder0.append((float[]) null, floatArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(0.0, 1.5099433558145794);
      equalsBuilder1.append((float[]) null, (float[]) null);
      assertFalse(equalsBuilder0.build());
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append((float[]) null, (float[]) null);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      double[] doubleArray0 = new double[18];
      double[] doubleArray1 = new double[18];
      doubleArray1[0] = (double) (byte)42;
      equalsBuilder0.append(doubleArray1, doubleArray0);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      double[] doubleArray0 = new double[18];
      double[] doubleArray1 = new double[1];
      equalsBuilder0.append(doubleArray0, doubleArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      double[] doubleArray0 = new double[3];
      equalsBuilder0.append(doubleArray0, (double[]) null);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      double[] doubleArray0 = new double[1];
      equalsBuilder0.append((double[]) null, doubleArray0);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append((double[]) null, (double[]) null);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte) (-48);
      byte[] byteArray1 = new byte[7];
      equalsBuilder0.append(byteArray0, byteArray1);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = new byte[4];
      equalsBuilder0.append(byteArray0, byteArray1);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = new byte[7];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(byteArray0, byteArray1);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      byte[] byteArray0 = new byte[0];
      equalsBuilder0.append(byteArray0, (byte[]) null);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      byte[] byteArray0 = new byte[5];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(byteArray0, byteArray0);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      byte[] byteArray0 = new byte[0];
      equalsBuilder0.append((byte[]) null, byteArray0);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      char[] charArray0 = new char[5];
      char[] charArray1 = new char[5];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(charArray0, charArray1);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      char[] charArray0 = new char[5];
      equalsBuilder0.append(charArray0, (char[]) null);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      char[] charArray0 = new char[0];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(charArray0, charArray0);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      equalsBuilder0.append(0.0, 1.5099433558145794);
      char[] charArray0 = new char[1];
      equalsBuilder0.append(charArray0, charArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      short[] shortArray0 = new short[6];
      short[] shortArray1 = new short[6];
      shortArray1[0] = (short) (-370);
      equalsBuilder0.append(shortArray0, shortArray1);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      short[] shortArray0 = new short[5];
      short[] shortArray1 = new short[4];
      equalsBuilder0.append(shortArray0, shortArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      short[] shortArray0 = new short[6];
      short[] shortArray1 = new short[6];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(shortArray0, shortArray1);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      short[] shortArray0 = new short[6];
      equalsBuilder0.append(shortArray0, (short[]) null);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append((short[]) null, (short[]) null);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      short[] shortArray0 = new short[3];
      equalsBuilder0.append((short[]) null, shortArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      int[] intArray0 = new int[1];
      int[] intArray1 = new int[1];
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(intArray1, intArray0);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      int[] intArray0 = new int[1];
      int[] intArray1 = new int[0];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(intArray0, intArray1);
      byte[] byteArray0 = new byte[3];
      equalsBuilder1.append(byteArray0, byteArray0);
      assertFalse(equalsBuilder0.build());
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      int[] intArray0 = new int[12];
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      equalsBuilder0.append(intArray0, (int[]) null);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      int[] intArray0 = new int[1];
      equalsBuilder0.append((int[]) null, intArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      long[] longArray0 = new long[2];
      longArray0[0] = (long) (byte)30;
      long[] longArray1 = new long[2];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(longArray0, longArray1);
      equalsBuilder1.append((int[]) null, (int[]) null);
      assertFalse(equalsBuilder0.build());
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      long[] longArray0 = new long[8];
      long[] longArray1 = new long[6];
      equalsBuilder0.append(longArray1, longArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      long[] longArray0 = new long[0];
      equalsBuilder0.append(longArray0, (long[]) null);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      long[] longArray0 = new long[3];
      equalsBuilder0.append((long[]) null, longArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      long[] longArray0 = new long[2];
      long[] longArray1 = new long[2];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(longArray0, longArray1);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      equalsBuilder0.append((-25), 2975);
      long[] longArray0 = new long[2];
      equalsBuilder0.append(longArray0, longArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      long[] longArray0 = new long[2];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(longArray0, longArray0);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) equalsBuilder0;
      Object[] objectArray1 = new Object[4];
      equalsBuilder0.append(objectArray0, objectArray1);
      short[] shortArray0 = new short[5];
      equalsBuilder0.append(shortArray0, shortArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      Object[] objectArray0 = new Object[6];
      Object[] objectArray1 = new Object[6];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(objectArray0, objectArray1);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      Object[] objectArray0 = new Object[3];
      equalsBuilder0.append(objectArray0, (Object[]) null);
      equalsBuilder0.append((double[]) null, (double[]) null);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append((Object[]) null, (Object[]) null);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      boolean[] booleanArray0 = new boolean[1];
      boolean[] booleanArray1 = new boolean[1];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(booleanArray0, booleanArray1);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Object object0 = new Object();
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      equalsBuilder0.append(object0, (Object) equalsBuilder0);
      equalsBuilder0.append(true, true);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append((byte)0, (byte)5);
      EqualsBuilder equalsBuilder2 = equalsBuilder1.append((float) (byte)0, (-1817.0F));
      assertSame(equalsBuilder2, equalsBuilder0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(50.50849F, 0.0F);
      EqualsBuilder equalsBuilder2 = equalsBuilder1.append((double) (short)103, (double) 0.0F);
      assertSame(equalsBuilder0, equalsBuilder2);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      Object object0 = new Object();
      equalsBuilder0.append((Object) equalsBuilder0, object0);
      equalsBuilder0.append((byte)35, (byte)35);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(false, true);
      equalsBuilder1.append('h', 'h');
      assertFalse(equalsBuilder0.build());
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      char[] charArray0 = new char[2];
      equalsBuilder0.append((char[]) null, charArray0);
      equalsBuilder0.append((short) (-3257), (short) (-3257));
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append((byte) (-124), (byte)126);
      EqualsBuilder equalsBuilder2 = equalsBuilder1.append((int) (byte)126, 1149896294);
      assertSame(equalsBuilder2, equalsBuilder1);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-1.0);
      double[] doubleArray1 = new double[1];
      equalsBuilder0.append(doubleArray0, doubleArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(50.50849F, 0.0F);
      equalsBuilder1.append((long) (short)103, (long) (short)103);
      assertFalse(equalsBuilder0.isEquals());
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      Object object0 = new Object();
      equalsBuilder0.append((Object) null, object0);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(50.50849F, 0.0F);
      EqualsBuilder equalsBuilder2 = equalsBuilder1.append((Object) equalsBuilder1, (Object) null);
      assertFalse(equalsBuilder2.isEquals());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(true, false);
      EqualsBuilder equalsBuilder2 = equalsBuilder1.appendSuper(false);
      assertFalse(equalsBuilder2.build());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      equalsBuilder0.appendSuper(false);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      EqualsBuilder.reflectionEquals((Object) "VD9V", (Object) "VD9V");
      Boolean boolean0 = new Boolean("VD9V");
      Object object0 = new Object();
      EqualsBuilder.unregister(boolean0, object0);
      Class<String> class0 = String.class;
      boolean boolean1 = EqualsBuilder.reflectionEquals((Object) "VD9V", (Object) "EV-KwiHgl w", true, (Class<?>) class0, (String[]) null);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Object object0 = new Object();
      boolean boolean0 = EqualsBuilder.reflectionEquals(object0, (Object) "`!F}ySc6xF;n;D`'G");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      IDKey iDKey0 = new IDKey((Object) null);
      boolean boolean0 = EqualsBuilder.reflectionEquals((Object) null, (Object) iDKey0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      equalsBuilder0.reset();
      assertTrue(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      Boolean boolean0 = equalsBuilder0.build();
      assertTrue(boolean0);
      
      boolean boolean1 = EqualsBuilder.reflectionEquals((Object) "Kyp~1JaPTZ8wmt~P3B", (Object) boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Object object0 = new Object();
      Class<Integer> class0 = Integer.class;
      boolean boolean0 = EqualsBuilder.reflectionEquals((Object) class0, object0, false, (Class<?>) class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Object object0 = new Object();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      boolean boolean0 = EqualsBuilder.reflectionEquals(object0, object0, (Collection<String>) linkedList0);
      assertTrue(boolean0);
  }
}
