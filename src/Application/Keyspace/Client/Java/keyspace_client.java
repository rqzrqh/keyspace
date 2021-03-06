/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.31
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.scalien.keyspace;

public class keyspace_client {
  public static long imaxabs(long n) {
    return keyspace_clientJNI.imaxabs(n);
  }

  public static imaxdiv_t imaxdiv(long numer, long denom) {
    return new imaxdiv_t(keyspace_clientJNI.imaxdiv(numer, denom), true);
  }

  public static long strtoimax(String nptr, SWIGTYPE_p_p_char endptr, int base) {
    return keyspace_clientJNI.strtoimax(nptr, SWIGTYPE_p_p_char.getCPtr(endptr), base);
  }

  public static java.math.BigInteger strtoumax(String nptr, SWIGTYPE_p_p_char endptr, int base) {
    return keyspace_clientJNI.strtoumax(nptr, SWIGTYPE_p_p_char.getCPtr(endptr), base);
  }

  public static void Keyspace_ResultBegin(SWIGTYPE_p_void result) {
    keyspace_clientJNI.Keyspace_ResultBegin(SWIGTYPE_p_void.getCPtr(result));
  }

  public static void Keyspace_ResultNext(SWIGTYPE_p_void result) {
    keyspace_clientJNI.Keyspace_ResultNext(SWIGTYPE_p_void.getCPtr(result));
  }

  public static boolean Keyspace_ResultIsEnd(SWIGTYPE_p_void result) {
    return keyspace_clientJNI.Keyspace_ResultIsEnd(SWIGTYPE_p_void.getCPtr(result));
  }

  public static void Keyspace_ResultClose(SWIGTYPE_p_void result) {
    keyspace_clientJNI.Keyspace_ResultClose(SWIGTYPE_p_void.getCPtr(result));
  }

  public static String Keyspace_ResultKey(SWIGTYPE_p_void result) {
    return keyspace_clientJNI.Keyspace_ResultKey(SWIGTYPE_p_void.getCPtr(result));
  }

  public static String Keyspace_ResultValue(SWIGTYPE_p_void result) {
    return keyspace_clientJNI.Keyspace_ResultValue(SWIGTYPE_p_void.getCPtr(result));
  }

  public static int Keyspace_ResultTransportStatus(SWIGTYPE_p_void result) {
    return keyspace_clientJNI.Keyspace_ResultTransportStatus(SWIGTYPE_p_void.getCPtr(result));
  }

  public static int Keyspace_ResultConnectivityStatus(SWIGTYPE_p_void result) {
    return keyspace_clientJNI.Keyspace_ResultConnectivityStatus(SWIGTYPE_p_void.getCPtr(result));
  }

  public static int Keyspace_ResultTimeoutStatus(SWIGTYPE_p_void result) {
    return keyspace_clientJNI.Keyspace_ResultTimeoutStatus(SWIGTYPE_p_void.getCPtr(result));
  }

  public static int Keyspace_ResultCommandStatus(SWIGTYPE_p_void result) {
    return keyspace_clientJNI.Keyspace_ResultCommandStatus(SWIGTYPE_p_void.getCPtr(result));
  }

  public static SWIGTYPE_p_void Keyspace_Create() {
    long cPtr = keyspace_clientJNI.Keyspace_Create();
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static int Keyspace_Init(SWIGTYPE_p_void client, Keyspace_NodeParams params) {
    return keyspace_clientJNI.Keyspace_Init(SWIGTYPE_p_void.getCPtr(client), Keyspace_NodeParams.getCPtr(params), params);
  }

  public static void Keyspace_Destroy(SWIGTYPE_p_void client) {
    keyspace_clientJNI.Keyspace_Destroy(SWIGTYPE_p_void.getCPtr(client));
  }

  public static SWIGTYPE_p_void Keyspace_GetResult(SWIGTYPE_p_void arg0) {
    long cPtr = keyspace_clientJNI.Keyspace_GetResult(SWIGTYPE_p_void.getCPtr(arg0));
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static void Keyspace_SetGlobalTimeout(SWIGTYPE_p_void client, java.math.BigInteger timeout) {
    keyspace_clientJNI.Keyspace_SetGlobalTimeout(SWIGTYPE_p_void.getCPtr(client), timeout);
  }

  public static void Keyspace_SetMasterTimeout(SWIGTYPE_p_void client, java.math.BigInteger timeout) {
    keyspace_clientJNI.Keyspace_SetMasterTimeout(SWIGTYPE_p_void.getCPtr(client), timeout);
  }

  public static java.math.BigInteger Keyspace_GetGlobalTimeout(SWIGTYPE_p_void client) {
    return keyspace_clientJNI.Keyspace_GetGlobalTimeout(SWIGTYPE_p_void.getCPtr(client));
  }

  public static java.math.BigInteger Keyspace_GetMasterTimeout(SWIGTYPE_p_void client) {
    return keyspace_clientJNI.Keyspace_GetMasterTimeout(SWIGTYPE_p_void.getCPtr(client));
  }

  public static int Keyspace_GetMaster(SWIGTYPE_p_void client) {
    return keyspace_clientJNI.Keyspace_GetMaster(SWIGTYPE_p_void.getCPtr(client));
  }

  public static void Keyspace_DistributeDirty(SWIGTYPE_p_void client, boolean dd) {
    keyspace_clientJNI.Keyspace_DistributeDirty(SWIGTYPE_p_void.getCPtr(client), dd);
  }

  public static int Keyspace_Get(SWIGTYPE_p_void client, String key) {
    return keyspace_clientJNI.Keyspace_Get(SWIGTYPE_p_void.getCPtr(client), key);
  }

  public static int Keyspace_DirtyGet(SWIGTYPE_p_void client, String key) {
    return keyspace_clientJNI.Keyspace_DirtyGet(SWIGTYPE_p_void.getCPtr(client), key);
  }

  public static int Keyspace_Count(SWIGTYPE_p_void client, String prefix, String startKey, java.math.BigInteger count, boolean next, boolean forward) {
    return keyspace_clientJNI.Keyspace_Count(SWIGTYPE_p_void.getCPtr(client), prefix, startKey, count, next, forward);
  }

  public static int Keyspace_CountStr(SWIGTYPE_p_void client, String prefix, String startKey, String count, boolean next, boolean forward) {
    return keyspace_clientJNI.Keyspace_CountStr(SWIGTYPE_p_void.getCPtr(client), prefix, startKey, count, next, forward);
  }

  public static int Keyspace_DirtyCount(SWIGTYPE_p_void client, String prefix, String startKey, java.math.BigInteger count, boolean next, boolean forward) {
    return keyspace_clientJNI.Keyspace_DirtyCount(SWIGTYPE_p_void.getCPtr(client), prefix, startKey, count, next, forward);
  }

  public static int Keyspace_DirtyCountStr(SWIGTYPE_p_void client, String prefix, String startKey, String count, boolean next, boolean forward) {
    return keyspace_clientJNI.Keyspace_DirtyCountStr(SWIGTYPE_p_void.getCPtr(client), prefix, startKey, count, next, forward);
  }

  public static int Keyspace_ListKeys(SWIGTYPE_p_void client, String prefix, String startKey, java.math.BigInteger count, boolean next, boolean forward) {
    return keyspace_clientJNI.Keyspace_ListKeys(SWIGTYPE_p_void.getCPtr(client), prefix, startKey, count, next, forward);
  }

  public static int Keyspace_ListKeysStr(SWIGTYPE_p_void client, String prefix, String startKey, String count, boolean next, boolean forward) {
    return keyspace_clientJNI.Keyspace_ListKeysStr(SWIGTYPE_p_void.getCPtr(client), prefix, startKey, count, next, forward);
  }

  public static int Keyspace_DirtyListKeys(SWIGTYPE_p_void client, String prefix, String startKey, java.math.BigInteger count, boolean next, boolean forward) {
    return keyspace_clientJNI.Keyspace_DirtyListKeys(SWIGTYPE_p_void.getCPtr(client), prefix, startKey, count, next, forward);
  }

  public static int Keyspace_DirtyListKeysStr(SWIGTYPE_p_void client, String prefix, String startKey, String count, boolean next, boolean forward) {
    return keyspace_clientJNI.Keyspace_DirtyListKeysStr(SWIGTYPE_p_void.getCPtr(client), prefix, startKey, count, next, forward);
  }

  public static int Keyspace_ListKeyValues(SWIGTYPE_p_void client, String prefix, String startKey, java.math.BigInteger count, boolean next, boolean forward) {
    return keyspace_clientJNI.Keyspace_ListKeyValues(SWIGTYPE_p_void.getCPtr(client), prefix, startKey, count, next, forward);
  }

  public static int Keyspace_ListKeyValuesStr(SWIGTYPE_p_void client, String prefix, String startKey, String count, boolean next, boolean forward) {
    return keyspace_clientJNI.Keyspace_ListKeyValuesStr(SWIGTYPE_p_void.getCPtr(client), prefix, startKey, count, next, forward);
  }

  public static int Keyspace_DirtyListKeyValues(SWIGTYPE_p_void client, String prefix, String startKey, java.math.BigInteger count, boolean next, boolean forward) {
    return keyspace_clientJNI.Keyspace_DirtyListKeyValues(SWIGTYPE_p_void.getCPtr(client), prefix, startKey, count, next, forward);
  }

  public static int Keyspace_DirtyListKeyValuesStr(SWIGTYPE_p_void client, String prefix, String startKey, String count, boolean next, boolean forward) {
    return keyspace_clientJNI.Keyspace_DirtyListKeyValuesStr(SWIGTYPE_p_void.getCPtr(client), prefix, startKey, count, next, forward);
  }

  public static int Keyspace_Set(SWIGTYPE_p_void client, String key, String value) {
    return keyspace_clientJNI.Keyspace_Set(SWIGTYPE_p_void.getCPtr(client), key, value);
  }

  public static int Keyspace_TestAndSet(SWIGTYPE_p_void client, String key, String test, String value) {
    return keyspace_clientJNI.Keyspace_TestAndSet(SWIGTYPE_p_void.getCPtr(client), key, test, value);
  }

  public static int Keyspace_Add(SWIGTYPE_p_void client, String key, long num) {
    return keyspace_clientJNI.Keyspace_Add(SWIGTYPE_p_void.getCPtr(client), key, num);
  }

  public static int Keyspace_AddStr(SWIGTYPE_p_void client, String key, String num) {
    return keyspace_clientJNI.Keyspace_AddStr(SWIGTYPE_p_void.getCPtr(client), key, num);
  }

  public static int Keyspace_Delete(SWIGTYPE_p_void client, String key) {
    return keyspace_clientJNI.Keyspace_Delete(SWIGTYPE_p_void.getCPtr(client), key);
  }

  public static int Keyspace_Remove(SWIGTYPE_p_void client, String key) {
    return keyspace_clientJNI.Keyspace_Remove(SWIGTYPE_p_void.getCPtr(client), key);
  }

  public static int Keyspace_Rename(SWIGTYPE_p_void client, String from, String to) {
    return keyspace_clientJNI.Keyspace_Rename(SWIGTYPE_p_void.getCPtr(client), from, to);
  }

  public static int Keyspace_Prune(SWIGTYPE_p_void client, String prefix) {
    return keyspace_clientJNI.Keyspace_Prune(SWIGTYPE_p_void.getCPtr(client), prefix);
  }

  public static int Keyspace_SetExpiry(SWIGTYPE_p_void client, String key, int exptime) {
    return keyspace_clientJNI.Keyspace_SetExpiry(SWIGTYPE_p_void.getCPtr(client), key, exptime);
  }

  public static int Keyspace_RemoveExpiry(SWIGTYPE_p_void client, String key) {
    return keyspace_clientJNI.Keyspace_RemoveExpiry(SWIGTYPE_p_void.getCPtr(client), key);
  }

  public static int Keyspace_ClearExpiries(SWIGTYPE_p_void client) {
    return keyspace_clientJNI.Keyspace_ClearExpiries(SWIGTYPE_p_void.getCPtr(client));
  }

  public static int Keyspace_Begin(SWIGTYPE_p_void client) {
    return keyspace_clientJNI.Keyspace_Begin(SWIGTYPE_p_void.getCPtr(client));
  }

  public static int Keyspace_Submit(SWIGTYPE_p_void client) {
    return keyspace_clientJNI.Keyspace_Submit(SWIGTYPE_p_void.getCPtr(client));
  }

  public static int Keyspace_Cancel(SWIGTYPE_p_void client) {
    return keyspace_clientJNI.Keyspace_Cancel(SWIGTYPE_p_void.getCPtr(client));
  }

  public static boolean Keyspace_IsBatched(SWIGTYPE_p_void client) {
    return keyspace_clientJNI.Keyspace_IsBatched(SWIGTYPE_p_void.getCPtr(client));
  }

  public static void Keyspace_SetTrace(boolean trace) {
    keyspace_clientJNI.Keyspace_SetTrace(trace);
  }

}
