/*
 * Created by JFormDesigner on Wed Sep 03 00:10:42 EDT 2014
 */

package com.mbovard.classviewer.frames;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * @author unknown
 */
public class ClassView extends JFrame {
    public ClassView() {
        initComponents();
    }

    private void loadMenuButton(ActionEvent e) {
        JFileChooser jFileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Class & Jar Files", "class", "jar");
        jFileChooser.setFileFilter(filter);
        int returnVal = jFileChooser.showOpenDialog(this);
        if(returnVal == jFileChooser.APPROVE_OPTION) {
            File file = jFileChooser.getSelectedFile();
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        menuItem1 = new JMenuItem();
        scrollPane1 = new JScrollPane();
        list1 = new JList();
        tabbedPane1 = new JTabbedPane();
        scrollPane2 = new JScrollPane();
        textPane1 = new JTextPane();

        //======== this ========
        setTitle("ClassViewer");
        Container contentPane = getContentPane();

        //======== menuBar1 ========
        {

            //======== menu1 ========
            {
                menu1.setText("File");

                //---- menuItem1 ----
                menuItem1.setText("Load");
                menuItem1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        loadMenuButton(e);
                    }
                });
                menu1.add(menuItem1);
            }
            menuBar1.add(menu1);
        }
        setJMenuBar(menuBar1);

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(list1);
        }

        //======== scrollPane2 ========
        {
            scrollPane2.setViewportView(textPane1);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(tabbedPane1, GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                            .addContainerGap())))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(tabbedPane1, GroupLayout.PREFERRED_SIZE, 378, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenuItem menuItem1;
    private JScrollPane scrollPane1;
    private JList list1;
    private JTabbedPane tabbedPane1;
    private JScrollPane scrollPane2;
    private JTextPane textPane1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
