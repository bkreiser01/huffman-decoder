//Brandon Kreiser

public class HuffmanDecoder
{
    /*
    private void method() throws java.io.IOException
    {
        char next = (char)System.in.read();
    }
    */
    
    public static void main(String[] args)
    {
        BinaryTreeNode<char> tree = buildTree();
    }
    
    private BinaryTreeNode<char> buildTree() throws java.io.IOException
    {
        char next = (char)System.in.read();
        
        if(next == '1')
            return (BinaryTreeNode<char> node = new BinaryTreeNode<char>((char)System.in.read())));
        else
        {
            //BinaryTreeNode<char> node = new BinaryTreeNode<char>()
        }
    }
}
