package com.ytalogsantos.mpsys.controllers;

import com.ytalogsantos.mpsys.models.Gatekeeper;
import com.ytalogsantos.mpsys.services.GatekeeperService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gatekeepers")
public class GatekeeperController {
    private final GatekeeperService gatekeeperService;

    public GatekeeperController(GatekeeperService gatekeeperService) {
        this.gatekeeperService = gatekeeperService;
    }

    public Gatekeeper createGatekeeper(Gatekeeper gatekeeper) {
        try {
            return gatekeeperService.createGatekeeper(gatekeeper);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<Gatekeeper> getGatekeepers() {
        try {
            return gatekeeperService.getGatekeepers();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
