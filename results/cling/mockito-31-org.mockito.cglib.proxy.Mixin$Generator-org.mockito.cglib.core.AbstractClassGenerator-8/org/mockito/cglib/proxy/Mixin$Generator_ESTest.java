/*

 * Tue Mar 03 14:06:38 GMT 2020
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
import org.mockito.asm.ClassVisitor;
import org.mockito.cglib.core.CodeGenerationException;
import org.mockito.cglib.core.DefaultGeneratorStrategy;
import org.mockito.cglib.core.DefaultNamingPolicy;
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
        mixin_Generator0.setStyle((-1397));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mixin style: -1397
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      DefaultNamingPolicy defaultNamingPolicy0 = DefaultNamingPolicy.INSTANCE;
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
  public void test02()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      mixin_Generator0.setStyle(0);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      mixin_Generator0.setClassLoader(classLoader0);
      // Undeclared exception!
      try { 
        mixin_Generator0.generateClass((ClassVisitor) null);
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
  public void test03()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setAttemptLoad(true);
      mixin_Generator0.setUseCache(false);
      mixin_Generator0.setDelegates(objectArray0);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.instrumentation.InstrumentedClass$$MixinByCGLIB$$9536fd96_61 cannot be cast to org.mockito.cglib.proxy.Mixin
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      mixin_Generator0.setStyle(2);
      Object[] objectArray0 = new Object[1];
      Object object0 = new Object();
      objectArray0[0] = object0;
      mixin_Generator0.setDelegates(objectArray0);
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
  public void test05()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.instrumentation.InstrumentedClass$$MixinByCGLIB$$9536fd96_32 cannot be cast to org.mockito.cglib.proxy.Mixin
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 1);
      Class<Object> class0 = Object.class;
      classArray0[0] = class0;
      mixin_Generator0.setClasses(classArray0);
      mixin_Generator0.setStyle(2);
      ClassLoader classLoader0 = mixin_Generator0.getClassLoader();
      Mixin.createBean(classLoader0, (Object[]) classArray0);
      mixin_Generator0.setDelegates(classArray0);
      mixin_Generator0.create();
      assertTrue(mixin_Generator0.getUseCache());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.setUseCache(false);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.instrumentation.InstrumentedClass$$MixinByCGLIB$$9536fd96_62 cannot be cast to org.mockito.cglib.proxy.Mixin
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 7);
      mixin_Generator0.setClasses(classArray0);
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
  public void test09()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.setUseCache(false);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.instrumentation.InstrumentedClass$$MixinByCGLIB$$9536fd96_63 cannot be cast to org.mockito.cglib.proxy.Mixin
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      mixin_Generator0.setUseCache(false);
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 1);
      Class<Object> class0 = Object.class;
      classArray0[0] = class0;
      mixin_Generator0.setClasses(classArray0);
      mixin_Generator0.setStyle(2);
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
  public void test11()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) mixin_Generator0;
      objectArray0[1] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.instrumentation.InstrumentedClass$$MixinByCGLIB$$9536fd96_32 cannot be cast to org.mockito.cglib.proxy.Mixin
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      mixin_Generator0.setClassLoader(classLoader0);
      mixin_Generator0.getClassLoader();
      // Undeclared exception!
      try { 
        mixin_Generator0.setStyle((-1851));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mixin style: -1851
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 1);
      Class<Object> class0 = Object.class;
      classArray0[0] = class0;
      mixin_Generator0.setClasses(classArray0);
      mixin_Generator0.setStyle(2);
      ClassLoader classLoader0 = mixin_Generator0.getClassLoader();
      Mixin.createBean(classLoader0, (Object[]) classArray0);
      mixin_Generator0.create();
      assertTrue(mixin_Generator0.getUseCache());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 1);
      Class<Object> class0 = Object.class;
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
  @Ignore
  public void test15()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 12);
      DefaultNamingPolicy defaultNamingPolicy0 = new DefaultNamingPolicy();
      mixin_Generator0.setNamingPolicy(defaultNamingPolicy0);
      mixin_Generator0.setClasses(classArray0);
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
  public void test16()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.setUseCache(false);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.instrumentation.InstrumentedClass$$MixinByCGLIB$$9536fd96_64 cannot be cast to org.mockito.cglib.proxy.Mixin
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      Mixin.createBean(objectArray0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.setUseCache(false);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.instrumentation.InstrumentedClass$$MixinByCGLIB$$9536fd96_65 cannot be cast to org.mockito.cglib.proxy.Mixin
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.instrumentation.InstrumentedClass$$MixinByCGLIB$$9536fd96_32 cannot be cast to org.mockito.cglib.proxy.Mixin
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      DefaultNamingPolicy defaultNamingPolicy0 = DefaultNamingPolicy.INSTANCE;
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
  public void test21()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      DefaultGeneratorStrategy defaultGeneratorStrategy0 = DefaultGeneratorStrategy.INSTANCE;
      mixin_Generator0.setStrategy(defaultGeneratorStrategy0);
      // Undeclared exception!
      try { 
        mixin_Generator0.setStyle((-3722));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mixin style: -3722
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      DefaultGeneratorStrategy defaultGeneratorStrategy0 = DefaultGeneratorStrategy.INSTANCE;
      mixin_Generator0.setStrategy(defaultGeneratorStrategy0);
      mixin_Generator0.setStyle(0);
      assertTrue(mixin_Generator0.getUseCache());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test23()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      DefaultNamingPolicy defaultNamingPolicy0 = new DefaultNamingPolicy();
      mixin_Generator0.setNamingPolicy(defaultNamingPolicy0);
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 6);
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
  public void test24()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      DefaultGeneratorStrategy defaultGeneratorStrategy0 = DefaultGeneratorStrategy.INSTANCE;
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
  public void test25()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      mixin_Generator0.setDelegates(objectArray0);
      DefaultGeneratorStrategy defaultGeneratorStrategy0 = DefaultGeneratorStrategy.INSTANCE;
      mixin_Generator0.setStrategy(defaultGeneratorStrategy0);
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
  public void test26()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) mixin_Generator0;
      DefaultNamingPolicy defaultNamingPolicy0 = DefaultNamingPolicy.INSTANCE;
      mixin_Generator0.setNamingPolicy(defaultNamingPolicy0);
      objectArray0[1] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.instrumentation.InstrumentedClass$$MixinByCGLIB$$9536fd96_32 cannot be cast to org.mockito.cglib.proxy.Mixin
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      DefaultNamingPolicy defaultNamingPolicy0 = DefaultNamingPolicy.INSTANCE;
      mixin_Generator0.setNamingPolicy(defaultNamingPolicy0);
      mixin_Generator0.setStyle(0);
      assertTrue(mixin_Generator0.getUseCache());
  }
}
