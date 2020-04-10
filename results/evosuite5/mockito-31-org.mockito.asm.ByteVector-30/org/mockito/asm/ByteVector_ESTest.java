/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 09:23:21 GMT 2019
 */

package org.mockito.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.ByteVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ByteVector_ESTest extends ByteVector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        byteVector0.putByteArray(byteArray0, 13, 13);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.putByteArray((byte[]) null, 71, 71);
      assertSame(byteVector1, byteVector0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector(0);
      ByteVector byteVector1 = byteVector0.putUTF8("]d0IO`npK(");
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.putUTF8("Kb{.LRo7k ");
      assertSame(byteVector1, byteVector0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector(0);
      ByteVector byteVector1 = byteVector0.putLong(0);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.putLong(1462L);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector(3);
      ByteVector byteVector1 = byteVector0.putInt(3);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.putInt((-1725));
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector(0);
      ByteVector byteVector1 = byteVector0.put12(0, 0);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.put12((-17), (-17));
      assertSame(byteVector1, byteVector0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector(0);
      ByteVector byteVector1 = byteVector0.putShort(0);
      assertSame(byteVector1, byteVector0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.putShort((-861));
      assertSame(byteVector1, byteVector0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector(0);
      ByteVector byteVector1 = byteVector0.put11(0, 0);
      assertSame(byteVector1, byteVector0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.put11((-409), (-409));
      assertSame(byteVector1, byteVector0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector(0);
      ByteVector byteVector1 = byteVector0.putByte(0);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.putByte((-861));
      assertSame(byteVector0, byteVector1);
  }
}
