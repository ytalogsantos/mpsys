package com.ytalogsantos.mpsys.services;

import com.ytalogsantos.mpsys.models.Gatekeeper;
import com.ytalogsantos.mpsys.repositories.GatekeeperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GatekeeperService {

    @Autowired
    private final GatekeeperRepository gatekeeperRepository;

    public GatekeeperService(GatekeeperRepository gatekeeperRepository) {
        this.gatekeeperRepository = gatekeeperRepository;
    }

    public Gatekeeper createGatekeeper(Gatekeeper gatekeeper) {
        try {
            return gatekeeperRepository.save(gatekeeper);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        // TODO handle errors correctly
    }

    public List<Gatekeeper> getGatekeepers() {
        try {
            return gatekeeperRepository.findAll();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        // TODO handle errors correctly
    }
}
