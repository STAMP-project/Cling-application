/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 12:46:10 GMT 2019
 */

package org.mockito.cglib.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.cglib.core.AbstractClassGenerator;
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
        keyFactory_Generator0.create();
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
      keyFactory_Generator0.setStrategy((GeneratorStrategy) null);
      assertTrue(keyFactory_Generator0.getUseCache());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      KeyFactory.Generator keyFactory_Generator0 = new KeyFactory.Generator();
      keyFactory_Generator0.setNamingPolicy((NamingPolicy) null);
      assertTrue(keyFactory_Generator0.getUseCache());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      KeyFactory.Generator keyFactory_Generator0 = new KeyFactory.Generator();
      Class<Object> class0 = Object.class;
      keyFactory_Generator0.setInterface(class0);
      keyFactory_Generator0.getClassName();
      String string0 = keyFactory_Generator0.getClassName();
      assertTrue(keyFactory_Generator0.getUseCache());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AbstractClassGenerator.Source abstractClassGenerator_Source0 = new AbstractClassGenerator.Source("v2RaRef3TVQI1i@");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      KeyFactory.Generator keyFactory_Generator0 = new KeyFactory.Generator();
      GeneratorStrategy generatorStrategy0 = keyFactory_Generator0.getStrategy();
      keyFactory_Generator0.setStrategy(generatorStrategy0);
      assertTrue(keyFactory_Generator0.getUseCache());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      KeyFactory.Generator keyFactory_Generator0 = new KeyFactory.Generator();
      keyFactory_Generator0.setUseCache(false);
      Class<String> class0 = String.class;
      keyFactory_Generator0.setInterface(class0);
      // Undeclared exception!
      try { 
        keyFactory_Generator0.create();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // class java.lang.String is not an interface
         //
         verifyException("org.mockito.cglib.core.ReflectUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      KeyFactory.Generator keyFactory_Generator0 = new KeyFactory.Generator();
      boolean boolean0 = keyFactory_Generator0.getUseCache();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      KeyFactory.Generator keyFactory_Generator0 = new KeyFactory.Generator();
      keyFactory_Generator0.getAttemptLoad();
      assertTrue(keyFactory_Generator0.getUseCache());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      KeyFactory.Generator keyFactory_Generator0 = new KeyFactory.Generator();
      keyFactory_Generator0.setAttemptLoad(true);
      Class<String> class0 = String.class;
      keyFactory_Generator0.setInterface(class0);
      // Undeclared exception!
      try { 
        keyFactory_Generator0.create();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // class java.lang.String is not an interface
         //
         verifyException("org.mockito.cglib.core.ReflectUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      KeyFactory.Generator keyFactory_Generator0 = new KeyFactory.Generator();
      NamingPolicy namingPolicy0 = keyFactory_Generator0.getNamingPolicy();
      keyFactory_Generator0.setNamingPolicy(namingPolicy0);
      assertTrue(keyFactory_Generator0.getUseCache());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AbstractClassGenerator abstractClassGenerator0 = AbstractClassGenerator.getCurrent();
      assertNull(abstractClassGenerator0);
  }
}
