package removenode;
/**
 *
 * @author jeff
 */
public class Node {
    
    Node link;

    public Node(Node link) {
        this.link = link;
    }

    public Node getLink() {
        return link;
    }

    public void setLink(Node link) {
        this.link = link;
    }
    
}
