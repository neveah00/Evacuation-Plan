package DijkstraLinkedListSolution;

import java.util.LinkedList;

public class NodeWeighted {
    // The int n and String name are just arbitrary attributes
    // we've chosen for our nodes these attributes can of course
    // be whatever you need
    String n;
    String name;
    private boolean visited;
    LinkedList<EdgeWeighted> edges;

    NodeWeighted(String n, String name) {
        this.n = n;
        this.name = name;
        visited = false;
        edges = new LinkedList<>();
    }

    boolean isVisited() {
        return visited;
    }

    void visit() {
        visited = true;
    }

    void unvisit() {
        visited = false;
    }

	public String getN() {
		return n;
	}

	public void setN(String n) {
		this.n = n;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LinkedList<EdgeWeighted> getEdges() {
		return edges;
	}

	public void setEdges(LinkedList<EdgeWeighted> edges) {
		this.edges = edges;
	}
    
    
}