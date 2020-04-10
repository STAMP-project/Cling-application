/*

 * Tue Mar 03 14:41:29 GMT 2020
 */

package org.mockito.cglib.proxy;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
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
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) mixin_Generator0;
      objectArray0[1] = (Object) mixin_Generator0;
      mixin_Generator0.setUseCache(false);
      objectArray0[2] = (Object) mixin_Generator0;
      objectArray0[3] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.setStyle(1);
      Mixin mixin0 = mixin_Generator0.create();
      assertEquals(1, Mixin.STYLE_BEANS);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Class<InputStream>[] classArray0 = (Class<InputStream>[]) Array.newInstance(Class.class, 1);
      Class<InputStream> class0 = InputStream.class;
      classArray0[0] = class0;
      mixin_Generator0.setStyle(2);
      mixin_Generator0.setUseCache(false);
      mixin_Generator0.setDelegates(classArray0);
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
  public void test2()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) mixin_Generator0;
      objectArray0[1] = (Object) mixin_Generator0;
      mixin_Generator0.setUseCache(false);
      objectArray0[2] = (Object) mixin_Generator0;
      objectArray0[3] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.create();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<Mixin> class0 = Mixin.class;
      Object[] objectArray1 = new Object[2];
      objectArray1[0] = (Object) class0;
      objectArray1[1] = (Object) classLoader0;
      Mixin mixin0 = Mixin.createBean(objectArray1);
      assertEquals(0, Mixin.STYLE_INTERFACES);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) mixin_Generator0;
      objectArray0[1] = (Object) mixin_Generator0;
      objectArray0[2] = (Object) mixin_Generator0;
      objectArray0[3] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.create();
      mixin_Generator0.setStyle(1);
      Class<Mixin> class0 = Mixin.class;
      Class<Mixin>[] classArray0 = (Class<Mixin>[]) Array.newInstance(Class.class, 4);
      classArray0[0] = class0;
      mixin_Generator0.setClasses(classArray0);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Specified class class org.mockito.cglib.proxy.Mixin is incompatible with delegate class class org.mockito.cglib.proxy.Mixin$Generator (index 0)
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }
}
