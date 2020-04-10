/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 14:18:43 GMT 2019
 */

package org.apache.commons.lang3.concurrent;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledThreadPoolExecutor;
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
      MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializer_MultiBackgroundInitializerResults0 = multiBackgroundInitializer0.initialize();
      multiBackgroundInitializer_MultiBackgroundInitializerResults0.isSuccessful();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      MultiBackgroundInitializer multiBackgroundInitializer1 = new MultiBackgroundInitializer();
      multiBackgroundInitializer0.addInitializer("", multiBackgroundInitializer1);
      MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializer_MultiBackgroundInitializerResults0 = multiBackgroundInitializer0.initialize();
      multiBackgroundInitializer_MultiBackgroundInitializerResults0.isException("");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      assertFalse(multiBackgroundInitializer0.isStarted());
      assertNotNull(multiBackgroundInitializer0);
      
      MultiBackgroundInitializer multiBackgroundInitializer1 = new MultiBackgroundInitializer();
      assertFalse(multiBackgroundInitializer1.isStarted());
      assertFalse(multiBackgroundInitializer1.equals((Object)multiBackgroundInitializer0));
      assertNotNull(multiBackgroundInitializer1);
      
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(1691);
      assertNotNull(scheduledThreadPoolExecutor0);
      
      multiBackgroundInitializer1.setExternalExecutor(scheduledThreadPoolExecutor0);
      assertFalse(multiBackgroundInitializer1.isStarted());
      assertNotSame(multiBackgroundInitializer1, multiBackgroundInitializer0);
      assertFalse(multiBackgroundInitializer1.equals((Object)multiBackgroundInitializer0));
      
      multiBackgroundInitializer0.addInitializer("", multiBackgroundInitializer1);
      assertFalse(multiBackgroundInitializer0.isStarted());
      assertFalse(multiBackgroundInitializer1.isStarted());
      assertNotSame(multiBackgroundInitializer0, multiBackgroundInitializer1);
      assertNotSame(multiBackgroundInitializer1, multiBackgroundInitializer0);
      assertFalse(multiBackgroundInitializer0.equals((Object)multiBackgroundInitializer1));
      assertFalse(multiBackgroundInitializer1.equals((Object)multiBackgroundInitializer0));
      
      MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializer_MultiBackgroundInitializerResults0 = multiBackgroundInitializer0.initialize();
      assertFalse(multiBackgroundInitializer0.isStarted());
      assertTrue(multiBackgroundInitializer_MultiBackgroundInitializerResults0.isSuccessful());
      assertNotSame(multiBackgroundInitializer0, multiBackgroundInitializer1);
      assertFalse(multiBackgroundInitializer0.equals((Object)multiBackgroundInitializer1));
      assertNotNull(multiBackgroundInitializer_MultiBackgroundInitializerResults0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      assertFalse(multiBackgroundInitializer0.isStarted());
      assertNotNull(multiBackgroundInitializer0);
      
      Callable<Object> callable0 = (Callable<Object>) mock(Callable.class, new ViolatedAssumptionAnswer());
      CallableBackgroundInitializer<Object> callableBackgroundInitializer0 = new CallableBackgroundInitializer<Object>(callable0);
      assertFalse(callableBackgroundInitializer0.isStarted());
      assertNotNull(callableBackgroundInitializer0);
      
      multiBackgroundInitializer0.addInitializer("addInitializer() must not be called after start()!", callableBackgroundInitializer0);
      assertFalse(multiBackgroundInitializer0.isStarted());
      assertFalse(callableBackgroundInitializer0.isStarted());
      
      int int0 = multiBackgroundInitializer0.getTaskCount();
      assertFalse(multiBackgroundInitializer0.isStarted());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      assertFalse(multiBackgroundInitializer0.isStarted());
      assertNotNull(multiBackgroundInitializer0);
      
      boolean boolean0 = multiBackgroundInitializer0.start();
      assertTrue(multiBackgroundInitializer0.isStarted());
      assertTrue(boolean0);
      
      // Undeclared exception!
      try { 
        multiBackgroundInitializer0.addInitializer("", multiBackgroundInitializer0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // addInitializer() must not be called after start()!
         //
         verifyException("org.apache.commons.lang3.concurrent.MultiBackgroundInitializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      assertFalse(multiBackgroundInitializer0.isStarted());
      assertNotNull(multiBackgroundInitializer0);
      
      // Undeclared exception!
      try { 
        multiBackgroundInitializer0.addInitializer("nVD'aull2", (BackgroundInitializer<?>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Child initializer must not be null!
         //
         verifyException("org.apache.commons.lang3.concurrent.MultiBackgroundInitializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      assertFalse(multiBackgroundInitializer0.isStarted());
      assertNotNull(multiBackgroundInitializer0);
      
      Callable<Object> callable0 = (Callable<Object>) mock(Callable.class, new ViolatedAssumptionAnswer());
      CallableBackgroundInitializer<Object> callableBackgroundInitializer0 = new CallableBackgroundInitializer<Object>(callable0);
      assertFalse(callableBackgroundInitializer0.isStarted());
      assertNotNull(callableBackgroundInitializer0);
      
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
  public void test07()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      assertFalse(multiBackgroundInitializer0.isStarted());
      assertNotNull(multiBackgroundInitializer0);
      
      MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializer_MultiBackgroundInitializerResults0 = multiBackgroundInitializer0.initialize();
      assertFalse(multiBackgroundInitializer0.isStarted());
      assertTrue(multiBackgroundInitializer_MultiBackgroundInitializerResults0.isSuccessful());
      assertNotNull(multiBackgroundInitializer_MultiBackgroundInitializerResults0);
      
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
  public void test08()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      assertFalse(multiBackgroundInitializer0.isStarted());
      assertNotNull(multiBackgroundInitializer0);
      
      MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializer_MultiBackgroundInitializerResults0 = multiBackgroundInitializer0.initialize();
      assertFalse(multiBackgroundInitializer0.isStarted());
      assertTrue(multiBackgroundInitializer_MultiBackgroundInitializerResults0.isSuccessful());
      assertNotNull(multiBackgroundInitializer_MultiBackgroundInitializerResults0);
      
      // Undeclared exception!
      try { 
        multiBackgroundInitializer_MultiBackgroundInitializerResults0.getInitializer("WGAtI`bMM{4KRSK");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No child initializer with name WGAtI`bMM{4KRSK
         //
         verifyException("org.apache.commons.lang3.concurrent.MultiBackgroundInitializer$MultiBackgroundInitializerResults", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      assertFalse(multiBackgroundInitializer0.isStarted());
      assertNotNull(multiBackgroundInitializer0);
      
      MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializer_MultiBackgroundInitializerResults0 = multiBackgroundInitializer0.initialize();
      assertFalse(multiBackgroundInitializer0.isStarted());
      assertTrue(multiBackgroundInitializer_MultiBackgroundInitializerResults0.isSuccessful());
      assertNotNull(multiBackgroundInitializer_MultiBackgroundInitializerResults0);
      
      // Undeclared exception!
      try { 
        multiBackgroundInitializer_MultiBackgroundInitializerResults0.getException("addInitializer() must not be called after start()!");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No child initializer with name addInitializer() must not be called after start()!
         //
         verifyException("org.apache.commons.lang3.concurrent.MultiBackgroundInitializer$MultiBackgroundInitializerResults", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ForkJoinPool forkJoinPool0 = new ForkJoinPool();
      assertNotNull(forkJoinPool0);
      
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer(forkJoinPool0);
      assertFalse(multiBackgroundInitializer0.isStarted());
      assertNotNull(multiBackgroundInitializer0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      assertFalse(multiBackgroundInitializer0.isStarted());
      assertNotNull(multiBackgroundInitializer0);
      
      MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializer_MultiBackgroundInitializerResults0 = multiBackgroundInitializer0.initialize();
      assertFalse(multiBackgroundInitializer0.isStarted());
      assertTrue(multiBackgroundInitializer_MultiBackgroundInitializerResults0.isSuccessful());
      assertNotNull(multiBackgroundInitializer_MultiBackgroundInitializerResults0);
      
      Set<String> set0 = multiBackgroundInitializer_MultiBackgroundInitializerResults0.initializerNames();
      assertFalse(multiBackgroundInitializer0.isStarted());
      assertTrue(multiBackgroundInitializer_MultiBackgroundInitializerResults0.isSuccessful());
      assertTrue(set0.isEmpty());
      assertEquals(0, set0.size());
      assertNotNull(set0);
  }
}
