/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 14:28:38 GMT 2019
 */

package org.apache.commons.lang3.concurrent;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
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
  public void test00()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      multiBackgroundInitializer0.getTaskCount();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializer_MultiBackgroundInitializerResults0 = multiBackgroundInitializer0.initialize();
      assertTrue(multiBackgroundInitializer_MultiBackgroundInitializerResults0.isSuccessful());
      
      String string0 = "";
      // Undeclared exception!
      try { 
        multiBackgroundInitializer_MultiBackgroundInitializerResults0.getResultObject("");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No child initializer with name 
         //
         verifyException("org.apache.commons.lang3.concurrent.MultiBackgroundInitializer$MultiBackgroundInitializerResults", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ForkJoinPool forkJoinPool0 = new ForkJoinPool();
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer(forkJoinPool0);
      multiBackgroundInitializer0.initialize();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      // Undeclared exception!
      try { 
        multiBackgroundInitializer0.addInitializer("", (BackgroundInitializer<?>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Child initializer must not be null!
         //
         verifyException("org.apache.commons.lang3.concurrent.MultiBackgroundInitializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      Callable<Callable<String>> callable0 = (Callable<Callable<String>>) mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(callable0).call();
      CallableBackgroundInitializer<Callable<String>> callableBackgroundInitializer0 = new CallableBackgroundInitializer<Callable<String>>(callable0);
      ThreadPoolExecutor.DiscardOldestPolicy threadPoolExecutor_DiscardOldestPolicy0 = new ThreadPoolExecutor.DiscardOldestPolicy();
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(857, threadPoolExecutor_DiscardOldestPolicy0);
      callableBackgroundInitializer0.setExternalExecutor(scheduledThreadPoolExecutor0);
      multiBackgroundInitializer0.addInitializer("'", callableBackgroundInitializer0);
      MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializer_MultiBackgroundInitializerResults0 = multiBackgroundInitializer0.initialize();
      multiBackgroundInitializer_MultiBackgroundInitializerResults0.initializerNames();
      MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializer_MultiBackgroundInitializerResults1 = multiBackgroundInitializer0.initialize();
      multiBackgroundInitializer_MultiBackgroundInitializerResults1.isSuccessful();
      multiBackgroundInitializer_MultiBackgroundInitializerResults1.isException("'");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      multiBackgroundInitializer0.initialize();
      Callable<MultiBackgroundInitializer> callable0 = (Callable<MultiBackgroundInitializer>) mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn(multiBackgroundInitializer0).when(callable0).call();
      CallableBackgroundInitializer<MultiBackgroundInitializer> callableBackgroundInitializer0 = new CallableBackgroundInitializer<MultiBackgroundInitializer>(callable0);
      multiBackgroundInitializer0.addInitializer("b$2Z0Av_gyolHE,u", callableBackgroundInitializer0);
      MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializer_MultiBackgroundInitializerResults0 = multiBackgroundInitializer0.initialize();
      boolean boolean0 = multiBackgroundInitializer_MultiBackgroundInitializerResults0.isException("b$2Z0Av_gyolHE,u");
      assertFalse(boolean0);
      
      boolean boolean1 = multiBackgroundInitializer0.start();
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializer_MultiBackgroundInitializerResults0 = multiBackgroundInitializer0.initialize();
      // Undeclared exception!
      try { 
        multiBackgroundInitializer_MultiBackgroundInitializerResults0.isException("");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No child initializer with name 
         //
         verifyException("org.apache.commons.lang3.concurrent.MultiBackgroundInitializer$MultiBackgroundInitializerResults", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializer_MultiBackgroundInitializerResults0 = multiBackgroundInitializer0.initialize();
      multiBackgroundInitializer_MultiBackgroundInitializerResults0.isSuccessful();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      Callable<String> callable0 = (Callable<String>) mock(Callable.class, new ViolatedAssumptionAnswer());
      Callable<Callable<String>> callable1 = (Callable<Callable<String>>) mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn(callable0).when(callable1).call();
      CallableBackgroundInitializer<Callable<String>> callableBackgroundInitializer0 = new CallableBackgroundInitializer<Callable<String>>(callable1);
      multiBackgroundInitializer0.addInitializer("<}c5", callableBackgroundInitializer0);
      MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializer_MultiBackgroundInitializerResults0 = multiBackgroundInitializer0.initialize();
      boolean boolean0 = multiBackgroundInitializer_MultiBackgroundInitializerResults0.isSuccessful();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializer_MultiBackgroundInitializerResults0 = multiBackgroundInitializer0.initialize();
      multiBackgroundInitializer_MultiBackgroundInitializerResults0.initializerNames();
      multiBackgroundInitializer0.isStarted();
      // Undeclared exception!
      try { 
        multiBackgroundInitializer_MultiBackgroundInitializerResults0.isException("");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No child initializer with name 
         //
         verifyException("org.apache.commons.lang3.concurrent.MultiBackgroundInitializer$MultiBackgroundInitializerResults", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      MultiBackgroundInitializer multiBackgroundInitializer1 = new MultiBackgroundInitializer((ExecutorService) null);
      multiBackgroundInitializer0.addInitializer("B,mc~#Stz7`A+,_Bzi", multiBackgroundInitializer1);
      assertNotSame(multiBackgroundInitializer1, multiBackgroundInitializer0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      multiBackgroundInitializer0.initialize();
      MultiBackgroundInitializer multiBackgroundInitializer1 = new MultiBackgroundInitializer();
      multiBackgroundInitializer1.start();
      String string0 = "";
      // Undeclared exception!
      try { 
        multiBackgroundInitializer1.addInitializer("", multiBackgroundInitializer0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // addInitializer() must not be called after start()!
         //
         verifyException("org.apache.commons.lang3.concurrent.MultiBackgroundInitializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializer_MultiBackgroundInitializerResults0 = multiBackgroundInitializer0.initialize();
      // Undeclared exception!
      try { 
        multiBackgroundInitializer_MultiBackgroundInitializerResults0.getException("");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No child initializer with name 
         //
         verifyException("org.apache.commons.lang3.concurrent.MultiBackgroundInitializer$MultiBackgroundInitializerResults", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      Callable<Object> callable0 = (Callable<Object>) mock(Callable.class, new ViolatedAssumptionAnswer());
      CallableBackgroundInitializer<Object> callableBackgroundInitializer0 = new CallableBackgroundInitializer<Object>(callable0);
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
  public void test14()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      multiBackgroundInitializer0.initialize();
      MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializer_MultiBackgroundInitializerResults0 = multiBackgroundInitializer0.initialize();
      // Undeclared exception!
      try { 
        multiBackgroundInitializer_MultiBackgroundInitializerResults0.getInitializer("");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No child initializer with name 
         //
         verifyException("org.apache.commons.lang3.concurrent.MultiBackgroundInitializer$MultiBackgroundInitializerResults", e);
      }
  }
}
