/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 23:55:52 GMT 2019
 */

package org.apache.commons.math.geometry;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.geometry.CardanEulerSingularityException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class CardanEulerSingularityException_ESTest extends CardanEulerSingularityException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CardanEulerSingularityException cardanEulerSingularityException0 = new CardanEulerSingularityException(true);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CardanEulerSingularityException cardanEulerSingularityException0 = new CardanEulerSingularityException(false);
  }
}
