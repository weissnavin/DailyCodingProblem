public class Node {
    String val;
    Node left;
    Node right;

    public Node(String val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public Node(String val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static String serialize(Node root) {
        if (root != null) {
            return root.val + "," + serialize(root.left) + "," + serialize(root.right);
        } else {
            return "null";
        }
    }

    public static Node deserialize(String str) {
        Node root = new Node("");
        String[] nodes = str.split(",");
        for (int i = 0; i < nodes.length; i++) {
            root.val = nodes[0];
            if (nodes[i + 1].equals("null") && nodes[i + 2].equals("null")) {
                return root;
            }
            if (!nodes[i + 1].equals("null")) {
                System.out.println(nodes[i + 1]);
                root.left = new Node(nodes[i + 1]);
            }
            if (!nodes[i + 2].equals("null")) {
                System.out.println(nodes[i + 2]);
                root.right = new Node(nodes[i + 2]);
            }

        }
        return root;
    }

    public static void main(String[] args) {
        String temp = "root,left,null,lr,lrl,null,null,lrr,null,null,right,null,null";
        Node l = new Node("left");
        Node r = new Node("right");
        Node root = new Node("root", l, r);
        Node lr = new Node("lr");
        l.right = lr;
        Node lrl = new Node("lrl");
        Node lrr = new Node("lrr");
        lr.left = lrl;
        lr.right = lrr;
        System.out.println(serialize(root));
        Node newRoot = deserialize(temp);


//        System.out.println(newRoot.val);
    }
}