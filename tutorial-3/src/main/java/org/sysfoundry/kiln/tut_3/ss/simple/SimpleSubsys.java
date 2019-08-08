package org.sysfoundry.kiln.tut_3.ss.simple;

import org.sysfoundry.kiln.base.sys.Subsys;
import org.sysfoundry.kiln.base.sys.SubsysInfo;

import static org.sysfoundry.kiln.base.util.CollectionUtils.KV;
import static org.sysfoundry.kiln.base.util.CollectionUtils.MAP;

public class SimpleSubsys extends Subsys {
    public SimpleSubsys() {
        super(new SubsysInfo("simple-subsys",MAP(KV("name","simple-subsys"))));
    }

    @Override
    protected void configure() {
        super.configure();

        bindServers(SimpleServer.class,
                ComplexServer.class);

        bind(OnComplexServiceStarted.class).asEagerSingleton();
    }
}
