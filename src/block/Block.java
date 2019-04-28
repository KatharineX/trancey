// camelCase
package block;
import java.time.ZonedDateTime;
import java.security.MessageDigest;
import java.util.*;

public class Block {
	public final ZonedDateTime timeStamp;
	private int index;
    // private String hash;
    // private String previousHash;
	private ClothingArticle article;
	private String location;
	private String[] notes;

	public Block(int index, String location, String[] notes) {
		this.article = null;
		this.timeStamp = ZonedDateTime.now();
		this.index = index;
		// this.hash = calculateHash(); 
		// this.previousHash = previousHash;
		this.location = location;
		this.notes = notes;

	}
	
	public Block(int index, ClothingArticle article) {
		this.article = article;
		this.timeStamp = ZonedDateTime.now();
		this.index = index;
		//this.hash = calculateHash(); 
		//this.previousHash = previousHash;
	}

	// Needs to access previous block through its hash. Validate parent's hash?
	
	
	// Hashing function && blockchain
	
	// Validate Hash?
	
	// The string representation.
	public String toString() {
		StringBuilder s = new StringBuilder("");
		
		if (index != 0) {
			s.append( String.format("\n\n---------------------------------------------------------------------------\nIndex: %d\nTimestamp: %s \nLocation: %s \nNotes: %s\n", this.index, this.timeStamp.toString(), this.location, Arrays.toString(notes) ));
		}

		if (index == 0) {
			s.append(String.format("Index: %s\nTimestamp: %s\n", this.index, this.timeStamp.toString() ));
			s.append(this.article.toString());
		}
		System.out.println("printing from block");
		return s.toString();
	}
	
	// public void computeHash() {
	// Gson parser = new Gson(); // probably should cache this instance
	// String serializedData = parser.toJson(transactions);     
	// setHash(SHA256.generateHash(timeStamp + index + merkleRoot + serializedData + nonce + previousHash));
	// }

	// Create the Hash.

	
	// public String calculateHash() {
	// String calculatedhash = StringUtil.applySha256( 
	// 		this.previousHash +
	// 		this.timeStamp.toString() 
	// 		);
	// return calculatedhash; }
	


	
	
}

// https://keyholesoftware.com/2018/04/10/blockchain-with-java/
