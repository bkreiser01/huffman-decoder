//Brandon Kreiser

public class HuffmanDecoder
{
    public static void main(String[] args) throws java.io.IOException
    {
        BinaryTreeNode<Character> root = buildTree();
        BinaryTreeNode<Character> currentNode = root;
        char currentNum = (char)System.in.read();

        //While there are numbers in the file, search through the tree for the proper characters.
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
                //When a character is found, print it and go back to the root.
                System.out.print(currentNode.getData());
                currentNode = root;
            }
        }
        
        System.out.println();
    }
    
    //Recurively reconstruct the tree.
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