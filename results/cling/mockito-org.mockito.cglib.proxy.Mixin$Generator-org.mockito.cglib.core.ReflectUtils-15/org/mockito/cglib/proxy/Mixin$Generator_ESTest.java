/*

 * Tue Mar 03 14:41:55 GMT 2020
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
import org.mockito.cglib.proxy.Mixin;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Mixin$Generator_ESTest extends Mixin$Generator_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Class<InputStream>[] classArray0 = (Class<InputStream>[]) Array.newInstance(Class.class, 1);
      Class<InputStream> class0 = InputStream.class;
      classArray0[0] = class0;
      mixin_Generator0.setClasses(classArray0);
      mixin_Generator0.create();
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Class<InputStream>[] classArray0 = (Class<InputStream>[]) Array.newInstance(Class.class, 1);
      Class<InputStream> class0 = InputStream.class;
      classArray0[0] = class0;
      mixin_Generator0.setDelegates(classArray0);
      mixin_Generator0.setClasses(classArray0);
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) mixin_Generator0;
      objectArray0[1] = (Object) class0;
      objectArray0[2] = (Object) class0;
      objectArray0[3] = (Object) class0;
      objectArray0[4] = (Object) mixin_Generator0;
      objectArray0[5] = (Object) class0;
      objectArray0[6] = (Object) mixin_Generator0;
      objectArray0[7] = (Object) class0;
      objectArray0[8] = (Object) mixin_Generator0;
      Mixin.createBean(objectArray0);
      mixin_Generator0.setStyle(2);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Specified class class java.io.InputStream is incompatible with delegate class class java.lang.Class (index 0)
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 1);
      Class<Object> class0 = Object.class;
      classArray0[0] = class0;
      mixin_Generator0.setDelegates(classArray0);
      mixin_Generator0.setClasses(classArray0);
      mixin_Generator0.setStyle(1);
      mixin_Generator0.create();
  }
}
