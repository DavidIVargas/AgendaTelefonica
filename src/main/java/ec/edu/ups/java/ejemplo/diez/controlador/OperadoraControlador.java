/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.ejemplo.diez.controlador;

import ec.edu.ups.java.ejemplo.diez.idao.IOperadoraDAO;
import ec.edu.ups.java.ejemplo.diez.modelo.Operadora;

/**
 *
 * @author davidvargas
 */
public class OperadoraControlador {
    private Operadora operadora;
    private IOperadoraDAO operadoraDAO;

    public OperadoraControlador(IOperadoraDAO operadoraDAO) {
        this.operadoraDAO = operadoraDAO;
    }

    public void crear(Operadora operadora) {
        this.operadora = operadora;
        operadoraDAO.create(operadora);
    }

    public Operadora buscar(int codigo) {
        this.operadora = operadoraDAO.read(codigo);
        return this.operadora;
    }
}
