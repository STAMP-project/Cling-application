/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 12:33:03 GMT 2019
 */

package org.apache.commons.lang3.concurrent;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ThreadPoolExecutor;
import org.apache.commons.lang3.concurrent.CallableBackgroundInitializer;
import org.apache.commons.lang3.concurrent.MultiBackgroundInitializer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BackgroundInitializer_ESTest extends BackgroundInitializer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Callable<Object> callable0 = (Callable<Object>) mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null).when(callable0).call();
      CallableBackgroundInitializer<Object> callableBackgroundInitializer0 = new CallableBackgroundInitializer<Object>(callable0);
      callableBackgroundInitializer0.initialize();
      callableBackgroundInitializer0.start();
      callableBackgroundInitializer0.get();
      callableBackgroundInitializer0.getExternalExecutor();
      Callable<Integer> callable1 = (Callable<Integer>) mock(Callable.class, new ViolatedAssumptionAnswer());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ForkJoinPool forkJoinPool0 = new ForkJoinPool();
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer(forkJoinPool0);
      Callable<Delayed> callable0 = (Callable<Delayed>) mock(Callable.class, new ViolatedAssumptionAnswer());
      CallableBackgroundInitializer<Delayed> callableBackgroundInitializer0 = new CallableBackgroundInitializer<Delayed>(callable0, forkJoinPool0);
      callableBackgroundInitializer0.start();
      Callable<String> callable1 = (Callable<String>) mock(Callable.class, new ViolatedAssumptionAnswer());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Callable<String> callable0 = (Callable<String>) mock(Callable.class, new ViolatedAssumptionAnswer());
      CallableBackgroundInitializer<String> callableBackgroundInitializer0 = new CallableBackgroundInitializer<String>(callable0);
      callableBackgroundInitializer0.start();
      boolean boolean0 = callableBackgroundInitializer0.start();
      assertTrue(callableBackgroundInitializer0.isStarted());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      // Undeclared exception!
      try { 
        multiBackgroundInitializer0.get();
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
      ExecutorService executorService0 = null;
      Callable<Callable<Object>> callable0 = (Callable<Callable<Object>>) mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(callable0).call();
      CallableBackgroundInitializer<Callable<Object>> callableBackgroundInitializer0 = new CallableBackgroundInitializer<Callable<Object>>(callable0, (ExecutorService) null);
      callableBackgroundInitializer0.start();
      // Undeclared exception!
      try { 
        callableBackgroundInitializer0.setExternalExecutor((ExecutorService) null);
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
      ExecutorService executorService0 = null;
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer((ExecutorService) null);
      multiBackgroundInitializer0.initialize();
      MockThread.interrupted();
      ThreadPoolExecutor.DiscardPolicy threadPoolExecutor_DiscardPolicy0 = new ThreadPoolExecutor.DiscardPolicy();
  }
}
