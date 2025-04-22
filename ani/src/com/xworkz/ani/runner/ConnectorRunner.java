package com.xworkz.ani.runner;

import com.xworkz.ani.external.ConnectUser;
import com.xworkz.ani.internal.Connector;
import com.xworkz.ani.internal.ConnectorImpl;

public class ConnectorRunner {
    public static void main(String[] args) {
        Connector connector=new ConnectorImpl();
        ConnectUser connectUser=new ConnectUser(connector);
        connectUser.execute();
    }
}
