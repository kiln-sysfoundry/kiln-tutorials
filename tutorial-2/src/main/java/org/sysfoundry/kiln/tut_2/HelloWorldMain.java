package org.sysfoundry.kiln.tut_2;

import lombok.extern.slf4j.Slf4j;
import org.sysfoundry.kiln.base.LifecycleException;
import org.sysfoundry.kiln.base.srv.AbstractServer;
import org.sysfoundry.kiln.base.ss.sys.BaseSysBuilder;
import org.sysfoundry.kiln.base.sys.Sys;

import java.util.Arrays;

public class HelloWorldMain {

    public static void main(String[] args) {
        Sys sys = new BaseSysBuilder(args)
                .withServers(OnStartRunner.class,OnStopRunner.class)
                .build();

        try {
            sys.start();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }
    }
}


@Slf4j
class OnStartRunner extends AbstractServer{


    public OnStartRunner() {
        super("on-start-runner");
    }

    public void start(String[] strings) throws LifecycleException {
        log.info("Starting with Arguments {}",Arrays.asList(strings));
    }

    public void stop() throws LifecycleException {

    }
}

@Slf4j
class OnStopRunner extends AbstractServer{


    public OnStopRunner() {
        super("on-stop-runner");
    }

    public void start(String[] strings) throws LifecycleException {

    }

    public void stop() throws LifecycleException {
        log.info("Stopping application...");
    }
}