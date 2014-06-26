package GenericGameStudios.GenericRandomGame.Loader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import javax.swing.JOptionPane;

import GenericGameStudios.GenericRandomGame.Items.Item;

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
			if(entry.getName().startsWith("com/me/GenericRandomGame/Items/Item_")){
				String itemClassName = entry.getName().replace("/", ".").replace(".class", "");
				Class itemClass = Class.forName(itemClassName);
				Item item = (Item) itemClass.newInstance();
				JOptionPane.showMessageDialog(null, item.getName(), "Test Titel", JOptionPane.OK_CANCEL_OPTION);
			}
		}
		}catch (Exception e){
			JOptionPane.showMessageDialog(null, "Error", "Test Titel", JOptionPane.OK_CANCEL_OPTION);
		}
	}
}
