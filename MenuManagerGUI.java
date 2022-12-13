package jaw371_FinalProject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class MenuManagerGUI {

	private JFrame frame;
	@SuppressWarnings("rawtypes")
	private JComboBox entreeBox;

	private int entreeIndex;
	@SuppressWarnings("rawtypes")
	private JComboBox sideBox;
	private int sideIndex;

	@SuppressWarnings("rawtypes")
	private JComboBox saladBox;

	private int saladIndex;
	@SuppressWarnings("rawtypes")
	private JComboBox dessertBox;
	private int dessertIndex;
	private String textAreaAll = "";

	private JTextArea textArea;

	private JFrame frame2;

	private JTextField caloriesText = new JTextField();

	private JTextField priceText = new JTextField();

	private JTextArea entreeTextArea = new JTextArea();

	private JTextArea sideTextArea = new JTextArea();

	private JTextArea saladTextArea = new JTextArea();

	private JTextArea dessertTextArea = new JTextArea();

	private ArrayList<Menu> menus = new ArrayList<>();

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public MenuManagerGUI() {

		MenuManager run = new MenuManager("dishes.txt");

		frame = new JFrame("Menu Manager");
		frame.setBounds(400, 150, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(35, 40, 346, 221);
		panel_1.setBorder(BorderFactory.createTitledBorder("Build your own Menu"));
		frame.getContentPane().add(panel_1);

		JPanel panel = new JPanel();
		panel.setBounds(35, 297, 346, 221);
		panel_1.setLayout(null);

//Create Entree label
		JLabel entreeLabel = new JLabel("Entree");
		entreeLabel.setBounds(10, 27, 56, 21);
		entreeLabel.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(entreeLabel);

//Create Entree box

		ArrayList<Entree> entrees = new ArrayList<Entree>(run.getEntrees());
		String[] entreeList = new String[entrees.size() + 1];
		entreeList[0] = "None";
		for (int i = 0; i < entrees.size(); i++)
			entreeList[i + 1] = entrees.get(i).getName();

		entreeBox = new JComboBox(entreeList);
		entreeBox.setBounds(66, 26, 270, 23);
		panel_1.add(entreeBox);

		entreeTextArea.setText("None");

		entreeBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox) e.getSource();
				entreeIndex = cb.getSelectedIndex();
			}
		});
//Create Side label
		JLabel sideLabel = new JLabel("Side");
		sideLabel.setBounds(10, 58, 32, 29);
		panel_1.add(sideLabel);
//Create Side box
		ArrayList<Side> sides = new ArrayList<Side>(run.getSides());
		String[] sideList = new String[sides.size() + 1];
		sideList[0] = "None";
		for (int i = 0; i < sides.size(); i++)
			sideList[i + 1] = sides.get(i).getName();

		sideBox = new JComboBox(sideList);
		sideBox.setBounds(66, 61, 270, 23);
		panel_1.add(sideBox);

		sideTextArea.setText("None");

		sideBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox) e.getSource();
				sideIndex = cb.getSelectedIndex();

			}
		});
//Create Salad label
		JLabel saladLabel = new JLabel("Salad");
		saladLabel.setBounds(10, 93, 32, 23);
		panel_1.add(saladLabel);
//Create Salad box
		ArrayList<Salad> salads = new ArrayList<Salad>(run.getSalads());
		String[] saladList = new String[salads.size() + 1];
		saladList[0] = "None";
		for (int i = 0; i < salads.size(); i++)
			saladList[i + 1] = salads.get(i).getName();

		saladBox = new JComboBox(saladList);
		saladBox.setBounds(66, 93, 270, 23);
		panel_1.add(saladBox);

		saladTextArea.setText("None");

		saladBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox) e.getSource();
				saladIndex = cb.getSelectedIndex();
			}
		});
//Create Dessert label
		JLabel dessertLabel = new JLabel("Dessert");
		dessertLabel.setBounds(10, 130, 45, 15);
		panel_1.add(dessertLabel);
//Create Dessert box
		ArrayList<Dessert> desserts = new ArrayList<Dessert>(run.getDesserts());
		String[] dessertList = new String[desserts.size() + 1];
		dessertList[0] = "None";
		for (int i = 0; i < desserts.size(); i++)
			dessertList[i + 1] = desserts.get(i).getName();

		dessertBox = new JComboBox(dessertList);
		dessertBox.setBounds(66, 126, 270, 23);
		panel_1.add(dessertBox);

		dessertTextArea.setText("None");

		dessertBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox) e.getSource();
				dessertIndex = cb.getSelectedIndex();
			}
		});
//Create Menu with these dishes
		JButton createButton = new JButton("Create Menu with these dishes");
		createButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String menuName = JOptionPane.showInputDialog("Please type the menu name");
				String txt = menuName + "\n";
				textAreaAll += txt;
				textArea.setText(textAreaAll);
				if (entreeIndex == 0) {
					entreeTextArea.setText("Entree: None");
				} else {
					entreeTextArea.setText(entrees.get(entreeIndex - 1).getName() + "\n"
							+ entrees.get(entreeIndex - 1).getDescription() + "\n" + "Calories: "
							+ String.valueOf(entrees.get(entreeIndex - 1).getCalories()) + "\n" + "Price: $"
							+ String.valueOf(entrees.get(entreeIndex - 1).getPrice()));
				}
				if (sideIndex == 0) {
					sideTextArea.setText("Side: None");
				} else {
					sideTextArea.setText(
							sides.get(sideIndex - 1).getName() + "\n" + sides.get(sideIndex - 1).getDescription() + "\n"
									+ "Calories: " + String.valueOf(sides.get(sideIndex - 1).getCalories()) + "\n"
									+ "Price: $" + String.valueOf(sides.get(sideIndex - 1).getPrice()));
				}

				if (saladIndex == 0) {
					saladTextArea.setText("Salad: None");
				} else {
					saladTextArea.setText(
							salads.get(saladIndex - 1).getName() + "\n" + salads.get(saladIndex - 1).getDescription()
									+ "\n" + "Calories: " + String.valueOf(salads.get(saladIndex - 1).getCalories())
									+ "\n" + "Price: $" + String.valueOf(salads.get(saladIndex - 1).getPrice()));
				}

				if (dessertIndex == 0) {
					dessertTextArea.setText("Dessert: None");
				} else {
					dessertTextArea.setText(desserts.get(dessertIndex - 1).getName() + "\n"
							+ desserts.get(dessertIndex - 1).getDescription() + "\n" + "Calories: "
							+ String.valueOf(desserts.get(dessertIndex - 1).getCalories()) + "\n" + "Price: $"
							+ String.valueOf(desserts.get(dessertIndex - 1).getPrice()));
				}

				priceText.setText(String.valueOf((entreeIndex == 0 ? 0 : entrees.get(entreeIndex - 1).getPrice())
						+ (sideIndex == 0 ? 0 : sides.get(sideIndex - 1).getPrice())
						+ (saladIndex == 0 ? 0 : salads.get(saladIndex - 1).getPrice())
						+ (dessertIndex == 0 ? 0 : desserts.get(dessertIndex - 1).getPrice())));

				caloriesText.setText(String.valueOf((entreeIndex == 0 ? 0 : entrees.get(entreeIndex - 1).getCalories())
						+ (sideIndex == 0 ? 0 : sides.get(sideIndex - 1).getCalories())
						+ (saladIndex == 0 ? 0 : salads.get(saladIndex - 1).getCalories())
						+ (dessertIndex == 0 ? 0 : desserts.get(dessertIndex - 1).getCalories())));

//Save Menu to file when entree, side, salad, and dessert are all selected
				if ((entreeIndex * sideIndex * saladIndex * dessertIndex) != 0) {
					menus.add(new Menu(menuName, entrees.get(entreeIndex - 1), sides.get(sideIndex - 1),
							salads.get(saladIndex - 1), desserts.get(dessertIndex - 1)));
				}
			}
		});
		createButton.setBounds(66, 182, 219, 23);
		panel_1.add(createButton);

//Create Panel 2
		panel.setBorder(BorderFactory.createTitledBorder("Or generate a Menu"));
		frame.getContentPane().add(panel);

//Generate a Random Menu
		JButton randomButton = new JButton("Generate a Random Menu");
		randomButton.setBounds(57, 54, 243, 23);
		randomButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String menuName = JOptionPane.showInputDialog("Please type the menu name");
				String txt = menuName;
				textAreaAll += txt + "\n";
				textArea.setText(textAreaAll);
				Menu randomMenu = run.randomMenu(menuName);

				entreeTextArea.setText(randomMenu.getEntree().getName() + "\n" + randomMenu.getEntree().getDescription()
						+ "\n" + "Calories: " + String.valueOf(randomMenu.getEntree().getCalories()) + "\n" + "Price: $"
						+ String.valueOf(randomMenu.getEntree().getPrice()));

				sideTextArea.setText(randomMenu.getSide().getName() + "\n" + randomMenu.getSide().getDescription()
						+ "\n" + "Calories: " + String.valueOf(randomMenu.getSide().getCalories()) + "\n" + "Price: $"
						+ String.valueOf(randomMenu.getSide().getPrice()));

				saladTextArea.setText(randomMenu.getSalad().getName() + "\n" + randomMenu.getSalad().getDescription()
						+ "\n" + "Calories: " + String.valueOf(randomMenu.getSalad().getCalories()) + "\n" + "Price: $"
						+ String.valueOf(randomMenu.getSalad().getPrice()));

				dessertTextArea
						.setText(randomMenu.getDessert().getName() + "\n" + randomMenu.getDessert().getDescription()
								+ "\n" + "Calories: " + String.valueOf(randomMenu.getDessert().getCalories()) + "\n"
								+ "Price: $" + String.valueOf(randomMenu.getDessert().getPrice()));

				priceText.setText(String.valueOf(randomMenu.getEntree().getPrice() + randomMenu.getSide().getPrice()
						+ randomMenu.getSalad().getPrice() + randomMenu.getDessert().getPrice()));

				caloriesText.setText(
						String.valueOf(randomMenu.getEntree().getCalories() + randomMenu.getSide().getCalories()
								+ randomMenu.getSalad().getCalories() + randomMenu.getDessert().getCalories()));

				menus.add(new Menu("Random pick menu", randomMenu.getEntree(), randomMenu.getSide(),
						randomMenu.getSalad(), randomMenu.getDessert()));

			}
		});
		panel.add(randomButton);
		{
		}

		JLabel menuLabel = new JLabel("Created Menus:");
		menuLabel.setBounds(424, 40, 90, 15);
		frame.getContentPane().add(menuLabel);

//Create test area
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(424, 61, 326, 414);

		frame.getContentPane().add(textArea);

//Create details button
		JButton detailsButton = new JButton("Details");
		detailsButton.setBounds(421, 495, 93, 23);
		detailsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (entreeIndex != 0 || sideIndex != 0 || saladIndex != 0 || dessertIndex != 0) {
					frame2.setVisible(true);
				}
			}
		});
		frame.getContentPane().add(detailsButton);

//Create delete all button
		JButton deleteButton = new JButton("Delete all");
		deleteButton.setBounds(532, 495, 97, 23);
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				menus.clear();
				textAreaAll = "";
			}
		});
		panel.setLayout(null);
		frame.getContentPane().add(deleteButton);

//Create save to file button
		JButton saveButton = new JButton("Save to file");
		saveButton.setBounds(641, 495, 109, 23);
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileManager.writeMenus("data/menus.txt", menus);
			}
		});
		frame.getContentPane().add(saveButton);

//Create secondary Window
		frame2 = new JFrame("Menu My own menu");
		frame2.setBounds(400, 150, 700, 600);
		frame2.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Entree");
		lblNewLabel.setBounds(49, 72, 74, 42);
		frame2.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Side");
		lblNewLabel_1.setBounds(49, 171, 66, 42);
		frame2.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Salad");
		lblNewLabel_2.setBounds(49, 261, 90, 42);
		frame2.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Dessert");
		lblNewLabel_3.setBounds(49, 340, 82, 42);
		frame2.getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Total calories:");
		lblNewLabel_4.setBounds(49, 440, 103, 42);
		frame2.getContentPane().add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Total price: $");
		lblNewLabel_5.setBounds(49, 494, 103, 34);
		frame2.getContentPane().add(lblNewLabel_5);

//Set the JTextArea entreeTextArea = new JTextArea();
		entreeTextArea.setEditable(false);
		entreeTextArea.setLineWrap(true);
		entreeTextArea.setWrapStyleWord(true);
		JScrollPane entreeScroll = new JScrollPane(entreeTextArea);
		entreeScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		entreeScroll.setBounds(149, 60, 525, 72);
		frame2.getContentPane().add(entreeScroll);

//Set the JTextArea sideTextArea = new JTextArea();
		sideTextArea.setEditable(false);
		sideTextArea.setLineWrap(true);
		sideTextArea.setWrapStyleWord(true);
		JScrollPane sideScroll = new JScrollPane(sideTextArea);
		sideScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		sideScroll.setBounds(149, 150, 525, 72);
		frame2.getContentPane().add(sideScroll);

//Set the JTextArea saladTextArea = new JTextArea();
		saladTextArea.setEditable(false);
		saladTextArea.setLineWrap(true);
		saladTextArea.setWrapStyleWord(true);
		JScrollPane saladScroll = new JScrollPane(saladTextArea);
		saladScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		saladScroll.setBounds(149, 248, 525, 72);
		frame2.getContentPane().add(saladScroll);

//Set the JTextArea dessertTextArea = new JTextArea();
		dessertTextArea.setEditable(false);
		dessertTextArea.setLineWrap(true);
		dessertTextArea.setWrapStyleWord(true);
		JScrollPane dessertScroll = new JScrollPane(dessertTextArea);
		dessertScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		dessertScroll.setBounds(149, 340, 525, 72);
		frame2.getContentPane().add(dessertScroll);

//Set the priceText = new JTextField();
		priceText.setBackground(new Color(255, 255, 255));
		priceText.setEditable(false);
		priceText.setBounds(148, 501, 66, 21);
		frame2.getContentPane().add(priceText);
		priceText.setColumns(10);

//Set caloriesText = new JTextField();
		caloriesText.setBackground(new Color(255, 255, 255));
		caloriesText.setEditable(false);
		caloriesText.setBounds(148, 451, 66, 21);
		frame2.getContentPane().add(caloriesText);
		caloriesText.setColumns(10);

	}

	public static void main(String[] args) {
		MenuManagerGUI play = new MenuManagerGUI();
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				play.frame.setVisible(true);
			}
		});
	}
}