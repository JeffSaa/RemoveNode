package removenode;
/**
 *
 * @author jeff
 */
public class Node {
    
    private Node link;
    private String data;

    public Node(String data) {
        this.data = data;
        link = null;
    }

    public void addNode(Node node, String data){
        while(node.getLink() != null){
            node = node.getLink();
        }
        node.setLink(new Node(data));
        System.out.println("Nodo agregado despues de "+node.getData());
    }
    
    public void printList(Node node){
        int i = 0;
        while(node.getLink() != null){
            System.out.println(i+") "+node.getData());
            node = node.getLink();
            i++;
        }
        System.out.println(i+") "+node.getData());
    }

    public Node getLink() {
        return link;
    }

    public void setLink(Node link) {
        this.link = link;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
}
