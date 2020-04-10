/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 08:21:26 GMT 2019
 */

package org.mockito.cglib.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.cglib.util.ParallelSorter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ParallelSorter_ESTest extends ParallelSorter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = 9.099619210682269;
      ParallelSorter.DoubleComparer parallelSorter_DoubleComparer0 = new ParallelSorter.DoubleComparer(doubleArray0);
      int int0 = parallelSorter_DoubleComparer0.compare(1, 0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      ParallelSorter.DoubleComparer parallelSorter_DoubleComparer0 = new ParallelSorter.DoubleComparer(doubleArray0);
      int int0 = parallelSorter_DoubleComparer0.compare(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = (-1.0);
      ParallelSorter.DoubleComparer parallelSorter_DoubleComparer0 = new ParallelSorter.DoubleComparer(doubleArray0);
      int int0 = parallelSorter_DoubleComparer0.compare(1, 0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      float[] floatArray0 = new float[5];
      floatArray0[0] = 14.337812F;
      ParallelSorter.FloatComparer parallelSorter_FloatComparer0 = new ParallelSorter.FloatComparer(floatArray0);
      int int0 = parallelSorter_FloatComparer0.compare(1, 0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      float[] floatArray0 = new float[11];
      floatArray0[1] = (float) 680;
      ParallelSorter.FloatComparer parallelSorter_FloatComparer0 = new ParallelSorter.FloatComparer(floatArray0);
      int int0 = parallelSorter_FloatComparer0.compare(1, 0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      long[] longArray0 = new long[17];
      longArray0[0] = (long) 11114263;
      ParallelSorter.LongComparer parallelSorter_LongComparer0 = new ParallelSorter.LongComparer(longArray0);
      int int0 = parallelSorter_LongComparer0.compare(1, 0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      long[] longArray0 = new long[4];
      ParallelSorter.LongComparer parallelSorter_LongComparer0 = new ParallelSorter.LongComparer(longArray0);
      int int0 = parallelSorter_LongComparer0.compare(1, 1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      long[] longArray0 = new long[17];
      longArray0[0] = (long) (-1529);
      ParallelSorter.LongComparer parallelSorter_LongComparer0 = new ParallelSorter.LongComparer(longArray0);
      int int0 = parallelSorter_LongComparer0.compare(1, 0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ParallelSorter.Generator parallelSorter_Generator0 = new ParallelSorter.Generator();
      // Undeclared exception!
      try { 
        parallelSorter_Generator0.nextInstance("");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.mockito.cglib.util.ParallelSorter
         //
         verifyException("org.mockito.cglib.util.ParallelSorter$Generator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ParallelSorter.Generator parallelSorter_Generator0 = new ParallelSorter.Generator();
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        parallelSorter_Generator0.firstInstance(class0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.mockito.cglib.util.ParallelSorter
         //
         verifyException("org.mockito.cglib.util.ParallelSorter$Generator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      short[] shortArray0 = new short[9];
      ParallelSorter.ShortComparer parallelSorter_ShortComparer0 = new ParallelSorter.ShortComparer(shortArray0);
      // Undeclared exception!
      try { 
        parallelSorter_ShortComparer0.compare((short)0, (short)202);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 202
         //
         verifyException("org.mockito.cglib.util.ParallelSorter$ShortComparer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      float[] floatArray0 = new float[11];
      ParallelSorter.FloatComparer parallelSorter_FloatComparer0 = new ParallelSorter.FloatComparer(floatArray0);
      int int0 = parallelSorter_FloatComparer0.compare(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[7];
      ParallelSorter.IntComparer parallelSorter_IntComparer0 = new ParallelSorter.IntComparer(intArray0);
      // Undeclared exception!
      try { 
        parallelSorter_IntComparer0.compare((-733), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -733
         //
         verifyException("org.mockito.cglib.util.ParallelSorter$IntComparer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ParallelSorter.ObjectComparer parallelSorter_ObjectComparer0 = new ParallelSorter.ObjectComparer((Object[]) null);
      // Undeclared exception!
      try { 
        parallelSorter_ObjectComparer0.compare((-1), (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.util.ParallelSorter$ObjectComparer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ParallelSorter.ByteComparer parallelSorter_ByteComparer0 = new ParallelSorter.ByteComparer(byteArray0);
      int int0 = parallelSorter_ByteComparer0.compare((byte)0, (byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      ParallelSorter.ComparatorComparer parallelSorter_ComparatorComparer0 = new ParallelSorter.ComparatorComparer((Object[]) null, comparator0);
      // Undeclared exception!
      try { 
        parallelSorter_ComparatorComparer0.compare((-980), (-980));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.util.ParallelSorter$ComparatorComparer", e);
      }
  }
}
