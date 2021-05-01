package com.pupilary.provider.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author takesi
 * @date 2021-05-01
 */
@RestController
public class OrderController {

    @PreAuthorize("hasAnyAuthority('res1')")
    @GetMapping(value = "/r1")
    public String r1() {
        return "r1";
    }

    @PreAuthorize("hasAnyAuthority('res2')")
    @GetMapping(value = "/r2")
    public String r2() {
        return "r2";
    }

}
