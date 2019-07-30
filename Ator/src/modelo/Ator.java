/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class Ator {
    private int codigo;
    private String nomereal;
    private String nomeartistico;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomereal() {
        return nomereal;
    }

    public void setNomereal(String nomereal) {
        this.nomereal = nomereal;
    }

    public String getNomeartistico() {
        return nomeartistico;
    }

    public void setNomeartistico(String nomeartistico) {
        this.nomeartistico = nomeartistico;
    }

    @Override
    public String toString() {
        return "Ator{" + "nomereal=" + nomereal + ", nomeartistico=" + nomeartistico + '}';
    }

    public void setAtor(String arlete_PEST) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
