// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/stitcher/v1/cdn_keys.proto

package com.google.cloud.video.stitcher.v1;

public interface AkamaiCdnKeyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.stitcher.v1.AkamaiCdnKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Input only. Token key for the Akamai CDN edge configuration.
   * </pre>
   *
   * <code>bytes token_key = 1 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   * @return The tokenKey.
   */
  com.google.protobuf.ByteString getTokenKey();
}
