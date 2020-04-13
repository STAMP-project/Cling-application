/*

 * Tue Mar 03 16:22:43 GMT 2020
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ArrayUtils_ESTest extends ArrayUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      char[] charArray0 = new char[2];
      char[] charArray1 = ArrayUtils.nullToEmpty(charArray0);
      assertEquals(2, charArray1.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Float[] floatArray0 = new Float[1];
      Float[] floatArray1 = ArrayUtils.nullToEmpty(floatArray0);
      assertEquals(1, floatArray1.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = ArrayUtils.subarray(byteArray0, (-57), (int) (byte)1);
      assertEquals(1, byteArray1.length);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      char[] charArray0 = ArrayUtils.subarray((char[]) null, (-2144210743), (-1602));
      assertNull(charArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Long[] longArray0 = new Long[3];
      Long[] longArray1 = ArrayUtils.nullToEmpty(longArray0);
      assertEquals(3, longArray1.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = ArrayUtils.nullToEmpty(doubleArray0);
      assertEquals(2, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Float[] floatArray0 = new Float[0];
      Float[] floatArray1 = ArrayUtils.nullToEmpty(floatArray0);
      assertNotSame(floatArray1, floatArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Float[] floatArray0 = ArrayUtils.nullToEmpty((Float[]) null);
      assertEquals(0, floatArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Double[] doubleArray0 = ArrayUtils.nullToEmpty((Double[]) null);
      assertEquals(0, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      boolean boolean0 = ArrayUtils.isSameLength((Object[]) null, objectArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = ArrayUtils.subarray(doubleArray0, 0, 0);
      assertEquals(0, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Integer[] integerArray0 = ArrayUtils.subarray((Integer[]) null, 57, 57);
      assertNull(integerArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = ArrayUtils.isSameLength((short[]) null, (short[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Double[] doubleArray0 = new Double[0];
      Double[] doubleArray1 = ArrayUtils.nullToEmpty(doubleArray0);
      assertNotSame(doubleArray1, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Double[] doubleArray0 = new Double[9];
      Double[] doubleArray1 = ArrayUtils.nullToEmpty(doubleArray0);
      assertEquals(9, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      char[] charArray0 = new char[4];
      char[] charArray1 = ArrayUtils.subarray(charArray0, (-1), 0);
      assertEquals(0, charArray1.length);
      assertNotNull(charArray1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int[] intArray0 = new int[2];
      int[] intArray1 = new int[4];
      boolean boolean0 = ArrayUtils.isSameLength(intArray0, intArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = ArrayUtils.subarray((double[]) null, (-176), (-176));
      assertNull(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      long[] longArray0 = new long[16];
      long[] longArray1 = new long[6];
      boolean boolean0 = ArrayUtils.isSameLength(longArray0, longArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      Long[] longArray0 = ArrayUtils.nullToEmpty(arrayUtils0.EMPTY_LONG_OBJECT_ARRAY);
      assertEquals(0, longArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Character[] characterArray0 = new Character[4];
      boolean boolean0 = ArrayUtils.isSameLength((Object[]) characterArray0, (Object[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      char[] charArray0 = new char[1];
      char[] charArray1 = ArrayUtils.subarray(charArray0, (-568), (int) 'z');
      assertEquals(1, charArray1.length);
      assertNotSame(charArray1, charArray0);
      assertNotNull(charArray1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      char[] charArray0 = new char[0];
      char[] charArray1 = ArrayUtils.subarray(charArray0, 1224, 1178);
      assertNotSame(charArray0, charArray1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Integer[] integerArray0 = new Integer[1];
      Integer[] integerArray1 = ArrayUtils.nullToEmpty(integerArray0);
      assertEquals(1, integerArray1.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      long[] longArray0 = new long[2];
      long[] longArray1 = ArrayUtils.subarray(longArray0, (-2125791893), 1632);
      assertEquals(2, longArray1.length);
      assertNotSame(longArray1, longArray0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      float[] floatArray0 = new float[1];
      float[] floatArray1 = ArrayUtils.subarray(floatArray0, (int) (byte)2, (int) (byte)2);
      assertEquals(0, floatArray1.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = ArrayUtils.nullToEmpty(doubleArray0);
      assertNotSame(doubleArray1, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = ArrayUtils.nullToEmpty((double[]) null);
      assertArrayEquals(new double[] {}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      float[] floatArray0 = new float[0];
      float[] floatArray1 = ArrayUtils.nullToEmpty(floatArray0);
      assertNotSame(floatArray1, floatArray0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      Short[] shortArray0 = ArrayUtils.nullToEmpty(arrayUtils0.EMPTY_SHORT_OBJECT_ARRAY);
      assertEquals(0, shortArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      long[] longArray0 = new long[0];
      boolean boolean0 = ArrayUtils.isSameLength(longArray0, longArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      short[] shortArray0 = ArrayUtils.subarray((short[]) null, 874, 874);
      assertNull(shortArray0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Short[] shortArray0 = new Short[1];
      Short[] shortArray1 = ArrayUtils.nullToEmpty(shortArray0);
      assertEquals(1, shortArray1.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Short[] shortArray0 = ArrayUtils.nullToEmpty((Short[]) null);
      assertEquals(0, shortArray0.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      boolean[] booleanArray1 = ArrayUtils.nullToEmpty(booleanArray0);
      assertEquals(1, booleanArray1.length);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = ArrayUtils.nullToEmpty(byteArray0);
      assertEquals(1, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = ArrayUtils.subarray((byte[]) null, 690, 690);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      boolean[] booleanArray0 = ArrayUtils.subarray((boolean[]) null, (-1867), (-1867));
      assertNull(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = ArrayUtils.subarray(byteArray0, (int) (byte) (-1), (int) (byte) (-1));
      assertEquals(0, byteArray1.length);
      assertNotNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = ArrayUtils.subarray(byteArray0, 2488, 2488);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      long[] longArray0 = new long[0];
      long[] longArray1 = ArrayUtils.subarray(longArray0, (-2146952577), (-2146952577));
      assertEquals(0, longArray1.length);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      float[] floatArray0 = ArrayUtils.EMPTY_FLOAT_ARRAY;
      float[] floatArray1 = ArrayUtils.subarray(floatArray0, (-2201), (-2201));
      assertSame(floatArray1, floatArray0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      boolean boolean0 = ArrayUtils.isSameLength((Object[]) null, (Object[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      float[] floatArray0 = new float[1];
      float[] floatArray1 = ArrayUtils.nullToEmpty(floatArray0);
      assertEquals(1, floatArray1.length);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      float[] floatArray0 = ArrayUtils.nullToEmpty((float[]) null);
      assertEquals(0, floatArray0.length);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      int[] intArray0 = new int[1];
      int[] intArray1 = ArrayUtils.subarray(intArray0, 0, Integer.MAX_VALUE);
      assertEquals(1, intArray1.length);
      assertNotSame(intArray1, intArray0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      Integer[] integerArray0 = ArrayUtils.nullToEmpty(arrayUtils0.EMPTY_INTEGER_OBJECT_ARRAY);
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Integer[] integerArray0 = ArrayUtils.nullToEmpty((Integer[]) null);
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Byte[] byteArray0 = new Byte[1];
      Byte[] byteArray1 = ArrayUtils.nullToEmpty(byteArray0);
      assertEquals(1, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      short[] shortArray0 = new short[1];
      boolean boolean0 = ArrayUtils.isSameLength((short[]) null, shortArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      short[] shortArray0 = new short[1];
      boolean boolean0 = ArrayUtils.isSameLength(shortArray0, shortArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      Byte[] byteArray0 = ArrayUtils.nullToEmpty(arrayUtils0.EMPTY_BYTE_OBJECT_ARRAY);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Byte[] byteArray0 = ArrayUtils.nullToEmpty((Byte[]) null);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      boolean boolean0 = ArrayUtils.isSameLength((long[]) null, (long[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Long[] longArray0 = ArrayUtils.nullToEmpty((Long[]) null);
      boolean boolean0 = ArrayUtils.isSameLength((Object[]) longArray0, (Object[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      int[] intArray0 = new int[9];
      boolean boolean0 = ArrayUtils.isSameLength(intArray0, (int[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Object[] objectArray1 = new Object[7];
      boolean boolean0 = ArrayUtils.isSameLength(objectArray0, objectArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      boolean boolean0 = ArrayUtils.isSameLength(objectArray0, objectArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      int[] intArray0 = new int[1];
      int[] intArray1 = ArrayUtils.subarray(intArray0, (-1225), (-1));
      assertEquals(0, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      int[] intArray0 = ArrayUtils.subarray((int[]) null, (-3432), 562);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      int[] intArray0 = new int[9];
      boolean boolean0 = ArrayUtils.isSameLength((int[]) null, intArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      boolean boolean0 = ArrayUtils.isSameLength((int[]) null, (int[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      boolean[] booleanArray0 = ArrayUtils.nullToEmpty(arrayUtils0.EMPTY_BOOLEAN_ARRAY);
      assertTrue(Arrays.equals(new boolean[] {}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      boolean[] booleanArray0 = ArrayUtils.nullToEmpty((boolean[]) null);
      assertTrue(Arrays.equals(new boolean[] {}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      long[] longArray0 = new long[9];
      boolean boolean0 = ArrayUtils.isSameLength((long[]) null, longArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      boolean[] booleanArray1 = ArrayUtils.subarray(booleanArray0, (-99), 5);
      assertNotNull(booleanArray1);
      assertEquals(1, booleanArray1.length);
      assertNotSame(booleanArray1, booleanArray0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      float[] floatArray0 = ArrayUtils.subarray((float[]) null, 1706, 3);
      assertNull(floatArray0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      float[] floatArray0 = new float[1];
      float[] floatArray1 = ArrayUtils.subarray(floatArray0, (-638), Integer.MAX_VALUE);
      assertNotSame(floatArray1, floatArray0);
      assertNotNull(floatArray1);
      assertEquals(1, floatArray1.length);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Character[] characterArray0 = new Character[16];
      Character[] characterArray1 = ArrayUtils.nullToEmpty(characterArray0);
      assertEquals(16, characterArray1.length);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      short[] shortArray0 = new short[0];
      short[] shortArray1 = ArrayUtils.subarray(shortArray0, (-757), (-757));
      assertFalse(shortArray1.equals((Object)shortArray0));
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      short[] shortArray0 = new short[4];
      short[] shortArray1 = ArrayUtils.subarray(shortArray0, (int) (short)0, 928);
      assertEquals(4, shortArray1.length);
      assertNotNull(shortArray1);
      assertNotSame(shortArray1, shortArray0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = ArrayUtils.subarray(doubleArray0, (-4720), (-4720));
      assertEquals(0, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      double[] doubleArray0 = new double[12];
      double[] doubleArray1 = ArrayUtils.subarray(doubleArray0, (-711), 602);
      assertEquals(12, doubleArray1.length);
      assertNotNull(doubleArray1);
      assertNotSame(doubleArray1, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[0];
      Boolean[] booleanArray1 = ArrayUtils.nullToEmpty(booleanArray0);
      assertNotSame(booleanArray1, booleanArray0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Character[] characterArray0 = new Character[0];
      Character[] characterArray1 = ArrayUtils.nullToEmpty(characterArray0);
      assertNotSame(characterArray1, characterArray0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Character[] characterArray0 = ArrayUtils.nullToEmpty((Character[]) null);
      assertEquals(0, characterArray0.length);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      boolean[] booleanArray1 = ArrayUtils.subarray(booleanArray0, 244, 244);
      assertEquals(0, booleanArray1.length);
      assertNotNull(booleanArray1);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[0];
      boolean[] booleanArray1 = ArrayUtils.subarray(booleanArray0, (-537), (-537));
      assertNotSame(booleanArray0, booleanArray1);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      long[] longArray0 = ArrayUtils.subarray((long[]) null, 0, 36);
      assertNull(longArray0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      long[] longArray0 = new long[0];
      long[] longArray1 = ArrayUtils.subarray(longArray0, 2500, 2500);
      assertEquals(0, longArray1.length);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean[] booleanArray1 = ArrayUtils.nullToEmpty(booleanArray0);
      assertEquals(1, booleanArray1.length);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      Boolean[] booleanArray0 = ArrayUtils.nullToEmpty((Boolean[]) null);
      assertEquals(0, booleanArray0.length);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      char[] charArray0 = new char[0];
      char[] charArray1 = ArrayUtils.nullToEmpty(charArray0);
      assertNotSame(charArray1, charArray0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      char[] charArray0 = ArrayUtils.nullToEmpty((char[]) null);
      assertEquals(0, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      String[] stringArray0 = new String[1];
      String[] stringArray1 = ArrayUtils.subarray(stringArray0, (-171), 2215);
      assertEquals(1, stringArray1.length);
      assertNotNull(stringArray1);
      assertNotSame(stringArray1, stringArray0);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      ArrayUtils arrayUtils0 = new ArrayUtils();
      Object[] objectArray0 = ArrayUtils.subarray((Object[]) arrayUtils0.EMPTY_SHORT_OBJECT_ARRAY, 5, (-1));
      assertEquals(0, objectArray0.length);
      assertNotNull(objectArray0);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      int[] intArray0 = new int[2];
      boolean boolean0 = ArrayUtils.isSameLength(intArray0, intArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = ArrayUtils.nullToEmpty(byteArray0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      byte[] byteArray0 = ArrayUtils.nullToEmpty((byte[]) null);
      assertEquals(0, byteArray0.length);
  }
}
