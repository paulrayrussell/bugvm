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
import com.bugvm.objc.annotation.Method;
import com.bugvm.objc.annotation.NativeClass;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 5.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSJSONSerialization/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSJSONSerializationPtr extends Ptr<NSJSONSerialization, NSJSONSerializationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSJSONSerialization.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSJSONSerialization() {}
    protected NSJSONSerialization(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "isValidJSONObject:")
    public static native boolean isValidJSONObject(NSObject obj);
    public static NSData createJSONData(NSObject obj, NSJSONWritingOptions opt) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSData result = createJSONData(obj, opt, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "dataWithJSONObject:options:error:")
    private static native NSData createJSONData(NSObject obj, NSJSONWritingOptions opt, NSError.NSErrorPtr error);
    public static NSObject createJSONObject(NSData data, NSJSONReadingOptions opt) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSObject result = createJSONObject(data, opt, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "JSONObjectWithData:options:error:")
    private static native NSObject createJSONObject(NSData data, NSJSONReadingOptions opt, NSError.NSErrorPtr error);
    public static @MachineSizedSInt long writeJSONObject(NSObject obj, NSOutputStream stream, NSJSONWritingOptions opt) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       long result = writeJSONObject(obj, stream, opt, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "writeJSONObject:toStream:options:error:")
    private static native @MachineSizedSInt long writeJSONObject(NSObject obj, NSOutputStream stream, NSJSONWritingOptions opt, NSError.NSErrorPtr error);
    public static NSObject readJSONObject(NSInputStream stream, NSJSONReadingOptions opt) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSObject result = readJSONObject(stream, opt, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "JSONObjectWithStream:options:error:")
    private static native NSObject readJSONObject(NSInputStream stream, NSJSONReadingOptions opt, NSError.NSErrorPtr error);
    /*</methods>*/
}