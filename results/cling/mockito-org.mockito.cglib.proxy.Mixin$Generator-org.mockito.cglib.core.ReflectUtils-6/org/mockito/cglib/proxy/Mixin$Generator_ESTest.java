/*

 * Tue Mar 03 14:41:21 GMT 2020
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
import org.mockito.cglib.proxy.Mixin;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Mixin$Generator_ESTest extends Mixin$Generator_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 4);
      Class<Object> class0 = Object.class;
      classArray0[0] = class0;
      classArray0[1] = classArray0[0];
      classArray0[2] = classArray0[1];
      mixin_Generator0.setDelegates(classArray0);
      classArray0[3] = class0;
      mixin_Generator0.setStyle(2);
      mixin_Generator0.setClasses(classArray0);
      mixin_Generator0.create();
      Mixin.Generator mixin_Generator1 = new Mixin.Generator();
      Class<String>[] classArray1 = (Class<String>[]) Array.newInstance(Class.class, 9);
      Class<String> class1 = String.class;
      classArray1[0] = class1;
      classArray1[1] = classArray1[0];
      classArray1[2] = class1;
      classArray1[3] = classArray1[0];
      classArray1[4] = classArray1[1];
      classArray1[5] = classArray1[1];
      classArray1[6] = classArray1[2];
      classArray1[7] = classArray1[3];
      classArray1[8] = class1;
      mixin_Generator1.setClasses(classArray1);
      mixin_Generator1.create();
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassLoader classLoader1 = classLoader0.getParent();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) classLoader1;
      // Undeclared exception!
      try { 
        Mixin.createBean(classLoader1, objectArray0);
        fail("Expecting exception: CodeGenerationException");
      
      } catch(CodeGenerationException e) {
         //
         // java.lang.reflect.InvocationTargetException-->null
         //
         verifyException("org.mockito.cglib.core.AbstractClassGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Class<ByteArrayInputStream>[] classArray0 = (Class<ByteArrayInputStream>[]) Array.newInstance(Class.class, 1);
      Class<ByteArrayInputStream> class0 = ByteArrayInputStream.class;
      classArray0[0] = class0;
      mixin_Generator0.setDelegates(classArray0);
      Mixin.createBean((Object[]) classArray0);
      mixin_Generator0.setStyle(2);
      mixin_Generator0.setClasses(classArray0);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Specified class class java.io.ByteArrayInputStream is incompatible with delegate class class java.lang.Class (index 0)
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }
}
