/*

 * Tue Mar 03 14:42:38 GMT 2020
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
import org.mockito.cglib.core.CodeGenerationException;
import org.mockito.cglib.proxy.Mixin;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Mixin$Generator_ESTest extends Mixin$Generator_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) mixin_Generator0;
      objectArray0[1] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      Mixin mixin0 = mixin_Generator0.create();
      mixin_Generator0.setUseCache(false);
      Mixin mixin1 = mixin_Generator0.create();
      mixin_Generator0.setStyle(1);
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 2);
      Class<Integer> class0 = Integer.class;
      classArray0[0] = class0;
      Class<String> class1 = String.class;
      mixin_Generator0.setClasses(classArray0);
      Object[] objectArray1 = new Object[9];
      objectArray1[0] = (Object) class0;
      objectArray1[1] = (Object) mixin1;
      objectArray1[2] = (Object) class1;
      objectArray1[3] = (Object) mixin_Generator0;
      objectArray1[4] = (Object) class0;
      objectArray1[5] = (Object) mixin_Generator0;
      objectArray1[6] = (Object) mixin_Generator0;
      objectArray1[7] = (Object) mixin_Generator0;
      objectArray1[8] = (Object) mixin0;
      Mixin.createBean(objectArray1);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Specified class class java.lang.Integer is incompatible with delegate class class org.mockito.cglib.proxy.Mixin$Generator (index 0)
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
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

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) mixin_Generator0;
      objectArray0[1] = (Object) mixin_Generator0;
      Object object0 = new Object();
      objectArray0[2] = object0;
      objectArray0[3] = (Object) classLoader0;
      objectArray0[4] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
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
}
