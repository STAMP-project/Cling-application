/*

 * Tue Mar 03 16:17:08 GMT 2020
 */

package org.apache.commons.lang3.concurrent;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
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
      ExecutorService executorService0 = mock(ExecutorService.class, new ViolatedAssumptionAnswer());
      MultiBackgroundInitializer multiBackgroundInitializer1 = new MultiBackgroundInitializer(executorService0);
      multiBackgroundInitializer1.addInitializer("]AUm Cb", multiBackgroundInitializer0);
      multiBackgroundInitializer1.getTaskCount();
      // Undeclared exception!
      try { 
        multiBackgroundInitializer1.get();
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
      MultiBackgroundInitializer multiBackgroundInitializer1 = new MultiBackgroundInitializer();
      multiBackgroundInitializer0.addInitializer("7v }ilB0O#W#]RFv", multiBackgroundInitializer1);
      multiBackgroundInitializer0.initialize();
      // Undeclared exception!
      try { 
        multiBackgroundInitializer1.addInitializer("7v }ilB0O#W#]RFv", multiBackgroundInitializer0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // addInitializer() must not be called after start()!
         //
         verifyException("org.apache.commons.lang3.concurrent.MultiBackgroundInitializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ForkJoinPool.ForkJoinWorkerThreadFactory forkJoinPool_ForkJoinWorkerThreadFactory0 = ForkJoinPool.defaultForkJoinWorkerThreadFactory;
      Thread.UncaughtExceptionHandler thread_UncaughtExceptionHandler0 = mock(Thread.UncaughtExceptionHandler.class, new ViolatedAssumptionAnswer());
      ForkJoinPool forkJoinPool0 = new ForkJoinPool(729, forkJoinPool_ForkJoinWorkerThreadFactory0, thread_UncaughtExceptionHandler0, false);
      Callable<Object> callable0 = (Callable<Object>) mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(callable0).call();
      ForkJoinTask<Object> forkJoinTask0 = forkJoinPool0.submit(callable0);
      ExecutorService executorService0 = mock(ExecutorService.class, new ViolatedAssumptionAnswer());
      doReturn("", "", (String) null).when(executorService0).toString();
      doReturn(forkJoinTask0).when(executorService0).submit(nullable(java.util.concurrent.Callable.class));
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer(executorService0);
      multiBackgroundInitializer0.addInitializer(":p~X<27N0nIB", multiBackgroundInitializer0);
      multiBackgroundInitializer0.start();
      Callable<MultiBackgroundInitializer.MultiBackgroundInitializerResults> callable1 = (Callable<MultiBackgroundInitializer.MultiBackgroundInitializerResults>) mock(Callable.class, new ViolatedAssumptionAnswer());
      CallableBackgroundInitializer<MultiBackgroundInitializer.MultiBackgroundInitializerResults> callableBackgroundInitializer0 = new CallableBackgroundInitializer<MultiBackgroundInitializer.MultiBackgroundInitializerResults>(callable1);
      multiBackgroundInitializer0.initialize();
      // Undeclared exception!
      try { 
        multiBackgroundInitializer0.addInitializer((String) null, callableBackgroundInitializer0);
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
      MultiBackgroundInitializer multiBackgroundInitializer1 = new MultiBackgroundInitializer();
      multiBackgroundInitializer0.addInitializer("7v }ilB0O#W#]RF,", multiBackgroundInitializer1);
      multiBackgroundInitializer0.initialize();
      ExecutorService executorService0 = mock(ExecutorService.class, new ViolatedAssumptionAnswer());
      MultiBackgroundInitializer multiBackgroundInitializer2 = new MultiBackgroundInitializer(executorService0);
      // Undeclared exception!
      try { 
        multiBackgroundInitializer2.get();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // start() must be called first!
         //
         verifyException("org.apache.commons.lang3.concurrent.BackgroundInitializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      MultiBackgroundInitializer multiBackgroundInitializer1 = new MultiBackgroundInitializer();
      multiBackgroundInitializer0.addInitializer("7v }ilB0O#W#]RF,", multiBackgroundInitializer1);
      MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializer_MultiBackgroundInitializerResults0 = multiBackgroundInitializer0.initialize();
      assertTrue(multiBackgroundInitializer_MultiBackgroundInitializerResults0.isSuccessful());
      
      int int0 = multiBackgroundInitializer0.getTaskCount();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ForkJoinPool.ForkJoinWorkerThreadFactory forkJoinPool_ForkJoinWorkerThreadFactory0 = ForkJoinPool.defaultForkJoinWorkerThreadFactory;
      Thread.UncaughtExceptionHandler thread_UncaughtExceptionHandler0 = mock(Thread.UncaughtExceptionHandler.class, new ViolatedAssumptionAnswer());
      ForkJoinPool forkJoinPool0 = new ForkJoinPool(729, forkJoinPool_ForkJoinWorkerThreadFactory0, thread_UncaughtExceptionHandler0, false);
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer(forkJoinPool0);
      Callable<MultiBackgroundInitializer.MultiBackgroundInitializerResults> callable0 = (Callable<MultiBackgroundInitializer.MultiBackgroundInitializerResults>) mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(callable0).call();
      CallableBackgroundInitializer<MultiBackgroundInitializer.MultiBackgroundInitializerResults> callableBackgroundInitializer0 = new CallableBackgroundInitializer<MultiBackgroundInitializer.MultiBackgroundInitializerResults>(callable0);
      multiBackgroundInitializer0.addInitializer(";", callableBackgroundInitializer0);
      multiBackgroundInitializer0.initialize();
      // Undeclared exception!
      try { 
        multiBackgroundInitializer0.addInitializer((String) null, callableBackgroundInitializer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Name of child initializer must not be null!
         //
         verifyException("org.apache.commons.lang3.concurrent.MultiBackgroundInitializer", e);
      }
  }
}
