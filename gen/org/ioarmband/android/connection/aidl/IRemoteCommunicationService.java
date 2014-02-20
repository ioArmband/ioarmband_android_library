/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: C:\\Users\\benjamin\\Documents\\Android\\workspace\\Ioarmband_android_library\\src\\org\\ioarmband\\android\\connection\\aidl\\IRemoteCommunicationService.aidl
 */
package org.ioarmband.android.connection.aidl;
public interface IRemoteCommunicationService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements org.ioarmband.android.connection.aidl.IRemoteCommunicationService
{
private static final java.lang.String DESCRIPTOR = "org.ioarmband.android.connection.aidl.IRemoteCommunicationService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an org.ioarmband.android.connection.aidl.IRemoteCommunicationService interface,
 * generating a proxy if needed.
 */
public static org.ioarmband.android.connection.aidl.IRemoteCommunicationService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof org.ioarmband.android.connection.aidl.IRemoteCommunicationService))) {
return ((org.ioarmband.android.connection.aidl.IRemoteCommunicationService)iin);
}
return new org.ioarmband.android.connection.aidl.IRemoteCommunicationService.Stub.Proxy(obj);
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
case TRANSACTION_useConnection:
{
data.enforceInterface(DESCRIPTOR);
org.ioarmband.android.connection.aidl.RemoteCommunicationServiceListener _arg0;
_arg0 = org.ioarmband.android.connection.aidl.RemoteCommunicationServiceListener.Stub.asInterface(data.readStrongBinder());
this.useConnection(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_sendMessage:
{
data.enforceInterface(DESCRIPTOR);
org.ioarmband.android.connection.message.impl.android.MessageContainer _arg0;
if ((0!=data.readInt())) {
_arg0 = org.ioarmband.android.connection.message.impl.android.MessageContainer.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.sendMessage(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unUseConnection:
{
data.enforceInterface(DESCRIPTOR);
org.ioarmband.android.connection.aidl.RemoteCommunicationServiceListener _arg0;
_arg0 = org.ioarmband.android.connection.aidl.RemoteCommunicationServiceListener.Stub.asInterface(data.readStrongBinder());
this.unUseConnection(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements org.ioarmband.android.connection.aidl.IRemoteCommunicationService
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
@Override public void useConnection(org.ioarmband.android.connection.aidl.RemoteCommunicationServiceListener communicationListener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((communicationListener!=null))?(communicationListener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_useConnection, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void sendMessage(org.ioarmband.android.connection.message.impl.android.MessageContainer messageContainer) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((messageContainer!=null)) {
_data.writeInt(1);
messageContainer.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_sendMessage, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unUseConnection(org.ioarmband.android.connection.aidl.RemoteCommunicationServiceListener communicationListener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((communicationListener!=null))?(communicationListener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unUseConnection, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_useConnection = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_sendMessage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_unUseConnection = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
public void useConnection(org.ioarmband.android.connection.aidl.RemoteCommunicationServiceListener communicationListener) throws android.os.RemoteException;
public void sendMessage(org.ioarmband.android.connection.message.impl.android.MessageContainer messageContainer) throws android.os.RemoteException;
public void unUseConnection(org.ioarmband.android.connection.aidl.RemoteCommunicationServiceListener communicationListener) throws android.os.RemoteException;
}
