/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 12:35:37 GMT 2019
 */

package org.apache.commons.lang3.concurrent;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
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
  @Ignore
  public void test0()  throws Throwable  {
      ExecutorService executorService0 = mock(ExecutorService.class, new ViolatedAssumptionAnswer());
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer(executorService0);
      ThreadPoolExecutor.DiscardPolicy threadPoolExecutor_DiscardPolicy0 = new ThreadPoolExecutor.DiscardPolicy();
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(1, threadPoolExecutor_DiscardPolicy0);
      BackgroundInitializer<Thread> backgroundInitializer0 = (BackgroundInitializer<Thread>) mock(BackgroundInitializer.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(backgroundInitializer0).get();
      doReturn(scheduledThreadPoolExecutor0).when(backgroundInitializer0).getExternalExecutor();
      doReturn(true).when(backgroundInitializer0).start();
      multiBackgroundInitializer0.addInitializer("<t7#V\"Na2+\"D# ", backgroundInitializer0);
      Callable<MultiBackgroundInitializer> callable0 = (Callable<MultiBackgroundInitializer>) mock(Callable.class, new ViolatedAssumptionAnswer());
      CallableBackgroundInitializer<MultiBackgroundInitializer> callableBackgroundInitializer0 = new CallableBackgroundInitializer<MultiBackgroundInitializer>(callable0);
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
  public void test1()  throws Throwable  {
      ExecutorService executorService0 = mock(ExecutorService.class, new ViolatedAssumptionAnswer());
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer(executorService0);
      Callable<Delayed> callable0 = (Callable<Delayed>) mock(Callable.class, new ViolatedAssumptionAnswer());
      CallableBackgroundInitializer<Delayed> callableBackgroundInitializer0 = new CallableBackgroundInitializer<Delayed>(callable0);
      multiBackgroundInitializer0.addInitializer("Cannot set ExecutorService after start()!", callableBackgroundInitializer0);
      Callable<Runnable> callable1 = (Callable<Runnable>) mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(callable1).call();
      ForkJoinPool forkJoinPool0 = new ForkJoinPool();
      CallableBackgroundInitializer<Runnable> callableBackgroundInitializer1 = new CallableBackgroundInitializer<Runnable>(callable1, forkJoinPool0);
      multiBackgroundInitializer0.addInitializer("Cannot set ExecutorService after start()!", callableBackgroundInitializer1);
      multiBackgroundInitializer0.initialize();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      Callable<String> callable0 = (Callable<String>) mock(Callable.class, new ViolatedAssumptionAnswer());
      CallableBackgroundInitializer<String> callableBackgroundInitializer0 = new CallableBackgroundInitializer<String>(callable0);
      multiBackgroundInitializer0.addInitializer("#hvzh!4g{PA]Juf(pY", callableBackgroundInitializer0);
      multiBackgroundInitializer0.getTaskCount();
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
      ExecutorService executorService0 = mock(ExecutorService.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(executorService0).toString();
      doReturn((Future) null).when(executorService0).submit(nullable(java.util.concurrent.Callable.class));
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer(executorService0);
      multiBackgroundInitializer0.addInitializer("No child initializer with name ", multiBackgroundInitializer0);
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
  public void test4()  throws Throwable  {
      ExecutorService executorService0 = mock(ExecutorService.class, new ViolatedAssumptionAnswer());
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer(executorService0);
      Callable<MultiBackgroundInitializer> callable0 = (Callable<MultiBackgroundInitializer>) mock(Callable.class, new ViolatedAssumptionAnswer());
      CallableBackgroundInitializer<MultiBackgroundInitializer> callableBackgroundInitializer0 = new CallableBackgroundInitializer<MultiBackgroundInitializer>(callable0);
      multiBackgroundInitializer0.addInitializer("Child initializer must not be null!", callableBackgroundInitializer0);
      // Undeclared exception!
      multiBackgroundInitializer0.initialize();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      MultiBackgroundInitializer multiBackgroundInitializer1 = new MultiBackgroundInitializer();
      multiBackgroundInitializer0.addInitializer(".", multiBackgroundInitializer1);
      // Undeclared exception!
      multiBackgroundInitializer0.initialize();
  }
}
