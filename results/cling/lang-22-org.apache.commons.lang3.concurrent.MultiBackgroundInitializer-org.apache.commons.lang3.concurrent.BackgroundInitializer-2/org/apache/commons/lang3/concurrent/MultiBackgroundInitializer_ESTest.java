/*

 * Tue Mar 03 16:04:14 GMT 2020
 */

package org.apache.commons.lang3.concurrent;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import org.apache.commons.lang3.concurrent.BackgroundInitializer;
import org.apache.commons.lang3.concurrent.CallableBackgroundInitializer;
import org.apache.commons.lang3.concurrent.MultiBackgroundInitializer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MultiBackgroundInitializer_ESTest extends MultiBackgroundInitializer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      BackgroundInitializer<Object> backgroundInitializer0 = (BackgroundInitializer<Object>) mock(BackgroundInitializer.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(backgroundInitializer0).getTaskCount();
      multiBackgroundInitializer0.addInitializer("C7,80<lkad~(IUXxjM", backgroundInitializer0);
      multiBackgroundInitializer0.getTaskCount();
      // Undeclared exception!
      try { 
        multiBackgroundInitializer0.getFuture();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // start() must be called first!
         //
         verifyException("org.apache.commons.lang3.concurrent.BackgroundInitializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      multiBackgroundInitializer0.start();
      MultiBackgroundInitializer multiBackgroundInitializer1 = new MultiBackgroundInitializer();
      // Undeclared exception!
      try { 
        multiBackgroundInitializer1.getFuture();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // start() must be called first!
         //
         verifyException("org.apache.commons.lang3.concurrent.BackgroundInitializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      multiBackgroundInitializer0.initialize();
      // Undeclared exception!
      try { 
        multiBackgroundInitializer0.addInitializer((String) null, multiBackgroundInitializer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Name of child initializer must not be null!
         //
         verifyException("org.apache.commons.lang3.concurrent.MultiBackgroundInitializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      multiBackgroundInitializer0.start();
      multiBackgroundInitializer0.get();
      // Undeclared exception!
      try { 
        multiBackgroundInitializer0.addInitializer("addInitializer() must not be called after start()!", multiBackgroundInitializer0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // addInitializer() must not be called after start()!
         //
         verifyException("org.apache.commons.lang3.concurrent.MultiBackgroundInitializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      Callable<Integer> callable0 = (Callable<Integer>) mock(Callable.class, new ViolatedAssumptionAnswer());
      CallableBackgroundInitializer<Integer> callableBackgroundInitializer0 = new CallableBackgroundInitializer<Integer>(callable0);
      multiBackgroundInitializer0.addInitializer("B", callableBackgroundInitializer0);
      multiBackgroundInitializer0.addInitializer("Q#bYEb;lbEsJ<+g%0-", callableBackgroundInitializer0);
      try { 
        multiBackgroundInitializer0.initialize();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Cannot set ExecutorService after start()!
         //
         verifyException("org.apache.commons.lang3.concurrent.BackgroundInitializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      multiBackgroundInitializer0.start();
      boolean boolean0 = multiBackgroundInitializer0.start();
      assertTrue(multiBackgroundInitializer0.isStarted());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      multiBackgroundInitializer0.start();
      multiBackgroundInitializer0.getFuture();
      // Undeclared exception!
      try { 
        multiBackgroundInitializer0.addInitializer((String) null, multiBackgroundInitializer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Name of child initializer must not be null!
         //
         verifyException("org.apache.commons.lang3.concurrent.MultiBackgroundInitializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ExecutorService executorService0 = mock(ExecutorService.class, new ViolatedAssumptionAnswer());
      doReturn((Future) null).when(executorService0).submit(nullable(java.util.concurrent.Callable.class));
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer(executorService0);
      MultiBackgroundInitializer multiBackgroundInitializer1 = new MultiBackgroundInitializer();
      multiBackgroundInitializer1.addInitializer("4fSw.A", multiBackgroundInitializer0);
      MultiBackgroundInitializer multiBackgroundInitializer2 = new MultiBackgroundInitializer();
      multiBackgroundInitializer2.addInitializer("", multiBackgroundInitializer1);
      try { 
        multiBackgroundInitializer2.initialize();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // start() must be called first!
         //
         verifyException("org.apache.commons.lang3.concurrent.BackgroundInitializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ExecutorService executorService0 = mock(ExecutorService.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(executorService0).toString();
      doReturn((Future) null).when(executorService0).submit(nullable(java.util.concurrent.Callable.class));
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer(executorService0);
      multiBackgroundInitializer0.addInitializer("]\fK4", multiBackgroundInitializer0);
      try { 
        multiBackgroundInitializer0.initialize();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // start() must be called first!
         //
         verifyException("org.apache.commons.lang3.concurrent.BackgroundInitializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ExecutorService executorService0 = mock(ExecutorService.class, new ViolatedAssumptionAnswer());
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer(executorService0);
      MultiBackgroundInitializer multiBackgroundInitializer1 = new MultiBackgroundInitializer();
      multiBackgroundInitializer0.addInitializer("", multiBackgroundInitializer1);
      MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializer_MultiBackgroundInitializerResults0 = multiBackgroundInitializer0.initialize();
      assertTrue(multiBackgroundInitializer_MultiBackgroundInitializerResults0.isSuccessful());
  }
}
