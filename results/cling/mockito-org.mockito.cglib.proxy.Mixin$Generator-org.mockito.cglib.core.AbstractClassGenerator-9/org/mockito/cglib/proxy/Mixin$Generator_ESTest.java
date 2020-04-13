/*

 * Tue Mar 03 14:06:45 GMT 2020
 */

package org.mockito.cglib.proxy;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.ClassWriter;
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
      DefaultNamingPolicy defaultNamingPolicy0 = new DefaultNamingPolicy();
      mixin_Generator0.setNamingPolicy(defaultNamingPolicy0);
      // Undeclared exception!
      try { 
        mixin_Generator0.setStyle(164);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mixin style: 164
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 1);
      Class<Object> class0 = Object.class;
      classArray0[0] = class0;
      mixin_Generator0.setClasses(classArray0);
      ClassLoader classLoader0 = mixin_Generator0.getClassLoader();
      mixin_Generator0.setClassLoader(classLoader0);
      mixin_Generator0.setStyle(1);
      Mixin mixin0 = mixin_Generator0.create();
      assertEquals(0, Mixin.STYLE_INTERFACES);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.create();
      ClassLoader classLoader0 = mixin_Generator0.getDefaultClassLoader();
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
  public void test03()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      DefaultNamingPolicy defaultNamingPolicy0 = new DefaultNamingPolicy();
      mixin_Generator0.setNamingPolicy(defaultNamingPolicy0);
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
  @Ignore
  public void test04()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      mixin_Generator0.setClassLoader(classLoader0);
      mixin_Generator0.setStyle(0);
      ClassWriter classWriter0 = new ClassWriter(42);
      // Undeclared exception!
      try { 
        mixin_Generator0.generateClass(classWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.DefaultNamingPolicy", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      mixin_Generator0.setAttemptLoad(true);
      mixin_Generator0.setUseCache(false);
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.create();
      // Undeclared exception!
      try { 
        mixin_Generator0.setStyle(111);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mixin style: 111
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      mixin_Generator0.setStyle(1);
      mixin_Generator0.setUseCache(false);
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) mixin_Generator0;
      objectArray0[1] = (Object) mixin_Generator0;
      objectArray0[2] = (Object) mixin_Generator0;
      objectArray0[3] = (Object) mixin_Generator0;
      objectArray0[4] = (Object) mixin_Generator0;
      objectArray0[5] = (Object) mixin_Generator0;
      objectArray0[6] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
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
  public void test07()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.create();
      ClassLoader classLoader0 = mixin_Generator0.getDefaultClassLoader();
      Mixin.createBean(classLoader0, objectArray0);
      mixin_Generator0.setStyle(1);
      mixin_Generator0.setClasses((Class[]) null);
      Mixin mixin0 = mixin_Generator0.create();
      Mixin mixin1 = mixin_Generator0.create();
      assertNotSame(mixin1, mixin0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      Mixin.createBean(objectArray0);
      mixin_Generator0.setStyle(0);
      assertFalse(mixin_Generator0.getAttemptLoad());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      DefaultGeneratorStrategy defaultGeneratorStrategy0 = new DefaultGeneratorStrategy();
      mixin_Generator0.setStrategy(defaultGeneratorStrategy0);
      mixin_Generator0.setStyle(1);
      Class<Mixin>[] classArray0 = (Class<Mixin>[]) Array.newInstance(Class.class, 0);
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
  public void test10()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      mixin_Generator0.setStyle(1);
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 1);
      Class<String> class0 = String.class;
      classArray0[0] = class0;
      mixin_Generator0.setClasses(classArray0);
      Mixin mixin0 = mixin_Generator0.create();
      assertEquals(2, Mixin.STYLE_EVERYTHING);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      DefaultNamingPolicy defaultNamingPolicy0 = new DefaultNamingPolicy();
      mixin_Generator0.setNamingPolicy(defaultNamingPolicy0);
      mixin_Generator0.setStyle(0);
      assertTrue(mixin_Generator0.getUseCache());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 1);
      Class<Object> class0 = Object.class;
      classArray0[0] = class0;
      mixin_Generator0.setClasses(classArray0);
      mixin_Generator0.setAttemptLoad(true);
      mixin_Generator0.setStyle(1);
      mixin_Generator0.create();
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.create();
      GeneratorStrategy generatorStrategy0 = mixin_Generator0.getStrategy();
      mixin_Generator0.setStrategy(generatorStrategy0);
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
      mixin_Generator0.setStyle(1);
      Class<Mixin>[] classArray0 = (Class<Mixin>[]) Array.newInstance(Class.class, 0);
      mixin_Generator0.setClasses(classArray0);
      GeneratorStrategy generatorStrategy0 = mixin_Generator0.getStrategy();
      mixin_Generator0.setStrategy(generatorStrategy0);
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
      mixin_Generator0.create();
      ClassLoader classLoader0 = mixin_Generator0.getDefaultClassLoader();
      Mixin.createBean(classLoader0, objectArray0);
      // Undeclared exception!
      try { 
        mixin_Generator0.setStyle(73);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mixin style: 73
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      DefaultNamingPolicy defaultNamingPolicy0 = DefaultNamingPolicy.INSTANCE;
      mixin_Generator0.setNamingPolicy(defaultNamingPolicy0);
      mixin_Generator0.setStyle(1);
      Class<Mixin>[] classArray0 = (Class<Mixin>[]) Array.newInstance(Class.class, 0);
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
  public void test17()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      mixin_Generator0.setUseCache(false);
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.create();
      // Undeclared exception!
      try { 
        mixin_Generator0.setStyle(111);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mixin style: 111
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setUseCache(false);
      mixin_Generator0.setDelegates(objectArray0);
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
  public void test19()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.create();
      ClassLoader classLoader0 = mixin_Generator0.getDefaultClassLoader();
      Mixin.createBean(classLoader0, objectArray0);
      // Undeclared exception!
      try { 
        Mixin.createBean((Object[]) null);
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
  public void test20()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 1);
      Class<Object> class0 = Object.class;
      mixin_Generator0.setUseCache(false);
      classArray0[0] = class0;
      mixin_Generator0.setClasses(classArray0);
      mixin_Generator0.setStyle(1);
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
  public void test21()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      DefaultNamingPolicy defaultNamingPolicy0 = DefaultNamingPolicy.INSTANCE;
      mixin_Generator0.setNamingPolicy(defaultNamingPolicy0);
      Object[] objectArray0 = new Object[1];
      // Undeclared exception!
      try { 
        Mixin.createBean(objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.ReflectUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      DefaultGeneratorStrategy defaultGeneratorStrategy0 = new DefaultGeneratorStrategy();
      mixin_Generator0.setStrategy(defaultGeneratorStrategy0);
      // Undeclared exception!
      try { 
        mixin_Generator0.setStyle((-1362));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mixin style: -1362
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      GeneratorStrategy generatorStrategy0 = mixin_Generator0.getStrategy();
      mixin_Generator0.setStrategy(generatorStrategy0);
      mixin_Generator0.setStyle(0);
      assertFalse(mixin_Generator0.getAttemptLoad());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test24()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      NamingPolicy namingPolicy0 = mixin_Generator0.getNamingPolicy();
      mixin_Generator0.setNamingPolicy(namingPolicy0);
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 13);
      mixin_Generator0.setClasses(classArray0);
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
  public void test25()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.create();
      ClassLoader classLoader0 = mixin_Generator0.getDefaultClassLoader();
      Mixin.createBean(classLoader0, objectArray0);
      Mixin mixin0 = mixin_Generator0.create();
      assertEquals(1, Mixin.STYLE_BEANS);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      DefaultGeneratorStrategy defaultGeneratorStrategy0 = new DefaultGeneratorStrategy();
      mixin_Generator0.setStrategy(defaultGeneratorStrategy0);
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
  @Ignore
  public void test27()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      Mixin.createBean(objectArray0);
      GeneratorStrategy generatorStrategy0 = mixin_Generator0.getStrategy();
      mixin_Generator0.setStrategy(generatorStrategy0);
      assertFalse(mixin_Generator0.getAttemptLoad());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test28()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      NamingPolicy namingPolicy0 = mixin_Generator0.getNamingPolicy();
      mixin_Generator0.setNamingPolicy(namingPolicy0);
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
  @Ignore
  public void test29()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      Mixin mixin0 = mixin_Generator0.create();
      GeneratorStrategy generatorStrategy0 = mixin_Generator0.getStrategy();
      mixin_Generator0.setStrategy(generatorStrategy0);
      Mixin mixin1 = mixin_Generator0.create();
      assertNotSame(mixin1, mixin0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      NamingPolicy namingPolicy0 = mixin_Generator0.getNamingPolicy();
      mixin_Generator0.setNamingPolicy(namingPolicy0);
      mixin_Generator0.setStyle(1);
      Class<Mixin>[] classArray0 = (Class<Mixin>[]) Array.newInstance(Class.class, 0);
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
}
