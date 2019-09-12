package com.loginregisterspringmvc.config;


import com.mysqlaccess.models.MySQLAConfig;

public class DBConfig {

    public static MySQLAConfig getConfig() { return XQUBE; }

    private static MySQLAConfig HOME = new MySQLAConfig(
            "127.0.0.1",            // ---> Server I.P
            3306,                   // ---> Server port
            "springdb",        // ---> Database name
            "root",                 // ---> User name
            "RogerRootPass"              // ---> Password
    );

    private static MySQLAConfig XQUBE = new MySQLAConfig(
            "127.0.0.1",            // ---> Server I.P
            3306,                   // ---> Server port
            "springdb",        // ---> Database name
            "root",                 // ---> User name
            "root"              // ---> Password
    );
}
