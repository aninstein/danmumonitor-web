package com.aninstein.po;

public class UsertbPO {
    private Integer id;

    private String username;

    private String userpassword;

    private Short usergrant;

    private String userrealname;

    private String usernick;

    private String usertel;

    private String useremail;

    private String userqiandao;

    /*usertb的字段名*/
    public static String _id="id";
    public static String _username="username";
    public static String _userpassword="userpassword";
    public static String _usergrant="usergrant";
    public static String _userrealname="userrealname";
    public static String _usernick="usernick";
    public static String _usertel="usertel";
    public static String _useremail="useremail";
    public static String _userqiandao="userqiandao";

    public Integer getId() {
        return id;
    }

    public UsertbPO setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UsertbPO setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public UsertbPO setUserpassword(String userpassword) {
        this.userpassword = userpassword;
        return this;
    }

    public Short getUsergrant() {
        return usergrant;
    }

    public UsertbPO setUsergrant(Short usergrant) {
        this.usergrant = usergrant;
        return this;
    }

    public String getUserrealname() {
        return userrealname;
    }

    public UsertbPO setUserrealname(String userrealname) {
        this.userrealname = userrealname;
        return this;
    }

    public String getUsernick() {
        return usernick;
    }

    public UsertbPO setUsernick(String usernick) {
        this.usernick = usernick;
        return this;
    }

    public String getUsertel() {
        return usertel;
    }

    public UsertbPO setUsertel(String usertel) {
        this.usertel = usertel;
        return this;
    }

    public String getUseremail() {
        return useremail;
    }

    public UsertbPO setUseremail(String useremail) {
        this.useremail = useremail;
        return this;
    }

    public String getUserqiandao() {
        return userqiandao;
    }

    public UsertbPO setUserqiandao(String userqiandao) {
        this.userqiandao = userqiandao;
        return this;
    }
}