// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Heroes.proto

package com.tdc.heroes;

public interface MissionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:heroes.Mission)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .heroes.Hero heroes = 1;</code>
   */
  java.util.List<com.tdc.heroes.Hero> 
      getHeroesList();
  /**
   * <code>repeated .heroes.Hero heroes = 1;</code>
   */
  com.tdc.heroes.Hero getHeroes(int index);
  /**
   * <code>repeated .heroes.Hero heroes = 1;</code>
   */
  int getHeroesCount();
  /**
   * <code>repeated .heroes.Hero heroes = 1;</code>
   */
  java.util.List<? extends com.tdc.heroes.HeroOrBuilder> 
      getHeroesOrBuilderList();
  /**
   * <code>repeated .heroes.Hero heroes = 1;</code>
   */
  com.tdc.heroes.HeroOrBuilder getHeroesOrBuilder(
      int index);

  /**
   * <code>string city = 2;</code>
   * @return The city.
   */
  java.lang.String getCity();
  /**
   * <code>string city = 2;</code>
   * @return The bytes for city.
   */
  com.google.protobuf.ByteString
      getCityBytes();

  /**
   * <code>string villain = 3;</code>
   * @return The villain.
   */
  java.lang.String getVillain();
  /**
   * <code>string villain = 3;</code>
   * @return The bytes for villain.
   */
  com.google.protobuf.ByteString
      getVillainBytes();
}
