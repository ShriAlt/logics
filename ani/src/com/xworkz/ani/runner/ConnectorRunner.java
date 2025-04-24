package com.xworkz.ani.runner;


import com.xworkz.ani.external.*;

import com.xworkz.ani.internal.*;

public class ConnectorRunner {
    public static void main(String[] args) {
        Connector connector = new ConnectorImpl();
        ConnectUser connectUser = new ConnectUser(connector);
        connectUser.execute();
        ICC icc = new IndianCriketTeamImpl();
        BCCI bcci = new BCCI(icc);

        bcci.execute();
        Laptop laptop =new LaptopImpl();
        Asus asus=new Asus(laptop);
        asus.execute();


    }
}
