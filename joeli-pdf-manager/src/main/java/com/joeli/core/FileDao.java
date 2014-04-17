package com.joeli.core;

import org.elasticsearch.client.Client;
import org.elasticsearch.node.Node;
import org.elasticsearch.node.NodeBuilder;

public class FileDao {

	Node node;
	Client clienteElastic;
	
	public FileDao() {
		super();
		this.node = new NodeBuilder().build();
		this.clienteElastic = this.node.client();
	}
	
	
}
