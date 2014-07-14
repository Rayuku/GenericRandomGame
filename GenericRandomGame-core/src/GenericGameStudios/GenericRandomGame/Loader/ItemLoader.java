package GenericGameStudios.GenericRandomGame.Loader;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import javax.swing.JOptionPane;

import GenericGameStudios.GenericRandomGame.Item.Item;

public class ItemLoader {
	
	private ArrayList<Item> existingItems;
	
	public ItemLoader(){
		existingItems = new ArrayList<Item>();
	}
	
	public void loadItems(){
		try{
			String path = (String)Item.class.getProtectionDomain().getCodeSource().getLocation().getPath();
			JarFile jar = new JarFile(path);
			for(JarEntry entry : Collections.list(jar.entries())){
				if(entry.getName().startsWith("GenericGameStudios/GenericRandomGame/Items/Items/Item_")){
					String itemClassName = entry.getName().replace("/", ".").replace(".class", "");
					Class itemClass = Class.forName(itemClassName);
					Item item = (Item) itemClass.newInstance();
					existingItems.add(item);
			}
		}
		}catch (Exception e){
			JOptionPane.showMessageDialog(null, e.getMessage(), "Test Titel", JOptionPane.OK_CANCEL_OPTION);
		}
	}
	
	/**
	 * Only for Development
	 */
	public void loadItemsDevelop(){
		try{
			String path = (String)Item.class.getProtectionDomain().getCodeSource().getLocation().getPath();
			path += "GenericGameStudios/GenericRandomGame/Items/Items";
			File file = new File(path);
			for(File entry : file.listFiles()){
				if(entry.getName().startsWith("Item_")){
					Class ItemClass = Class.forName(entry.getName().replace(".class", "").replace("Item_", ""));
					Item item = (Item) ItemClass.newInstance();
					System.out.println(item.getName());
				}
			}
		}catch (Exception e){
			JOptionPane.showMessageDialog(null, e.getMessage(), "Test Titel", JOptionPane.OK_CANCEL_OPTION);
		}
	}

	public ArrayList<Item> getExistingItems() {
		return existingItems;
	}

	public void setExistingItems(ArrayList<Item> existingItems) {
		this.existingItems = existingItems;
	}
}
