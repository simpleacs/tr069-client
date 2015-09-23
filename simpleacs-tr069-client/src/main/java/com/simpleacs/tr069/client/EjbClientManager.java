/*
 * Copyright (c) 2015, Vunb
 * All rights reserved.
 */
package com.simpleacs.tr069.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * EjbClient Manager
 *
 * @author Vunb
 * @date Aug 29, 2015
 * @update Aug 29, 2015
 */
public class EjbClientManager {

    public static final String FILE_CONFIG_JNDI_SERVER = "../etc/jndi.properties";
    public static final String FILE_CONFIG_JNDI_NAME = "../etc/ejb.properties";

    public static EjbClientManager _INSTANCE = null;

    private InitialContext context = null;

    private Properties jndiNameResx = null;
    private Properties jndiServerResx = null;

    public EjbClientManager() throws IOException, NamingException {
        this.jndiServerResx = getJndiServerResource();
        this.jndiNameResx = getJndiNameResource();
        this.context = new InitialContext(this.jndiServerResx);
    }

    public static EjbClientManager getInstance() throws IOException, NamingException {
        if (_INSTANCE == null) {
            _INSTANCE = new EjbClientManager();
            return _INSTANCE;
        } else {
            return _INSTANCE;
        }
    }

    private Properties getJndiServerResource() throws IOException {
        File file = new File(FILE_CONFIG_JNDI_SERVER);
        if (file.exists()) {
            Properties prop = new Properties();
            try (InputStream in = new FileInputStream(file)) {
                prop.load(in);
            }
            return prop;
        } else {
            Properties prop = new Properties();
            try (InputStream in = getClass().getClassLoader().getResourceAsStream("jndi.properties")) {
                prop.load(in);
            }
            return prop;
        }
    }

    private Properties getJndiNameResource() throws IOException {

        Properties prop = new Properties();
        try (InputStream in = getClass().getClassLoader().getResourceAsStream("ejb.properties")) {
            prop.load(in);
        }
        return prop;
    }

    public Properties getJndiServerResources() {
        return jndiServerResx;
    }

    public Properties getJndiNameResources() {
        return jndiNameResx;
    }

    public void setJndiServerResources(Properties resx) {
        this.jndiServerResx = resx;
    }

    public void setJndiNameResources(Properties resx) {
        this.jndiNameResx = resx;
    }

    public Object getEjbFacadeRemote(String jndiName) throws NamingException {
        return context.lookup(jndiName);
    }

    public String getJndiName(String key) {
        return jndiNameResx.getProperty(key);
    }
}
