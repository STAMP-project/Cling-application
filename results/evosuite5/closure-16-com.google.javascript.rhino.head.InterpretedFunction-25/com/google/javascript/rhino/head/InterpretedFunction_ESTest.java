/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 18 07:20:45 GMT 2019
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.InterpretedFunction;
import com.google.javascript.rhino.head.InterpreterData;
import com.google.javascript.rhino.head.Scriptable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class InterpretedFunction_ESTest extends InterpretedFunction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      InterpreterData interpreterData0 = new InterpreterData(3, "language version", "error reporter", false);
      InterpretedFunction interpretedFunction0 = InterpretedFunction.createFunction(context0, importerTopLevel0, interpreterData0, (Object) null);
      // Undeclared exception!
      try { 
        interpretedFunction0.exec(context0, importerTopLevel0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.InterpretedFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      InterpreterData interpreterData0 = new InterpreterData(5, "error reporter", "error reporter", false);
      InterpreterData interpreterData1 = new InterpreterData(interpreterData0);
      interpreterData1.itsRegExpLiterals = context0.emptyArgs;
      InterpretedFunction interpretedFunction0 = InterpretedFunction.createFunction(context0, importerTopLevel0, interpreterData1, (Object) null);
      assertTrue(interpretedFunction0.isScript());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      InterpreterData interpreterData0 = new InterpreterData(5, "error reporter", "error reporter", false);
      InterpreterData interpreterData1 = new InterpreterData(interpreterData0);
      Object[] objectArray0 = new Object[2];
      interpreterData1.itsRegExpLiterals = objectArray0;
      InterpretedFunction interpretedFunction0 = InterpretedFunction.createScript(interpreterData1, (Object) null);
      Scriptable[] scriptableArray0 = interpretedFunction0.createRegExpWraps(context0, importerTopLevel0);
      assertNotNull(scriptableArray0);
      assertEquals(2, scriptableArray0.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Context context0 = Context.enter();
      // Undeclared exception!
      try { 
        InterpretedFunction.createFunction(context0, (Scriptable) null, (InterpretedFunction) null, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.InterpretedFunction", e);
      }
  }
}
