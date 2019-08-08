package org.sysfoundry.kiln.tut_3.ss.simple;

import lombok.extern.slf4j.Slf4j;
import org.sysfoundry.kiln.base.LifecycleException;
import org.sysfoundry.kiln.base.srv.AbstractServer;

@Slf4j
class SimpleServer extends AbstractServer {

    private static final String name = "simple-server";
    private static final String serviceName = "simple-service";

    public SimpleServer() {
        super(name,serviceName,"");
    }

    public void start(String[] strings) throws LifecycleException {
        log.info("Starting service {}",serviceName);
    }

    public void stop() throws LifecycleException {
        log.info("Stopping service {}",serviceName);
    }
}
