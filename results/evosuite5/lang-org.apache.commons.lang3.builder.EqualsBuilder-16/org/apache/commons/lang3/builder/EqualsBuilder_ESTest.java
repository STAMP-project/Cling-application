/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 16:44:49 GMT 2019
 */

package org.apache.commons.lang3.builder;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.LinkedList;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
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
      
      boolean[] booleanArray0 = new boolean[2];
      booleanArray0[0] = true;
      boolean[] booleanArray1 = new boolean[2];
      equalsBuilder0.append(booleanArray1, booleanArray0);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      boolean[] booleanArray0 = new boolean[10];
      boolean[] booleanArray1 = new boolean[4];
      equalsBuilder0.append(booleanArray0, booleanArray1);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      boolean[] booleanArray0 = new boolean[5];
      boolean[] booleanArray1 = new boolean[5];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(booleanArray0, booleanArray1);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      boolean[] booleanArray0 = new boolean[2];
      equalsBuilder0.append((boolean[]) null, booleanArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      boolean[] booleanArray0 = new boolean[5];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(booleanArray0, booleanArray0);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append('\\', 'p');
      boolean[] booleanArray0 = new boolean[1];
      equalsBuilder1.append(booleanArray0, booleanArray0);
      assertFalse(equalsBuilder0.build());
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      float[] floatArray0 = new float[3];
      float[] floatArray1 = new float[3];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(floatArray0, floatArray1);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      float[] floatArray0 = new float[8];
      float[] floatArray1 = new float[7];
      equalsBuilder0.append(floatArray0, floatArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      float[] floatArray0 = new float[1];
      equalsBuilder0.append(floatArray0, (float[]) null);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      float[] floatArray0 = new float[0];
      equalsBuilder0.append((float[]) null, floatArray0);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      float[] floatArray0 = new float[1];
      int[] intArray0 = new int[8];
      int[] intArray1 = new int[5];
      equalsBuilder0.append(intArray1, intArray0);
      equalsBuilder0.append(floatArray0, floatArray0);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = (double) 2432.2048F;
      double[] doubleArray1 = new double[3];
      equalsBuilder0.append(doubleArray1, doubleArray0);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[2];
      equalsBuilder0.append(doubleArray1, doubleArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[3];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(doubleArray1, doubleArray0);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      double[] doubleArray0 = new double[3];
      equalsBuilder0.append(doubleArray0, (double[]) null);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      double[] doubleArray0 = new double[0];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(doubleArray0, doubleArray0);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      equalsBuilder0.append(4648971914687982801L, 4653556436942181943L);
      equalsBuilder0.append((double[]) null, (double[]) null);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)1;
      byte[] byteArray1 = new byte[3];
      equalsBuilder0.append(byteArray0, byteArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = new byte[1];
      equalsBuilder0.append(byteArray0, byteArray1);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      byte[] byteArray0 = new byte[1];
      equalsBuilder0.append((byte[]) null, byteArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      equalsBuilder0.append('l', 'v');
      byte[] byteArray0 = new byte[0];
      equalsBuilder0.append(byteArray0, byteArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      char[] charArray0 = new char[1];
      char[] charArray1 = new char[1];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(charArray0, charArray1);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      char[] charArray0 = new char[4];
      equalsBuilder0.append(charArray0, (char[]) null);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      char[] charArray0 = new char[6];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(charArray0, charArray0);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      equalsBuilder0.appendSuper(false);
      equalsBuilder0.append((char[]) null, (char[]) null);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      short[] shortArray0 = new short[8];
      short[] shortArray1 = new short[8];
      shortArray1[5] = (short) (-2266);
      equalsBuilder0.append(shortArray0, shortArray1);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      short[] shortArray0 = new short[8];
      short[] shortArray1 = new short[5];
      equalsBuilder0.append(shortArray0, shortArray1);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      short[] shortArray0 = new short[8];
      short[] shortArray1 = new short[8];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(shortArray0, shortArray1);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      short[] shortArray0 = new short[2];
      equalsBuilder0.append((short[]) null, shortArray0);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      short[] shortArray0 = new short[3];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(shortArray0, (short[]) null);
      equalsBuilder1.append((short[]) null, (short[]) null);
      assertFalse(equalsBuilder0.build());
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      short[] shortArray0 = new short[0];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(shortArray0, shortArray0);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      int[] intArray0 = new int[5];
      int[] intArray1 = new int[5];
      intArray1[0] = (int) 'J';
      equalsBuilder0.append(intArray1, intArray0);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      int[] intArray0 = new int[8];
      int[] intArray1 = new int[8];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(intArray0, intArray1);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      int[] intArray0 = new int[0];
      equalsBuilder0.append((int[]) null, intArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      equalsBuilder0.appendSuper(false);
      int[] intArray0 = new int[3];
      equalsBuilder0.append(intArray0, intArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      long[] longArray0 = new long[7];
      longArray0[5] = (-827L);
      long[] longArray1 = new long[7];
      equalsBuilder0.append(longArray0, longArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      long[] longArray0 = new long[7];
      long[] longArray1 = new long[7];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(longArray0, longArray1);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      long[] longArray0 = new long[14];
      equalsBuilder0.append(longArray0, (long[]) null);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      long[] longArray0 = new long[7];
      equalsBuilder0.append((long[]) null, longArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      long[] longArray0 = new long[6];
      long[] longArray1 = new long[7];
      equalsBuilder0.append(longArray1, longArray0);
      equalsBuilder0.append(longArray1, longArray1);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      long[] longArray0 = new long[7];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(longArray0, longArray0);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      Object[] objectArray1 = new Object[9];
      Object object0 = new Object();
      objectArray1[0] = object0;
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      equalsBuilder0.append(objectArray0, objectArray1);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Object[] objectArray1 = new Object[9];
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      equalsBuilder0.append(objectArray1, objectArray0);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      Object[] objectArray0 = new Object[2];
      equalsBuilder0.append(objectArray0, (Object[]) null);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      equalsBuilder0.append((Object[]) null, objectArray0);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      Object[] objectArray1 = new Object[9];
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(objectArray0, objectArray1);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      Object[] objectArray0 = new Object[1];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(objectArray0, objectArray0);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      equalsBuilder0.appendSuper(false);
      equalsBuilder0.append(false, false);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append((-1), 920);
      equalsBuilder1.append((float) 920, (float) (-1));
      assertFalse(equalsBuilder0.isEquals());
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      EqualsBuilder equalsBuilder1 = equalsBuilder0.appendSuper(false);
      EqualsBuilder equalsBuilder2 = equalsBuilder1.append(0.0, (-1103.23825));
      assertSame(equalsBuilder0, equalsBuilder2);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = new byte[1];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(byteArray0, byteArray1);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      boolean[] booleanArray0 = new boolean[9];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(booleanArray0, (boolean[]) null);
      equalsBuilder1.append((byte)37, (byte)37);
      assertFalse(equalsBuilder0.build());
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      equalsBuilder0.append(false, true);
      equalsBuilder0.append('J', 'J');
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      equalsBuilder0.append((short) (-3607), (short)3413);
      Object[] objectArray0 = new Object[0];
      equalsBuilder0.append(objectArray0, objectArray0);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      int[] intArray0 = new int[2];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(intArray0, (int[]) null);
      EqualsBuilder equalsBuilder2 = equalsBuilder1.append((short) (-752), (short) (-1300));
      assertFalse(equalsBuilder2.isEquals());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      boolean[] booleanArray0 = new boolean[9];
      equalsBuilder0.append(booleanArray0, (boolean[]) null);
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append((int) (short)10, (int) (short)1);
      assertSame(equalsBuilder1, equalsBuilder0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      equalsBuilder0.setEquals(false);
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(4634907704006017024L, (-1895L));
      assertFalse(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      Object object0 = new Object();
      IDKey iDKey0 = new IDKey(object0);
      equalsBuilder0.append(object0, (Object) iDKey0);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      equalsBuilder0.append((Object) equalsBuilder0, (Object) null);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      EqualsBuilder equalsBuilder1 = equalsBuilder0.appendSuper(false);
      equalsBuilder1.append((Object) equalsBuilder1, (Object) equalsBuilder0);
      assertFalse(equalsBuilder0.build());
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      double[] doubleArray0 = new double[3];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append((double[]) null, doubleArray0);
      EqualsBuilder equalsBuilder2 = equalsBuilder1.appendSuper(false);
      assertSame(equalsBuilder2, equalsBuilder1);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Object object0 = new Object();
      Class<Object> class0 = Object.class;
      boolean boolean0 = EqualsBuilder.reflectionEquals((Object) class0, object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder(1, 1);
      boolean boolean0 = EqualsBuilder.reflectionEquals((Object) "%/Zexcu+077o=", (Object) hashCodeBuilder0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      Object object0 = new Object();
      boolean boolean0 = EqualsBuilder.reflectionEquals(object0, (Object) equalsBuilder0);
      assertFalse(boolean0);
      assertTrue(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Object object0 = new Object();
      boolean boolean0 = EqualsBuilder.reflectionEquals(object0, (Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      equalsBuilder0.reset();
      assertTrue(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      Boolean boolean0 = equalsBuilder0.build();
      assertTrue(boolean0);
      
      EqualsBuilder.register(boolean0, equalsBuilder0);
      assertTrue(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Class<String> class0 = String.class;
      boolean boolean0 = EqualsBuilder.reflectionEquals((Object) "yfQ-//f<w3;gn3'^:@", (Object) "\"wuxh882*8}3[1u,q", true, (Class<?>) class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Object object0 = new Object();
      boolean boolean0 = EqualsBuilder.reflectionEquals(object0, object0, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      boolean boolean0 = EqualsBuilder.reflectionEquals((Object) null, (Object) equalsBuilder0, (Collection<String>) linkedList0);
      assertTrue(equalsBuilder0.isEquals());
      assertFalse(boolean0);
  }
}
