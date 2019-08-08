package org.sysfoundry.kiln.tut_3.ss.simple;

import lombok.extern.slf4j.Slf4j;
import org.sysfoundry.kiln.base.LifecycleException;
import org.sysfoundry.kiln.base.evt.Event;
import org.sysfoundry.kiln.base.evt.EventBus;
import org.sysfoundry.kiln.base.srv.AbstractServer;
import org.sysfoundry.kiln.base.sys.Args;

import javax.inject.Inject;

@Slf4j
class ComplexServer extends AbstractServer {

    public static final String NAME = "complex-server";
    public static final String SERVICE_NAME = "complex-service";
    public static final String SIMPLE_SERVICE = "simple-service";

    private EventBus eventBus;

    @Inject
    ComplexServer(EventBus eventBus){
        super(NAME,SERVICE_NAME,SIMPLE_SERVICE);
        this.eventBus = eventBus;
    }

    public void start(String[] strings) throws LifecycleException {
        log.info("Starting {} depending on {}",SERVICE_NAME,SIMPLE_SERVICE);

        this.eventBus.publishSync(Event.create(SERVICE_NAME+"-ready"));
    }

    public void stop() throws LifecycleException {
        log.info("Stopping {} depending on {}",SERVICE_NAME,SIMPLE_SERVICE);

        this.eventBus.publishSync(Event.create(SERVICE_NAME+"-closing"));
    }
}

