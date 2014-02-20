/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: C:\\Users\\benjamin\\Documents\\Android\\workspace\\Ioarmband_android_library\\src\\org\\ioarmband\\android\\connection\\aidl\\RemoteCommunicationServiceListener.aidl
 */
package org.ioarmband.android.connection.aidl;
public interface RemoteCommunicationServiceListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements org.ioarmband.android.connection.aidl.RemoteCommunicationServiceListener
{
private static final java.lang.String DESCRIPTOR = "org.ioarmband.android.connection.aidl.RemoteCommunicationServiceListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an org.ioarmband.android.connection.aidl.RemoteCommunicationServiceListener interface,
 * generating a proxy if needed.
 */
public static org.ioarmband.android.connection.aidl.RemoteCommunicationServiceListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof org.ioarmband.android.connection.aidl.RemoteCommunicationServiceListener))) {
return ((org.ioarmband.android.connection.aidl.RemoteCommunicationServiceListener)iin);
}
return new org.ioarmband.android.connection.aidl.RemoteCommunicationServiceListener.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_onConnectionStarted:
{
data.enforceInterface(DESCRIPTOR);
this.onConnectionStarted();
reply.writeNoException();
return true;
}
case TRANSACTION_onWinControl:
{
data.enforceInterface(DESCRIPTOR);
this.onWinControl();
reply.writeNoException();
return true;
}
case TRANSACTION_onCommandReiceved:
{
data.enforceInterface(DESCRIPTOR);
org.ioarmband.android.connection.message.impl.android.MessageContainer _arg0;
if ((0!=data.readInt())) {
_arg0 = org.ioarmband.android.connection.message.impl.android.MessageContainer.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onCommandReiceved(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onLoseControl:
{
data.enforceInterface(DESCRIPTOR);
this.onLoseControl();
reply.writeNoException();
return true;
}
case TRANSACTION_onConnectionClose:
{
data.enforceInterface(DESCRIPTOR);
this.onConnectionClose();
reply.writeNoException();
return true;
}
case TRANSACTION_getIdClass:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getIdClass();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_isEquals:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.isEquals(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isEqual:
{
data.enforceInterface(DESCRIPTOR);
org.ioarmband.android.connection.aidl.RemoteCommunicationServiceListener _arg0;
_arg0 = org.ioarmband.android.connection.aidl.RemoteCommunicationServiceListener.Stub.asInterface(data.readStrongBinder());
boolean _result = this.isEqual(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements org.ioarmband.android.connection.aidl.RemoteCommunicationServiceListener
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public void onConnectionStarted() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onConnectionStarted, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onWinControl() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onWinControl, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onCommandReiceved(org.ioarmband.android.connection.message.impl.android.MessageContainer command) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((command!=null)) {
_data.writeInt(1);
command.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onCommandReiceved, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onLoseControl() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onLoseControl, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onConnectionClose() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onConnectionClose, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.lang.String getIdClass() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getIdClass, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isEquals(java.lang.String idClass) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(idClass);
mRemote.transact(Stub.TRANSACTION_isEquals, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isEqual(org.ioarmband.android.connection.aidl.RemoteCommunicationServiceListener connection) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((connection!=null))?(connection.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_isEqual, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_onConnectionStarted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onWinControl = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onCommandReiceved = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onLoseControl = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onConnectionClose = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getIdClass = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_isEquals = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_isEqual = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
}
public void onConnectionStarted() throws android.os.RemoteException;
public void onWinControl() throws android.os.RemoteException;
public void onCommandReiceved(org.ioarmband.android.connection.message.impl.android.MessageContainer command) throws android.os.RemoteException;
public void onLoseControl() throws android.os.RemoteException;
public void onConnectionClose() throws android.os.RemoteException;
public java.lang.String getIdClass() throws android.os.RemoteException;
public boolean isEquals(java.lang.String idClass) throws android.os.RemoteException;
public boolean isEqual(org.ioarmband.android.connection.aidl.RemoteCommunicationServiceListener connection) throws android.os.RemoteException;
}
