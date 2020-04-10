/*

 * Tue Mar 03 14:41:38 GMT 2020
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
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) classLoader0;
      objectArray0[1] = (Object) mixin_Generator0;
      objectArray0[2] = (Object) mixin_Generator0;
      objectArray0[3] = (Object) classLoader0;
      objectArray0[4] = (Object) mixin_Generator0;
      Mixin mixin0 = Mixin.createBean(objectArray0);
      assertEquals(0, Mixin.STYLE_INTERFACES);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 4);
      Class<Object> class0 = Object.class;
      classArray0[0] = class0;
      classArray0[1] = class0;
      classArray0[2] = classArray0[0];
      classArray0[3] = class0;
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
  public void test2()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Class<InputStream> class0 = InputStream.class;
      Class<InputStream>[] classArray0 = (Class<InputStream>[]) Array.newInstance(Class.class, 1);
      classArray0[0] = class0;
      mixin_Generator0.setClasses(classArray0);
      Mixin.createBean((Object[]) classArray0);
      mixin_Generator0.create();
  }
}
