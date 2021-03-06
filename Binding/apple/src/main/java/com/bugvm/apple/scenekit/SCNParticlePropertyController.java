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
package com.bugvm.apple.scenekit;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import com.bugvm.objc.*;
import com.bugvm.objc.annotation.*;
import com.bugvm.objc.block.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
import com.bugvm.apple.foundation.*;
import com.bugvm.apple.uikit.*;
import com.bugvm.apple.coregraphics.*;
import com.bugvm.apple.coreanimation.*;
import com.bugvm.apple.dispatch.*;
import com.bugvm.apple.glkit.*;
import com.bugvm.apple.spritekit.*;
import com.bugvm.apple.opengles.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("SceneKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SCNParticlePropertyController/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SCNParticlePropertyControllerPtr extends Ptr<SCNParticlePropertyController, SCNParticlePropertyControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SCNParticlePropertyController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SCNParticlePropertyController() {}
    protected SCNParticlePropertyController(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "animation")
    public native CAAnimation getAnimation();
    @Property(selector = "setAnimation:")
    public native void setAnimation(CAAnimation v);
    @Property(selector = "inputMode")
    public native SCNParticleInputMode getInputMode();
    @Property(selector = "setInputMode:")
    public native void setInputMode(SCNParticleInputMode v);
    @Property(selector = "inputScale")
    public native @MachineSizedFloat double getInputScale();
    @Property(selector = "setInputScale:")
    public native void setInputScale(@MachineSizedFloat double v);
    @Property(selector = "inputBias")
    public native @MachineSizedFloat double getInputBias();
    @Property(selector = "setInputBias:")
    public native void setInputBias(@MachineSizedFloat double v);
    @Property(selector = "inputOrigin")
    public native SCNNode getInputOrigin();
    @Property(selector = "setInputOrigin:", strongRef = true)
    public native void setInputOrigin(SCNNode v);
    @Property(selector = "inputProperty")
    public native SCNParticleProperty getInputProperty();
    @Property(selector = "setInputProperty:")
    public native void setInputProperty(SCNParticleProperty v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "controllerWithAnimation:")
    public static native SCNParticlePropertyController create(CAAnimation animation);
    /*</methods>*/
}
