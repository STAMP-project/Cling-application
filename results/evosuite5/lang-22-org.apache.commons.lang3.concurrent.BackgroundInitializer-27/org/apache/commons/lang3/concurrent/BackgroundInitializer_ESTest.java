/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 12:31:34 GMT 2019
 */

package org.apache.commons.lang3.concurrent;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import org.apache.commons.lang3.concurrent.CallableBackgroundInitializer;
import org.apache.commons.lang3.concurrent.MultiBackgroundInitializer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BackgroundInitializer_ESTest extends BackgroundInitializer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ForkJoinPool forkJoinPool0 = ForkJoinPool.commonPool();
      Callable<String> callable0 = (Callable<String>) mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn("org.apache.commons.lang3.concurrent.CallableBackgroundInitializer").when(callable0).call();
      CallableBackgroundInitializer<String> callableBackgroundInitializer0 = new CallableBackgroundInitializer<String>(callable0, forkJoinPool0);
      boolean boolean0 = callableBackgroundInitializer0.start();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Callable<Object> callable0 = (Callable<Object>) mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(callable0).call();
      CallableBackgroundInitializer<Object> callableBackgroundInitializer0 = new CallableBackgroundInitializer<Object>(callable0);
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(1, threadFactory0);
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer(scheduledThreadPoolExecutor0);
      multiBackgroundInitializer0.addInitializer("start() must be called first!", callableBackgroundInitializer0);
      multiBackgroundInitializer0.initialize();
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
  public void test2()  throws Throwable  {
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
  public void test3()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      multiBackgroundInitializer0.start();
      boolean boolean0 = multiBackgroundInitializer0.start();
      assertTrue(multiBackgroundInitializer0.isStarted());
      assertFalse(boolean0);
  }
}
