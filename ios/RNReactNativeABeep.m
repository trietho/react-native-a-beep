
#import "RNReactNativeABeep.h"
#import <AudioToolbox/AudioToolbox.h>

@implementation RNReactNativeABeep

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}

RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(PlaySysSound: (nonnull NSInteger *) soundID){
    
    AudioServicesPlaySystemSound (soundID);
}

@end
  
