
import java.util.ArrayList;

    public class Node {

        private String value;

        private ArrayList<Node> edges;

        public Node(String setValue) {
            value = setValue;
            edges = new ArrayList<Node>();
        }

        public void addEdge(Node target) {
            edges.add(target);
        }

        public ArrayList<Node> getEdges() {
            return new ArrayList<Node>(edges);  // uses copy constructor
        }

        public String getValue() {
            return value;
        }


    }


