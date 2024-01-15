package com.example.prm392_lab3_football;

public class FootballLegend {

    private String Name;
    private String BirthDay;
    private int FooterImg;
    private int FlagImg;

    public FootballLegend(String name, String birthDay, int footerImg, int flagImg) {
        Name = name;
        BirthDay = birthDay;
        FooterImg = footerImg;
        FlagImg = flagImg;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(String birthDay) {
        BirthDay = birthDay;
    }

    public int getFooterImg() {
        return FooterImg;
    }

    public void setFooterImg(int footerImg) {
        FooterImg = footerImg;
    }

    public int getFlagImg() {
        return FlagImg;
    }

    public void setFlagImg(int flagImg) {
        FlagImg = flagImg;
    }
}
