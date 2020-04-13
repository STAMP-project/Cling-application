/*

 * Tue Mar 03 14:41:13 GMT 2020
 */

package org.mockito.cglib.proxy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.cglib.proxy.Mixin;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Mixin$Generator_ESTest extends Mixin$Generator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) objectArray0;
      objectArray0[1] = (Object) mixin_Generator0;
      objectArray0[2] = (Object) mixin_Generator0;
      objectArray0[3] = (Object) mixin_Generator0;
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.setUseCache(false);
      Mixin mixin0 = mixin_Generator0.create();
      mixin_Generator0.setStyle(1);
      Object[] objectArray1 = new Object[4];
      objectArray1[0] = (Object) mixin0;
      objectArray1[1] = (Object) mixin_Generator0;
      objectArray1[2] = (Object) mixin_Generator0;
      objectArray1[3] = (Object) mixin_Generator0;
      Mixin.createBean(objectArray1);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Specified class interface java.io.Serializable is incompatible with delegate class class org.mockito.cglib.proxy.Mixin$Generator (index 2)
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }
}
