/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Entregas;

/**
 *
 * @author Igor
 */
public class EntregasDAO {
    
    
    public void create(Entregas en) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO encaminhados (cliente,endereco,produto,telefone) VALUES (?,?,?,?)");
            stmt.setString(1, en.getCliente());
            stmt.setString(2, en.getEndereco());
            stmt.setString(3, en.getProduto());
            stmt.setString(4, en.getTelefone());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Registrado como encaminhado!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro!");
        } finally {
            ConnectionFactory.ColseConnection(con, stmt);
        }

    }
    
    
    public List<Entregas> pendentes() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        
        List<Entregas> pessoa = new ArrayList<>();
        
        
        
        try {
            stmt = con.prepareStatement("SELECT * FROM pendentes");
           rs =  stmt.executeQuery();
           while(rs.next()){ 
               
               Entregas en = new Entregas();
               
               en.setId(rs.getInt("id"));
               en.setCliente(rs.getString("cliente"));
               en.setEndereco(rs.getString("endereco"));
               en.setProduto(rs.getString("produto"));
               en.setTelefone(rs.getString("telefone"));
               pessoa.add(en);
               
           }
           
           
        } catch (SQLException ex) {
            Logger.getLogger(EntregasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.ColseConnection(con, stmt, rs);
        
        }
        return pessoa;
            
    }
    
    public List<Entregas> encaminhados() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        
        List<Entregas> pessoa = new ArrayList<>();
        
        
        
        try {
            stmt = con.prepareStatement("SELECT * FROM encaminhados");
           rs =  stmt.executeQuery();
           while(rs.next()){ 
               
               Entregas en = new Entregas();
               
               en.setId(rs.getInt("id"));
               en.setCliente(rs.getString("cliente"));
               en.setEndereco(rs.getString("endereco"));
               en.setProduto(rs.getString("produto"));
               en.setTelefone(rs.getString("telefone"));
               pessoa.add(en);
               
           }
           
           
        } catch (SQLException ex) {
            Logger.getLogger(EntregasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.ColseConnection(con, stmt, rs);
        
        }
        return pessoa;
            
    }
    public void saiPendente(Entregas en) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM pendentes WHERE id = ?");
            stmt.setInt(1, en.getId());

            stmt.executeUpdate();

            //JOptionPane.showMessageDialog(null, "Exclído com sucesso!");
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro ao excluir!");
        } finally {
            ConnectionFactory.ColseConnection(con, stmt);
        }

    }
    
     public void entregaFinalizada(Entregas en) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM encaminhados WHERE id = ?");
            stmt.setInt(1, en.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Entrega finalizada com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro!");
        } finally {
            ConnectionFactory.ColseConnection(con, stmt);
        }

    }
    
}
