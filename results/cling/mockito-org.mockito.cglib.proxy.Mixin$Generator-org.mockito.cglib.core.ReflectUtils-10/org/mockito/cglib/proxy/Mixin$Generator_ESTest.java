/*

 * Tue Mar 03 14:41:21 GMT 2020
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
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      Class<Integer> class0 = Integer.class;
      Mixin.Generator mixin_Generator1 = new Mixin.Generator();
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 7);
      classArray0[0] = class0;
      classArray0[1] = class0;
      classArray0[2] = class0;
      classArray0[3] = class0;
      classArray0[4] = class0;
      classArray0[5] = class0;
      classArray0[6] = class0;
      mixin_Generator1.setClasses(classArray0);
      mixin_Generator0.setStyle(1);
      mixin_Generator0.create();
      mixin_Generator0.create();
      // Undeclared exception!
      try { 
        mixin_Generator1.create();
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
  public void test1()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Class<Mixin>[] classArray0 = (Class<Mixin>[]) Array.newInstance(Class.class, 1);
      Class<Mixin> class0 = Mixin.class;
      classArray0[0] = class0;
      mixin_Generator0.setClasses(classArray0);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) class0;
      objectArray0[1] = (Object) mixin_Generator0;
      objectArray0[2] = (Object) classLoader0;
      objectArray0[3] = (Object) classLoader0;
      Mixin.createBean(objectArray0);
      mixin_Generator0.create();
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Class<Mixin>[] classArray0 = (Class<Mixin>[]) Array.newInstance(Class.class, 1);
      Class<Mixin> class0 = Mixin.class;
      classArray0[0] = class0;
      mixin_Generator0.setDelegates(classArray0);
      mixin_Generator0.setClasses(classArray0);
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) class0;
      objectArray0[1] = (Object) mixin_Generator0;
      objectArray0[2] = (Object) class0;
      objectArray0[3] = (Object) class0;
      objectArray0[4] = (Object) mixin_Generator0;
      objectArray0[5] = (Object) class0;
      objectArray0[6] = (Object) class0;
      objectArray0[7] = (Object) class0;
      objectArray0[8] = (Object) mixin_Generator0;
      Mixin.createBean(objectArray0);
      mixin_Generator0.setStyle(1);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Specified class class org.mockito.cglib.proxy.Mixin is incompatible with delegate class class java.lang.Class (index 0)
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
      mixin_Generator0.setStyle(2);
      mixin_Generator0.create();
  }
}
