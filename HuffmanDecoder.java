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
                system.out.println("Node =>" + currentNode.getData);
                if(currentNum == '0')
                {
                    currentNode = currentNode.getLeftChild();
                }
                else if(currentNum == '1')
                {
                    currentNode = currentNode.getRightChild();
                }
            }
            else
            {
                System.out.print(currentNode.getData());
                currentNode = tree;
            }
            
            currentNum = (char)System.in.read();
        }
        
        System.out.println();
    }
    
    private static BinaryTreeNode<Character> buildTree() throws java.io.IOException
    {
        char next = (char)System.in.read();
        
        if(next == '0')
            return(new BinaryTreeNode<Character>(null, buildTree(), buildTree()));
        else
            return(new BinaryTreeNode<Character>((char)System.in.read()));
    }
}
