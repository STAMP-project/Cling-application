/*

 * Tue Mar 03 14:07:14 GMT 2020
 */

package org.mockito.cglib.proxy;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Array;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.cglib.core.CodeGenerationException;
import org.mockito.cglib.core.DefaultGeneratorStrategy;
import org.mockito.cglib.core.DefaultNamingPolicy;
import org.mockito.cglib.core.GeneratorStrategy;
import org.mockito.cglib.core.NamingPolicy;
import org.mockito.cglib.proxy.Mixin;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Mixin$Generator_ESTest extends Mixin$Generator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      NamingPolicy namingPolicy0 = mixin_Generator0.getNamingPolicy();
      mixin_Generator0.setNamingPolicy(namingPolicy0);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Either classes or delegates must be set
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      mixin_Generator0.setStyle(0);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      mixin_Generator0.setClassLoader(classLoader0);
      ClassLoader classLoader1 = mixin_Generator0.getClassLoader();
      assertSame(classLoader1, classLoader0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.setAttemptLoad(true);
      mixin_Generator0.setUseCache(false);
      mixin_Generator0.create();
      // Undeclared exception!
      try { 
        mixin_Generator0.setStyle(3308);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mixin style: 3308
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.setAttemptLoad(true);
      mixin_Generator0.setStyle(2);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: CodeGenerationException");
      
      } catch(CodeGenerationException e) {
         //
         // java.lang.reflect.InvocationTargetException-->null
         //
         verifyException("org.mockito.cglib.core.AbstractClassGenerator", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.setAttemptLoad(true);
      mixin_Generator0.setUseCache(false);
      mixin_Generator0.create();
      mixin_Generator0.setStyle(2);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Specified classes are incompatible with delegates
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.create();
      ClassLoader classLoader0 = mixin_Generator0.getClassLoader();
      Mixin.createBean(classLoader0, objectArray0);
      mixin_Generator0.setStyle(2);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Specified classes are incompatible with delegates
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.setStyle(1);
      mixin_Generator0.create();
      ClassLoader classLoader0 = mixin_Generator0.getDefaultClassLoader();
      Mixin mixin0 = Mixin.createBean(classLoader0, objectArray0);
      Mixin mixin1 = mixin_Generator0.create();
      assertFalse(mixin1.equals((Object)mixin0));
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.setAttemptLoad(true);
      mixin_Generator0.setUseCache(false);
      mixin_Generator0.create();
      Mixin.Generator mixin_Generator1 = new Mixin.Generator();
      // Undeclared exception!
      try { 
        mixin_Generator1.create();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Either classes or delegates must be set
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.create();
      mixin_Generator0.setStyle(0);
      assertFalse(mixin_Generator0.getAttemptLoad());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      mixin_Generator0.setStyle(2);
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 7);
      DefaultNamingPolicy defaultNamingPolicy0 = new DefaultNamingPolicy();
      mixin_Generator0.setNamingPolicy(defaultNamingPolicy0);
      mixin_Generator0.setDelegates(classArray0);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.ReflectUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      NamingPolicy namingPolicy0 = mixin_Generator0.getNamingPolicy();
      mixin_Generator0.setNamingPolicy(namingPolicy0);
      mixin_Generator0.setStyle(0);
      assertTrue(mixin_Generator0.getUseCache());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) mixin_Generator0;
      objectArray0[1] = (Object) mixin_Generator0;
      mixin_Generator0.setUseCache(false);
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.create();
      mixin_Generator0.setStyle(1);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: CodeGenerationException");
      
      } catch(CodeGenerationException e) {
         //
         // java.beans.IntrospectionException-->java.lang.Object not superclass of org.mockito.cglib.core.ClassGenerator
         //
         verifyException("org.mockito.cglib.core.ReflectUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      mixin_Generator0.setDelegates(objectArray0);
      DefaultGeneratorStrategy defaultGeneratorStrategy0 = DefaultGeneratorStrategy.INSTANCE;
      mixin_Generator0.setStrategy(defaultGeneratorStrategy0);
      mixin_Generator0.setStyle(2);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.ReflectUtils", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      DefaultGeneratorStrategy defaultGeneratorStrategy0 = new DefaultGeneratorStrategy();
      mixin_Generator0.setStrategy(defaultGeneratorStrategy0);
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.create();
      mixin_Generator0.setStyle(2);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Specified classes are incompatible with delegates
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      DefaultGeneratorStrategy defaultGeneratorStrategy0 = DefaultGeneratorStrategy.INSTANCE;
      mixin_Generator0.setStrategy(defaultGeneratorStrategy0);
      mixin_Generator0.setStyle(1);
      Class<ByteArrayInputStream>[] classArray0 = (Class<ByteArrayInputStream>[]) Array.newInstance(Class.class, 0);
      mixin_Generator0.setClasses(classArray0);
      mixin_Generator0.setDelegates(classArray0);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.setUseCache(false);
      mixin_Generator0.create();
      Mixin.Generator mixin_Generator1 = new Mixin.Generator();
      // Undeclared exception!
      try { 
        mixin_Generator1.create();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Either classes or delegates must be set
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.create();
      ClassLoader classLoader0 = mixin_Generator0.getClassLoader();
      Mixin.createBean(classLoader0, objectArray0);
      // Undeclared exception!
      try { 
        mixin_Generator0.setStyle((-23));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mixin style: -23
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      mixin_Generator0.setClassLoader(classLoader0);
      mixin_Generator0.setStyle(1);
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 4);
      Class<Object> class0 = Object.class;
      classArray0[0] = class0;
      classArray0[1] = class0;
      classArray0[2] = class0;
      classArray0[3] = class0;
      mixin_Generator0.setClasses(classArray0);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: CodeGenerationException");
      
      } catch(CodeGenerationException e) {
         //
         // java.beans.IntrospectionException-->java.lang.Object not superclass of java.lang.Object
         //
         verifyException("org.mockito.cglib.core.ReflectUtils", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.setUseCache(false);
      mixin_Generator0.create();
      Mixin.Generator mixin_Generator1 = new Mixin.Generator();
      mixin_Generator1.setStyle(1);
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 1);
      mixin_Generator1.setClasses(classArray0);
      // Undeclared exception!
      try { 
        mixin_Generator1.create();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.ReflectUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      mixin_Generator0.setStyle(1);
      NamingPolicy namingPolicy0 = mixin_Generator0.getNamingPolicy();
      mixin_Generator0.setNamingPolicy(namingPolicy0);
      Class<ByteArrayInputStream>[] classArray0 = (Class<ByteArrayInputStream>[]) Array.newInstance(Class.class, 0);
      mixin_Generator0.setClasses(classArray0);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.setUseCache(false);
      mixin_Generator0.create();
      // Undeclared exception!
      try { 
        mixin_Generator0.setStyle(2536);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mixin style: 2536
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      mixin_Generator0.setStyle(2);
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 2);
      Class<Object> class0 = Object.class;
      classArray0[0] = class0;
      classArray0[1] = class0;
      mixin_Generator0.setClasses(classArray0);
      Mixin mixin0 = mixin_Generator0.create();
      assertEquals(2, Mixin.STYLE_EVERYTHING);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test22()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      mixin_Generator0.setStyle(2);
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 2);
      Class<Object> class0 = Object.class;
      classArray0[0] = class0;
      classArray0[1] = class0;
      mixin_Generator0.setClasses(classArray0);
      mixin_Generator0.setUseCache(false);
      mixin_Generator0.create();
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: CodeGenerationException");
      
      } catch(CodeGenerationException e) {
         //
         // java.lang.reflect.InvocationTargetException-->null
         //
         verifyException("org.mockito.cglib.core.AbstractClassGenerator", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test23()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.setUseCache(false);
      mixin_Generator0.create();
      mixin_Generator0.setStyle(0);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: CodeGenerationException");
      
      } catch(CodeGenerationException e) {
         //
         // java.lang.reflect.InvocationTargetException-->null
         //
         verifyException("org.mockito.cglib.core.AbstractClassGenerator", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test24()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) mixin_Generator0;
      objectArray0[1] = (Object) mixin_Generator0;
      mixin_Generator0.setUseCache(false);
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.setStyle(1);
      mixin_Generator0.create();
      assertFalse(mixin_Generator0.getUseCache());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test25()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      mixin_Generator0.setClassLoader(classLoader0);
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 4);
      Class<Object> class0 = Object.class;
      classArray0[0] = class0;
      classArray0[1] = class0;
      classArray0[2] = classArray0[1];
      classArray0[3] = class0;
      mixin_Generator0.setClasses(classArray0);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: CodeGenerationException");
      
      } catch(CodeGenerationException e) {
         //
         // java.lang.reflect.InvocationTargetException-->null
         //
         verifyException("org.mockito.cglib.core.AbstractClassGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      DefaultGeneratorStrategy defaultGeneratorStrategy0 = DefaultGeneratorStrategy.INSTANCE;
      mixin_Generator0.setStrategy(defaultGeneratorStrategy0);
      // Undeclared exception!
      try { 
        mixin_Generator0.setStyle(21);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mixin style: 21
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      GeneratorStrategy generatorStrategy0 = mixin_Generator0.getStrategy();
      mixin_Generator0.setStrategy(generatorStrategy0);
      mixin_Generator0.setStyle(0);
      assertTrue(mixin_Generator0.getUseCache());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test28()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.create();
      Mixin.Generator mixin_Generator1 = new Mixin.Generator();
      // Undeclared exception!
      try { 
        mixin_Generator1.create();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Either classes or delegates must be set
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      DefaultNamingPolicy defaultNamingPolicy0 = DefaultNamingPolicy.INSTANCE;
      mixin_Generator0.setNamingPolicy(defaultNamingPolicy0);
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 0);
      mixin_Generator0.setClasses(classArray0);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test30()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.create();
      ClassLoader classLoader0 = mixin_Generator0.getClassLoader();
      Mixin.createBean(classLoader0, objectArray0);
      Mixin.Generator mixin_Generator1 = new Mixin.Generator();
      // Undeclared exception!
      try { 
        mixin_Generator1.create();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Either classes or delegates must be set
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      GeneratorStrategy generatorStrategy0 = mixin_Generator0.getStrategy();
      mixin_Generator0.setStrategy(generatorStrategy0);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Either classes or delegates must be set
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      DefaultGeneratorStrategy defaultGeneratorStrategy0 = DefaultGeneratorStrategy.INSTANCE;
      mixin_Generator0.setStrategy(defaultGeneratorStrategy0);
      mixin_Generator0.setStyle(1);
      Class<ByteArrayInputStream>[] classArray0 = (Class<ByteArrayInputStream>[]) Array.newInstance(Class.class, 0);
      mixin_Generator0.setClasses(classArray0);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test33()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      NamingPolicy namingPolicy0 = mixin_Generator0.getNamingPolicy();
      mixin_Generator0.setNamingPolicy(namingPolicy0);
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.create();
      mixin_Generator0.setStyle(1);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Specified classes are incompatible with delegates
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test34()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) mixin_Generator0;
      DefaultNamingPolicy defaultNamingPolicy0 = new DefaultNamingPolicy();
      mixin_Generator0.setNamingPolicy(defaultNamingPolicy0);
      objectArray0[1] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.create();
      mixin_Generator0.setStyle(1);
      mixin_Generator0.create();
  }

  @Test(timeout = 4000)
  @Ignore
  public void test35()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      DefaultGeneratorStrategy defaultGeneratorStrategy0 = new DefaultGeneratorStrategy();
      mixin_Generator0.setStrategy(defaultGeneratorStrategy0);
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      Mixin mixin0 = mixin_Generator0.create();
      Mixin mixin1 = mixin_Generator0.create();
      assertFalse(mixin1.equals((Object)mixin0));
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      DefaultNamingPolicy defaultNamingPolicy0 = new DefaultNamingPolicy();
      mixin_Generator0.setNamingPolicy(defaultNamingPolicy0);
      // Undeclared exception!
      try { 
        mixin_Generator0.setStyle(6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mixin style: 6
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }
}
