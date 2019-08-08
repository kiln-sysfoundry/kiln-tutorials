package org.sysfoundry.kiln.tut_3.ss.simple;

import lombok.extern.slf4j.Slf4j;
import org.sysfoundry.kiln.base.evt.OnEvent;

@Slf4j
public class OnComplexServiceStarted {

    @OnEvent("complex-service-ready")
    public void onComplexServiceReady(){
        log.info("Complex Service is ready to be processed...");
    }
}
