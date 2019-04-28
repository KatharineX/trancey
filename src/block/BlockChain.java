package block;
import java.util.*;
// We iterate throught the block and add a new Block element to the list - no fixed length
public class BlockChain{
	public static int size;
	public List<Block> chain = new ArrayList<Block>();
 
    public void Blockchain(){ 
    }
	
	public void insertBlock(Block newBlock){
		// create genesis block
        chain.add(newBlock);
		size++;
		
	}
	
	public String printChain(){
    	StringBuilder sb = new StringBuilder();
		for (Block b: this.chain) {
			sb.append(b);
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		BlockChain bc = new BlockChain();
		ClothingArticle a = new ClothingArticle("SampleID", new String[] {"Cotton", "Nylon"}, "Bangladesh", "Zara");
		Block b = new Block(BlockChain.size, a);
		bc.insertBlock(b);
		
		Block b2 = new Block(BlockChain.size, "New Zealand", new String[] {"Packaged by Lina"});
		bc.insertBlock(b2);
		
		bc.printChain();
		
		System.out.println("A change");
		
		}
} 
