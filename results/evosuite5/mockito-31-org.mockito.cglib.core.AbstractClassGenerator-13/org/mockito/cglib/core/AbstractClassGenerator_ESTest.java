/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 12:51:57 GMT 2019
 */

package org.mockito.cglib.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.cglib.core.AbstractClassGenerator;
import org.mockito.cglib.core.DefaultGeneratorStrategy;
import org.mockito.cglib.core.DefaultNamingPolicy;
import org.mockito.cglib.core.GeneratorStrategy;
import org.mockito.cglib.core.KeyFactory;
import org.mockito.cglib.core.NamingPolicy;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AbstractClassGenerator_ESTest extends AbstractClassGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      KeyFactory.Generator keyFactory_Generator0 = new KeyFactory.Generator();
      Class<Object> class0 = Object.class;
      keyFactory_Generator0.setInterface(class0);
      // Undeclared exception!
      try { 
        keyFactory_Generator0.create((Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // class java.lang.Object is not an interface
         //
         verifyException("org.mockito.cglib.core.ReflectUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      KeyFactory.Generator keyFactory_Generator0 = new KeyFactory.Generator();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      keyFactory_Generator0.setClassLoader(classLoader0);
      // Undeclared exception!
      try { 
        keyFactory_Generator0.create(classLoader0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.ReflectUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      KeyFactory.Generator keyFactory_Generator0 = new KeyFactory.Generator();
      // Undeclared exception!
      try { 
        keyFactory_Generator0.getClassName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.KeyFactory$Generator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      KeyFactory.Generator keyFactory_Generator0 = new KeyFactory.Generator();
      keyFactory_Generator0.setStrategy((GeneratorStrategy) null);
      assertTrue(keyFactory_Generator0.getUseCache());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      KeyFactory.Generator keyFactory_Generator0 = new KeyFactory.Generator();
      DefaultGeneratorStrategy defaultGeneratorStrategy0 = new DefaultGeneratorStrategy();
      keyFactory_Generator0.setStrategy(defaultGeneratorStrategy0);
      assertTrue(keyFactory_Generator0.getUseCache());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      KeyFactory.Generator keyFactory_Generator0 = new KeyFactory.Generator();
      keyFactory_Generator0.setNamingPolicy((NamingPolicy) null);
      assertTrue(keyFactory_Generator0.getUseCache());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      KeyFactory.Generator keyFactory_Generator0 = new KeyFactory.Generator();
      DefaultNamingPolicy defaultNamingPolicy0 = new DefaultNamingPolicy();
      keyFactory_Generator0.setNamingPolicy(defaultNamingPolicy0);
      assertTrue(keyFactory_Generator0.getUseCache());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      KeyFactory.Generator keyFactory_Generator0 = new KeyFactory.Generator();
      keyFactory_Generator0.getStrategy();
      assertTrue(keyFactory_Generator0.getUseCache());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      KeyFactory.Generator keyFactory_Generator0 = new KeyFactory.Generator();
      keyFactory_Generator0.setUseCache(false);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      keyFactory_Generator0.setClassLoader(classLoader0);
      // Undeclared exception!
      try { 
        keyFactory_Generator0.create(classLoader0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.ReflectUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      KeyFactory.Generator keyFactory_Generator0 = new KeyFactory.Generator();
      boolean boolean0 = keyFactory_Generator0.getUseCache();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      KeyFactory.Generator keyFactory_Generator0 = new KeyFactory.Generator();
      keyFactory_Generator0.getAttemptLoad();
      assertTrue(keyFactory_Generator0.getUseCache());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      KeyFactory.Generator keyFactory_Generator0 = new KeyFactory.Generator();
      keyFactory_Generator0.setAttemptLoad(true);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      keyFactory_Generator0.setClassLoader(classLoader0);
      // Undeclared exception!
      try { 
        keyFactory_Generator0.create(classLoader0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.ReflectUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      KeyFactory.Generator keyFactory_Generator0 = new KeyFactory.Generator();
      keyFactory_Generator0.getNamingPolicy();
      assertTrue(keyFactory_Generator0.getUseCache());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AbstractClassGenerator abstractClassGenerator0 = AbstractClassGenerator.getCurrent();
      assertNull(abstractClassGenerator0);
  }
}
