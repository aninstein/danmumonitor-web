package com.aninstein.util;


import com.aninstein.po.*;

import java.util.HashMap;
import java.util.Map;

public class CheckPOnotNullMap {

    /*alarmtbPO非空值的Map*/
    public Map<String, Object> getAlarmtbPOMap(AlarmtbPO alarmtbPO) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (alarmtbPO.getId() != null) {
            map.put(AlarmtbPO._id, alarmtbPO.getId());
        }
        if (alarmtbPO.getAlarmname() != null) {
            map.put(AlarmtbPO._alarmname, alarmtbPO.getAlarmname());
        }
        if (alarmtbPO.getAlarmroom() != null) {
            map.put(AlarmtbPO._alarmroom, alarmtbPO.getAlarmroom());
        }
        if (alarmtbPO.getAlarmcredit() != null) {
            map.put(AlarmtbPO._alarmcredit, alarmtbPO.getAlarmcredit());
        }
        if (alarmtbPO.getAlarmtype() != null) {
            map.put(AlarmtbPO._alarmtype, alarmtbPO.getAlarmtype());
        }
        if (alarmtbPO.getAlarmtime() != null) {
            map.put(AlarmtbPO._alarmtime, alarmtbPO.getAlarmtime());
        }
        return map;
    }


    /*anchormapperPO非空值的Map*/
    public Map<String, Object> getAnchormapperPOMap(AnchormapperPO anchormapperPO) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (anchormapperPO.getId() != null) {
            map.put(AnchormapperPO._id, anchormapperPO.getId());
        }
        if (anchormapperPO.getAnchorname() != null) {
            map.put(AnchormapperPO._anchorname, anchormapperPO.getAnchorname());
        }
        if (anchormapperPO.getAnchorroom() != null) {
            map.put(AnchormapperPO._anchorroom, anchormapperPO.getAnchorroom());
        }
        if (anchormapperPO.getAnchortable() != null) {
            map.put(AnchormapperPO._anchortable, anchormapperPO.getAnchortable());
        }
        return map;
    }


    /*bantbPO非空值的Map*/
    public Map<String, Object> getBantbPOMap(BantbPO bantbPO) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (bantbPO.getId() != null) {
            map.put(BantbPO._id, bantbPO.getId());
        }
        if (bantbPO.getAnchorname() != null) {
            map.put(BantbPO._anchorname, bantbPO.getAnchorname());
        }
        if (bantbPO.getBantype() != null) {
            map.put(BantbPO._bantype, bantbPO.getBantype());
        }
        if (bantbPO.getBanhis() != null) {
            map.put(BantbPO._banhis, bantbPO.getBanhis());
        }
        if (bantbPO.getBantime() != null) {
            map.put(BantbPO._bantime, bantbPO.getBantime());
        }
        return map;
    }


    /*danmutbPO非空值的Map*/
    public Map<String, Object> getDanmutbPOMap(DanmutbPO danmutbPO) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (danmutbPO.getId() != null) {
            map.put(DanmutbPO._id, danmutbPO.getId());
        }
        if (danmutbPO.getAnchorname() != null) {
            map.put(DanmutbPO._anchorname, danmutbPO.getAnchorname());
        }
        if (danmutbPO.getDanmuall() != null) {
            map.put(DanmutbPO._danmuall, danmutbPO.getDanmuall());
        }
        if (danmutbPO.getDanmusex() != null) {
            map.put(DanmutbPO._danmusex, danmutbPO.getDanmusex());
        }
        if (danmutbPO.getDanmuabuse() != null) {
            map.put(DanmutbPO._danmuabuse, danmutbPO.getDanmuabuse());
        }
        if (danmutbPO.getDanmureact() != null) {
            map.put(DanmutbPO._danmureact, danmutbPO.getDanmureact());
        }
        if (danmutbPO.getDanmuvio() != null) {
            map.put(DanmutbPO._danmuvio, danmutbPO.getDanmuvio());
        }
        if (danmutbPO.getDanmuother() != null) {
            map.put(DanmutbPO._danmuother, danmutbPO.getDanmuother());
        }
        if (danmutbPO.getDanmutime() != null) {
            map.put(DanmutbPO._danmutime, danmutbPO.getDanmutime());
        }
        return map;
    }


    /*infomanagetbPO非空值的Map*/
    public Map<String, Object> getInfomanagetbPOMap(InfomanagetbPO infomanagetbPO) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (infomanagetbPO.getId() != null) {
            map.put(InfomanagetbPO._id, infomanagetbPO.getId());
        }
        if (infomanagetbPO.getMyindex() != null) {
            map.put(InfomanagetbPO._myindex, infomanagetbPO.getMyindex());
        }
        if (infomanagetbPO.getTimes() != null) {
            map.put(InfomanagetbPO._times, infomanagetbPO.getTimes());
        }
        if (infomanagetbPO.getNegtimes() != null) {
            map.put(InfomanagetbPO._negtimes, infomanagetbPO.getNegtimes());
        }
        if (infomanagetbPO.getNeg() != null) {
            map.put(InfomanagetbPO._neg, infomanagetbPO.getNeg());
        }
        return map;
    }


    /*monitortbPO非空值的Map*/
    public Map<String, Object> getMonitortbPOMap(MonitortbPO monitortbPO) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (monitortbPO.getId() != null) {
            map.put(MonitortbPO._id, monitortbPO.getId());
        }
        if (monitortbPO.getMAname() != null) {
            map.put(MonitortbPO._MAname, monitortbPO.getMAname());
        }
        if (monitortbPO.getMAroom() != null) {
            map.put(MonitortbPO._MAroom, monitortbPO.getMAroom());
        }
        if (monitortbPO.getMAstate() != null) {
            map.put(MonitortbPO._MAstate, monitortbPO.getMAstate());
        }
        if (monitortbPO.getMApeople() != null) {
            map.put(MonitortbPO._MApeople, monitortbPO.getMApeople());
        }
        if (monitortbPO.getMAhis() != null) {
            map.put(MonitortbPO._MAhis, monitortbPO.getMAhis());
        }
        if (monitortbPO.getMAnow() != null) {
            map.put(MonitortbPO._MAnow, monitortbPO.getMAnow());
        }
        if (monitortbPO.getMAdmnum() != null) {
            map.put(MonitortbPO._MAdmnum, monitortbPO.getMAdmnum());
        }
        if (monitortbPO.getMAban() != null) {
            map.put(MonitortbPO._MAban, monitortbPO.getMAban());
        }
        return map;
    }


    /*notestPO非空值的Map*/
    public Map<String, Object> getNotestPOMap(NotestPO notestPO) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (notestPO.getNumber() != null) {
            map.put(NotestPO._number, notestPO.getNumber());
        }
        if (notestPO.getLevel() != null) {
            map.put(NotestPO._level, notestPO.getLevel());
        }
        if (notestPO.getId() != null) {
            map.put(NotestPO._id, notestPO.getId());
        }
        if (notestPO.getContent() != null) {
            map.put(NotestPO._content, notestPO.getContent());
        }
        if (notestPO.getDate() != null) {
            map.put(NotestPO._date, notestPO.getDate());
        }
        if (notestPO.getPos() != null) {
            map.put(NotestPO._pos, notestPO.getPos());
        }
        if (notestPO.getNeg() != null) {
            map.put(NotestPO._neg, notestPO.getNeg());
        }
        if (notestPO.getMark() != null) {
            map.put(NotestPO._mark, notestPO.getMark());
        }
        if (notestPO.getSum() != null) {
            map.put(NotestPO._sum, notestPO.getSum());
        }
        if (notestPO.getRatio() != null) {
            map.put(NotestPO._ratio, notestPO.getRatio());
        }
        if (notestPO.getFlag() != null) {
            map.put(NotestPO._flag, notestPO.getFlag());
        }
        return map;
    }


    /*reporttbPO非空值的Map*/
    public Map<String, Object> getReporttbPOMap(ReporttbPO reporttbPO) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (reporttbPO.getId() != null) {
            map.put(ReporttbPO._id, reporttbPO.getId());
        }
        if (reporttbPO.getReportname() != null) {
            map.put(ReporttbPO._reportname, reporttbPO.getReportname());
        }
        if (reporttbPO.getReportroom() != null) {
            map.put(ReporttbPO._reportroom, reporttbPO.getReportroom());
        }
        if (reporttbPO.getReportcredit() != null) {
            map.put(ReporttbPO._reportcredit, reporttbPO.getReportcredit());
        }
        if (reporttbPO.getReporttype() != null) {
            map.put(ReporttbPO._reporttype, reporttbPO.getReporttype());
        }
        if (reporttbPO.getReporttime() != null) {
            map.put(ReporttbPO._reporttime, reporttbPO.getReporttime());
        }
        if (reporttbPO.getReporttext() != null) {
            map.put(ReporttbPO._reporttext, reporttbPO.getReporttext());
        }
        return map;
    }


    /*statistictbPO非空值的Map*/
    public Map<String, Object> getStatistictbPOMap(StatistictbPO statistictbPO) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (statistictbPO.getId() != null) {
            map.put(StatistictbPO._id, statistictbPO.getId());
        }
        if (statistictbPO.getAnchorroom() != null) {
            map.put(StatistictbPO._anchorroom, statistictbPO.getAnchorroom());
        }
        if (statistictbPO.getAnchortype() != null) {
            map.put(StatistictbPO._anchortype, statistictbPO.getAnchortype());
        }
        if (statistictbPO.getAnchorsex() != null) {
            map.put(StatistictbPO._anchorsex, statistictbPO.getAnchorsex());
        }
        if (statistictbPO.getAnchorabuse() != null) {
            map.put(StatistictbPO._anchorabuse, statistictbPO.getAnchorabuse());
        }
        if (statistictbPO.getAnchorreact() != null) {
            map.put(StatistictbPO._anchorreact, statistictbPO.getAnchorreact());
        }
        if (statistictbPO.getAnchorvio() != null) {
            map.put(StatistictbPO._anchorvio, statistictbPO.getAnchorvio());
        }
        if (statistictbPO.getAnchorother() != null) {
            map.put(StatistictbPO._anchorother, statistictbPO.getAnchorother());
        }
        return map;
    }


    /*usertbPO非空值的Map*/
    public Map<String, Object> getUsertbPOMap(UsertbPO usertbPO) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (usertbPO.getId() != null) {
            map.put(UsertbPO._id, usertbPO.getId());
        }
        if (usertbPO.getUsername() != null) {
            map.put(UsertbPO._username, usertbPO.getUsername());
        }
        if (usertbPO.getUserpassword() != null) {
            map.put(UsertbPO._userpassword, usertbPO.getUserpassword());
        }
        if (usertbPO.getUsergrant() != null) {
            map.put(UsertbPO._usergrant, usertbPO.getUsergrant());
        }
        if (usertbPO.getUserrealname() != null) {
            map.put(UsertbPO._userrealname, usertbPO.getUserrealname());
        }
        if (usertbPO.getUsernick() != null) {
            map.put(UsertbPO._usernick, usertbPO.getUsernick());
        }
        if (usertbPO.getUsertel() != null) {
            map.put(UsertbPO._usertel, usertbPO.getUsertel());
        }
        if (usertbPO.getUseremail() != null) {
            map.put(UsertbPO._useremail, usertbPO.getUseremail());
        }
        if (usertbPO.getUserqiandao() != null) {
            map.put(UsertbPO._userqiandao, usertbPO.getUserqiandao());
        }
        return map;
    }


    /*youtiaoPO非空值的Map*/
    public Map<String, Object> getYoutiaoPOMap(YoutiaoPO youtiaoPO) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (youtiaoPO.getId() != null) {
            map.put(YoutiaoPO._id, youtiaoPO.getId());
        }
        if (youtiaoPO.getUserlevel() != null) {
            map.put(YoutiaoPO._userlevel, youtiaoPO.getUserlevel());
        }
        if (youtiaoPO.getUserid() != null) {
            map.put(YoutiaoPO._userid, youtiaoPO.getUserid());
        }
        if (youtiaoPO.getDmcontent() != null) {
            map.put(YoutiaoPO._dmcontent, youtiaoPO.getDmcontent());
        }
        if (youtiaoPO.getDmdata() != null) {
            map.put(YoutiaoPO._dmdata, youtiaoPO.getDmdata());
        }
        if (youtiaoPO.getPos() != null) {
            map.put(YoutiaoPO._pos, youtiaoPO.getPos());
        }
        if (youtiaoPO.getNeg() != null) {
            map.put(YoutiaoPO._neg, youtiaoPO.getNeg());
        }
        if (youtiaoPO.getDmsum() != null) {
            map.put(YoutiaoPO._dmsum, youtiaoPO.getDmsum());
        }
        if (youtiaoPO.getMark() != null) {
            map.put(YoutiaoPO._mark, youtiaoPO.getMark());
        }
        if (youtiaoPO.getRatio() != null) {
            map.put(YoutiaoPO._ratio, youtiaoPO.getRatio());
        }
        if (youtiaoPO.getFlag() != null) {
            map.put(YoutiaoPO._flag, youtiaoPO.getFlag());
        }
        return map;
    }


}
