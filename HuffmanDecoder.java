//Brandon Kreiser
public class HuffmanDecoder
{
    public static void main(String[] args) throws java.io.IOException
    {
        BinaryTreeNode<Character> tree = buildTree();
        BinaryTreeNode<Character> currentNode = tree;
        char currentNum = (char)System.in.read();

        System.out.println("***" + currentNum);
        while(currentNum != (char)(-1))
        {
            if(currentNum == '0')
                currentNode = currentNode.getLeftChild();
            else if(currentNum == '1')
                currentNode = currentNode.getRightChild();
            else
            {
                System.out.print(currentNode.getData());
                currentNode = tree;
            }
        }
    }
    
    private static BinaryTreeNode<Character> buildTree() throws java.io.IOException
    {
        char next = (char)System.in.read();
        System.out.println(next);
        if(next == '1')
        {
            char x = (char)System.in.read();
            BinaryTreeNode<Character> y = new BinaryTreeNode<Character>(x);
            System.out.println(x +" ==>" + y.getData());
            return (y);
        }
        else
            return(new BinaryTreeNode<Character>(null, buildTree(), buildTree()));
    }
}
