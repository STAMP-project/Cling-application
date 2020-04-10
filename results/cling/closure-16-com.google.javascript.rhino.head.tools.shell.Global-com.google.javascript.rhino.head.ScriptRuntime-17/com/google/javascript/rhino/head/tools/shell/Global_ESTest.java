/*

 * Tue Mar 03 20:47:49 GMT 2020
 */

package com.google.javascript.rhino.head.tools.shell;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.Delegator;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.Function;
import com.google.javascript.rhino.head.IdFunctionCall;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.Synchronizer;
import com.google.javascript.rhino.head.TopLevel;
import com.google.javascript.rhino.head.tools.shell.Global;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Global_ESTest extends Global_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      // Undeclared exception!
      try { 
        Global.sync((Context) null, (Scriptable) null, objectArray0, (Function) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.sync.args
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Global global0 = new Global();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PrintStream printStream0 = new PrintStream(pipedOutputStream0, false);
      global0.setOut(printStream0);
      PrintStream printStream1 = global0.getOut();
      assertSame(printStream1, printStream0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Context context0 = Context.enter();
      Global global0 = new Global(context0);
      context0.initStandardObjects();
      Object[] objectArray0 = context0.getElements(global0);
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Context context0 = Context.enter();
      Global global0 = new Global(context0);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Array;
      BaseFunction baseFunction0 = global0.getBuiltinCtor(topLevel_Builtins0);
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) baseFunction0;
      Object object0 = Global.toint32(context0, baseFunction0, objectArray0, baseFunction0);
      assertEquals(0, object0);
      assertFalse(baseFunction0.isSealed());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Scriptable) null).when(scriptable0).getParentScope();
      Object[] objectArray0 = new Object[4];
      Delegator delegator0 = new Delegator(scriptable0);
      // Undeclared exception!
      try { 
        Global.doctest((Context) null, scriptable0, objectArray0, delegator0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.bad.shell.function.scope
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      // Undeclared exception!
      try { 
        Global.runCommand((Context) null, (Scriptable) null, objectArray0, (Function) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Context context0 = Context.enter();
      Global global0 = new Global(context0);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(global0, global0, 2, 16);
      // Undeclared exception!
      try { 
        Global.spawn(context0, global0, context0.emptyArgs, idFunctionObject0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Argument to spawn() must be a function or script.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      Global global0 = new Global();
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) global0;
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      // Undeclared exception!
      try { 
        Global.seal((Context) null, nativeContinuation0, objectArray0, nativeContinuation0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // seal function can only be applied to objects
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      Object[] objectArray0 = new Object[4];
      objectArray0[3] = (Object) scriptable0;
      BaseFunction baseFunction0 = new BaseFunction();
      // Undeclared exception!
      try { 
        Global.runCommand((Context) null, baseFunction0, objectArray0, baseFunction0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot convert null to an object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      // Undeclared exception!
      try { 
        Global.pipe(false, (InputStream) null, pipedOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Context context0 = Context.enter();
      Global global0 = new Global(context0);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Array;
      BaseFunction baseFunction0 = global0.getBuiltinCtor(topLevel_Builtins0);
      // Undeclared exception!
      try { 
        Global.runCommand(context0, baseFunction0, context0.emptyArgs, baseFunction0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // The first argument to runCommand must be a command name.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Context context0 = Context.enter();
      Global global0 = new Global(context0);
      InputStream inputStream0 = global0.getIn();
      InputStream inputStream1 = global0.getIn();
      assertSame(inputStream1, inputStream0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      IdFunctionObject idFunctionObject0 = new IdFunctionObject((IdFunctionCall) null, (Object) null, 3061, 80);
      // Undeclared exception!
      try { 
        Global.spawn((Context) null, (Scriptable) null, objectArray0, idFunctionObject0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Argument to spawn() must be a function or script.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) scriptable0;
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      // Undeclared exception!
      try { 
        Global.seal((Context) null, nativeContinuation0, objectArray0, nativeContinuation0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // seal function supports only sealing of ScriptableObject instances
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Context context0 = Context.enter();
      Global global0 = new Global(context0);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Array;
      BaseFunction baseFunction0 = global0.getBuiltinCtor(topLevel_Builtins0);
      assertNotNull(baseFunction0);
      
      Object[] objectArray0 = context0.getElements(baseFunction0);
      assertFalse(baseFunction0.isSealed());
      assertEquals(1, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(774, 0, (-1044)).when(inputStream0).read(any(byte[].class) , anyInt() , anyInt());
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      Global.pipe(false, inputStream0, outputStream0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      Global global0 = new Global(context0);
      Synchronizer synchronizer0 = new Synchronizer(global0);
      // Undeclared exception!
      try { 
        global0.runDoctest(context0, synchronizer0, "js>", "isNaN", (-183));
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      Global.seal(context0, (Scriptable) null, context0.emptyArgs, (Function) null);
      assertEquals(160, Context.VERSION_1_6);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      // Undeclared exception!
      try { 
        Global.sync((Context) null, (Scriptable) null, objectArray0, (Function) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.sync.args
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        Global.sync(context0, (Scriptable) null, context0.emptyArgs, (Function) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.sync.args
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(774, 0, 0, 0, 0).when(inputStream0).read(any(byte[].class) , anyInt() , anyInt());
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      Global.pipe(true, inputStream0, outputStream0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Context context0 = Context.enter();
      Global global0 = new Global(context0);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Array;
      BaseFunction baseFunction0 = global0.getBuiltinCtor(topLevel_Builtins0);
      assertNotNull(baseFunction0);
      
      Object object0 = Global.toint32(context0, baseFunction0, context0.emptyArgs, baseFunction0);
      assertFalse(baseFunction0.isSealed());
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Global global0 = new Global();
      try { 
        Global.readFile((Context) null, global0, objectArray0, (Function) null);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // File not found: null
         //
         verifyException("com.google.javascript.rhino.head.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Global global0 = new Global();
      Context context0 = Context.getCurrentContext();
      int int0 = global0.runDoctest(context0, (Scriptable) null, "language version", "language version", 150);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      Object[] objectArray0 = new Object[7];
      objectArray0[6] = (Object) baseFunction0;
      // Undeclared exception!
      try { 
        Global.runCommand(context0, baseFunction0, objectArray0, (Function) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      BaseFunction baseFunction0 = new BaseFunction();
      try { 
        Global.readUrl((Context) null, baseFunction0, objectArray0, baseFunction0);
        fail("Expecting exception: MalformedURLException");
      
      } catch(MalformedURLException e) {
         //
         // no protocol: null
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enter();
      boolean boolean0 = context0.stringIsCompilableUnit("#xmmDZS8Y#4");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn(nativeObject0, nativeObject0).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      Object[] objectArray0 = new Object[2];
      objectArray0[1] = (Object) scriptable0;
      // Undeclared exception!
      try { 
        Global.runCommand((Context) null, (Scriptable) null, objectArray0, (Function) null);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          Global global0 = new Global();
          Object[] objectArray0 = new Object[3];
          Context context0 = Context.enter();
          IdFunctionObject idFunctionObject0 = new IdFunctionObject(global0, context0, (-2592), "language version", 12, global0);
          // Undeclared exception!
          try { 
            Global.runCommand(context0, global0, objectArray0, idFunctionObject0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"<<ALL FILES>>\" \"execute\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkExec(SecurityManager.java:799)
             // java.lang.ProcessBuilder.start(ProcessBuilder.java:1018)
             // java.lang.Runtime.exec(Runtime.java:621)
             // java.lang.Runtime.exec(Runtime.java:486)
             // com.google.javascript.rhino.head.tools.shell.Global.runProcess(Global.java:930)
             // com.google.javascript.rhino.head.tools.shell.Global.runCommand(Global.java:760)
             // sun.reflect.GeneratedMethodAccessor183.invoke(Unknown Source)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:498)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:257)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:220)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }
}
