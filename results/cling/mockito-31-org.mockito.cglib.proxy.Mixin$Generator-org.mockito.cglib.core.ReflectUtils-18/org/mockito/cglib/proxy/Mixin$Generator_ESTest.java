/*

 * Tue Mar 03 14:42:41 GMT 2020
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
      Class<Mixin>[] classArray0 = (Class<Mixin>[]) Array.newInstance(Class.class, 1);
      Class<Mixin> class0 = Mixin.class;
      mixin_Generator0.setUseCache(false);
      mixin_Generator0.setDelegates(classArray0);
      classArray0[0] = class0;
      mixin_Generator0.setStyle(2);
      mixin_Generator0.create();
      mixin_Generator0.setClasses(classArray0);
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
  public void test1()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Class<Mixin>[] classArray0 = (Class<Mixin>[]) Array.newInstance(Class.class, 1);
      Class<Mixin> class0 = Mixin.class;
      classArray0[0] = class0;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) classLoader0;
      objectArray0[1] = (Object) class0;
      objectArray0[2] = (Object) mixin_Generator0;
      objectArray0[3] = (Object) class0;
      Mixin.createBean(objectArray0);
      Mixin.create(classArray0, objectArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Class<Mixin>[] classArray0 = (Class<Mixin>[]) Array.newInstance(Class.class, 1);
      Class<Mixin> class0 = Mixin.class;
      mixin_Generator0.setUseCache(false);
      mixin_Generator0.setDelegates(classArray0);
      classArray0[0] = class0;
      mixin_Generator0.setStyle(2);
      mixin_Generator0.create();
      mixin_Generator0.setStyle(1);
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
}
