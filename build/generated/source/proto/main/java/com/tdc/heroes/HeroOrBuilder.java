// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Heroes.proto

package com.tdc.heroes;

public interface HeroOrBuilder extends
    // @@protoc_insertion_point(interface_extends:heroes.Hero)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string nickname = 1;</code>
   * @return The nickname.
   */
  java.lang.String getNickname();
  /**
   * <code>string nickname = 1;</code>
   * @return The bytes for nickname.
   */
  com.google.protobuf.ByteString
      getNicknameBytes();

  /**
   * <code>repeated .heroes.Skill skills = 2;</code>
   */
  java.util.List<com.tdc.heroes.Skill> 
      getSkillsList();
  /**
   * <code>repeated .heroes.Skill skills = 2;</code>
   */
  com.tdc.heroes.Skill getSkills(int index);
  /**
   * <code>repeated .heroes.Skill skills = 2;</code>
   */
  int getSkillsCount();
  /**
   * <code>repeated .heroes.Skill skills = 2;</code>
   */
  java.util.List<? extends com.tdc.heroes.SkillOrBuilder> 
      getSkillsOrBuilderList();
  /**
   * <code>repeated .heroes.Skill skills = 2;</code>
   */
  com.tdc.heroes.SkillOrBuilder getSkillsOrBuilder(
      int index);
}
