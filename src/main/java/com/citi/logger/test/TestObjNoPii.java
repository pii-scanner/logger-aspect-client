package com.citi.logger.test;

import com.citi.cpb.logger.aspect.NoPiiInfo;

@NoPiiInfo
public class TestObjNoPii {

    private String someInfo;

    public TestObjNoPii(String someInfo) {
        this.someInfo = someInfo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TestObjNoPii{");
        sb.append("someInfo='").append(someInfo).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
