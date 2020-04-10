/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 14:27:23 GMT 2019
 */

package org.apache.commons.lang3.concurrent;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.NoSuchElementException;
import java.util.Set;
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
  public void test00()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer((ExecutorService) null);
      assertFalse(multiBackgroundInitializer0.isStarted());
      assertNotNull(multiBackgroundInitializer0);
      
      MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializer_MultiBackgroundInitializerResults0 = multiBackgroundInitializer0.initialize();
      assertFalse(multiBackgroundInitializer0.isStarted());
      assertTrue(multiBackgroundInitializer_MultiBackgroundInitializerResults0.isSuccessful());
      assertNotNull(multiBackgroundInitializer_MultiBackgroundInitializerResults0);
      
      // Undeclared exception!
      try { 
        multiBackgroundInitializer_MultiBackgroundInitializerResults0.getException("J#'bzQvh^[");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No child initializer with name J#'bzQvh^[
         //
         verifyException("org.apache.commons.lang3.concurrent.MultiBackgroundInitializer$MultiBackgroundInitializerResults", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      assertFalse(multiBackgroundInitializer0.isStarted());
      assertNotNull(multiBackgroundInitializer0);
      
      Callable<MultiBackgroundInitializer> callable0 = (Callable<MultiBackgroundInitializer>) mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(callable0).call();
      CallableBackgroundInitializer<MultiBackgroundInitializer> callableBackgroundInitializer0 = new CallableBackgroundInitializer<MultiBackgroundInitializer>(callable0);
      assertFalse(callableBackgroundInitializer0.isStarted());
      assertNotNull(callableBackgroundInitializer0);
      
      multiBackgroundInitializer0.addInitializer("org.apache.commons.lang3.concurrent.CallableBackgroundInitializer", callableBackgroundInitializer0);
      assertFalse(multiBackgroundInitializer0.isStarted());
      assertFalse(callableBackgroundInitializer0.isStarted());
      
      MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializer_MultiBackgroundInitializerResults0 = multiBackgroundInitializer0.initialize();
      assertFalse(multiBackgroundInitializer0.isStarted());
      assertTrue(multiBackgroundInitializer_MultiBackgroundInitializerResults0.isSuccessful());
      assertNotNull(multiBackgroundInitializer_MultiBackgroundInitializerResults0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      assertFalse(multiBackgroundInitializer0.isStarted());
      assertNotNull(multiBackgroundInitializer0);
      
      Callable<String> callable0 = (Callable<String>) mock(Callable.class, new ViolatedAssumptionAnswer());
      CallableBackgroundInitializer<String> callableBackgroundInitializer0 = new CallableBackgroundInitializer<String>(callable0);
      assertFalse(callableBackgroundInitializer0.isStarted());
      assertNotNull(callableBackgroundInitializer0);
      
      multiBackgroundInitializer0.addInitializer("", callableBackgroundInitializer0);
      assertFalse(multiBackgroundInitializer0.isStarted());
      assertFalse(callableBackgroundInitializer0.isStarted());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      assertFalse(multiBackgroundInitializer0.isStarted());
      assertNotNull(multiBackgroundInitializer0);
      
      boolean boolean0 = multiBackgroundInitializer0.start();
      assertTrue(multiBackgroundInitializer0.isStarted());
      assertTrue(boolean0);
      
      MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializer_MultiBackgroundInitializerResults0 = multiBackgroundInitializer0.initialize();
      assertTrue(multiBackgroundInitializer0.isStarted());
      assertTrue(multiBackgroundInitializer_MultiBackgroundInitializerResults0.isSuccessful());
      assertNotNull(multiBackgroundInitializer_MultiBackgroundInitializerResults0);
      
      // Undeclared exception!
      try { 
        multiBackgroundInitializer0.addInitializer("Cu6ejZ3iUC", (BackgroundInitializer<?>) null);
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
      assertFalse(multiBackgroundInitializer0.isStarted());
      assertNotNull(multiBackgroundInitializer0);
      
      boolean boolean0 = multiBackgroundInitializer0.start();
      assertTrue(multiBackgroundInitializer0.isStarted());
      assertTrue(boolean0);
      
      Callable<MultiBackgroundInitializer.MultiBackgroundInitializerResults> callable0 = (Callable<MultiBackgroundInitializer.MultiBackgroundInitializerResults>) mock(Callable.class, new ViolatedAssumptionAnswer());
      ForkJoinPool forkJoinPool0 = ForkJoinPool.commonPool();
      assertNotNull(forkJoinPool0);
      
      CallableBackgroundInitializer<MultiBackgroundInitializer.MultiBackgroundInitializerResults> callableBackgroundInitializer0 = new CallableBackgroundInitializer<MultiBackgroundInitializer.MultiBackgroundInitializerResults>(callable0, forkJoinPool0);
      assertFalse(callableBackgroundInitializer0.isStarted());
      assertNotNull(callableBackgroundInitializer0);
      
      // Undeclared exception!
      try { 
        multiBackgroundInitializer0.addInitializer("org.apache.commons.lang3.concurrent.MultiBackgroundInitializer$MultiBackgroundInitializerResults", callableBackgroundInitializer0);
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
      
      MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializer_MultiBackgroundInitializerResults0 = multiBackgroundInitializer0.initialize();
      assertFalse(multiBackgroundInitializer0.isStarted());
      assertTrue(multiBackgroundInitializer_MultiBackgroundInitializerResults0.isSuccessful());
      assertNotNull(multiBackgroundInitializer_MultiBackgroundInitializerResults0);
      
      boolean boolean0 = multiBackgroundInitializer_MultiBackgroundInitializerResults0.isSuccessful();
      assertFalse(multiBackgroundInitializer0.isStarted());
      assertTrue(multiBackgroundInitializer_MultiBackgroundInitializerResults0.isSuccessful());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      assertFalse(multiBackgroundInitializer0.isStarted());
      assertNotNull(multiBackgroundInitializer0);
      
      int int0 = multiBackgroundInitializer0.getTaskCount();
      assertFalse(multiBackgroundInitializer0.isStarted());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      assertFalse(multiBackgroundInitializer0.isStarted());
      assertNotNull(multiBackgroundInitializer0);
      
      Callable<String> callable0 = (Callable<String>) mock(Callable.class, new ViolatedAssumptionAnswer());
      CallableBackgroundInitializer<String> callableBackgroundInitializer0 = new CallableBackgroundInitializer<String>(callable0);
      assertFalse(callableBackgroundInitializer0.isStarted());
      assertNotNull(callableBackgroundInitializer0);
      
      // Undeclared exception!
      try { 
        multiBackgroundInitializer0.addInitializer((String) null, (BackgroundInitializer<?>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Name of child initializer must not be null!
         //
         verifyException("org.apache.commons.lang3.concurrent.MultiBackgroundInitializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      assertFalse(multiBackgroundInitializer0.isStarted());
      assertNotNull(multiBackgroundInitializer0);
      
      Callable<String> callable0 = (Callable<String>) mock(Callable.class, new ViolatedAssumptionAnswer());
      CallableBackgroundInitializer<String> callableBackgroundInitializer0 = new CallableBackgroundInitializer<String>(callable0);
      assertFalse(callableBackgroundInitializer0.isStarted());
      assertNotNull(callableBackgroundInitializer0);
      
      multiBackgroundInitializer0.addInitializer("Naming pattern must not be null!", callableBackgroundInitializer0);
      assertFalse(multiBackgroundInitializer0.isStarted());
      assertFalse(callableBackgroundInitializer0.isStarted());
      
      boolean boolean0 = multiBackgroundInitializer0.start();
      assertTrue(multiBackgroundInitializer0.isStarted());
      assertTrue(boolean0);
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
  public void test10()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      Callable<String> callable0 = (Callable<String>) mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn("Naming pattern must not be null!").when(callable0).call();
      CallableBackgroundInitializer<String> callableBackgroundInitializer0 = new CallableBackgroundInitializer<String>(callable0);
      ForkJoinPool forkJoinPool0 = new ForkJoinPool();
      callableBackgroundInitializer0.setExternalExecutor(forkJoinPool0);
      multiBackgroundInitializer0.addInitializer("Naming pattern must not be null!", callableBackgroundInitializer0);
      MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializer_MultiBackgroundInitializerResults0 = multiBackgroundInitializer0.initialize();
      boolean boolean0 = multiBackgroundInitializer_MultiBackgroundInitializerResults0.isSuccessful();
      assertTrue(boolean0);
      
      boolean boolean1 = multiBackgroundInitializer_MultiBackgroundInitializerResults0.isException("Naming pattern must not be null!");
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
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

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      Callable<String> callable0 = (Callable<String>) mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(callable0).call();
      CallableBackgroundInitializer<String> callableBackgroundInitializer0 = new CallableBackgroundInitializer<String>(callable0);
      multiBackgroundInitializer0.addInitializer("Naming pattern must not be null!", callableBackgroundInitializer0);
      MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializer_MultiBackgroundInitializerResults0 = multiBackgroundInitializer0.initialize();
      Set<String> set0 = multiBackgroundInitializer_MultiBackgroundInitializerResults0.initializerNames();
      assertTrue(set0.contains("Naming pattern must not be null!"));
      
      boolean boolean0 = multiBackgroundInitializer_MultiBackgroundInitializerResults0.isException("Naming pattern must not be null!");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializer_MultiBackgroundInitializerResults0 = multiBackgroundInitializer0.initialize();
      Set<String> set0 = multiBackgroundInitializer_MultiBackgroundInitializerResults0.initializerNames();
      assertTrue(set0.isEmpty());
  }
}
