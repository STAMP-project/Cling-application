/*

 * Tue Mar 03 14:01:56 GMT 2020
 */

package org.mockito.cglib.proxy;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PipedInputStream;
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
      NamingPolicy namingPolicy0 = mixin_Generator0.getNamingPolicy();
      mixin_Generator0.setNamingPolicy(namingPolicy0);
      // Undeclared exception!
      try { 
        mixin_Generator0.setStyle(1941);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mixin style: 1941
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      mixin_Generator0.setClassLoader(classLoader0);
      mixin_Generator0.setStyle(2);
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 3);
      Class<Object> class0 = Object.class;
      classArray0[0] = class0;
      classArray0[1] = classArray0[0];
      classArray0[2] = class0;
      mixin_Generator0.setClasses(classArray0);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // $java.lang.Object$$MixinByCGLIB$$1b198540_3 cannot be cast to org.mockito.cglib.proxy.Mixin
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      mixin_Generator0.setUseCache(false);
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) mixin_Generator0;
      objectArray0[1] = (Object) mixin_Generator0;
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
      ClassWriter classWriter0 = new ClassWriter(0);
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
      mixin_Generator0.setUseCache(false);
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.create();
      ClassWriter classWriter0 = new ClassWriter(1);
      mixin_Generator0.generateClass(classWriter0);
      // Undeclared exception!
      try { 
        mixin_Generator0.setStyle((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mixin style: -1
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      mixin_Generator0.setUseCache(false);
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.create();
      ClassWriter classWriter0 = new ClassWriter(142);
      mixin_Generator0.generateClass(classWriter0);
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
  public void test07()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      mixin_Generator0.setUseCache(false);
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.create();
      ClassWriter classWriter0 = new ClassWriter(0);
      mixin_Generator0.generateClass(classWriter0);
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
      GeneratorStrategy generatorStrategy0 = mixin_Generator0.getStrategy();
      mixin_Generator0.setStrategy(generatorStrategy0);
      mixin_Generator0.setStyle(2);
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
  public void test10()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      DefaultNamingPolicy defaultNamingPolicy0 = new DefaultNamingPolicy();
      mixin_Generator0.setNamingPolicy(defaultNamingPolicy0);
      mixin_Generator0.setStyle(0);
      assertFalse(mixin_Generator0.getAttemptLoad());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) mixin_Generator0;
      objectArray0[1] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.setAttemptLoad(true);
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
  @Ignore
  public void test12()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      mixin_Generator0.setStyle(2);
      mixin_Generator0.setAttemptLoad(true);
      Class<Mixin>[] classArray0 = (Class<Mixin>[]) Array.newInstance(Class.class, 1);
      Class<Mixin> class0 = Mixin.class;
      classArray0[0] = class0;
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
  @Ignore
  public void test13()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      DefaultGeneratorStrategy defaultGeneratorStrategy0 = DefaultGeneratorStrategy.INSTANCE;
      mixin_Generator0.setStrategy(defaultGeneratorStrategy0);
      objectArray0[0] = (Object) mixin_Generator0;
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
  public void test14()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) mixin_Generator0;
      objectArray0[1] = (Object) mixin_Generator0;
      DefaultGeneratorStrategy defaultGeneratorStrategy0 = new DefaultGeneratorStrategy();
      mixin_Generator0.setStrategy(defaultGeneratorStrategy0);
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.create();
      mixin_Generator0.setStyle(2);
      Mixin mixin0 = mixin_Generator0.create();
      assertEquals(2, Mixin.STYLE_EVERYTHING);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.create();
      ClassLoader classLoader0 = mixin_Generator0.getClassLoader();
      Mixin.createBean(classLoader0, objectArray0);
      // Undeclared exception!
      try { 
        mixin_Generator0.setStyle(3374);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mixin style: 3374
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      mixin_Generator0.setStyle(1);
      Class<Object> class0 = Object.class;
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 1);
      classArray0[0] = class0;
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
  public void test17()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      DefaultNamingPolicy defaultNamingPolicy0 = DefaultNamingPolicy.INSTANCE;
      mixin_Generator0.setNamingPolicy(defaultNamingPolicy0);
      mixin_Generator0.setStyle(2);
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 3);
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
  public void test18()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      mixin_Generator0.setUseCache(false);
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.create();
      Mixin.createBean(objectArray0);
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
      mixin_Generator0.setUseCache(false);
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
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
  public void test20()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.create();
      ClassLoader classLoader0 = mixin_Generator0.getDefaultClassLoader();
      mixin_Generator0.setClassLoader(classLoader0);
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
  public void test21()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      mixin_Generator0.setStyle(2);
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 3);
      Class<Object> class0 = Object.class;
      classArray0[0] = class0;
      classArray0[1] = class0;
      classArray0[2] = classArray0[0];
      mixin_Generator0.setUseCache(false);
      mixin_Generator0.setClasses(classArray0);
      mixin_Generator0.create();
      assertFalse(mixin_Generator0.getUseCache());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[9];
      DefaultNamingPolicy defaultNamingPolicy0 = new DefaultNamingPolicy();
      mixin_Generator0.setNamingPolicy(defaultNamingPolicy0);
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
  public void test23()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      GeneratorStrategy generatorStrategy0 = mixin_Generator0.getStrategy();
      mixin_Generator0.setStrategy(generatorStrategy0);
      // Undeclared exception!
      try { 
        mixin_Generator0.setStyle(1890);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mixin style: 1890
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      DefaultGeneratorStrategy defaultGeneratorStrategy0 = new DefaultGeneratorStrategy();
      mixin_Generator0.setStrategy(defaultGeneratorStrategy0);
      mixin_Generator0.setStyle(0);
      assertTrue(mixin_Generator0.getUseCache());
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
      mixin_Generator0.setClassLoader(classLoader0);
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
  public void test26()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      NamingPolicy namingPolicy0 = mixin_Generator0.getNamingPolicy();
      mixin_Generator0.setNamingPolicy(namingPolicy0);
      Class<PipedInputStream>[] classArray0 = (Class<PipedInputStream>[]) Array.newInstance(Class.class, 6);
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
  public void test27()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) mixin_Generator0;
      objectArray0[1] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.create();
      ClassLoader classLoader0 = mixin_Generator0.getDefaultClassLoader();
      mixin_Generator0.setClassLoader(classLoader0);
      mixin_Generator0.setStyle(2);
      mixin_Generator0.create();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
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
  public void test29()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      DefaultGeneratorStrategy defaultGeneratorStrategy0 = DefaultGeneratorStrategy.INSTANCE;
      mixin_Generator0.setStrategy(defaultGeneratorStrategy0);
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.setStyle(1);
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
  public void test30()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.create();
      mixin_Generator0.setStyle(2);
      DefaultNamingPolicy defaultNamingPolicy0 = new DefaultNamingPolicy();
      mixin_Generator0.setNamingPolicy(defaultNamingPolicy0);
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
  public void test31()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) mixin_Generator0;
      objectArray0[1] = (Object) mixin_Generator0;
      DefaultGeneratorStrategy defaultGeneratorStrategy0 = new DefaultGeneratorStrategy();
      mixin_Generator0.setStrategy(defaultGeneratorStrategy0);
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.create();
      Mixin mixin0 = mixin_Generator0.create();
      assertEquals(2, Mixin.STYLE_EVERYTHING);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test32()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      DefaultNamingPolicy defaultNamingPolicy0 = DefaultNamingPolicy.INSTANCE;
      mixin_Generator0.setNamingPolicy(defaultNamingPolicy0);
      Object[] objectArray0 = new Object[2];
      objectArray0[1] = (Object) mixin_Generator0;
      objectArray0[0] = (Object) mixin_Generator0;
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
}
