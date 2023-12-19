package com.github.pixomia.spring_boot_template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.github.pixomia.spring_service_template.ServiceTwo;
import com.github.pixomia.util.PixomiaIdUtils;

@Service
public class BackgroundTaskker {
    @Autowired
    private ServiceTwo serviceTwo;

    @Scheduled(fixedDelay = 1000)
    public void backGroundTassker() {
	System.out.println(" Bingo Bongo " + PixomiaIdUtils.genHumandReadableId() + "");
	System.out.println(serviceTwo.callOneOtherTwo());
    }
}
