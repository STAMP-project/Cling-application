/*

 * Tue Mar 03 14:41:24 GMT 2020
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
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Mixin mixin0 = Mixin.createBean(objectArray0);
      mixin_Generator0.setStyle(2);
      Class<Integer> class0 = Integer.class;
      Object[] objectArray1 = new Object[9];
      objectArray1[0] = (Object) class0;
      objectArray1[1] = (Object) classLoader0;
      objectArray1[2] = (Object) class0;
      objectArray1[3] = (Object) mixin_Generator0;
      objectArray1[4] = (Object) mixin0;
      objectArray1[5] = (Object) classLoader0;
      objectArray1[6] = (Object) mixin0;
      objectArray1[7] = (Object) class0;
      objectArray1[8] = (Object) mixin0;
      mixin_Generator0.setDelegates(objectArray1);
      mixin_Generator0.create();
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      Mixin mixin0 = Mixin.createBean(objectArray0);
      mixin_Generator0.setStyle(1);
      Object[] objectArray1 = new Object[3];
      objectArray1[0] = (Object) mixin0;
      objectArray1[1] = (Object) mixin_Generator0;
      objectArray1[2] = (Object) mixin0;
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 3);
      Class<Integer> class0 = Integer.class;
      classArray0[0] = class0;
      mixin_Generator0.setClasses(classArray0);
      mixin_Generator0.setDelegates(objectArray1);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Specified class class java.lang.Integer is incompatible with delegate class class org.mockito.cglib.proxy.Mixin$Generator$$MixinByCGLIB$$c711d283 (index 0)
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Class<String> class0 = String.class;
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 1);
      classArray0[0] = class0;
      mixin_Generator0.setStyle(2);
      mixin_Generator0.setDelegates(classArray0);
      mixin_Generator0.create();
      Mixin mixin0 = mixin_Generator0.create();
      assertEquals(1, Mixin.STYLE_BEANS);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test3()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Class<String> class0 = String.class;
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 1);
      classArray0[0] = class0;
      Mixin.createBean((Object[]) classArray0);
      mixin_Generator0.setClasses(classArray0);
      mixin_Generator0.create();
  }
}
