# react-native-a-beep
Play system sounds and beep for react-native apps

## Install
npm install "react-native-a-beep"
react-native link

## Usage
import RNBeep from 'react-native-a-beep';

Examples:

        <Button onPress={() => {RNBeep.beep() }} title="Beep Success"></Button>
        <Button onPress={() => {RNBeep.beep(false) }} title="Beep Fail"></Button>
        <Button onPress={() => {RNBeep.PlaySysSound(RNBeep.AndroidSoundIDs.TONE_CDMA_ABBR_ALERT) }} title="Beep Android Custom"></Button>
        <Button onPress={() => {RNBeep.PlaySysSound(RNBeep.iOSSoundIDs.AudioToneBusy) }} title="Beep iOS Custom"></Button>
        
Happy Beep!

FREE!
