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
package com.bugvm.apple.foundation;

/*<imports>*/

import com.bugvm.objc.ObjCRuntime;
import com.bugvm.objc.Selector;
import com.bugvm.objc.annotation.Method;
import com.bugvm.objc.annotation.NativeClass;
import com.bugvm.objc.annotation.Property;
import com.bugvm.objc.block.VoidBlock1;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSThread/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    public static class Notifications {
        public static NSObject observeWillBecomeMultiThreaded(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(WillBecomeMultiThreadedNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.run();
                }
            });
        }
        public static NSObject observeDidBecomeSingleThreaded(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(DidBecomeSingleThreadedNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.run();
                }
            });
        }
        public static NSObject observeWillExit(NSThread object, final VoidBlock1<NSThread> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(WillExitNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((NSThread) a.getObject());
                }
            });
        }
    }
    
    /*<ptr>*/public static class NSThreadPtr extends Ptr<NSThread, NSThreadPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSThread.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSThread() {}
    protected NSThread(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 2.0 and later.
     */
    public NSThread(NSObject target, Selector selector, NSObject argument) { super((SkipInit) null); initObject(init(target, selector, argument)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "threadDictionary")
    public native NSMutableDictionary<?, ?> getThreadDictionary();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "qualityOfService")
    public native NSQualityOfService getQualityOfService();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "setQualityOfService:")
    public native void setQualityOfService(NSQualityOfService v);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Property(selector = "name")
    public native String getName();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Property(selector = "setName:")
    public native void setName(String v);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Property(selector = "stackSize")
    public native @MachineSizedUInt long getStackSize();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Property(selector = "setStackSize:")
    public native void setStackSize(@MachineSizedUInt long v);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Property(selector = "isMainThread")
    public native boolean isMainThread();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Property(selector = "isExecuting")
    public native boolean isExecuting();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Property(selector = "isFinished")
    public native boolean isFinished();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Property(selector = "isCancelled")
    public native boolean isCancelled();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="NSWillBecomeMultiThreadedNotification", optional=true)
    public static native NSString WillBecomeMultiThreadedNotification();
    @GlobalValue(symbol="NSDidBecomeSingleThreadedNotification", optional=true)
    public static native NSString DidBecomeSingleThreadedNotification();
    @GlobalValue(symbol="NSThreadWillExitNotification", optional=true)
    public static native NSString WillExitNotification();
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Method(selector = "initWithTarget:selector:object:")
    protected native @Pointer long init(NSObject target, Selector selector, NSObject argument);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Method(selector = "cancel")
    public native void cancel();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Method(selector = "start")
    public native void start();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Method(selector = "main")
    public native void main();
    @Method(selector = "currentThread")
    public static native NSThread getCurrentThread();
    @Method(selector = "detachNewThreadSelector:toTarget:withObject:")
    public static native void detachNewThread(Selector selector, NSObject target, NSObject argument);
    @Method(selector = "isMultiThreaded")
    public static native boolean isMultiThreaded();
    @Method(selector = "sleepUntilDate:")
    public static native void sleep(NSDate date);
    @Method(selector = "sleepForTimeInterval:")
    public static native void sleep(double ti);
    @Method(selector = "exit")
    public static native void exit();
    @Method(selector = "threadPriority")
    public static native double getThreadPriority();
    @Method(selector = "setThreadPriority:")
    public static native boolean setThreadPriority(double p);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Method(selector = "isMainThread")
    public static native boolean isCurrentThreadMainThread();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Method(selector = "mainThread")
    public static native NSThread getMainThread();
    /*</methods>*/
}