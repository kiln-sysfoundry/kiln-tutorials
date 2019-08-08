package org.sysfoundry.kiln.tut_3;

import org.sysfoundry.kiln.base.LifecycleException;
import org.sysfoundry.kiln.base.ss.sys.BaseSysBuilder;
import org.sysfoundry.kiln.base.sys.Sys;
import org.sysfoundry.kiln.tut_3.ss.simple.SimpleSubsys;

public class SimpleSubsysMain {

    public static void main(String[] args) {
        Sys sys = new BaseSysBuilder(args)
                .withSubsystems(new SimpleSubsys())
                .build();
        try {
            sys.start();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }
    }
}
