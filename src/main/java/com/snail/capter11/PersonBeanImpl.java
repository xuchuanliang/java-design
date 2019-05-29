package com.snail.capter11;

/**
 * @author xuchuanliangbt
 * @title: PersonBeanImpl
 * @projectName java-design
 * @description:
 * @date 2019/5/2919:20
 * @Version
 */
public class PersonBeanImpl implements PersonBean{
    private String name;
    private String gender;
    private String interests;
    private int rating;
    private int ratingCount = 0;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public int getHotOrNotRating() {
        return 0;
    }

    @Override
    public void setHotOrNotRating(int hotOrNotRating) {
        this.rating += hotOrNotRating;
        ratingCount++;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(int ratingCount) {
        this.ratingCount = ratingCount;
    }
}
