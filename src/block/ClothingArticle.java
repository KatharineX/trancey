package block;

import java.util.*;

// create an ClothingArticle item to pass through blockchain
public class ClothingArticle{

	public final String ID;
	public final String[] materials;
	public final String location;
	public final String brand;
	public ArrayList<String> notes;
	
	public ClothingArticle(String ID, String[] materials, String location, String brand){
		this.ID = ID;
		this.materials = materials;
		this.location = location;
		this.brand = brand;
		this.notes = new ArrayList<String>();
	}
	
	public String toString() {
		return String.format("Article ID: %s \nMaterials: %s \nLocation: %s \nBrand: %s \nNotes: %s\n", ID, Arrays.toString(materials), location, brand, notes.toString());
	}
	
	public String getID(){
		return this.ID;	
	}
	
	public String[] getMaterials(){
		return this.materials;	
	}
	
	public String getBrand(){
		return this.brand;	
	}
	
	public String getLocation() {
		return this.location;
	}
	
	public void setNotes(String newNotes){
		notes.add(newNotes); 
		
	}
		
} 
