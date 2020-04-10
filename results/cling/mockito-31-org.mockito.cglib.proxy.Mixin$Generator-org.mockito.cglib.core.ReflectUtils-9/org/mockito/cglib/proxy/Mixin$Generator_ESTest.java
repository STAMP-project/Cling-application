/*

 * Tue Mar 03 14:41:18 GMT 2020
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
import org.mockito.asm.ClassVisitor;
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
      mixin_Generator0.setStyle(1);
      Mixin mixin0 = mixin_Generator0.create();
      mixin_Generator0.setUseCache(false);
      mixin_Generator0.create();
      Object[] objectArray1 = new Object[1];
      objectArray1[0] = (Object) mixin0;
      mixin_Generator0.setDelegates(objectArray1);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Specified class class org.mockito.cglib.proxy.Mixin$Generator is incompatible with delegate class class org.mockito.cglib.proxy.Mixin$Generator$$MixinByCGLIB$$c711d283_2 (index 0)
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 1);
      Class<String> class0 = String.class;
      classArray0[0] = class0;
      mixin_Generator0.setClasses(classArray0);
      mixin_Generator0.create();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.setUseCache(false);
      mixin_Generator0.create();
      mixin_Generator0.setStyle(1);
      // Undeclared exception!
      try { 
        mixin_Generator0.generateClass((ClassVisitor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }
}
