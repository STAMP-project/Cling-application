/*

 * Tue Mar 03 14:42:02 GMT 2020
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
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) classLoader0;
      Class<InputStream>[] classArray0 = (Class<InputStream>[]) Array.newInstance(Class.class, 6);
      Class<InputStream> class0 = InputStream.class;
      classArray0[0] = class0;
      classArray0[1] = classArray0[0];
      classArray0[2] = class0;
      classArray0[3] = class0;
      classArray0[4] = classArray0[2];
      classArray0[5] = classArray0[3];
      mixin_Generator0.setClasses(classArray0);
      Mixin.createBean(objectArray0);
      mixin_Generator0.create();
  }
}
