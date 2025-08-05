package server.demo_server.delay.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/openstack/instance")
public class DelayController {

    @GetMapping("")
    public Object getInstanceController() throws InterruptedException {

        String instanceId = "instanceId";

        System.out.println("instanceId : " + instanceId);

        Thread.sleep(1000);

        return instanceId;
    }
}
