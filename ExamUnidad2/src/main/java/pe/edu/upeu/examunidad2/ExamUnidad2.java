/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package pe.edu.upeu.examunidad2;

import pe.edu.upeu.examunidad2.gui.ControllerGame;
import pe.edu.upeu.examunidad2.gui.Diseño;
import pe.edu.upeu.examunidad2.gui.ModelGame;

/**
 *
 * @author EMMANUEL
 */
public class ExamUnidad2 {

    public static void main(String[] args) {
        ModelGame model = new ModelGame();
        Diseño view = new Diseño();
        ControllerGame controlador = new ControllerGame(view, model);
        view.setLocationRelativeTo(null);
        view.setVisible(true);

    }
}
