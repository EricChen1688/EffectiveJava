package com.eric.chapter.number5;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author Chen 2018/12/2
 * @email 749829987@qq.com
 */
public class Person2 {
    private final Date birthDate;
    private static final Date BOOM_START;
    private static final Date BOOM_END;

    static {
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946,Calendar.JANUARY,1,0,0,0);
        BOOM_START = gmtCal.getTime();
        gmtCal.set(1965,Calendar.JANUARY,1,0,0,0);
        BOOM_END = gmtCal.getTime();
    }
    public Person2(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public boolean isBabyBommer(){
        return birthDate.compareTo(BOOM_START) >=0 && birthDate.compareTo(BOOM_END) <0;
    }

}
