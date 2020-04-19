package cn.com.doone.zookeeper;

import java.io.IOException;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.junit.Test;

public class HelloDemo {
	private String connectString="newdoone4:2181,newdoone5:2181,newdoone6:2181";
	private int sessionTimeout = 2000;
	private ZooKeeper zkClient;
    @Test 
	public void test() throws IOException{
		
		zkClient = new ZooKeeper(connectString, sessionTimeout , new Watcher() {
			public void process(WatchedEvent event) {
				// TODO Auto-generated method stub
				System.out.println(zkClient.getState().isConnected());
			}
		});		
				
	}
}
