/*

 * Tue Mar 03 16:04:30 GMT 2020
 */

package org.apache.commons.lang3.concurrent;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
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
      Callable<Object> callable0 = (Callable<Object>) mock(Callable.class, new ViolatedAssumptionAnswer());
      CallableBackgroundInitializer<Object> callableBackgroundInitializer0 = new CallableBackgroundInitializer<Object>(callable0);
      multiBackgroundInitializer0.addInitializer("u^o].U", callableBackgroundInitializer0);
      multiBackgroundInitializer0.getTaskCount();
      Callable<String> callable1 = (Callable<String>) mock(Callable.class, new ViolatedAssumptionAnswer());
      CallableBackgroundInitializer<String> callableBackgroundInitializer1 = new CallableBackgroundInitializer<String>(callable1);
      // Undeclared exception!
      try { 
        callableBackgroundInitializer1.get();
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
      ForkJoinPool forkJoinPool0 = new ForkJoinPool();
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer(forkJoinPool0);
      Integer integer0 = new Integer(0);
      Callable<Integer> callable0 = (Callable<Integer>) mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn(integer0).when(callable0).call();
      CallableBackgroundInitializer<Integer> callableBackgroundInitializer0 = new CallableBackgroundInitializer<Integer>(callable0, forkJoinPool0);
      multiBackgroundInitializer0.addInitializer("", callableBackgroundInitializer0);
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
  public void test2()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      MultiBackgroundInitializer multiBackgroundInitializer1 = new MultiBackgroundInitializer((ExecutorService) null);
      multiBackgroundInitializer0.addInitializer("", multiBackgroundInitializer1);
      multiBackgroundInitializer0.initialize();
      // Undeclared exception!
      try { 
        multiBackgroundInitializer1.addInitializer(">AJTy\"6BX", multiBackgroundInitializer0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // addInitializer() must not be called after start()!
         //
         verifyException("org.apache.commons.lang3.concurrent.MultiBackgroundInitializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      multiBackgroundInitializer0.initialize();
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
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      MultiBackgroundInitializer multiBackgroundInitializer1 = new MultiBackgroundInitializer();
      multiBackgroundInitializer1.addInitializer("", multiBackgroundInitializer0);
      multiBackgroundInitializer1.initialize();
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
  public void test5()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      MultiBackgroundInitializer multiBackgroundInitializer1 = new MultiBackgroundInitializer((ExecutorService) null);
      multiBackgroundInitializer0.addInitializer("", multiBackgroundInitializer1);
      int int0 = multiBackgroundInitializer0.getTaskCount();
      assertEquals(2, int0);
      
      MultiBackgroundInitializer multiBackgroundInitializer2 = new MultiBackgroundInitializer((ExecutorService) null);
      multiBackgroundInitializer2.addInitializer("", multiBackgroundInitializer1);
      MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializer_MultiBackgroundInitializerResults0 = multiBackgroundInitializer2.initialize();
      assertTrue(multiBackgroundInitializer_MultiBackgroundInitializerResults0.isSuccessful());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ForkJoinPool forkJoinPool0 = new ForkJoinPool();
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer(forkJoinPool0);
      Integer integer0 = new Integer(1337);
      Callable<Integer> callable0 = (Callable<Integer>) mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn(integer0).when(callable0).call();
      CallableBackgroundInitializer<Integer> callableBackgroundInitializer0 = new CallableBackgroundInitializer<Integer>(callable0, forkJoinPool0);
      multiBackgroundInitializer0.addInitializer("", callableBackgroundInitializer0);
      multiBackgroundInitializer0.initialize();
      MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializer_MultiBackgroundInitializerResults0 = multiBackgroundInitializer0.initialize();
      assertTrue(multiBackgroundInitializer_MultiBackgroundInitializerResults0.isSuccessful());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      MultiBackgroundInitializer multiBackgroundInitializer1 = new MultiBackgroundInitializer();
      multiBackgroundInitializer0.addInitializer("", multiBackgroundInitializer1);
      multiBackgroundInitializer0.initialize();
      // Undeclared exception!
      try { 
        multiBackgroundInitializer0.addInitializer("1{dG;OP.^r.Z^", (BackgroundInitializer<?>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Child initializer must not be null!
         //
         verifyException("org.apache.commons.lang3.concurrent.MultiBackgroundInitializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      MultiBackgroundInitializer multiBackgroundInitializer1 = new MultiBackgroundInitializer((ExecutorService) null);
      multiBackgroundInitializer0.addInitializer("", multiBackgroundInitializer1);
      multiBackgroundInitializer0.initialize();
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
}
