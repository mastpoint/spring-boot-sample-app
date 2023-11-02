/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.model;

import java.util.Map;

import lombok.Data;

/**
 *
 * @author z0043uwn
 */
@Data
public class RequestInfo {

    private String serverName;
    private String remoteAddress;
    private String remoteHost;
    private String remoteUser;
    private String requestURI;
    private String requestedSessionId;
    private String servletPath;
    private String scheme;
    private String localName;
    private Integer localPort;
    private String localCountry;
    private String contextPath;
    private Map<String, String> headers;
    private Map<String, String> attributes;
    private Map<String, String[]> parameters;

  
}
