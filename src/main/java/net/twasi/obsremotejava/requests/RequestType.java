package net.twasi.obsremotejava.requests;

public enum RequestType {
    GetVersion,
    GetAuthRequired,
    Authenticate,

    SetCurrentScene,
    GetSceneList,
    GetCurrentScene,

    SetCurrentTransition,

    GetSceneItemProperties,
    SetSceneItemProperties,
    ReorderSceneItems,

    GetTransitionList,

    GetStudioModeStatus,
    EnableStudioMode,
    DisableStudioMode,
    TransitionToProgram,
    GetPreviewScene,
    SetPreviewScene,

    GetSourceSettings,
    SetSourceSettings,

    GetStreamingStatus,
    StartRecording,
    StopRecording,
    StartStreaming,
    StopStreaming,
    StartRecording,
    StopRecording,

    SetCurrentProfile,
    GetCurrentProfile,
    ListProfiles,

    SetVolume,
    SetMute,
    GetVolume,

    GetTransitionDuration,
    SetTransitionDuration,

    StartReplayBuffer,
    StopReplayBuffer,
    SaveReplayBuffer
}
