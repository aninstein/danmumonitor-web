package com.aninstein.po;

public class NotestPO {
    private Integer number;

    private String level;

    private String id;

    private String content;

    private String date;

    private String pos;

    private String neg;

    private Integer mark;

    private Integer sum;

    private Float ratio;

    private Integer flag;

    /*notest的字段名*/
    public static String _number="number";
    public static String _level="level";
    public static String _id="id";
    public static String _content="content";
    public static String _date="date";
    public static String _pos="pos";
    public static String _neg="neg";
    public static String _mark="mark";
    public static String _sum="sum";
    public static String _ratio="ratio";
    public static String _flag="flag";

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos == null ? null : pos.trim();
    }

    public String getNeg() {
        return neg;
    }

    public void setNeg(String neg) {
        this.neg = neg == null ? null : neg.trim();
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Float getRatio() {
        return ratio;
    }

    public void setRatio(Float ratio) {
        this.ratio = ratio;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}