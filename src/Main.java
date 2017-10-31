public class Main {

    private static void printTree(Node node, int depth) {

        for (int i = 0; i <= depth; i++) {
            System.out.print("---");
        }
        System.out.println("> " + node.getValue());

        for (Node child: node.getEdges()) {
            printTree(child, depth+1);
        }

    }
    public static void main(String[] args){

        Node root = new Node("animals");
        Node vertebrates = new Node ( "Vertebrates");

        Node invertebrates = new Node ( "Invertebrates");
        Node worm = new Node ("Worm");
        Node amphibians = new Node ("Amphibians");
        vertebrates.addEdge(amphibians);
        invertebrates.addEdge(worm);
        root.addEdge(vertebrates);
        root.addEdge(invertebrates);
        printTree(root, 0);

        Node mammals = new Node ("mammals"); // Leaf nodes

    }

}
