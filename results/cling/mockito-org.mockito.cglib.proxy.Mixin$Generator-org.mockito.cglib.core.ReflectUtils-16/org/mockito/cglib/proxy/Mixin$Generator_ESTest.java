/*

 * Tue Mar 03 14:41:49 GMT 2020
 */

package org.mockito.cglib.proxy;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
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
      ClassLoader classLoader0 = mixin_Generator0.getClassLoader();
      Mixin mixin0 = Mixin.createBean(classLoader0, (Object[]) classArray0);
      ClassLoader classLoader1 = classLoader0.getParent();
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) mixin0;
      objectArray0[1] = (Object) classLoader1;
      objectArray0[2] = (Object) classLoader0;
      Mixin.createBean(classLoader0, objectArray0);
      mixin_Generator0.create();
  }
}
