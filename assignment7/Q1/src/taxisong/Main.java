package taxisong;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

//    Given a reference of a node in a connected undirected graph.
//
//    Return a deep copy (clone) of the graph.
//
//    Each node in the graph contains a value (int) and a list (List[Node]) of its neighbors.

    public static void main(String[] args) {
	// write your code here
    }//end of main

    Map<Node, Node> map = new HashMap<>();
    public Node cloneGraph(Node node) {
        if (node == null) return null;

        if (map.containsKey(node)) return map.get(node);

        Node cloneNode = new Node(node.val, new ArrayList<Node>());
        map.put(node, cloneNode);

        for (Node neighbor : node.neighbors) cloneNode.neighbors.add(cloneGraph(neighbor));

        return cloneNode;
    }//end of cloneGraph
}//end of Main
