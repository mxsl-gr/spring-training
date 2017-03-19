package io.terminus.springframework.controller;

import io.terminus.springframework.service.TerminusUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gengrong on 2017/3/19.
 */
@RestController
@RequestMapping("/api/users")
public class TerminusUserController {

    @Autowired
    private TerminusUserService terminusUserService;

    @GetMapping
    public String showName() {
        return terminusUserService.getName();
    }
}
