package org.sysfoundry.kiln.tut_1;

import org.sysfoundry.kiln.base.LifecycleException;
import org.sysfoundry.kiln.base.ss.sys.BaseSysBuilder;
import org.sysfoundry.kiln.base.sys.Sys;

public class DoNothingMain {

    public static void main(String[] args) {
        Sys sys = new BaseSysBuilder(args).build();

        try {
            sys.start();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }
    }
}
