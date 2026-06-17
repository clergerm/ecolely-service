/*
 * Copyright (c) 2026 Ecolely. All rights reserved.
 * Unauthorized copying, modification, distribution, or use of this software is strictly prohibited.
 */

package com.ecolely.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.ecolely.constants.EcolelyConstants.HEALTH_API;
import static com.ecolely.constants.EcolelyConstants.ROOT_API;

@RestController
@RequestMapping(value = ROOT_API, produces = MediaType.APPLICATION_JSON_VALUE)
public class HealthController {
    @GetMapping(HEALTH_API)
    public String healthCheck() {
        return "Ecolely Service in test is live!";
    }
}