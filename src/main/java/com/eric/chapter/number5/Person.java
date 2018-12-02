package com.eric.chapter.number5;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author Chen 2018/12/2
 * @email 749829987@qq.com
 */
public class Person {
    private final Date birthDate;

    public Person(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public boolean isBabyBommer(){
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946,Calendar.JANUARY,1,0,0,0);
        Date boomStart = gmtCal.getTime();
        gmtCal.set(1965,Calendar.JANUARY,1,0,0,0);
        Date boomEnd = gmtCal.getTime();
        return birthDate.compareTo(boomStart) >=0 && birthDate.compareTo(boomEnd) <0;
    }

}
