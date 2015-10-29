/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bugvm.apple.multipeerconnectivity;

/*<imports>*/
import java.util.*;

import com.bugvm.apple.foundation.*;
import com.bugvm.apple.security.SecIdentity;
import com.bugvm.objc.ObjCRuntime;
import com.bugvm.objc.annotation.Block;
import com.bugvm.objc.annotation.Method;
import com.bugvm.objc.annotation.NativeClass;
import com.bugvm.objc.annotation.Property;
import com.bugvm.objc.block.VoidBlock1;
import com.bugvm.objc.block.VoidBlock2;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 7.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MultipeerConnectivity") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MCSession/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MCSessionPtr extends Ptr<MCSession, MCSessionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MCSession.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MCSession() {}
    protected MCSession(SkipInit skipInit) { super(skipInit); }
    public MCSession(MCPeerID myPeerID) { super((SkipInit) null); initObject(init(myPeerID)); }
    @WeaklyLinked
    public MCSession(MCPeerID myPeerID, @com.bugvm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<SecIdentity> identity, MCEncryptionPreference encryptionPreference) { super((SkipInit) null); initObject(init(myPeerID, identity, encryptionPreference)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native MCSessionDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(MCSessionDelegate v);
    @Property(selector = "myPeerID")
    public native MCPeerID getMyPeerID();
    @WeaklyLinked
    @Property(selector = "securityIdentity")
    public native @com.bugvm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<SecIdentity> getSecurityIdentity();
    @Property(selector = "encryptionPreference")
    public native MCEncryptionPreference getEncryptionPreference();
    @Property(selector = "connectedPeers")
    public native NSArray<MCPeerID> getConnectedPeers();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="kMCSessionMinimumNumberOfPeers", optional=true)
    public static native @MachineSizedUInt long getMinimumNumberOfPeers();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="kMCSessionMaximumNumberOfPeers", optional=true)
    public static native @MachineSizedUInt long getMaximumNumberOfPeers();
    
    @Method(selector = "initWithPeer:")
    protected native @Pointer long init(MCPeerID myPeerID);
    @WeaklyLinked
    @Method(selector = "initWithPeer:securityIdentity:encryptionPreference:")
    protected native @Pointer long init(MCPeerID myPeerID, @com.bugvm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<SecIdentity> identity, MCEncryptionPreference encryptionPreference);
    public boolean sendData(NSData data, NSArray<MCPeerID> peerIDs, MCSessionSendDataMode mode) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = sendData(data, peerIDs, mode, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "sendData:toPeers:withMode:error:")
    private native boolean sendData(NSData data, NSArray<MCPeerID> peerIDs, MCSessionSendDataMode mode, NSError.NSErrorPtr error);
    @Method(selector = "disconnect")
    public native void disconnect();
    @Method(selector = "sendResourceAtURL:withName:toPeer:withCompletionHandler:")
    public native NSProgress sendResource(NSURL resourceURL, String resourceName, MCPeerID peerID, @Block VoidBlock1<NSError> completionHandler);
    public NSOutputStream startStream(String streamName, MCPeerID peerID) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSOutputStream result = startStream(streamName, peerID, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "startStreamWithName:toPeer:error:")
    private native NSOutputStream startStream(String streamName, MCPeerID peerID, NSError.NSErrorPtr error);
    @Method(selector = "nearbyConnectionDataForPeer:withCompletionHandler:")
    public native void requestNearbyConnectionData(MCPeerID peerID, @Block VoidBlock2<NSData, NSError> completionHandler);
    @Method(selector = "connectPeer:withNearbyConnectionData:")
    public native void connectPeer(MCPeerID peerID, NSData data);
    @Method(selector = "cancelConnectPeer:")
    public native void cancelConnectPeer(MCPeerID peerID);
    /*</methods>*/
}