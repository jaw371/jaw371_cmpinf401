package jaw371_lab8;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class RecordList {


    private class Node {

        Record data;

        Node next;

        /**
         * Creates a node with the given data
         *
         * @param dataValue data to hold in this node
         */
        public Node(Record dataValue) {
            next = null;
            data = dataValue;
        }
    }

    private Node head;

    /**
     * Initializes a linked list with a single "dummy" node (contains no real data)
     * to simplify code for the case of an empty list
     */
    public RecordList() {
        head = new Node(null);
    }

    /**
     * Finds the index of the record with the given name in the list
     *
     * @param name name to search for
     * @return index of name in list if found, -1 otherwise
     */
    public int indexOf(String name) {
        Node currentNode = head;
        int index = 0;

        // traverse through the list looking for our target node
        while (currentNode.next != null && !currentNode.next.data.getName().equals(name)) {
            currentNode = currentNode.next;
            index++;
        }

        // we got to the end of the list without finding our target
        if (currentNode.next == null) return -1;
        else return index;
    }

    /**
     * Adds the given item to the list, sorted by time (lowest to highest)
     *
     * @param data data to add
     * @return the index the data was inserted at
     */
    public int add(Record data) {


        Node currentNode = head; //initialization of the current node to be the head
        int index = 0;


        while (currentNode.next != null && currentNode.next.data.getTime() < data.getTime()) { //traverse until a node value is greater
            currentNode = currentNode.next;
            index++;
        }

        Node newNode = new Node(data); //creates a second node
        if (currentNode.next == null) {
            //add new node
            currentNode.next = newNode;
        } else {


            Node currentNext = currentNode.next; //saved node
            currentNode.next = newNode;  //current node to new node
            newNode.next = currentNext; //insert new node between current node and currentNext
        }

        return index;
    }


    public void print() {

        Node currentNode = head.next;
        while (currentNode != null) {
            System.out.println(currentNode.data.getName() + ", " + currentNode.data.getTime());
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    /**
     * Write out the contents of the linked list to the given file, one entry per line
     *
     * @param filename name of the file to write the list to
     */
    public void writeToFile(String filename) {


        String data= "";
        Node currentNode = head.next;
        while (currentNode != null) {
            data = data + currentNode.data;
            data =  data+"\n";  //creates a new line after each record
            currentNode = currentNode.next;
        }


        File file = new File(filename);

        FileWriter fr = null;
        try {
            fr = new FileWriter(file); //creates file to write to
            fr.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{

            try {
                fr.close(); //closes file
            } catch (IOException e) { //handles exceptions
                e.printStackTrace();
            }
        }
    }


public class Record {
	private String name;
	private double time;

	public Record(String name, double time) {
		this.name = name;
		this.time = time;
	}

	public String getName() {
		return this.name;
	}

	public double getTime() {
		return this.time;
	}


}
}
