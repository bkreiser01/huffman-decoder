//Brandon Kreiser

public class HuffmanDecoder
{
    public static void main(String[] args) throws java.io.IOException
    {
        BinaryTreeNode<Character> tree = buildTree();
        BinaryTreeNode<Character> currentNode = tree;
        char currentNum = (char)System.in.read();

        while(currentNum != (char)(-1))
        {
            if(currentNode.getData() == null)
            {
                if(currentNum == '0')
                    currentNode = currentNode.getLeftChild();
                else if(currentNum == '1')
                    currentNode = currentNode.getRightChild();
                    
                currentNum = (char)System.in.read();
            }
            else
            {
                System.out.print(currentNode.getData());
                currentNode = tree;
            }
        }
        
        System.out.println();
    }
    
    private static BinaryTreeNode<Character> buildTree() throws java.io.IOException
    {
        char next = (char)System.in.read();
        
        if(next == '1')
        {
            return(new BinaryTreeNode<Character>((char)System.in.read()));
        }
        else
        {
            return(new BinaryTreeNode<Character>(null, buildTree(), buildTree()));
        }
    }
}
