/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.examunidad2.dao;

import java.util.List;
import pe.edu.upeu.modelo.ResultadoTO;

public interface ResultadoDaoI {

    public int create(ResultadoTO d);

    public int update(ResultadoTO d);

    public List<ResultadoTO> listCmb(String filter);

    public List<ResultadoTO> listarResultado();

    public ResultadoTO buscarResultado(int parseInt);

}

