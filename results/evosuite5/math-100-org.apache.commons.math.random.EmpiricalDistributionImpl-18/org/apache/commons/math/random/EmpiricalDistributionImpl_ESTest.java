/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 16:01:01 GMT 2019
 */

package org.apache.commons.math.random;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.EOFException;
import java.io.File;
import java.net.URL;
import org.apache.commons.math.random.EmpiricalDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class EmpiricalDistributionImpl_ESTest extends EmpiricalDistributionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EmpiricalDistributionImpl empiricalDistributionImpl0 = new EmpiricalDistributionImpl();
      assertFalse(empiricalDistributionImpl0.isLoaded());
      
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 1.0E-19;
      doubleArray0[1] = 2.0;
      empiricalDistributionImpl0.load(doubleArray0);
      double double0 = empiricalDistributionImpl0.getNextValue();
      assertEquals(5.707106781186548E-20, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EmpiricalDistributionImpl empiricalDistributionImpl0 = new EmpiricalDistributionImpl();
      double[] doubleArray0 = new double[3];
      empiricalDistributionImpl0.load(doubleArray0);
      assertTrue(empiricalDistributionImpl0.isLoaded());
      
      empiricalDistributionImpl0.getNextValue();
      assertEquals(1000, empiricalDistributionImpl0.getBinCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EmpiricalDistributionImpl empiricalDistributionImpl0 = new EmpiricalDistributionImpl();
      try { 
        empiricalDistributionImpl0.getNextValue();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // distribution not loaded
         //
         verifyException("org.apache.commons.math.random.EmpiricalDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EmpiricalDistributionImpl empiricalDistributionImpl0 = new EmpiricalDistributionImpl();
      File file0 = MockFile.createTempFile("u~o.}", "u~o.}");
      empiricalDistributionImpl0.load(file0);
      // Undeclared exception!
      try { 
        empiricalDistributionImpl0.getNextValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No bin selected
         //
         verifyException("org.apache.commons.math.random.EmpiricalDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EmpiricalDistributionImpl empiricalDistributionImpl0 = new EmpiricalDistributionImpl((-444));
      File file0 = MockFile.createTempFile("u~o.}", "u~o.}");
      // Undeclared exception!
      try { 
        empiricalDistributionImpl0.load(file0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.random.EmpiricalDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EmpiricalDistributionImpl empiricalDistributionImpl0 = new EmpiricalDistributionImpl();
      assertFalse(empiricalDistributionImpl0.isLoaded());
      
      File file0 = MockFile.createTempFile("u~o.}", "u~o.}");
      empiricalDistributionImpl0.load(file0);
      empiricalDistributionImpl0.load(file0);
      assertTrue(empiricalDistributionImpl0.isLoaded());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://www.someFakeButWellFormedURL.org/fooExample");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "");
      EmpiricalDistributionImpl empiricalDistributionImpl0 = new EmpiricalDistributionImpl();
      try { 
        empiricalDistributionImpl0.load(uRL0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // URL http://www.someFakeButWellFormedURL.org/fooExample contains no data
         //
         verifyException("org.apache.commons.math.random.EmpiricalDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EmpiricalDistributionImpl empiricalDistributionImpl0 = new EmpiricalDistributionImpl();
      empiricalDistributionImpl0.getBinStats();
      assertEquals(1000, empiricalDistributionImpl0.getBinCount());
      assertFalse(empiricalDistributionImpl0.isLoaded());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EmpiricalDistributionImpl empiricalDistributionImpl0 = new EmpiricalDistributionImpl();
      empiricalDistributionImpl0.getSampleStats();
      assertFalse(empiricalDistributionImpl0.isLoaded());
      assertEquals(1000, empiricalDistributionImpl0.getBinCount());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EmpiricalDistributionImpl empiricalDistributionImpl0 = new EmpiricalDistributionImpl();
      // Undeclared exception!
      try { 
        empiricalDistributionImpl0.getUpperBounds();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.random.EmpiricalDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EmpiricalDistributionImpl empiricalDistributionImpl0 = new EmpiricalDistributionImpl(0);
      boolean boolean0 = empiricalDistributionImpl0.isLoaded();
      assertEquals(0, empiricalDistributionImpl0.getBinCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EmpiricalDistributionImpl empiricalDistributionImpl0 = new EmpiricalDistributionImpl();
      int int0 = empiricalDistributionImpl0.getBinCount();
      assertFalse(empiricalDistributionImpl0.isLoaded());
      assertEquals(1000, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://www.someFakeButWellFormedURL.org/fooExample");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "4");
      EmpiricalDistributionImpl empiricalDistributionImpl0 = new EmpiricalDistributionImpl();
      empiricalDistributionImpl0.load(uRL0);
      assertTrue(empiricalDistributionImpl0.isLoaded());
  }
}
