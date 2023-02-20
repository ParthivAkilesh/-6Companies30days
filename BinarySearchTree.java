class Node
    {
        int val;
        Node left;
        Node right;
        Node(int data)
        {
            this.val = data;
            this.left = null;
            this.right = null;
        }
    }

public class BinarySearchTree 
{

    

    public static Node insert(Node root, int data)
    {
        if (root == null)
        {
            return new Node(data);
        }
        if (data < root.val)
        {
            root.left = insert(root.left, data);
        }
        else
        {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public static void InOrder(Node root)
    {
        if (root != null)
        {
            InOrder(root.left);
            System.out.println(root.val);
            InOrder(root.right);
        }
    }

    public static void PreOrder(Node root)
    {
        if (root != null)
        {
            System.out.println(root.val);
            PreOrder(root.left);
            PreOrder(root.right);
        }
    }

    public static void PostOrder(Node root)
    {
        if (root != null)
        {
            PostOrder(root.left);
            PostOrder(root.right);
            System.out.println(root.val);
        }
    }

    

    public static void printData(Node root)
    {
        if (root.left != null)
        {
            printData(root.left);
            System.out.println(root.val);
        }
        System.out.println(root.val);
        if (root.right != null)
        {
            printData(root.right);
            System.out.println(root.val);
        }
    }

    public static void main(String[] args) 
    {
        int[] nar = {50, 30, 60, 20, 35, 55, 65};
        Node root = null;

        for (int data: nar)
        {
            root = insert(root, data);
        }

        // printData(root);
        InOrder(root);
        System.out.println("---------------------------");
        PreOrder(root);
        System.out.println("---------------------------");
        PostOrder(root);

        

    }
    
}

