package com.fengxueying.orderdishes.gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;



public class MainJFrame extends JFrame {

	private MyJPanel contentPane;
	private JTextField txtDsad;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JCheckBox c4;
	private JCheckBox c3;
	private JCheckBox c2;
	private JCheckBox c1;
	private JCheckBox c5;
	private JCheckBox c6;
	private JCheckBox c7;
	private JCheckBox c8;
	private JLabel label;
	private JLabel lblNewLabel;
	public int sum = 0;// 总价
	public int showSum = 0;// 用作显示的临时变量
	public int k1 = 1;// 用作菜数量的基础系数（默认为1，即一个菜）
	public int k2 = 1;
	public int k3 = 1;
	public int k4 = 1;
	public int k5 = 1;
	public int k6 = 1;
	public int k7 = 1;
	public int k8 = 1;
	public int tea=5;//茶会费（默认一个人）
	
	public Set<String> menuSet = new HashSet<String>();//菜单集合
	
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JComboBox personNum;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_0;
	private JComboBox menu1;
	private JComboBox menu2;
	private JComboBox menu3;
	private JComboBox menu4;
	private JComboBox menu5;
	private JComboBox menu6;
	private JComboBox menu7;
	private JComboBox menu8;




	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainJFrame frame = new MainJFrame();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1395, 657);
		
		contentPane = new MyJPanel();
		
		
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		txtDsad = new JTextField();
		txtDsad.setText("20元");
		txtDsad.setColumns(10);

		textField = new JTextField();
		textField.setText("10元");
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setText("真香餐厅欢迎你");
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setText("30元");
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setText("40元");
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setText("50元");
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setText("60元");
		textField_5.setColumns(10);

		textField_6 = new JTextField();
		textField_6.setText("70元");
		textField_6.setColumns(10);

		textField_7 = new JTextField();
		textField_7.setText("80元");
		textField_7.setColumns(10);

		JComboBox desk = new JComboBox();
		desk.setModel(new DefaultComboBoxModel(new String[] { "桌1", "桌2", "桌3", "桌4", "桌5" }));

		personNum = new JComboBox();
		personNum.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int selectedIndex = personNum.getSelectedIndex();
				tea=(selectedIndex+1)*5;
				System.out.println("茶会费是"+tea);
			}
		});
		
		personNum.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

		menu1 = new JComboBox();
		menu1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int selectedIndex = menu1.getSelectedIndex();
				k1 = selectedIndex + 1;// 系数k1
//				System.out.println("selectedIndex是"+selectedIndex);
//				System.out.println("k是"+k);

			}
		});
		menu1.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3" }));

		// 同理其余七个也一样
		menu2 = new JComboBox();
		menu2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int selectedIndex = menu2.getSelectedIndex();
				k2 = selectedIndex + 1;
			}
		});
		menu2.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3" }));

		menu3 = new JComboBox();
		menu3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int selectedIndex = menu3.getSelectedIndex();
				k3 = selectedIndex + 1;
			}
		});
		menu3.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3" }));

		menu4 = new JComboBox();
		menu4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int selectedIndex = menu4.getSelectedIndex();
				k4 = selectedIndex + 1;
			}
		});
		menu4.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3" }));

		menu5 = new JComboBox();
		menu5.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int selectedIndex = menu5.getSelectedIndex();
				k5 = selectedIndex + 1;
			}
		});
		menu5.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3" }));

		menu6 = new JComboBox();
		menu6.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int selectedIndex = menu6.getSelectedIndex();
				k6 = selectedIndex + 1;
			}
		});
		menu6.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3" }));

		menu7 = new JComboBox();
		menu7.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int selectedIndex = menu7.getSelectedIndex();
				k7 = selectedIndex + 1;
			}
		});
		menu7.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3" }));

		menu8 = new JComboBox();
		menu8.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int selectedIndex = menu8.getSelectedIndex();
				k8 = selectedIndex + 1;
			}
		});
		menu8.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3" }));

		JButton button = new JButton("加单");

		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				StringBuilder builder = new StringBuilder("你的菜单如下:");

				if (c1.isSelected()) {
					builder.append(" 烧味拼盘");
					sum = sum + 10 * k1;
					String text = c1.getText();
					menuSet.add(text);
					System.out.println(menuSet);
				}
				if (c2.isSelected()) {
					builder.append(" 回锅肉");
					sum = sum + 20 * k2;
					String text = c2.getText();
					menuSet.add(text);
					System.out.println(menuSet);
				}
				if (c3.isSelected()) {
					builder.append(" 酸菜鱼");
					sum = sum + 30 * k3;
					String text = c3.getText();
					menuSet.add(text);
					System.out.println(menuSet);
				}
				if (c4.isSelected()) {
					builder.append(" 白切鸡");
					sum = sum + 40 * k4;
					String text = c4.getText();
					menuSet.add(text);
					System.out.println(menuSet);
				}
				if (c5.isSelected()) {
					builder.append(" 青椒肉丝");
					sum = sum + 50 * k5;
					String text = c5.getText();
					menuSet.add(text);
					System.out.println(menuSet);
				}
				if (c6.isSelected()) {
					builder.append(" 糖醋排骨");
					sum = sum + 60 * k6;
					String text = c6.getText();
					menuSet.add(text);
					System.out.println(menuSet);
				}
				if (c7.isSelected()) {
					builder.append(" 蒜蓉酸菜");
					sum = sum + 70 * k7;
					String text = c7.getText();
					menuSet.add(text);
					System.out.println(menuSet);
				}
				if (c8.isSelected()) {
					builder.append(" 韭黄炒蛋");
					sum = sum + 80 * k8;
					String text = c8.getText();
					menuSet.add(text);
					System.out.println(menuSet);
				}
				
				System.out.println("sum:" + sum);
				StringBuilder builder2 = new StringBuilder("总价为:");
				builder2.append(sum);
				showSum = sum+tea;// 清空之前先把这个值存了以便以后用作显示
				sum = 0;// 清空一下这次点击的sum
				
				label.setText(builder.toString());

				lblNewLabel.setText(builder2.toString());
			}
		});

		c1 = new JCheckBox("烧味拼盘");

		c2 = new JCheckBox("回锅肉");

		c3 = new JCheckBox("酸菜鱼");

		c4 = new JCheckBox("白切鸡");

		c5 = new JCheckBox("青椒肉丝");

		c6 = new JCheckBox("糖醋排骨");

		c7 = new JCheckBox("蒜蓉酸菜");

		c8 = new JCheckBox("韭黄炒蛋");

		label = new JLabel(" ");
		label.setFont(new Font (Font.DIALOG, Font.BOLD, 20));

		lblNewLabel = new JLabel(" ");

		btnNewButton = new JButton("取消");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (c1.isSelected()) {
					c1.setSelected(false);
				}
				if (c2.isSelected()) {
					c2.setSelected(false);
				}
				if (c3.isSelected()) {
					c3.setSelected(false);
				}
				if (c4.isSelected()) {
					c4.setSelected(false);
				}
				if (c5.isSelected()) {
					c5.setSelected(false);
				}
				if (c6.isSelected()) {
					c6.setSelected(false);
				}
				if (c7.isSelected()) {
					c7.setSelected(false);
				}
				if (c8.isSelected()) {
					c8.setSelected(false);
				}
			}
		});

		btnNewButton_1 = new JButton("结账");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// 弹出确定对话框
				int value = JOptionPane.showConfirmDialog(null, "你的账单为:" + showSum);
				if (value == JOptionPane.YES_OPTION) {
					System.out.println(value);
					JOptionPane.showMessageDialog(null, "结账成功");
					//结账成功后把下列信息存入数据库
					//set集合用增强for循环遍历，也可以用迭代器
					String s="";//零食变量
					for(String str: menuSet) {
//						System.out.println(str);
						s=s+str+"、";
//						System.out.println(s);
						
					}
					
//					System.out.println(showSum);
					
					/*
					 * System.out.println("menuSet:"+menuSet);
					 * System.out.println("showSum:"+showSum);
					 */
					
			        StringBuffer document = new StringBuffer();

			        try {
			                URL url = new URL("http://localhost:8080/myServlet"+"?"+showSum+"&"+s);
			                java.net.URLConnection conn = url.openConnection();
			                BufferedReader reader = new BufferedReader(new InputStreamReader(
			                                conn.getInputStream(),"UTF-8"));
			                String line = null;
			                while ((line = reader.readLine()) != null) {
			                        document.append(line + "\r\n");
			                }
			                reader.close();
			        } catch (MalformedURLException e1) {
			                System.out.println("不能连接URL: ");
			        } catch (IOException e2) {
			                System.out.println("响应操作失败: ");
			        }
				} else if (value == JOptionPane.CANCEL_OPTION) {
					System.out.println(value);
				} else if (value == JOptionPane.CLOSED_OPTION) {
					System.out.println(value);
				}

				// 清空已选按钮
				
				  if(c1.isSelected()) { c1.setSelected(false); } if(c2.isSelected()) {
				  c2.setSelected(false); } if(c3.isSelected()) { c3.setSelected(false); }
				  if(c4.isSelected()) { c4.setSelected(false); } if(c5.isSelected()) {
				  c5.setSelected(false); } if(c6.isSelected()) { c6.setSelected(false); }
				  if(c7.isSelected()) { c7.setSelected(false); } if(c8.isSelected()) {
				  c8.setSelected(false); }
				 

			}
		});

		JTextArea textArea = new JTextArea();
		textArea.setText("请输入用餐人数(茶会费一人5元)");

		label_0 = new JLabel("New label");

		label_1 = new JLabel("New label");

		label_2 = new JLabel("New label");

		label_3 = new JLabel("New label");

		label_4 = new JLabel("New label");

		label_5 = new JLabel("New label");

		label_6 = new JLabel("New label");

		label_7 = new JLabel("New label");

		// 创建图片对象
		ImageIcon img1 = new ImageIcon("./src/images/img1.png");
		ImageIcon img2 = new ImageIcon("./src/images/img2.png");
		ImageIcon img3 = new ImageIcon("./src/images/img3.png");
		ImageIcon img4 = new ImageIcon("./src/images/img4.png");
		ImageIcon img5 = new ImageIcon("./src/images/img5.png");
		ImageIcon img6 = new ImageIcon("./src/images/img6.png");
		ImageIcon img7 = new ImageIcon("./src/images/img7.png");
		ImageIcon img8 = new ImageIcon("./src/images/img8.png");
		label_0.setIcon(img1);
		label_1.setIcon(img2);
		label_2.setIcon(img3);
		label_3.setIcon(img4);
		label_4.setIcon(img5);
		label_5.setIcon(img6);
		label_6.setIcon(img7);
		label_7.setIcon(img8);
		

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(22)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
									.addComponent(c2, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
									.addComponent(c3, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
									.addComponent(c4, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
								.addComponent(c1))
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(menu4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(menu3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(menu2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(menu1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnNewButton)
							.addGap(19)
							.addComponent(button)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
							.addGap(1)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(51)
									.addComponent(label_0, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(39)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE))))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(265)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
												.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
												.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
												.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
											.addGap(28)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(menu6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(menu5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(menu7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(menu8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addGap(488))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(textArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addGap(18)))
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(desk, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(personNum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addComponent(label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE))
							.addContainerGap(13, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(12)
									.addComponent(btnNewButton_1)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
									.addGap(322))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED, 373, Short.MAX_VALUE)
											.addComponent(c8, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(txtDsad, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED, 376, Short.MAX_VALUE)
											.addComponent(c6, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
										.addComponent(c7, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
										.addComponent(c5, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)))
							.addGap(198)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE))
							.addGap(355))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(43)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_0, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(c5)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
								.addComponent(menu1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(menu5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(c1))
							.addGap(2))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(desk, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(51)))
					.addGap(2)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(personNum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(51)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(c2)
										.addComponent(txtDsad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(menu2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(104)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(c3)
										.addComponent(c7)
										.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(menu3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(menu7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(62)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(c6)
										.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
										.addComponent(menu6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
							.addGap(98)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(c4)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(c8)
								.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(menu4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(menu8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(52)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
									.addGap(55)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(26))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
									.addGap(44)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))))
					.addGap(55)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(button)
						.addComponent(btnNewButton_1)
						.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
