/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Aug 18 05:25:28 GMT 2019
 */

package com.google.javascript.rhino.jstype;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class FunctionType_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.javascript.rhino.jstype.FunctionType"; 
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
    java.lang.System.setProperty("user.dir", "/home/pderakhshanfar/botsing-integration-experiment"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(FunctionType_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.collect.ArrayListMultimap",
      "com.google.common.collect.AbstractMultimap$WrappedSet",
      "com.google.javascript.rhino.jstype.PrototypeObjectType",
      "com.google.javascript.rhino.jstype.ArrowType",
      "com.google.javascript.rhino.SimpleErrorReporter",
      "com.google.common.collect.Lists$RandomAccessPartition",
      "com.google.common.collect.Collections2",
      "com.google.javascript.rhino.jstype.NumberType",
      "com.google.common.collect.PeekingIterator",
      "com.google.common.collect.LinkedHashMultimap$SetDecorator",
      "com.google.javascript.rhino.jstype.StaticScope",
      "com.google.javascript.rhino.jstype.InstanceObjectType",
      "com.google.common.collect.Sets$2",
      "com.google.javascript.rhino.Node$IntPropListItem",
      "com.google.common.collect.Sets$3",
      "com.google.javascript.rhino.jstype.ObjectType",
      "com.google.common.collect.Sets$1",
      "com.google.common.collect.NullsLastOrdering",
      "com.google.common.collect.ImmutableSet$ArrayImmutableSet",
      "com.google.common.collect.RegularImmutableMultiset",
      "com.google.javascript.rhino.JSDocInfo$Marker",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.javascript.rhino.jstype.RecordType",
      "com.google.javascript.rhino.Node$NodeMismatch",
      "com.google.common.collect.ImmutableMultimap$Values",
      "com.google.common.collect.Maps$AbstractFilteredMap$Values",
      "com.google.common.collect.ByFunctionOrdering",
      "com.google.javascript.rhino.jstype.ModificationVisitor",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.Iterators$12",
      "com.google.common.collect.Iterators$11",
      "com.google.javascript.rhino.jstype.JSType$1",
      "com.google.common.base.Predicate",
      "com.google.javascript.rhino.jstype.JSType$2",
      "com.google.common.collect.AbstractMultimap$AsMap",
      "com.google.common.collect.ImmutableListMultimap$Builder",
      "com.google.common.base.Joiner",
      "com.google.javascript.rhino.Node$SiblingNodeIterable",
      "com.google.common.collect.RegularImmutableMap$Values$1",
      "com.google.common.collect.AbstractListMultimap",
      "com.google.common.collect.SingletonImmutableMap",
      "com.google.common.collect.Iterables$IterableWithToString",
      "com.google.common.collect.NullsFirstOrdering",
      "com.google.javascript.rhino.Node$StringNode",
      "com.google.javascript.rhino.jstype.ProxyObjectType",
      "com.google.javascript.rhino.jstype.TemplateType",
      "com.google.javascript.rhino.jstype.NamedType",
      "com.google.common.collect.Iterators$14",
      "com.google.common.collect.Iterators$13",
      "com.google.javascript.rhino.InputId",
      "com.google.common.collect.RegularImmutableMap$LinkedEntry",
      "com.google.common.collect.Lists$Partition",
      "com.google.common.collect.Lists",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.Lists$StringAsImmutableList$1",
      "com.google.common.collect.Sets$InvertibleFunction$1",
      "com.google.common.collect.ImmutableMultimap",
      "com.google.javascript.rhino.ErrorReporter",
      "com.google.javascript.rhino.jstype.UnknownType",
      "com.google.common.collect.ImmutableSortedSet",
      "com.google.javascript.rhino.jstype.ValueType",
      "com.google.javascript.rhino.Token",
      "com.google.javascript.rhino.Node$FileLevelJsDocBuilder",
      "com.google.javascript.rhino.jstype.StaticSourceFile",
      "com.google.javascript.rhino.jstype.BooleanType",
      "com.google.javascript.rhino.jstype.JSType$TypePair",
      "com.google.common.base.Joiner$MapJoiner",
      "com.google.common.collect.ImmutableSortedSet$Builder",
      "com.google.javascript.rhino.JSDocInfo$1",
      "com.google.common.collect.AbstractMultimap$EntryIterator",
      "com.google.common.collect.RegularImmutableMap$NonTerminalEntry",
      "com.google.common.base.Equivalence$Wrapper",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.RegularImmutableMultiset$1",
      "com.google.common.collect.ImmutableSortedSetFauxverideShim",
      "com.google.common.collect.ImmutableMultimap$EntryCollection$1",
      "com.google.javascript.rhino.JSDocInfo",
      "com.google.common.collect.EmptyImmutableList",
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.base.Joiner$1",
      "com.google.common.base.Joiner$2",
      "com.google.common.collect.EmptyImmutableSetMultimap",
      "com.google.common.collect.ImmutableCollection",
      "com.google.javascript.rhino.jstype.IndexedType",
      "com.google.common.collect.AbstractMultimap$WrappedSortedSet",
      "com.google.javascript.rhino.jstype.EnumElementType",
      "com.google.common.collect.ImmutableMultimap$Values$1",
      "com.google.javascript.rhino.Node$NumberNode",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.ImmutableSetMultimap",
      "com.google.common.collect.Iterators$6",
      "com.google.common.collect.BiMap",
      "com.google.common.collect.Iterators$7",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.Lists$AbstractListWrapper",
      "com.google.common.collect.SortedSetMultimap",
      "com.google.javascript.rhino.jstype.SimpleSourceFile",
      "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode",
      "com.google.common.collect.ImmutableList$ReverseImmutableList$1",
      "com.google.common.collect.ImmutableSortedAsList",
      "com.google.javascript.rhino.jstype.EnumType",
      "com.google.common.collect.Iterators$1",
      "com.google.javascript.rhino.JSDocInfo$TypePosition",
      "com.google.common.collect.Iterators$2",
      "com.google.common.collect.Iterators$3",
      "com.google.common.collect.Iterators$5",
      "com.google.common.collect.Multimaps$Values",
      "com.google.common.collect.ForwardingSet",
      "com.google.common.collect.ImmutableMultimap$EntryCollection",
      "com.google.common.collect.RegularImmutableList$1",
      "com.google.common.collect.Lists$StringAsImmutableList",
      "com.google.common.collect.Lists$2",
      "com.google.common.collect.Lists$1",
      "com.google.common.collect.Maps$EntrySet",
      "com.google.javascript.rhino.jstype.StaticReference",
      "com.google.common.collect.ImmutableMultimap$Builder",
      "com.google.common.collect.Multiset",
      "com.google.common.collect.SingletonImmutableList$1",
      "com.google.common.collect.Multimaps$Entries",
      "com.google.common.collect.AbstractMultimap",
      "com.google.common.base.Supplier",
      "com.google.common.collect.EmptyImmutableListMultimap",
      "com.google.common.collect.EmptyImmutableSet",
      "com.google.common.collect.Maps$ImprovedAbstractMap",
      "com.google.javascript.rhino.JSDocInfo$NamePosition",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.ReverseOrdering",
      "com.google.javascript.rhino.jstype.ObjectType$Property",
      "com.google.javascript.rhino.Node$AbstractPropListItem",
      "com.google.common.collect.ForwardingCollection",
      "com.google.common.collect.AbstractMultimap$KeySet",
      "com.google.javascript.rhino.jstype.NoResolvedType",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.google.common.collect.Maps$EntryTransformer",
      "com.google.common.collect.Ordering",
      "com.google.common.collect.NaturalOrdering",
      "com.google.javascript.rhino.JSDocInfo$StringPosition",
      "com.google.javascript.rhino.jstype.NoType",
      "com.google.common.collect.ListMultimap",
      "com.google.javascript.rhino.JSDocInfo$Visibility",
      "com.google.common.base.FunctionalEquivalence",
      "com.google.common.collect.AbstractMultimap$WrappedCollection",
      "com.google.javascript.rhino.jstype.FunctionParamBuilder",
      "com.google.javascript.rhino.jstype.TernaryValue$1",
      "com.google.common.collect.Multimaps$AsMap",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.collect.Multimaps$Values$1",
      "com.google.javascript.rhino.jstype.TernaryValue$3",
      "com.google.common.collect.AbstractMultimap$WrappedCollection$WrappedIterator",
      "com.google.javascript.rhino.jstype.TernaryValue$2",
      "com.google.common.collect.Lists$TransformingRandomAccessList",
      "com.google.javascript.rhino.Node$PropListItem",
      "com.google.common.collect.RegularImmutableMap$KeySet",
      "com.google.common.collect.Maps$KeySet",
      "com.google.common.collect.ImmutableSet$TransformedImmutableSet$1",
      "com.google.common.collect.LinkedHashMultimap",
      "com.google.javascript.rhino.Node",
      "com.google.javascript.rhino.SourcePosition",
      "com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition",
      "com.google.common.collect.EmptyImmutableMultiset",
      "com.google.common.collect.AbstractMultimap$2",
      "com.google.common.collect.AbstractMultimap$4",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.common.collect.LexicographicalOrdering",
      "com.google.common.collect.Multimaps$EntrySet",
      "com.google.common.collect.ImmutableListMultimap",
      "com.google.common.collect.ImmutableCollection$SerializedForm",
      "com.google.common.collect.Maps$AbstractFilteredMap",
      "com.google.javascript.rhino.jstype.VoidType",
      "com.google.common.collect.Iterables",
      "com.google.javascript.rhino.jstype.JSType",
      "com.google.common.collect.ImmutableAsList",
      "com.google.common.collect.Sets$SetView",
      "com.google.common.collect.ImmutableSet$Builder",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.common.collect.ImmutableList$SerializedForm",
      "com.google.common.collect.ImmutableSetMultimap$Builder",
      "com.google.common.collect.Multimaps",
      "com.google.javascript.rhino.jstype.UnionTypeBuilder",
      "com.google.javascript.rhino.jstype.ParameterizedType",
      "com.google.javascript.rhino.Node$SideEffectFlags",
      "com.google.common.collect.ImmutableMultiset",
      "com.google.common.collect.UsingToStringOrdering",
      "com.google.common.collect.RegularImmutableMap$TerminalEntry",
      "com.google.javascript.rhino.jstype.NullType",
      "com.google.common.collect.EmptyImmutableList$1",
      "com.google.common.collect.Lists$TransformingSequentialList",
      "com.google.common.collect.Sets$InvertibleFunction",
      "com.google.common.collect.ObjectArrays",
      "com.google.javascript.rhino.jstype.NoObjectType",
      "com.google.common.collect.AbstractIterator",
      "com.google.javascript.rhino.jstype.FunctionBuilder",
      "com.google.common.collect.MapDifference",
      "com.google.common.collect.SortedIterable",
      "com.google.javascript.rhino.jstype.ErrorFunctionType",
      "com.google.javascript.rhino.jstype.FunctionType",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.ImmutableSet$TransformedImmutableSet",
      "com.google.common.collect.AbstractMultimap$WrappedList",
      "com.google.common.collect.EmptyImmutableSortedSet",
      "com.google.javascript.rhino.jstype.TernaryValue",
      "com.google.common.collect.ImmutableCollection$1",
      "com.google.javascript.rhino.Node$AncestorIterable",
      "com.google.common.collect.AbstractMultimap$RandomAccessWrappedList",
      "com.google.common.collect.ImmutableEnumSet",
      "com.google.common.collect.Lists$RandomAccessListWrapper",
      "com.google.javascript.rhino.jstype.RecordTypeBuilder",
      "com.google.common.collect.ImmutableMultiset$EntrySet",
      "com.google.javascript.rhino.jstype.UnresolvedTypeExpression",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.google.javascript.rhino.jstype.UnionType",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.javascript.rhino.jstype.JSTypeRegistry$1",
      "com.google.javascript.rhino.jstype.StaticSlot",
      "com.google.common.collect.AbstractSetMultimap",
      "com.google.common.base.Function",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.ComparatorOrdering",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.javascript.rhino.jstype.SimpleSlot",
      "com.google.common.collect.AbstractMultimap$SortedKeySet",
      "com.google.common.collect.Multiset$Entry",
      "com.google.common.collect.Sets",
      "com.google.common.collect.ImmutableCollection$EmptyImmutableCollection",
      "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo",
      "com.google.javascript.rhino.Node$ObjectPropListItem",
      "com.google.common.collect.ExplicitOrdering",
      "com.google.javascript.rhino.jstype.BooleanLiteralSet",
      "com.google.common.collect.AbstractMultimap$SortedAsMap",
      "com.google.common.collect.ImmutableList$Builder",
      "com.google.common.collect.Iterables$2",
      "com.google.common.collect.Iterables$3",
      "com.google.common.collect.ForwardingObject",
      "com.google.common.collect.EmptyImmutableMap",
      "com.google.common.collect.Multimap",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.CompoundOrdering",
      "com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation",
      "com.google.common.collect.ImmutableMultiset$Builder",
      "com.google.common.collect.ImmutableCollection$ArrayImmutableCollection",
      "com.google.common.base.PairwiseEquivalence",
      "com.google.javascript.rhino.jstype.StringType",
      "com.google.common.collect.Ordering$IncomparableValueException",
      "com.google.common.collect.ImmutableMultiset$1",
      "com.google.javascript.rhino.jstype.JSTypeRegistry",
      "com.google.common.collect.RegularImmutableMap$EntrySet",
      "com.google.common.base.Equivalence",
      "com.google.javascript.rhino.jstype.RecordTypeBuilder$RecordProperty",
      "com.google.javascript.rhino.jstype.Visitor",
      "com.google.javascript.rhino.jstype.JSTypeNative",
      "com.google.javascript.rhino.jstype.AllType",
      "com.google.common.collect.ReverseNaturalOrdering",
      "com.google.common.collect.Maps",
      "com.google.common.primitives.Ints",
      "com.google.common.collect.SetMultimap",
      "com.google.common.collect.AbstractMultimap$AsMap$AsMapEntries",
      "com.google.javascript.rhino.jstype.FunctionType$Kind",
      "com.google.javascript.rhino.JSTypeExpression",
      "com.google.common.collect.SingletonImmutableMap$Values",
      "com.google.common.collect.RegularImmutableMap$Values",
      "com.google.common.collect.RegularImmutableSortedSet"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(FunctionType_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.javascript.rhino.jstype.JSType$1",
      "com.google.javascript.rhino.jstype.JSType",
      "com.google.javascript.rhino.jstype.ObjectType",
      "com.google.javascript.rhino.jstype.PrototypeObjectType",
      "com.google.javascript.rhino.jstype.FunctionType",
      "com.google.javascript.rhino.jstype.JSTypeNative",
      "com.google.common.collect.ImmutableCollection$EmptyImmutableCollection",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.RegularImmutableList",
      "com.google.javascript.rhino.jstype.FunctionType$Kind",
      "com.google.javascript.rhino.SimpleErrorReporter",
      "com.google.javascript.rhino.jstype.JSTypeRegistry",
      "com.google.common.base.Joiner",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.Collections2",
      "com.google.common.base.Joiner$MapJoiner",
      "com.google.common.collect.Maps",
      "com.google.common.collect.AbstractMultimap",
      "com.google.common.collect.AbstractSetMultimap",
      "com.google.common.collect.LinkedHashMultimap",
      "com.google.common.collect.Sets",
      "com.google.common.collect.AbstractListMultimap",
      "com.google.common.collect.ArrayListMultimap",
      "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode",
      "com.google.javascript.rhino.jstype.ValueType",
      "com.google.javascript.rhino.jstype.BooleanType",
      "com.google.javascript.rhino.jstype.NullType",
      "com.google.javascript.rhino.jstype.NumberType",
      "com.google.javascript.rhino.jstype.StringType",
      "com.google.javascript.rhino.jstype.UnknownType",
      "com.google.javascript.rhino.jstype.VoidType",
      "com.google.javascript.rhino.jstype.AllType",
      "com.google.javascript.rhino.jstype.FunctionParamBuilder",
      "com.google.javascript.rhino.Node",
      "com.google.javascript.rhino.Node$StringNode",
      "com.google.javascript.rhino.Node$AbstractPropListItem",
      "com.google.javascript.rhino.Node$IntPropListItem",
      "com.google.javascript.rhino.jstype.ArrowType",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.EmptyImmutableList$1",
      "com.google.common.collect.EmptyImmutableList",
      "com.google.javascript.rhino.jstype.InstanceObjectType",
      "com.google.javascript.rhino.jstype.ObjectType$Property",
      "com.google.common.collect.Lists",
      "com.google.javascript.rhino.jstype.NoObjectType",
      "com.google.javascript.rhino.jstype.NoType",
      "com.google.javascript.rhino.jstype.NoResolvedType",
      "com.google.javascript.rhino.jstype.ErrorFunctionType",
      "com.google.javascript.rhino.jstype.UnionTypeBuilder",
      "com.google.javascript.rhino.jstype.UnionType",
      "com.google.common.collect.Iterators$1",
      "com.google.common.collect.Iterators$2",
      "com.google.common.collect.Iterators",
      "com.google.javascript.rhino.jstype.FunctionBuilder",
      "com.google.javascript.rhino.jstype.JSTypeRegistry$1",
      "com.google.javascript.rhino.jstype.ProxyObjectType",
      "com.google.javascript.rhino.jstype.IndexedType",
      "com.google.javascript.rhino.jstype.NamedType",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.EmptyImmutableSet",
      "com.google.javascript.rhino.jstype.ModificationVisitor",
      "com.google.javascript.rhino.jstype.RecordType",
      "com.google.javascript.rhino.Node$NumberNode",
      "com.google.javascript.rhino.jstype.EnumType",
      "com.google.javascript.rhino.jstype.EnumElementType",
      "com.google.common.primitives.Ints",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.Iterators$12",
      "com.google.common.collect.ForwardingObject",
      "com.google.common.collect.ForwardingCollection",
      "com.google.common.collect.ForwardingSet",
      "com.google.common.collect.LinkedHashMultimap$SetDecorator",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.ImmutableEntry",
      "com.google.javascript.rhino.jstype.TernaryValue",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.javascript.rhino.jstype.ParameterizedType",
      "com.google.javascript.rhino.Node$SiblingNodeIterable",
      "com.google.common.collect.Iterators$13",
      "com.google.javascript.rhino.JSDocInfo",
      "com.google.javascript.rhino.Node$ObjectPropListItem",
      "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo",
      "com.google.javascript.rhino.jstype.TemplateType",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.ImmutableList$Builder",
      "com.google.javascript.rhino.jstype.JSType$TypePair",
      "com.google.javascript.rhino.jstype.UnresolvedTypeExpression",
      "com.google.common.collect.Iterables",
      "com.google.common.collect.Iterables$IterableWithToString",
      "com.google.common.collect.Iterables$2",
      "com.google.common.collect.Iterables$3",
      "com.google.common.collect.Iterators$5",
      "com.google.javascript.rhino.jstype.JSType$2",
      "com.google.javascript.rhino.jstype.RecordTypeBuilder$RecordProperty",
      "com.google.common.collect.SingletonImmutableList$1",
      "com.google.javascript.rhino.InputId",
      "com.google.common.collect.AbstractMultimap$WrappedCollection",
      "com.google.common.collect.AbstractMultimap$WrappedSet",
      "com.google.javascript.rhino.Token",
      "com.google.javascript.rhino.Node$SideEffectFlags",
      "com.google.javascript.rhino.jstype.RecordTypeBuilder",
      "com.google.javascript.rhino.Node$FileLevelJsDocBuilder",
      "com.google.common.collect.Multimaps$Values",
      "com.google.common.collect.AbstractMultimap$2",
      "com.google.common.collect.Multimaps$Entries",
      "com.google.common.collect.AbstractMultimap$4",
      "com.google.common.collect.AbstractMultimap$EntryIterator",
      "com.google.common.collect.Multimaps$Values$1",
      "com.google.javascript.rhino.jstype.SimpleSourceFile",
      "com.google.javascript.rhino.jstype.SimpleSlot",
      "com.google.javascript.rhino.jstype.BooleanLiteralSet",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.google.common.collect.ObjectArrays",
      "com.google.common.collect.RegularImmutableList$1",
      "com.google.common.collect.ImmutableList$ReverseImmutableList$1",
      "com.google.common.collect.AbstractMultimap$WrappedList",
      "com.google.common.collect.AbstractMultimap$RandomAccessWrappedList",
      "com.google.common.collect.AbstractMultimap$WrappedCollection$WrappedIterator",
      "com.google.javascript.rhino.Node$NodeMismatch"
    );
  }
}
