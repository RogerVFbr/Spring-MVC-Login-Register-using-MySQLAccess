package com.javatpoint.config;


import com.mysqlaccess.models.MySQLAConfig;

public class DBConfig {

    public static MySQLAConfig LOCAL = new MySQLAConfig(
            "127.0.0.1",            // ---> Server I.P
            3306,                   // ---> Server port
            "springdb",        // ---> Database name
            "root",                 // ---> User name
            "RogerRootPass"              // ---> Password
    );
}
