package com.dexlab.theshop.userservice;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
    info =  @Info(
        title = "userservice",
        version = "v2.0"
    ),
    servers = @Server(url = "http://userservice:8080")
)
public class OpenAPIConfig {
    
}
