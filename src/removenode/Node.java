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

    public void addNode(String data){
        Node node = this;
        while(node.getLink() != null){
            node = node.getLink();
        }
        node.setLink(new Node(data));
        System.out.println("Nodo agregado despues de "+node.getData());
    }
    
    public void delNode(String data){
        Node node = this;
        Node root = this;
        boolean sw = false;
        do{
            if(root.getLink() != null && !root.getData().equals(data)){
                if (node.getLink().getData().equals(data)) {
                    sw = true;
                    node.setLink(node.getLink().getLink());
                    System.out.println("Nodo "+data+" eliminado.");
                }
                node = node.getLink();
            }
            else{
                sw = true;
                System.out.println("No puedes eliminar la raiz");
            }
        }while(node != null && node.getLink() != null && !sw);
        if (!sw) {
            System.out.println("No se encontro el nodo");
        }
    }
    
    public void printList(){
        Node node = this;
        int i = 0;
        do{
            System.out.println(i+") "+node.getData());
            node = node.getLink();
            i++;
        }while(node != null);
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
