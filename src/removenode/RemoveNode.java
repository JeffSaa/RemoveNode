package removenode;

import java.util.Scanner;

/**
 *
 * @author jeff
 */
public class RemoveNode {
    
    static Node root;
    static Scanner sc;
    
    public static void main(String[] args) {
        root = new Node("Root");
        sc = new Scanner(System.in);
        int op = -1;
        while(op != 0){
            System.out.println("Presiona 1) para agregar un nodo.");
            System.out.println("Presiona 2) para buscar y eliminar un nodo.");
            System.out.println("Presiona 0) para salir.");
            System.out.print("Que quieres hacer? ");
            op = Integer.parseInt(sc.nextLine());
            switch(op){
                case 1:
                    addNode();
                    break;
                case 2:
                    delNode();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcion incorrecta, intentalo de nuevo.");
                    break;
            }
        }
    }
    
    private static void addNode(){
        System.out.print("Ingresa la informacion del nodo: ");
        String data = sc.nextLine();
        root.addNode(root, data);
    }
    
    private static void delNode(){
        
    }
    
}
