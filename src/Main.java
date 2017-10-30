public class Main {

    public static void main(String[] args){
        Node root = new Node("animals");
        Node vertebrates = new Node ( "Vertebrates");
        Node invertebrates = new Node ( "Invertebrates");
        root.addEdge(vertebrates);
        root.addEdge(invertebrates);

        Node mammals = new Node ("mammals"); // Leaf nodes

    }

}
