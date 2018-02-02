package com.aninstein.util;


import com.aninstein.po.*;

import java.util.ArrayList;
import java.util.List;

public class CheckPOnotNullList {
    /*alarmtbPO字段列表*/
    public List<Object> getAlarmtbPOColnameList(AlarmtbPO alarmtbPO) {
        List<Object> colnameList = new ArrayList<Object>();

        if (alarmtbPO.getId() != null) {
            colnameList.add(AlarmtbPO._id);
        }
        if (alarmtbPO.getAlarmname() != null) {
            colnameList.add(AlarmtbPO._alarmname);
        }
        if (alarmtbPO.getAlarmroom() != null) {
            colnameList.add(AlarmtbPO._alarmroom);
        }
        if (alarmtbPO.getAlarmcredit() != null) {
            colnameList.add(AlarmtbPO._alarmcredit);
        }
        if (alarmtbPO.getAlarmtype() != null) {
            colnameList.add(AlarmtbPO._alarmtype);
        }
        if (alarmtbPO.getAlarmtime() != null) {
            colnameList.add(AlarmtbPO._alarmtime);
        }
        return colnameList;
    }


    /*alarmtbPO值的表格*/
    public List<Object> getAlarmtbPOValuesList(AlarmtbPO alarmtbPO) {
        List<Object> valuesList = new ArrayList<>();

        if (alarmtbPO.getId() != null) {
            valuesList.add(alarmtbPO.getId());
        }
        if (alarmtbPO.getAlarmname() != null) {
            valuesList.add(alarmtbPO.getAlarmname());
        }
        if (alarmtbPO.getAlarmroom() != null) {
            valuesList.add(alarmtbPO.getAlarmroom());
        }
        if (alarmtbPO.getAlarmcredit() != null) {
            valuesList.add(alarmtbPO.getAlarmcredit());
        }
        if (alarmtbPO.getAlarmtype() != null) {
            valuesList.add(alarmtbPO.getAlarmtype());
        }
        if (alarmtbPO.getAlarmtime() != null) {
            valuesList.add(alarmtbPO.getAlarmtime());
        }
        return valuesList;
    }


    /*anchormapperPO字段列表*/
    public List<Object> getAnchormapperPOColnameList(AnchormapperPO anchormapperPO) {
        List<Object> colnameList = new ArrayList<Object>();

        if (anchormapperPO.getId() != null) {
            colnameList.add(AnchormapperPO._id);
        }
        if (anchormapperPO.getAnchorname() != null) {
            colnameList.add(AnchormapperPO._anchorname);
        }
        if (anchormapperPO.getAnchorroom() != null) {
            colnameList.add(AnchormapperPO._anchorroom);
        }
        if (anchormapperPO.getAnchortable() != null) {
            colnameList.add(AnchormapperPO._anchortable);
        }
        return colnameList;
    }


    /*anchormapperPO值的表格*/
    public List<Object> getAnchormapperPOValuesList(AnchormapperPO anchormapperPO) {
        List<Object> valuesList = new ArrayList<>();

        if (anchormapperPO.getId() != null) {
            valuesList.add(anchormapperPO.getId());
        }
        if (anchormapperPO.getAnchorname() != null) {
            valuesList.add(anchormapperPO.getAnchorname());
        }
        if (anchormapperPO.getAnchorroom() != null) {
            valuesList.add(anchormapperPO.getAnchorroom());
        }
        if (anchormapperPO.getAnchortable() != null) {
            valuesList.add(anchormapperPO.getAnchortable());
        }
        return valuesList;
    }


    /*bantbPO字段列表*/
    public List<Object> getBantbPOColnameList(BantbPO bantbPO) {
        List<Object> colnameList = new ArrayList<Object>();

        if (bantbPO.getId() != null) {
            colnameList.add(BantbPO._id);
        }
        if (bantbPO.getAnchorname() != null) {
            colnameList.add(BantbPO._anchorname);
        }
        if (bantbPO.getBantype() != null) {
            colnameList.add(BantbPO._bantype);
        }
        if (bantbPO.getBanhis() != null) {
            colnameList.add(BantbPO._banhis);
        }
        if (bantbPO.getBantime() != null) {
            colnameList.add(BantbPO._bantime);
        }
        return colnameList;
    }


    /*bantbPO值的表格*/
    public List<Object> getBantbPOValuesList(BantbPO bantbPO) {
        List<Object> valuesList = new ArrayList<>();

        if (bantbPO.getId() != null) {
            valuesList.add(bantbPO.getId());
        }
        if (bantbPO.getAnchorname() != null) {
            valuesList.add(bantbPO.getAnchorname());
        }
        if (bantbPO.getBantype() != null) {
            valuesList.add(bantbPO.getBantype());
        }
        if (bantbPO.getBanhis() != null) {
            valuesList.add(bantbPO.getBanhis());
        }
        if (bantbPO.getBantime() != null) {
            valuesList.add(bantbPO.getBantime());
        }
        return valuesList;
    }


    /*danmutbPO字段列表*/
    public List<Object> getDanmutbPOColnameList(DanmutbPO danmutbPO) {
        List<Object> colnameList = new ArrayList<Object>();

        if (danmutbPO.getId() != null) {
            colnameList.add(DanmutbPO._id);
        }
        if (danmutbPO.getAnchorname() != null) {
            colnameList.add(DanmutbPO._anchorname);
        }
        if (danmutbPO.getDanmuall() != null) {
            colnameList.add(DanmutbPO._danmuall);
        }
        if (danmutbPO.getDanmusex() != null) {
            colnameList.add(DanmutbPO._danmusex);
        }
        if (danmutbPO.getDanmuabuse() != null) {
            colnameList.add(DanmutbPO._danmuabuse);
        }
        if (danmutbPO.getDanmureact() != null) {
            colnameList.add(DanmutbPO._danmureact);
        }
        if (danmutbPO.getDanmuvio() != null) {
            colnameList.add(DanmutbPO._danmuvio);
        }
        if (danmutbPO.getDanmuother() != null) {
            colnameList.add(DanmutbPO._danmuother);
        }
        if (danmutbPO.getDanmutime() != null) {
            colnameList.add(DanmutbPO._danmutime);
        }
        return colnameList;
    }


    /*danmutbPO值的表格*/
    public List<Object> getDanmutbPOValuesList(DanmutbPO danmutbPO) {
        List<Object> valuesList = new ArrayList<>();

        if (danmutbPO.getId() != null) {
            valuesList.add(danmutbPO.getId());
        }
        if (danmutbPO.getAnchorname() != null) {
            valuesList.add(danmutbPO.getAnchorname());
        }
        if (danmutbPO.getDanmuall() != null) {
            valuesList.add(danmutbPO.getDanmuall());
        }
        if (danmutbPO.getDanmusex() != null) {
            valuesList.add(danmutbPO.getDanmusex());
        }
        if (danmutbPO.getDanmuabuse() != null) {
            valuesList.add(danmutbPO.getDanmuabuse());
        }
        if (danmutbPO.getDanmureact() != null) {
            valuesList.add(danmutbPO.getDanmureact());
        }
        if (danmutbPO.getDanmuvio() != null) {
            valuesList.add(danmutbPO.getDanmuvio());
        }
        if (danmutbPO.getDanmuother() != null) {
            valuesList.add(danmutbPO.getDanmuother());
        }
        if (danmutbPO.getDanmutime() != null) {
            valuesList.add(danmutbPO.getDanmutime());
        }
        return valuesList;
    }


    /*infomanagetbPO字段列表*/
    public List<Object> getInfomanagetbPOColnameList(InfomanagetbPO infomanagetbPO) {
        List<Object> colnameList = new ArrayList<Object>();

        if (infomanagetbPO.getId() != null) {
            colnameList.add(InfomanagetbPO._id);
        }
        if (infomanagetbPO.getMyindex() != null) {
            colnameList.add(InfomanagetbPO._myindex);
        }
        if (infomanagetbPO.getTimes() != null) {
            colnameList.add(InfomanagetbPO._times);
        }
        if (infomanagetbPO.getNegtimes() != null) {
            colnameList.add(InfomanagetbPO._negtimes);
        }
        if (infomanagetbPO.getNeg() != null) {
            colnameList.add(InfomanagetbPO._neg);
        }
        return colnameList;
    }


    /*infomanagetbPO值的表格*/
    public List<Object> getInfomanagetbPOValuesList(InfomanagetbPO infomanagetbPO) {
        List<Object> valuesList = new ArrayList<>();

        if (infomanagetbPO.getId() != null) {
            valuesList.add(infomanagetbPO.getId());
        }
        if (infomanagetbPO.getMyindex() != null) {
            valuesList.add(infomanagetbPO.getMyindex());
        }
        if (infomanagetbPO.getTimes() != null) {
            valuesList.add(infomanagetbPO.getTimes());
        }
        if (infomanagetbPO.getNegtimes() != null) {
            valuesList.add(infomanagetbPO.getNegtimes());
        }
        if (infomanagetbPO.getNeg() != null) {
            valuesList.add(infomanagetbPO.getNeg());
        }
        return valuesList;
    }


    /*monitortbPO字段列表*/
    public List<Object> getMonitortbPOColnameList(MonitortbPO monitortbPO) {
        List<Object> colnameList = new ArrayList<Object>();

        if (monitortbPO.getId() != null) {
            colnameList.add(MonitortbPO._id);
        }
        if (monitortbPO.getMAname() != null) {
            colnameList.add(MonitortbPO._MAname);
        }
        if (monitortbPO.getMAroom() != null) {
            colnameList.add(MonitortbPO._MAroom);
        }
        if (monitortbPO.getMAstate() != null) {
            colnameList.add(MonitortbPO._MAstate);
        }
        if (monitortbPO.getMApeople() != null) {
            colnameList.add(MonitortbPO._MApeople);
        }
        if (monitortbPO.getMAhis() != null) {
            colnameList.add(MonitortbPO._MAhis);
        }
        if (monitortbPO.getMAnow() != null) {
            colnameList.add(MonitortbPO._MAnow);
        }
        if (monitortbPO.getMAdmnum() != null) {
            colnameList.add(MonitortbPO._MAdmnum);
        }
        if (monitortbPO.getMAban() != null) {
            colnameList.add(MonitortbPO._MAban);
        }
        return colnameList;
    }


    /*monitortbPO值的表格*/
    public List<Object> getMonitortbPOValuesList(MonitortbPO monitortbPO) {
        List<Object> valuesList = new ArrayList<>();

        if (monitortbPO.getId() != null) {
            valuesList.add(monitortbPO.getId());
        }
        if (monitortbPO.getMAname() != null) {
            valuesList.add(monitortbPO.getMAname());
        }
        if (monitortbPO.getMAroom() != null) {
            valuesList.add(monitortbPO.getMAroom());
        }
        if (monitortbPO.getMAstate() != null) {
            valuesList.add(monitortbPO.getMAstate());
        }
        if (monitortbPO.getMApeople() != null) {
            valuesList.add(monitortbPO.getMApeople());
        }
        if (monitortbPO.getMAhis() != null) {
            valuesList.add(monitortbPO.getMAhis());
        }
        if (monitortbPO.getMAnow() != null) {
            valuesList.add(monitortbPO.getMAnow());
        }
        if (monitortbPO.getMAdmnum() != null) {
            valuesList.add(monitortbPO.getMAdmnum());
        }
        if (monitortbPO.getMAban() != null) {
            valuesList.add(monitortbPO.getMAban());
        }
        return valuesList;
    }


    /*notestPO字段列表*/
    public List<Object> getNotestPOColnameList(NotestPO notestPO) {
        List<Object> colnameList = new ArrayList<Object>();

        if (notestPO.getNumber() != null) {
            colnameList.add(NotestPO._number);
        }
        if (notestPO.getLevel() != null) {
            colnameList.add(NotestPO._level);
        }
        if (notestPO.getId() != null) {
            colnameList.add(NotestPO._id);
        }
        if (notestPO.getContent() != null) {
            colnameList.add(NotestPO._content);
        }
        if (notestPO.getDate() != null) {
            colnameList.add(NotestPO._date);
        }
        if (notestPO.getPos() != null) {
            colnameList.add(NotestPO._pos);
        }
        if (notestPO.getNeg() != null) {
            colnameList.add(NotestPO._neg);
        }
        if (notestPO.getMark() != null) {
            colnameList.add(NotestPO._mark);
        }
        if (notestPO.getSum() != null) {
            colnameList.add(NotestPO._sum);
        }
        if (notestPO.getRatio() != null) {
            colnameList.add(NotestPO._ratio);
        }
        if (notestPO.getFlag() != null) {
            colnameList.add(NotestPO._flag);
        }
        return colnameList;
    }


    /*notestPO值的表格*/
    public List<Object> getNotestPOValuesList(NotestPO notestPO) {
        List<Object> valuesList = new ArrayList<>();

        if (notestPO.getNumber() != null) {
            valuesList.add(notestPO.getNumber());
        }
        if (notestPO.getLevel() != null) {
            valuesList.add(notestPO.getLevel());
        }
        if (notestPO.getId() != null) {
            valuesList.add(notestPO.getId());
        }
        if (notestPO.getContent() != null) {
            valuesList.add(notestPO.getContent());
        }
        if (notestPO.getDate() != null) {
            valuesList.add(notestPO.getDate());
        }
        if (notestPO.getPos() != null) {
            valuesList.add(notestPO.getPos());
        }
        if (notestPO.getNeg() != null) {
            valuesList.add(notestPO.getNeg());
        }
        if (notestPO.getMark() != null) {
            valuesList.add(notestPO.getMark());
        }
        if (notestPO.getSum() != null) {
            valuesList.add(notestPO.getSum());
        }
        if (notestPO.getRatio() != null) {
            valuesList.add(notestPO.getRatio());
        }
        if (notestPO.getFlag() != null) {
            valuesList.add(notestPO.getFlag());
        }
        return valuesList;
    }


    /*reporttbPO字段列表*/
    public List<Object> getReporttbPOColnameList(ReporttbPO reporttbPO) {
        List<Object> colnameList = new ArrayList<Object>();

        if (reporttbPO.getId() != null) {
            colnameList.add(ReporttbPO._id);
        }
        if (reporttbPO.getReportname() != null) {
            colnameList.add(ReporttbPO._reportname);
        }
        if (reporttbPO.getReportroom() != null) {
            colnameList.add(ReporttbPO._reportroom);
        }
        if (reporttbPO.getReportcredit() != null) {
            colnameList.add(ReporttbPO._reportcredit);
        }
        if (reporttbPO.getReporttype() != null) {
            colnameList.add(ReporttbPO._reporttype);
        }
        if (reporttbPO.getReporttime() != null) {
            colnameList.add(ReporttbPO._reporttime);
        }
        if (reporttbPO.getReporttext() != null) {
            colnameList.add(ReporttbPO._reporttext);
        }
        return colnameList;
    }


    /*reporttbPO值的表格*/
    public List<Object> getReporttbPOValuesList(ReporttbPO reporttbPO) {
        List<Object> valuesList = new ArrayList<>();

        if (reporttbPO.getId() != null) {
            valuesList.add(reporttbPO.getId());
        }
        if (reporttbPO.getReportname() != null) {
            valuesList.add(reporttbPO.getReportname());
        }
        if (reporttbPO.getReportroom() != null) {
            valuesList.add(reporttbPO.getReportroom());
        }
        if (reporttbPO.getReportcredit() != null) {
            valuesList.add(reporttbPO.getReportcredit());
        }
        if (reporttbPO.getReporttype() != null) {
            valuesList.add(reporttbPO.getReporttype());
        }
        if (reporttbPO.getReporttime() != null) {
            valuesList.add(reporttbPO.getReporttime());
        }
        if (reporttbPO.getReporttext() != null) {
            valuesList.add(reporttbPO.getReporttext());
        }
        return valuesList;
    }


    /*statistictbPO字段列表*/
    public List<Object> getStatistictbPOColnameList(StatistictbPO statistictbPO) {
        List<Object> colnameList = new ArrayList<Object>();

        if (statistictbPO.getId() != null) {
            colnameList.add(StatistictbPO._id);
        }
        if (statistictbPO.getAnchorroom() != null) {
            colnameList.add(StatistictbPO._anchorroom);
        }
        if (statistictbPO.getAnchortype() != null) {
            colnameList.add(StatistictbPO._anchortype);
        }
        if (statistictbPO.getAnchorsex() != null) {
            colnameList.add(StatistictbPO._anchorsex);
        }
        if (statistictbPO.getAnchorabuse() != null) {
            colnameList.add(StatistictbPO._anchorabuse);
        }
        if (statistictbPO.getAnchorreact() != null) {
            colnameList.add(StatistictbPO._anchorreact);
        }
        if (statistictbPO.getAnchorvio() != null) {
            colnameList.add(StatistictbPO._anchorvio);
        }
        if (statistictbPO.getAnchorother() != null) {
            colnameList.add(StatistictbPO._anchorother);
        }
        return colnameList;
    }


    /*statistictbPO值的表格*/
    public List<Object> getStatistictbPOValuesList(StatistictbPO statistictbPO) {
        List<Object> valuesList = new ArrayList<>();

        if (statistictbPO.getId() != null) {
            valuesList.add(statistictbPO.getId());
        }
        if (statistictbPO.getAnchorroom() != null) {
            valuesList.add(statistictbPO.getAnchorroom());
        }
        if (statistictbPO.getAnchortype() != null) {
            valuesList.add(statistictbPO.getAnchortype());
        }
        if (statistictbPO.getAnchorsex() != null) {
            valuesList.add(statistictbPO.getAnchorsex());
        }
        if (statistictbPO.getAnchorabuse() != null) {
            valuesList.add(statistictbPO.getAnchorabuse());
        }
        if (statistictbPO.getAnchorreact() != null) {
            valuesList.add(statistictbPO.getAnchorreact());
        }
        if (statistictbPO.getAnchorvio() != null) {
            valuesList.add(statistictbPO.getAnchorvio());
        }
        if (statistictbPO.getAnchorother() != null) {
            valuesList.add(statistictbPO.getAnchorother());
        }
        return valuesList;
    }


    /*usertbPO字段列表*/
    public List<Object> getUsertbPOColnameList(UsertbPO usertbPO) {
        List<Object> colnameList = new ArrayList<Object>();

        if (usertbPO.getId() != null) {
            colnameList.add(UsertbPO._id);
        }
        if (usertbPO.getUsername() != null) {
            colnameList.add(UsertbPO._username);
        }
        if (usertbPO.getUserpassword() != null) {
            colnameList.add(UsertbPO._userpassword);
        }
        if (usertbPO.getUsergrant() != null) {
            colnameList.add(UsertbPO._usergrant);
        }
        if (usertbPO.getUserrealname() != null) {
            colnameList.add(UsertbPO._userrealname);
        }
        if (usertbPO.getUsernick() != null) {
            colnameList.add(UsertbPO._usernick);
        }
        if (usertbPO.getUsertel() != null) {
            colnameList.add(UsertbPO._usertel);
        }
        if (usertbPO.getUseremail() != null) {
            colnameList.add(UsertbPO._useremail);
        }
        if (usertbPO.getUserqiandao() != null) {
            colnameList.add(UsertbPO._userqiandao);
        }
        return colnameList;
    }


    /*usertbPO值的表格*/
    public List<Object> getUsertbPOValuesList(UsertbPO usertbPO) {
        List<Object> valuesList = new ArrayList<>();

        if (usertbPO.getId() != null) {
            valuesList.add(usertbPO.getId());
        }
        if (usertbPO.getUsername() != null) {
            valuesList.add(usertbPO.getUsername());
        }
        if (usertbPO.getUserpassword() != null) {
            valuesList.add(usertbPO.getUserpassword());
        }
        if (usertbPO.getUsergrant() != null) {
            valuesList.add(usertbPO.getUsergrant());
        }
        if (usertbPO.getUserrealname() != null) {
            valuesList.add(usertbPO.getUserrealname());
        }
        if (usertbPO.getUsernick() != null) {
            valuesList.add(usertbPO.getUsernick());
        }
        if (usertbPO.getUsertel() != null) {
            valuesList.add(usertbPO.getUsertel());
        }
        if (usertbPO.getUseremail() != null) {
            valuesList.add(usertbPO.getUseremail());
        }
        if (usertbPO.getUserqiandao() != null) {
            valuesList.add(usertbPO.getUserqiandao());
        }
        return valuesList;
    }


    /*youtiaoPO字段列表*/
    public List<Object> getYoutiaoPOColnameList(YoutiaoPO youtiaoPO) {
        List<Object> colnameList = new ArrayList<Object>();

        if (youtiaoPO.getId() != null) {
            colnameList.add(YoutiaoPO._id);
        }
        if (youtiaoPO.getUserlevel() != null) {
            colnameList.add(YoutiaoPO._userlevel);
        }
        if (youtiaoPO.getUserid() != null) {
            colnameList.add(YoutiaoPO._userid);
        }
        if (youtiaoPO.getDmcontent() != null) {
            colnameList.add(YoutiaoPO._dmcontent);
        }
        if (youtiaoPO.getDmdata() != null) {
            colnameList.add(YoutiaoPO._dmdata);
        }
        if (youtiaoPO.getPos() != null) {
            colnameList.add(YoutiaoPO._pos);
        }
        if (youtiaoPO.getNeg() != null) {
            colnameList.add(YoutiaoPO._neg);
        }
        if (youtiaoPO.getDmsum() != null) {
            colnameList.add(YoutiaoPO._dmsum);
        }
        if (youtiaoPO.getMark() != null) {
            colnameList.add(YoutiaoPO._mark);
        }
        if (youtiaoPO.getRatio() != null) {
            colnameList.add(YoutiaoPO._ratio);
        }
        if (youtiaoPO.getFlag() != null) {
            colnameList.add(YoutiaoPO._flag);
        }
        return colnameList;
    }


    /*youtiaoPO值的表格*/
    public List<Object> getYoutiaoPOValuesList(YoutiaoPO youtiaoPO) {
        List<Object> valuesList = new ArrayList<>();

        if (youtiaoPO.getId() != null) {
            valuesList.add(youtiaoPO.getId());
        }
        if (youtiaoPO.getUserlevel() != null) {
            valuesList.add(youtiaoPO.getUserlevel());
        }
        if (youtiaoPO.getUserid() != null) {
            valuesList.add(youtiaoPO.getUserid());
        }
        if (youtiaoPO.getDmcontent() != null) {
            valuesList.add(youtiaoPO.getDmcontent());
        }
        if (youtiaoPO.getDmdata() != null) {
            valuesList.add(youtiaoPO.getDmdata());
        }
        if (youtiaoPO.getPos() != null) {
            valuesList.add(youtiaoPO.getPos());
        }
        if (youtiaoPO.getNeg() != null) {
            valuesList.add(youtiaoPO.getNeg());
        }
        if (youtiaoPO.getDmsum() != null) {
            valuesList.add(youtiaoPO.getDmsum());
        }
        if (youtiaoPO.getMark() != null) {
            valuesList.add(youtiaoPO.getMark());
        }
        if (youtiaoPO.getRatio() != null) {
            valuesList.add(youtiaoPO.getRatio());
        }
        if (youtiaoPO.getFlag() != null) {
            valuesList.add(youtiaoPO.getFlag());
        }
        return valuesList;
    }

}
