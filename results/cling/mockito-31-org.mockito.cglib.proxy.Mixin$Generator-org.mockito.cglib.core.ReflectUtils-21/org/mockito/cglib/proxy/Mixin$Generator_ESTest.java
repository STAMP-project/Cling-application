/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 09:57:16 GMT 2019
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
import org.mockito.cglib.proxy.Mixin;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Mixin$Generator_ESTest extends Mixin$Generator_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 1);
      Class<Integer> class0 = Integer.class;
      classArray0[0] = class0;
      mixin_Generator0.setClasses(classArray0);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassLoader classLoader1 = mixin_Generator0.getClassLoader();
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) class0;
      objectArray0[1] = (Object) class0;
      objectArray0[2] = (Object) class0;
      objectArray0[3] = (Object) classLoader0;
      objectArray0[4] = (Object) classLoader0;
      objectArray0[5] = (Object) classLoader0;
      Mixin.createBean(classLoader1, objectArray0);
      mixin_Generator0.create();
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 1);
      Class<Integer> class0 = Integer.class;
      classArray0[0] = class0;
      mixin_Generator0.setClasses(classArray0);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) class0;
      objectArray0[1] = (Object) class0;
      objectArray0[2] = (Object) class0;
      objectArray0[3] = (Object) classLoader0;
      objectArray0[4] = (Object) classLoader0;
      objectArray0[5] = (Object) classLoader0;
      // Undeclared exception!
      try { 
        Mixin.createBean(classLoader0, objectArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // sun.misc.Launcher$AppClassLoader$$MixinByCGLIB$$591d8fcc_3 cannot be cast to org.mockito.cglib.proxy.Mixin
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 1);
      Class<Integer> class0 = Integer.class;
      classArray0[0] = class0;
      mixin_Generator0.setDelegates(classArray0);
      mixin_Generator0.create();
      mixin_Generator0.setClasses(classArray0);
      mixin_Generator0.setStyle(2);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Specified class class java.lang.Integer is incompatible with delegate class class java.lang.Class (index 0)
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test3()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) mixin_Generator0;
      objectArray0[1] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.create();
      mixin_Generator0.setStyle(2);
      mixin_Generator0.create();
      mixin_Generator0.setClasses((Class[]) null);
      mixin_Generator0.create();
  }
}
