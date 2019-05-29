package com.snail.capter11;

/**
 * jdk动态代理
 */
public interface PersonBean {
    String getName();
    void setName(String name);

    String getGender();
    void setGender(String gender);

    String getInterests();
    void setInterests(String interests);

    int getHotOrNotRating();
    void setHotOrNotRating(int hotOrNotRating);
}
