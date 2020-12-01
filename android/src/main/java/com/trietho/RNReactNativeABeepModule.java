
package com.trietho;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import android.media.ToneGenerator;
import android.media.AudioManager;

public class RNReactNativeABeepModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;
  private ToneGenerator toneGen1 = new ToneGenerator(AudioManager.STREAM_SYSTEM, 100);
  public RNReactNativeABeepModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNReactNativeABeep";
  }

  @ReactMethod
    public void PlaySysSound(int soundID) {

      //toneGen1.startTone(ToneGenerator.TONE_CDMA_PIP,150);
      toneGen1.startTone(soundID);
    }

  @ReactMethod
  public void StopSysSound() {

    //toneGen1.startTone(ToneGenerator.TONE_CDMA_PIP,150);
    toneGen1.stopTone();
  }
}
