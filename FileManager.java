/**
 * Class FileManager
 * Jacob Wright
 * Created: 11/4/2022
 */
package jaw371_MenuManager_v2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

class FileManager {
	final static String SPLIT = "@@";
/**
 * Method create ArrayList
 * @param fileName
 * @return entrees
 */
	public static ArrayList<Entree>readEntrees(String fileName) {
		ArrayList<Entree>entrees = new ArrayList<Entree>();
		int arrayIndex = 0;
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while((line = br.readLine())!=null) {
				int first = line.indexOf(SPLIT);
				int second = line.indexOf(SPLIT,first + 1);
				entrees.add(arrayIndex,new Entree(line.substring(0,first),line.substring(first+2,second),Integer.parseInt(line.substring(second+2))));
				arrayIndex++;
			}
			br.close();
			fr.close();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return entrees;
	}
	/**
	 * Method create ArrayList
	 * @param fileName
	 * @return sides
	 */
	public static ArrayList<Side>readSides(String fileName) {
		ArrayList<Side>sides = new ArrayList<Side>();
		int arrayIndex = 0;
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while((line = br.readLine())!=null) {
				int first = line.indexOf(SPLIT);
				int second = line.indexOf(SPLIT,first + 1);
				sides.add(arrayIndex,new Side(line.substring(0,first),line.substring(first+2,second),Integer.parseInt(line.substring(second+2)),0));
				arrayIndex++;
			}
			br.close();
			fr.close();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return sides;
}
	/**
	 * Method create ArrayList
	 * @param fileName
	 * @return salads
	 */
	public static ArrayList<Salad>readSalads(String fileName) {
		ArrayList<Salad>salads = new ArrayList<Salad>();
		int arrayIndex = 0;
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while((line = br.readLine())!=null) {
				int first = line.indexOf(SPLIT);
				int second = line.indexOf(SPLIT,first + 1);
				salads.add(arrayIndex,new Salad(line.substring(0,first),line.substring(first+2,second),Integer.parseInt(line.substring(second+2)),0));
				arrayIndex++;
			}
			br.close();
			fr.close();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return salads;
	}
	/**
	 * Method create ArrayList
	 * @param fileName
	 * @return desserts
	 */
	
	public static ArrayList<Dessert>readDesserts(String fileName) {
		ArrayList<Dessert>desserts = new ArrayList<Dessert>();
		int arrayIndex = 0;
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while((line = br.readLine())!=null) {
				int first = line.indexOf(SPLIT);
				int second = line.indexOf(SPLIT,first + 1);
				desserts.add(arrayIndex,new Dessert(line.substring(0,first),line.substring(first+2,second),Integer.parseInt(line.substring(second+2)),0));
				arrayIndex++;
			}
			br.close();
			fr.close();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return desserts;
}
}
