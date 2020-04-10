/*

 * Tue Mar 03 14:41:11 GMT 2020
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
import org.mockito.cglib.proxy.Mixin;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Mixin$Generator_ESTest extends Mixin$Generator_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) classLoader0;
      Mixin.createBean(objectArray0);
      ClassWriter classWriter0 = new ClassWriter(1);
      // Undeclared exception!
      try { 
        mixin_Generator0.generateClass(classWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassLoader classLoader1 = classLoader0.getParent();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) classLoader0;
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
  @Ignore
  public void test2()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 2);
      Class<String> class0 = String.class;
      classArray0[0] = class0;
      classArray0[1] = class0;
      mixin_Generator0.setClasses(classArray0);
      mixin_Generator0.create();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Class<String> class0 = String.class;
      mixin_Generator0.setUseCache(false);
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) class0;
      objectArray0[1] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.create();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassLoader classLoader1 = classLoader0.getParent();
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
}
