package com.github.pixomia.spring_boot_template;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.github.pixomia.util.PixomiaIdUtils;

@Service
public class BackgroundTaskker {
    @Scheduled(fixedDelay = 1000)
    public void backGroundTassker() {
	System.out.println(" Bingo Bongo " + PixomiaIdUtils.genHumandReadableId() + "");
    }
}
