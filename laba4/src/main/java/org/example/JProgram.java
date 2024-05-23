/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.example;


import org.example.collections.ReactorsManipulation;
import org.example.manipulationBD.BuilderBD;
import org.example.parserManipulatiom.ParserManipulation;

import javax.swing.*;
import java.io.File;

public class JProgram extends javax.swing.JFrame {

    private BuilderBD builderBD = new BuilderBD();
    private ParserManipulation parserManipulation = new ParserManipulation();
    private ReactorsManipulation reactorsManipulation = new ReactorsManipulation();

    public JProgram() {
        initComponents();
        try {
            parserManipulation.createFiles();
        }catch (Exception e){
            JOptionPane.showMessageDialog (null, "Ошибка добавления файла", "Oшибка", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jButtonAddBD = new javax.swing.JButton();
        jButtonImportReactors = new javax.swing.JButton();
        jButtonGetDataBD = new javax.swing.JButton();
        jButtonAggregateCountry = new javax.swing.JButton();
        jButtonAggregateCompany = new javax.swing.JButton();
        jButtonAggregateRegion = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        jTableAggregate = new javax.swing.JTable();
        jButtonExit = new javax.swing.JButton();
        jButtonDeleteBD = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonAddBD.setText("Создать и заполнить БД");
        jButtonAddBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddBDActionPerformed(evt);
            }
        });

        jButtonImportReactors.setText("Загрузить файл с реакторами");
        jButtonImportReactors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImportReactorsActionPerformed(evt);
            }
        });

        jButtonGetDataBD.setText("Выгрузить данные из БД");
        jButtonGetDataBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGetDataBDActionPerformed(evt);
            }
        });

        jButtonAggregateCountry.setText("Аггрегация по странам");
        jButtonAggregateCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAggregateCountryActionPerformed(evt);
            }
        });

        jButtonAggregateCompany.setText("Аггрегация по компаниям");
        jButtonAggregateCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAggregateCompanyActionPerformed(evt);
            }
        });

        jButtonAggregateRegion.setText("Аггрегация по регионам");
        jButtonAggregateRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAggregateRegionActionPerformed(evt);
            }
        });

        jTableAggregate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableAggregate.setEnabled(false);
        jScrollPane.setViewportView(jTableAggregate);

        jButtonExit.setText("Выход");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jButtonDeleteBD.setText("Удалить БД");
        jButtonDeleteBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteBDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonImportReactors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAddBD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonGetDataBD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAggregateCountry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAggregateCompany, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAggregateRegion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonDeleteBD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(jButtonImportReactors)
                        .addGap(41, 41, 41)
                        .addComponent(jButtonAddBD)
                        .addGap(40, 40, 40)
                        .addComponent(jButtonGetDataBD)
                        .addGap(42, 42, 42)
                        .addComponent(jButtonDeleteBD)
                        .addGap(110, 110, 110)
                        .addComponent(jButtonAggregateCountry)
                        .addGap(43, 43, 43)
                        .addComponent(jButtonAggregateCompany)
                        .addGap(43, 43, 43)
                        .addComponent(jButtonAggregateRegion)
                        .addGap(43, 43, 43)
                        .addComponent(jButtonExit)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddBDActionPerformed
        try {
            if (builderBD.areDataExist().equals("Данные не загружены в БД")) {
                builderBD.createBD();
                builderBD.fillBD();
                JOptionPane.showMessageDialog(null, "БД создана и заполнена!", "ОК", JOptionPane.INFORMATION_MESSAGE);
            } else JOptionPane.showMessageDialog(null, "БД уже есть!", "Oшибка", JOptionPane.ERROR_MESSAGE);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ошибка работы с БД", "Oшибка", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButtonAddBDActionPerformed

    private void jButtonImportReactorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImportReactorsActionPerformed
        JFileChooser chooser = new JFileChooser();
        String currentDir = System.getProperty("user.dir");
        chooser.setCurrentDirectory(new File(currentDir));
        chooser.setDialogTitle("Выберите файл");

        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            try {
                File file = chooser.getSelectedFile();
                reactorsManipulation.setReactors(parserManipulation.importData(String.valueOf(file)));
                JOptionPane.showMessageDialog(null, "Данные загружены", "ОК", JOptionPane.INFORMATION_MESSAGE);
            }catch (Exception r){
                JOptionPane.showMessageDialog (null, "Ошибка чтения файла", "Oшибка", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonImportReactorsActionPerformed

    private void jButtonDeleteBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteBDActionPerformed
        try {
            if (builderBD.areTablesExist().equals("БД создана")) {
                builderBD.deleteBD();
                JOptionPane.showMessageDialog(null, "БД удалена!", "ОК", JOptionPane.INFORMATION_MESSAGE);
            } else JOptionPane.showMessageDialog(null, "БД уже удалена!", "Oшибка", JOptionPane.ERROR_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ошибка работы с БД", "Oшибка", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonDeleteBDActionPerformed

    private void jButtonGetDataBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGetDataBDActionPerformed
        try {
            reactorsManipulation.setStorageBDInitial(builderBD.getDataFromBD());
            JOptionPane.showMessageDialog(null, "Данные выгружены!", "ОК", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ошибка выгрузки из БД", "Oшибка", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButtonGetDataBDActionPerformed

    private void jButtonAggregateCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAggregateCountryActionPerformed
        if(reactorsManipulation.areDataGet()){
            try {
                reactorsManipulation.prepareData();
                jTableAggregate.setModel(reactorsManipulation.aggregateCountry());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ошибка агрегации", "Oшибка", JOptionPane.ERROR_MESSAGE);
            }
        }else JOptionPane.showMessageDialog(null, "Не все данные загружены", "Oшибка", JOptionPane.ERROR_MESSAGE);

    }//GEN-LAST:event_jButtonAggregateCountryActionPerformed

    private void jButtonAggregateCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAggregateCompanyActionPerformed
        if(reactorsManipulation.areDataGet()){
            try {
                reactorsManipulation.prepareData();
                jTableAggregate.setModel(reactorsManipulation.aggregateCompany());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ошибка агрегации", "Oшибка", JOptionPane.ERROR_MESSAGE);
            }
        }else JOptionPane.showMessageDialog(null, "Не все данные загружены", "Oшибка", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButtonAggregateCompanyActionPerformed

    private void jButtonAggregateRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAggregateRegionActionPerformed
        if(reactorsManipulation.areDataGet()){
            try {
                reactorsManipulation.prepareData();
                jTableAggregate.setModel(reactorsManipulation.aggregateRegion());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ошибка агрегации", "Oшибка", JOptionPane.ERROR_MESSAGE);
            }
        }else JOptionPane.showMessageDialog(null, "Не все данные загружены", "Oшибка", JOptionPane.ERROR_MESSAGE);

    }//GEN-LAST:event_jButtonAggregateRegionActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonExitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddBD;
    private javax.swing.JButton jButtonAggregateCompany;
    private javax.swing.JButton jButtonAggregateCountry;
    private javax.swing.JButton jButtonAggregateRegion;
    private javax.swing.JButton jButtonDeleteBD;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonGetDataBD;
    private javax.swing.JButton jButtonImportReactors;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable jTableAggregate;
    // End of variables declaration//GEN-END:variables
}
