package org.e7.test.elasticsearch.node;

import static org.elasticsearch.node.NodeBuilder.nodeBuilder;

import org.elasticsearch.node.Node;
public class Client {

	Node node;
	org.elasticsearch.client.Client client;
	
	public Client() {
		super();
		this.node = nodeBuilder().node();
		client = this.node.client();
	}
	
	
}
