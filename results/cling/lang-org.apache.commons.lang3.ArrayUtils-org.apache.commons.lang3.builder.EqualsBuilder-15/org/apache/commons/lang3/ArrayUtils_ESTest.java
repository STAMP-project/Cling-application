/*

 * Tue Mar 03 16:23:01 GMT 2020
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.ArrayUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ArrayUtils_ESTest extends ArrayUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      char[] charArray0 = new char[1];
      char[] charArray1 = ArrayUtils.nullToEmpty(charArray0);
      assertEquals(1, charArray1.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Float[] floatArray0 = new Float[1];
      Float[] floatArray1 = ArrayUtils.nullToEmpty(floatArray0);
      assertEquals(1, floatArray1.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[8];
      int[] intArray1 = ArrayUtils.subarray(intArray0, 0, 0);
      assertEquals(0, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = ArrayUtils.subarray(byteArray0, (-391), 120);
      assertNotSame(byteArray1, byteArray0);
      assertEquals(1, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      char[] charArray0 = ArrayUtils.subarray((char[]) null, 1322, 1322);
      assertNull(charArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Long[] longArray0 = new Long[1];
      Long[] longArray1 = ArrayUtils.nullToEmpty(longArray0);
      assertEquals(1, longArray1.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = ArrayUtils.subarray(byteArray0, (int) (byte)48, (int) (byte)48);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = ArrayUtils.nullToEmpty(doubleArray0);
      assertNotSame(doubleArray1, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      boolean boolean0 = ArrayUtils.isSameLength((Object[]) null, objectArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Float[] floatArray0 = new Float[0];
      Float[] floatArray1 = ArrayUtils.nullToEmpty(floatArray0);
      assertNotSame(floatArray1, floatArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Float[] floatArray0 = ArrayUtils.nullToEmpty((Float[]) null);
      assertEquals(0, floatArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Double[] doubleArray0 = ArrayUtils.nullToEmpty((Double[]) null);
      assertEquals(0, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object[] objectArray0 = ArrayUtils.nullToEmpty((Object[]) null);
      boolean boolean0 = ArrayUtils.isSameLength((Object[]) null, objectArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = ArrayUtils.subarray((String[]) null, 2146689166, 2146689166);
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = ArrayUtils.isSameLength((short[]) null, (short[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[2];
      String[] stringArray1 = ArrayUtils.subarray(stringArray0, (-1134), 792);
      assertNotSame(stringArray1, stringArray0);
      assertEquals(2, stringArray1.length);
      assertNotNull(stringArray1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Double[] doubleArray0 = new Double[0];
      Double[] doubleArray1 = ArrayUtils.nullToEmpty(doubleArray0);
      assertNotSame(doubleArray1, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Double[] doubleArray0 = new Double[1];
      Double[] doubleArray1 = ArrayUtils.nullToEmpty(doubleArray0);
      assertEquals(1, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      char[] charArray0 = new char[0];
      char[] charArray1 = ArrayUtils.subarray(charArray0, (-2603), (-2603));
      assertNotSame(charArray1, charArray0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int[] intArray0 = new int[1];
      int[] intArray1 = new int[3];
      boolean boolean0 = ArrayUtils.isSameLength(intArray0, intArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = ArrayUtils.subarray((double[]) null, 0, (-3343));
      assertNull(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      long[] longArray0 = new long[0];
      long[] longArray1 = new long[2];
      boolean boolean0 = ArrayUtils.isSameLength(longArray0, longArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Long[] longArray0 = new Long[0];
      Long[] longArray1 = ArrayUtils.nullToEmpty(longArray0);
      assertNotSame(longArray1, longArray0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Long[] longArray0 = ArrayUtils.nullToEmpty((Long[]) null);
      assertEquals(0, longArray0.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      float[] floatArray0 = new float[2];
      float[] floatArray1 = ArrayUtils.subarray(floatArray0, (-2146664934), 2064);
      assertEquals(2, floatArray1.length);
      assertNotSame(floatArray1, floatArray0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      char[] charArray0 = new char[2];
      char[] charArray1 = ArrayUtils.subarray(charArray0, (-1267), 1263);
      assertNotNull(charArray1);
      assertEquals(2, charArray1.length);
      assertNotSame(charArray1, charArray0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      char[] charArray0 = new char[1];
      char[] charArray1 = ArrayUtils.subarray(charArray0, 2506, 2506);
      assertNotNull(charArray1);
      assertEquals(0, charArray1.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Integer[] integerArray0 = new Integer[5];
      Integer[] integerArray1 = ArrayUtils.nullToEmpty(integerArray0);
      assertEquals(5, integerArray1.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      long[] longArray0 = new long[3];
      long[] longArray1 = ArrayUtils.subarray(longArray0, 2, 36);
      assertEquals(1, longArray1.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Integer[] integerArray0 = new Integer[1];
      int[] intArray0 = ArrayUtils.toPrimitive(integerArray0, (-2079));
      boolean boolean0 = ArrayUtils.isSameLength(intArray0, (int[]) null);
      assertFalse(boolean0);
      assertArrayEquals(new int[] {(-2079)}, intArray0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = ArrayUtils.nullToEmpty(doubleArray0);
      assertEquals(1, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = ArrayUtils.nullToEmpty((double[]) null);
      assertArrayEquals(new double[] {}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      float[] floatArray0 = new float[1];
      float[] floatArray1 = ArrayUtils.nullToEmpty(floatArray0);
      assertEquals(1, floatArray1.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Short[] shortArray0 = new Short[2];
      Short[] shortArray1 = ArrayUtils.nullToEmpty(shortArray0);
      assertEquals(2, shortArray1.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      long[] longArray0 = new long[0];
      boolean boolean0 = ArrayUtils.isSameLength(longArray0, longArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      short[] shortArray0 = ArrayUtils.subarray((short[]) null, Integer.MAX_VALUE, Integer.MAX_VALUE);
      assertNull(shortArray0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Short[] shortArray0 = new Short[0];
      Short[] shortArray1 = ArrayUtils.nullToEmpty(shortArray0);
      assertNotSame(shortArray1, shortArray0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Short[] shortArray0 = ArrayUtils.nullToEmpty((Short[]) null);
      assertEquals(0, shortArray0.length);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[0];
      boolean[] booleanArray1 = ArrayUtils.nullToEmpty(booleanArray0);
      assertNotSame(booleanArray1, booleanArray0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = ArrayUtils.nullToEmpty(byteArray0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = ArrayUtils.subarray((byte[]) null, 48, (-1332));
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      boolean[] booleanArray0 = ArrayUtils.subarray((boolean[]) null, (-1358), (-1358));
      assertNull(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = ArrayUtils.subarray(byteArray0, (-16), (int) (byte) (-101));
      assertEquals(0, byteArray1.length);
      assertNotNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      long[] longArray0 = new long[1];
      long[] longArray1 = ArrayUtils.subarray(longArray0, (-1), (-1));
      assertEquals(0, longArray1.length);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      float[] floatArray0 = new float[3];
      float[] floatArray1 = ArrayUtils.subarray(floatArray0, (-14), (-14));
      assertEquals(0, floatArray1.length);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      boolean boolean0 = ArrayUtils.isSameLength(objectArray0, (Object[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      float[] floatArray0 = new float[0];
      float[] floatArray1 = ArrayUtils.nullToEmpty(floatArray0);
      assertNotSame(floatArray1, floatArray0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      float[] floatArray0 = ArrayUtils.nullToEmpty((float[]) null);
      assertEquals(0, floatArray0.length);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Integer[] integerArray0 = new Integer[0];
      Integer[] integerArray1 = ArrayUtils.nullToEmpty(integerArray0);
      assertNotSame(integerArray1, integerArray0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Integer[] integerArray0 = ArrayUtils.nullToEmpty((Integer[]) null);
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Byte[] byteArray0 = new Byte[1];
      Byte[] byteArray1 = ArrayUtils.nullToEmpty(byteArray0);
      assertEquals(1, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      short[] shortArray0 = new short[3];
      boolean boolean0 = ArrayUtils.isSameLength((short[]) null, shortArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      short[] shortArray0 = new short[6];
      boolean boolean0 = ArrayUtils.isSameLength(shortArray0, shortArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      Byte[] byteArray0 = ArrayUtils.nullToEmpty(arrayUtils0.EMPTY_BYTE_OBJECT_ARRAY);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Byte[] byteArray0 = ArrayUtils.nullToEmpty((Byte[]) null);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      long[] longArray0 = new long[3];
      boolean boolean0 = ArrayUtils.isSameLength(longArray0, (long[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      boolean[] booleanArray1 = ArrayUtils.subarray(booleanArray0, 1, 1);
      assertEquals(0, booleanArray1.length);
      assertNotNull(booleanArray1);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      boolean boolean0 = ArrayUtils.isSameLength((long[]) null, (long[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = ArrayUtils.subarray(doubleArray0, (-1514), (-1514));
      assertNotNull(doubleArray1);
      assertEquals(0, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      boolean boolean0 = ArrayUtils.isSameLength((Object[]) null, (Object[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      Object[] objectArray1 = new Object[2];
      boolean boolean0 = ArrayUtils.isSameLength(objectArray0, objectArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Integer[] integerArray0 = new Integer[1];
      boolean boolean0 = ArrayUtils.isSameLength((Object[]) integerArray0, (Object[]) integerArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      int[] intArray0 = new int[2];
      int[] intArray1 = ArrayUtils.subarray(intArray0, (-1), 2892);
      assertNotSame(intArray1, intArray0);
      assertEquals(2, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      int[] intArray0 = ArrayUtils.subarray((int[]) null, (-1852), (-2672));
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      int[] intArray0 = new int[4];
      boolean boolean0 = ArrayUtils.isSameLength((int[]) null, intArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      boolean boolean0 = ArrayUtils.isSameLength((int[]) null, (int[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      boolean[] booleanArray1 = ArrayUtils.nullToEmpty(booleanArray0);
      assertEquals(1, booleanArray1.length);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      boolean[] booleanArray0 = ArrayUtils.nullToEmpty((boolean[]) null);
      assertEquals(0, booleanArray0.length);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      long[] longArray0 = new long[7];
      boolean boolean0 = ArrayUtils.isSameLength((long[]) null, longArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      float[] floatArray0 = ArrayUtils.subarray((float[]) null, 1205, 1205);
      assertNull(floatArray0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      float[] floatArray0 = new float[0];
      float[] floatArray1 = ArrayUtils.subarray(floatArray0, 1617, 1617);
      assertNotSame(floatArray0, floatArray1);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Character[] characterArray0 = new Character[3];
      Character[] characterArray1 = ArrayUtils.nullToEmpty(characterArray0);
      assertEquals(3, characterArray1.length);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      short[] shortArray0 = ArrayUtils.subarray(arrayUtils0.EMPTY_SHORT_ARRAY, (-1426), (-1));
      assertArrayEquals(new short[] {}, shortArray0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      short[] shortArray0 = new short[1];
      short[] shortArray1 = ArrayUtils.subarray(shortArray0, 0, 1607);
      assertEquals(1, shortArray1.length);
      assertNotSame(shortArray1, shortArray0);
      assertNotNull(shortArray1);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = ArrayUtils.subarray(doubleArray0, 1771, 1771);
      assertArrayEquals(new double[] {}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = ArrayUtils.subarray(doubleArray0, (-2051), 355);
      assertNotSame(doubleArray1, doubleArray0);
      assertNotNull(doubleArray1);
      assertEquals(3, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[2];
      Boolean[] booleanArray1 = ArrayUtils.nullToEmpty(booleanArray0);
      assertEquals(2, booleanArray1.length);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Character[] characterArray0 = new Character[0];
      Character[] characterArray1 = ArrayUtils.nullToEmpty(characterArray0);
      assertNotSame(characterArray1, characterArray0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Character[] characterArray0 = ArrayUtils.nullToEmpty((Character[]) null);
      assertEquals(0, characterArray0.length);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      boolean[] booleanArray1 = ArrayUtils.subarray(booleanArray0, (-3083), 351);
      assertEquals(2, booleanArray1.length);
      assertNotNull(booleanArray1);
      assertNotSame(booleanArray1, booleanArray0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      long[] longArray0 = ArrayUtils.subarray((long[]) null, 46, 46);
      assertNull(longArray0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[0];
      Boolean[] booleanArray1 = ArrayUtils.nullToEmpty(booleanArray0);
      assertNotSame(booleanArray1, booleanArray0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      Boolean[] booleanArray0 = ArrayUtils.nullToEmpty((Boolean[]) null);
      assertEquals(0, booleanArray0.length);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      char[] charArray0 = new char[0];
      char[] charArray1 = ArrayUtils.nullToEmpty(charArray0);
      assertNotSame(charArray1, charArray0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      char[] charArray0 = ArrayUtils.nullToEmpty((char[]) null);
      assertEquals(0, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      String[] stringArray0 = new String[0];
      String[] stringArray1 = ArrayUtils.subarray(stringArray0, 1079, 1079);
      assertNotSame(stringArray1, stringArray0);
      assertNotNull(stringArray1);
      assertEquals(0, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      String[] stringArray0 = new String[0];
      String[] stringArray1 = ArrayUtils.subarray(stringArray0, (-1506), (-1506));
      assertNotNull(stringArray1);
      assertNotSame(stringArray1, stringArray0);
      assertEquals(0, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      int[] intArray0 = new int[0];
      boolean boolean0 = ArrayUtils.isSameLength(intArray0, intArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      int[] intArray0 = ArrayUtils.EMPTY_INT_ARRAY;
      boolean boolean0 = ArrayUtils.isSameLength(intArray0, (int[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = ArrayUtils.nullToEmpty(byteArray0);
      assertEquals(1, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      byte[] byteArray0 = ArrayUtils.nullToEmpty((byte[]) null);
      assertEquals(0, byteArray0.length);
  }
}
