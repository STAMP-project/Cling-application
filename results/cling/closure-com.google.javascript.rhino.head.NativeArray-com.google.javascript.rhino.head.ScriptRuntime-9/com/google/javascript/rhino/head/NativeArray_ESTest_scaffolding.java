/**
 * Scaffolding file used to store all the setups needed to run 
 * Tue Mar 03 20:28:36 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class NativeArray_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.javascript.rhino.head.NativeArray"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(NativeArray_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.javascript.rhino.head.IdFunctionObject",
      "com.google.javascript.rhino.head.RegExpProxy",
      "com.google.javascript.rhino.head.Icode",
      "com.google.javascript.rhino.head.json.JsonParser$ParseException",
      "com.google.javascript.rhino.head.DefaultErrorReporter",
      "com.google.javascript.rhino.head.xml.XMLLib",
      "com.google.javascript.rhino.head.Script",
      "com.google.javascript.rhino.head.ScriptRuntime$DefaultMessageProvider",
      "com.google.javascript.rhino.head.WrappedException",
      "com.google.javascript.rhino.head.NativeJavaConstructor",
      "com.google.javascript.rhino.head.debug.DebuggableObject",
      "com.google.javascript.rhino.head.NativeGenerator$GeneratorClosedException",
      "com.google.javascript.rhino.head.jdk13.VMBridge_jdk13",
      "com.google.javascript.rhino.head.IdScriptableObject$PrototypeValues",
      "com.google.javascript.rhino.head.TopLevel$Builtins",
      "com.google.javascript.rhino.head.regexp.RENode",
      "com.google.javascript.rhino.head.Function",
      "com.google.javascript.rhino.head.ScriptableObject$RelinkedSlot",
      "com.google.javascript.rhino.head.RhinoException",
      "com.google.javascript.rhino.head.JavaMembers",
      "com.google.javascript.rhino.head.NativeJavaArray",
      "com.google.javascript.rhino.head.regexp.RECompiled",
      "com.google.javascript.rhino.head.NativeGlobal",
      "com.google.javascript.rhino.head.regexp.NativeRegExpCtor",
      "com.google.javascript.rhino.head.ContextFactory$Listener",
      "com.google.javascript.rhino.head.ErrorReporter",
      "com.google.javascript.rhino.head.optimizer.Codegen",
      "com.google.javascript.rhino.head.ast.Jump",
      "com.google.javascript.rhino.head.NativeCall",
      "com.google.javascript.rhino.head.NativeIterator$StopIteration",
      "com.google.javascript.rhino.head.v8dtoa.DoubleHelper",
      "com.google.javascript.rhino.head.ast.Scope",
      "com.google.javascript.rhino.head.LazilyLoadedCtor$1",
      "com.google.javascript.rhino.head.regexp.NativeRegExp",
      "com.google.javascript.rhino.head.Scriptable",
      "com.google.javascript.rhino.head.EcmaError",
      "com.google.javascript.rhino.head.FunctionObject",
      "com.google.javascript.rhino.head.ClassCache",
      "com.google.javascript.rhino.head.NativeContinuation",
      "com.google.javascript.rhino.head.xml.XMLObject",
      "com.google.javascript.rhino.head.xml.XMLLib$Factory",
      "com.google.javascript.rhino.head.regexp.REProgState",
      "com.google.javascript.rhino.head.InterpretedFunction",
      "com.google.javascript.rhino.head.NativeScript",
      "com.google.javascript.rhino.head.NativeNumber",
      "com.google.javascript.rhino.head.regexp.REBackTrackData",
      "com.google.javascript.rhino.head.ScriptableObject$Slot",
      "org.mozilla.classfile.ClassFileWriter$ClassFileFormatException",
      "com.google.javascript.rhino.head.ScriptableObject$GetterSlot",
      "com.google.javascript.rhino.head.ScriptRuntime$IdEnumeration",
      "com.google.javascript.rhino.head.v8dtoa.CachedPowers$CachedPower",
      "com.google.javascript.rhino.head.Context$ClassShutterSetter",
      "com.google.javascript.rhino.head.ScriptRuntime$MessageProvider",
      "com.google.javascript.rhino.head.GeneratedClassLoader",
      "com.google.javascript.rhino.head.regexp.SubString",
      "com.google.javascript.rhino.head.ast.FunctionNode",
      "com.google.javascript.rhino.head.v8dtoa.FastDtoaBuilder",
      "com.google.javascript.rhino.head.ast.AstNode",
      "com.google.javascript.rhino.head.NativeMath",
      "com.google.javascript.rhino.head.NativeJavaObject",
      "com.google.javascript.rhino.head.Context",
      "com.google.javascript.rhino.head.NativeError",
      "com.google.javascript.rhino.head.SecurityController",
      "com.google.javascript.rhino.head.Callable",
      "com.google.javascript.rhino.head.NativeJSON",
      "com.google.javascript.rhino.head.BoundFunction",
      "com.google.javascript.rhino.head.debug.Debugger",
      "com.google.javascript.rhino.head.Node",
      "com.google.javascript.rhino.head.NativeBoolean",
      "com.google.javascript.rhino.head.ClassShutter",
      "com.google.javascript.rhino.head.ast.ScriptNode",
      "com.google.javascript.rhino.head.NativeArray",
      "com.google.javascript.rhino.head.WrapFactory",
      "com.google.javascript.rhino.head.NativeJavaMethod",
      "com.google.javascript.rhino.head.UniqueTag",
      "com.google.javascript.rhino.head.v8dtoa.CachedPowers",
      "com.google.javascript.rhino.head.Undefined",
      "com.google.javascript.rhino.head.NativeDate",
      "com.google.javascript.rhino.head.LazilyLoadedCtor",
      "com.google.javascript.rhino.head.NativeString",
      "com.google.javascript.rhino.head.ContextFactory",
      "com.google.javascript.rhino.head.VMBridge",
      "com.google.javascript.rhino.head.regexp.RegExpImpl",
      "com.google.javascript.rhino.head.v8dtoa.FastDtoa",
      "com.google.javascript.rhino.head.NativeGenerator",
      "com.google.javascript.rhino.head.NativeIterator$WrappedJavaIterator",
      "com.google.javascript.rhino.head.Evaluator",
      "com.google.javascript.rhino.head.Kit",
      "com.google.javascript.rhino.head.DToA",
      "com.google.javascript.rhino.head.ObjArray",
      "com.google.javascript.rhino.head.Wrapper",
      "com.google.javascript.rhino.head.BeanProperty",
      "com.google.javascript.rhino.head.ContextListener",
      "com.google.javascript.rhino.head.JavaAdapter",
      "com.google.javascript.rhino.head.jdk15.VMBridge_jdk15",
      "com.google.javascript.rhino.head.ContinuationPending",
      "com.google.javascript.rhino.head.ContextAction",
      "com.google.javascript.rhino.head.xml.XMLLib$Factory$1",
      "com.google.javascript.rhino.head.JavaScriptException",
      "com.google.javascript.rhino.head.EvaluatorException",
      "com.google.javascript.rhino.head.NativeWith",
      "com.google.javascript.rhino.head.NativeIterator",
      "com.google.javascript.rhino.head.v8dtoa.DiyFp",
      "com.google.javascript.rhino.head.TopLevel",
      "com.google.javascript.rhino.head.BaseFunction",
      "com.google.javascript.rhino.head.IdFunctionCall",
      "com.google.javascript.rhino.head.regexp.CompilerState",
      "com.google.javascript.rhino.head.Synchronizer",
      "com.google.javascript.rhino.head.Interpreter",
      "com.google.javascript.rhino.head.ImporterTopLevel",
      "com.google.javascript.rhino.head.Delegator",
      "com.google.javascript.rhino.head.JavaMembers$MethodSignature",
      "com.google.javascript.rhino.head.ScriptRuntime$1",
      "com.google.javascript.rhino.head.ObjToIntMap",
      "com.google.javascript.rhino.head.ScriptRuntime",
      "com.google.javascript.rhino.head.Ref",
      "com.google.javascript.rhino.head.NativeArray$2",
      "com.google.javascript.rhino.head.ContextFactory$GlobalSetter",
      "com.google.javascript.rhino.head.NativeArray$1",
      "com.google.javascript.rhino.head.regexp.RECharSet",
      "com.google.javascript.rhino.head.ConstProperties",
      "com.google.javascript.rhino.head.ScriptableObject",
      "com.google.javascript.rhino.head.IdScriptableObject",
      "com.google.javascript.rhino.head.NativeFunction",
      "com.google.javascript.rhino.head.debug.DebuggableScript",
      "com.google.javascript.rhino.head.regexp.REGlobalData",
      "com.google.javascript.rhino.head.MemberBox",
      "com.google.javascript.rhino.head.NativeObject"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.google.javascript.rhino.head.Context", false, NativeArray_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.google.javascript.rhino.head.IdFunctionObject", false, NativeArray_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.google.javascript.rhino.head.Scriptable", false, NativeArray_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(NativeArray_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.javascript.rhino.head.ScriptableObject",
      "com.google.javascript.rhino.head.NativeArray",
      "com.google.javascript.rhino.head.Kit",
      "com.google.javascript.rhino.head.optimizer.Codegen",
      "com.google.javascript.rhino.head.Icode",
      "com.google.javascript.rhino.head.Interpreter",
      "com.google.javascript.rhino.head.Context",
      "com.google.javascript.rhino.head.ContextFactory",
      "com.google.javascript.rhino.head.ScriptRuntime",
      "com.google.javascript.rhino.head.BaseFunction",
      "com.google.javascript.rhino.head.ScriptRuntime$1",
      "com.google.javascript.rhino.head.UniqueTag",
      "com.google.javascript.rhino.head.Scriptable",
      "com.google.javascript.rhino.head.VMBridge",
      "com.google.javascript.rhino.head.TopLevel$Builtins",
      "com.google.javascript.rhino.head.TopLevel",
      "com.google.javascript.rhino.head.Undefined",
      "com.google.javascript.rhino.head.v8dtoa.FastDtoa",
      "com.google.javascript.rhino.head.v8dtoa.DoubleHelper",
      "com.google.javascript.rhino.head.v8dtoa.CachedPowers",
      "com.google.javascript.rhino.head.DToA",
      "com.google.javascript.rhino.head.JavaAdapter",
      "com.google.javascript.rhino.head.NativeJavaObject",
      "com.google.javascript.rhino.head.NativeJavaClass",
      "com.google.javascript.rhino.head.NativeObject",
      "com.google.javascript.rhino.head.NativeIterator$StopIteration",
      "com.google.javascript.rhino.head.NativeJavaConstructor",
      "com.google.javascript.rhino.head.RhinoException",
      "com.google.javascript.rhino.head.EcmaError",
      "com.google.javascript.rhino.head.NativeCall",
      "com.google.javascript.rhino.head.Arguments",
      "com.google.javascript.rhino.head.ImporterTopLevel",
      "com.google.javascript.rhino.head.ObjArray",
      "com.google.javascript.rhino.head.IdScriptableObject$PrototypeValues",
      "com.google.javascript.rhino.head.IdFunctionObject",
      "com.google.javascript.rhino.head.ScriptableObject$Slot",
      "com.google.javascript.rhino.head.EvaluatorException",
      "com.google.javascript.rhino.head.NativeError",
      "com.google.javascript.rhino.head.NativeJavaPackage",
      "com.google.javascript.rhino.head.NativeNumber",
      "com.google.javascript.rhino.head.BoundFunction",
      "com.google.javascript.rhino.head.ClassCache",
      "com.google.javascript.rhino.head.NativeWith",
      "com.google.javascript.rhino.head.NativeJavaMethod",
      "com.google.javascript.rhino.head.Node",
      "com.google.javascript.rhino.head.ast.AstNode",
      "com.google.javascript.rhino.head.NativeContinuation",
      "com.google.javascript.rhino.head.FunctionObject",
      "com.google.javascript.rhino.head.DefaultErrorReporter",
      "com.google.javascript.rhino.head.MemberBox",
      "com.google.javascript.rhino.head.NativeGlobal",
      "com.google.javascript.rhino.head.NativeString",
      "com.google.javascript.rhino.head.NativeBoolean",
      "com.google.javascript.rhino.head.NativeDate",
      "com.google.javascript.rhino.head.NativeMath",
      "com.google.javascript.rhino.head.NativeJSON",
      "com.google.javascript.rhino.head.NativeScript",
      "com.google.javascript.rhino.head.NativeIterator",
      "com.google.javascript.rhino.head.NativeGenerator",
      "com.google.javascript.rhino.head.LazilyLoadedCtor",
      "com.google.javascript.rhino.head.ScriptableObject$GetterSlot",
      "com.google.javascript.rhino.head.InterpreterData",
      "com.google.javascript.rhino.head.NativeFunction",
      "com.google.javascript.rhino.head.InterpretedFunction",
      "com.google.javascript.rhino.head.SecurityController",
      "com.google.javascript.rhino.head.regexp.NativeRegExp",
      "com.google.javascript.rhino.head.regexp.RECompiled",
      "com.google.javascript.rhino.head.regexp.NativeRegExpCtor",
      "com.google.javascript.rhino.head.NativeJavaArray",
      "com.google.javascript.rhino.head.Parser",
      "com.google.javascript.rhino.head.TokenStream",
      "com.google.javascript.rhino.head.ObjToIntMap",
      "com.google.javascript.rhino.head.tools.shell.Global",
      "com.google.javascript.rhino.head.tools.shell.Environment",
      "com.google.javascript.rhino.head.JavaScriptException",
      "com.google.javascript.rhino.head.WrappedException",
      "com.google.javascript.rhino.head.v8dtoa.FastDtoaBuilder",
      "com.google.javascript.rhino.head.v8dtoa.DiyFp",
      "com.google.javascript.rhino.head.NativeJavaTopPackage",
      "com.google.javascript.rhino.head.ContinuationPending",
      "com.google.javascript.rhino.head.IRFactory",
      "com.google.javascript.rhino.head.Decompiler",
      "com.google.javascript.rhino.head.CodeGenerator",
      "com.google.javascript.rhino.head.xml.XMLLib",
      "com.google.javascript.rhino.head.ast.ArrayLiteral",
      "org.mozilla.classfile.ClassFileWriter",
      "org.mozilla.classfile.ConstantPool",
      "com.google.javascript.rhino.head.UintMap",
      "com.google.javascript.rhino.head.PolicySecurityController",
      "com.google.javascript.rhino.head.ast.FunctionCall",
      "com.google.javascript.rhino.head.Token",
      "com.google.javascript.rhino.head.ast.ParseProblem$Type",
      "com.google.javascript.rhino.head.Parser$ParserException",
      "com.google.javascript.rhino.head.optimizer.BodyCodegen"
    );
  }
}
